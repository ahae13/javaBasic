package basic;

public class UnitA {
	int energy;
	String uname;
	int level;
	
	UnitA(int energy, String uname, int level){
		this.energy = energy;
		this.uname = uname;
		this.level = 1;
	}
	
	void attack(UnitB unitB) {
		unitB.decreaseEnergy();
	}
	
	public String toString() {
		return "Unit이름 : " + uname + ", 에너지 : " + energy + ", 레벨 : " + level;
	}
}
