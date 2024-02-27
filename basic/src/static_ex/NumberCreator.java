package static_ex;

public class NumberCreator {
	private static int num;
	private String productNo;
	
	public NumberCreator() {
		num++;
		setProductNo("p-" + num);
	}
	
	private void setProductNo(String productNo) {
		this.productNo = productNo;
	}
	
	public static int getNum() {
		return num;
	}
	
	public String getProductNo() {
		return productNo;
	}
	
	@Override
	public String toString() {
		return productNo + ", " + num;
	}
}
