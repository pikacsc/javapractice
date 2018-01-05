package AllinOne;

public class DTO {
	private float USD;
	private float JPY;
	private float EUR;
''
	private float exchange;
	private float goodsPrice;
	private float brandCommission;
	private float cardCommission;
	private float afterCardCommission;
	private float sumAllCommission;
	
	public float getExchange() {
		return exchange;
	}
	public void setExchange(int x) {
		switch(x) {
			case 0:
				this.getUSD();
				break;
			case 1:
				this.getJPY();
				break;
			case 2:
				this.getEUR();
				break;
		}
		this.exchange = exchange;
	}
	
	public float getUSD() {
		return USD;
	}
	public void setUSD(float uSD) {
		USD = uSD;
	}
	public float getJPY() {
		return JPY;
	}
	public void setJPY(float jPY) {
		JPY = jPY;
	}
	public float getEUR() {
		return EUR;
	}
	public void setEUR(float eUR) {
		EUR = eUR;
	}
	
	public float getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(float goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	
	
	public float getBrandCommission() {
		return brandCommission;
	}
	public void setBrandCommission(int x) {
		float brandCommission;
		switch(x) {
			case 1: 
				brandCommission = 0.011f;
				break;
			case 2: 
				brandCommission = 0.01f;
				break;
			case 3: 
				brandCommission = 0.014f;
			case 4: 
				brandCommission = 0;
				break;
			case 5:
				brandCommission = 0;
				break;
			case 6: 
				brandCommission = 0;
				break;
			case 7: 
				brandCommission = 0.008f;
				break;
			case 8: 
				brandCommission = 0.01f;
				break;
			case 9: 
				brandCommission = 0.015f;
				break;
			default :
				brandCommission = 0;
				break;
		}
		this.brandCommission = brandCommission;
	}
	
	
	public float getCardCommission() {
		return cardCommission;
	}
	public void setCardCommission(int x) {
		float cardCommission;
		
		switch(x){
		case 1: 
			cardCommission = 0.0018f;
			break;
		case 2: 
			cardCommission = 0.0018f;
			break;
		case 3: 
			cardCommission = 0.002f;
			break;
		case 4: 
			cardCommission = 0.002f;
			break;
		case 5: 
			cardCommission = 0.002f;
			break;
		case 6: 
			cardCommission = 0.0025f;
			break;
		case 7: 
			cardCommission = 0.0025f;
			break;
		case 8: 
			cardCommission = 0.003f;
			break;
		case 9: 
			cardCommission = 0.0035f;
			break;
		case 10: 
			cardCommission = 0.0035f;
			break;
		case 11: 
			cardCommission = 0.0035f;
			break;
		case 12: 
			cardCommission = 0.005f;
			break;
		default:
			cardCommission = 0;
			break;	
		}
		
		this.cardCommission = cardCommission;
	}
	
	
	public float getAfterCardCommission() {
		return afterCardCommission;
	}
	public void setAfterCardCommission(float afterCardCommission) {
		this.afterCardCommission = afterCardCommission;
	}
	public float getSumAllCommission() {
		return sumAllCommission;
	}
	public void setSumAllCommission(float sumAllCommission) {
		this.sumAllCommission = sumAllCommission;
	}
	
	
}
