package solution;

public class AcademicData {
	private String NIM, degree, major, kelas;

	public AcademicData(String nIM, String degree, String major, String kelas) {
		super();
		NIM = nIM;
		this.degree = degree;
		this.major = major;
		this.kelas = kelas;
	}
	
	//Getters
	public String getNIM() {
		return NIM;
	}
	
	public String getDegree() {
		return degree;
	}
	
	public String getMajor() {
		return major;
	}
	
	public String getKelas() {
		return kelas;
	}
	
	//Setters
	public void setMajor(String major) {
		this.major = major;
	}

	public void setKelas(String kelas) {
		this.kelas = kelas;
	}
}
