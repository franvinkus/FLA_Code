package solution.builder;

import solution.factory.DataFactory;
import solution.factory.StudentFactory;
import solution.models.PersonalData;
import solution.models.Student;

public class StudentBuilder {
	private String name;
	private String DOB;
	private String address;
	private String email;
	private String phoneNumber;

	public StudentBuilder setName(String name) {
		this.name = name;
		return this;
	}

	public StudentBuilder setDOB(String DOB) {
		this.DOB = DOB;
		return this;
	}

	public StudentBuilder setAddress(String address) {
		this.address = address;
		return this;
	}

	public StudentBuilder setEmail(String email) {
		this.email = email;
		return this;
	}

	public StudentBuilder setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
		return this;
	}

	public Student build() {
		PersonalData personalData = DataFactory.createPersonalData(name, DOB, address, email, phoneNumber);
		Student student = StudentFactory.createStudent(personalData);

		return student;
	}
}
