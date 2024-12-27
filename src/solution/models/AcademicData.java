package solution.models;

public class AcademicData {
	private String NIM, degree, major, kelas;

	public AcademicData(String NIM, String degree, String major, String kelas) {
		super();
		this.NIM = NIM;
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
	
	@Override
    public String toString() {
        return "NIM: " + NIM + ", Degree: " + degree + ", Major: " + major + ", Class: " + kelas;
    }
}
