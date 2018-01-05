package 싱크로나이즈;

public class SynchronizedEx {
	public static void main(String[] args) {
		SyncObject obj = new SyncObject();
		Thread th1 = new WorkerThread("kitae", obj);
		Thread th2 = new WorkerThread("Hyosoo",obj);
		th1.start();
		th2.start();
	}
	
}

class SyncObject{
	int sum = 0;
	synchronized void add() {
		int n = sum;
		Thread.yield(); // 현재 실행하고 있는 스레드가 다른 스레등에게 양보
		n += 10;
		sum = n;
		System.out.println(Thread.currentThread().getName() +" : " + sum);
	}
	int getSum() {return sum;}
}

class WorkerThread extends Thread {
	SyncObject sObj;
	WorkerThread(String name,SyncObject sObj){
		super(name);
		this.sObj = sObj;
	}
	
	public void run() {
		int i = 0;
		while(i<10) {
			sObj.add();
			i++;
		}
	}
}