package projecct.text;

public class User {
	
	private int ID;
	
	private String NAME1;
	
	private String BIRTHDAY;

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getNAME1() {
		return NAME1;
	}

	public void setNAME1(String nAME1) {
		NAME1 = nAME1;
	}

	public String getBIRTHDAY() {
		return BIRTHDAY;
	}

	public void setBIRTHDAY(String bIRTHDAY) {
		BIRTHDAY = bIRTHDAY;
	}

	@Override
	public String toString() {
		return "User [ID=" + ID + ", NAME1=" + NAME1 + ", BIRTHDAY=" + BIRTHDAY + "]";
	}

	
}
