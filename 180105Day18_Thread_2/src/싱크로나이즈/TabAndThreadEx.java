package ��ũ�γ�����;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;

class MyLabel extends JLabel{
	int barSize = 0; // ����ũ��
	int maxBarSize;
	
	MyLabel(int maxBarSize){
		this.maxBarSize = maxBarSize;
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.MAGENTA);
		int width = (int)(((double)(this.getWidth()))/maxBarSize*barSize);
		if(width==0) return;
		g.fillRect(0, 0, width, this.getHeight());
	}
	
	synchronized void fill() {
		if(barSize== maxBarSize) {
			try {
				wait();
			} catch (InterruptedException e) {return;}
		}
		barSize++;
		repaint(); //�� �ٽ� �׸���
		notify();
	}
	
	synchronized void consume() {
		if(barSize==0) {
			try {
				wait();
			} catch (InterruptedException e)
			{return ;}
		}
		barSize--;
		repaint();
		notify();
	}
	
}

class ConsumerThread extends Thread{
	MyLabel bar;
	
	ConsumerThread(MyLabel bar){
		this.bar = bar;
	}
	
	public void run() {
		while(true) {
			try {
				sleep(200);
				bar.consume();
			} catch (InterruptedException e) {
				{return ;}
			}
		}
	}
}


public class TabAndThreadEx extends JFrame{
	
	MyLabel bar = new MyLabel(100);
	public TabAndThreadEx(String title) {
		super(title);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Container c = getContentPane();
		c.setLayout(null);
		bar.setBackground(Color.orange);
		bar.setOpaque(true);
		bar.setLocation(20,50);
		bar.setSize(300,20);
		c.add(bar);
		
		c.addKeyListener(new KeyAdapter(){
			@Override
			public void keyPressed(KeyEvent e) {
				bar.fill();
			}
		});
		setSize(350,200);
		setVisible(true);
		
		c.requestFocus();
		ConsumerThread th = new ConsumerThread(bar);
		th.start(); //������ ����
	}
	
	
	public static void main(String[] args) {
		new TabAndThreadEx("�ƹ�Ű�� ��������");
	}

}
