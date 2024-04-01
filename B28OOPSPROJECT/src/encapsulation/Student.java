package encapsulation;

public class Student {
	private int studentId;
	private String studentName;
	private String studentAddress;
	private double studentPerc;
	private long studentContact;
	private char studentGrade;

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentAddress(String studentAddress) {
		this.studentAddress = studentAddress;
	}

	public String getStudentAddress() {
		return studentAddress;
	}

	public void setStudentPerc(double studentPerc) {
		this.studentPerc = studentPerc;
	}

	public double getStudentPerc() {
		return studentPerc;
	}

	public void setStudentContact(long studentContact) {
		this.studentContact = studentContact;
	}

	public long getStudentContact() {
		return studentContact;
	}

	public void setStudentGrade(char studentGrade) {
		this.studentGrade = studentGrade;
	}

	public char getStudentGrade() {
		return studentGrade;
	}

	public static void main(String[] args) {
		Student s = new Student();
		s.setStudentId(10);
		System.out.println(s.getStudentId());
		s.setStudentName("Amit");
		System.out.println(s.getStudentName());
		s.setStudentAddress("Odisha");
		System.out.println(s.getStudentAddress());
		s.setStudentPerc(98.70);
		System.out.println(s.getStudentPerc());
		s.setStudentContact(9861733914l);
		System.out.println(s.getStudentContact());
		s.setStudentGrade('O');
		System.out.println(s.getStudentGrade());
	}

}
