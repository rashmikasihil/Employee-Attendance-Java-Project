package AddAttendance;

public class attendance {

	private String EmpID;
	private String date;
	private String firstHalf;
	private String secondHalf;
	
	public attendance(String empID, String date, String firstHalf, String secondHalf) {
		this.EmpID = empID;
		this.date = date;
		this.firstHalf = firstHalf;
		this.secondHalf = secondHalf;
	}

	public String getEmpID() {
		return EmpID;
	}

	public String getDate() {
		return date;
	}

	public String getFirstHalf() {
		return firstHalf;
	}

	public String getSecondHalf() {
		return secondHalf;
	}

	
}
