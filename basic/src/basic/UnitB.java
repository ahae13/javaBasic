package basic;

public class UnitB {
	int energy;
	String uname;
	int level;
	
	
	public UnitB(int energy, String uname, int level){
		this.energy = energy;
		this.uname = uname;
		this.level = 1;
	}
	
	public void decreaseEnergy() {
		energy -= 10;
	}

	public String toString() {
		return "Unit이름 : " + uname + ", 에너지 : " + energy + ", 레벨 : " + level;
	}
}
