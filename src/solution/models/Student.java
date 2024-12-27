package solution.models;

public class Student {
	private AcademicData academicData;
	private PersonalData personalData;

	public Student(PersonalData personalData) {
		this.personalData = personalData;
	}

	public AcademicData getAcademicData() {
		return academicData;
	}

	public void setAcademicData(AcademicData academicData) {
		this.academicData = academicData;
	}

	public PersonalData getPersonalData() {
		return personalData;
	}

	public void setPersonalData(PersonalData personalData) {
		this.personalData = personalData;
	}
	
	public void studentView() {
		System.out.print("Name: ");System.out.println(this.getPersonalData().getName());
		System.out.print("Address: ");System.out.println(this.getPersonalData().getAddress());
		System.out.print("DOB: ");System.out.println(this.getPersonalData().getDOB());
		System.out.print("Email: ");System.out.println(this.getPersonalData().getEmail());
		System.out.print("Phone Number: ");System.out.println(this.getPersonalData().getPhoneNumber());
		System.out.println("===========================");
	}
	
	public void academicView() {
		System.out.print("NIM: ");System.out.println(this.getAcademicData().getNIM());
		System.out.print("Degree: ");System.out.println(this.getAcademicData().getDegree());
		System.out.print("Major: ");System.out.println(this.getAcademicData().getMajor());
		System.out.print("Class: ");System.out.println(this.getAcademicData().getKelas());
		System.out.println("===========================");
	}
	
}
