package solution.strategies;

import java.util.Scanner;

import solution.TemplateMethod.UpdateAcademicData;
import solution.TemplateMethod.UpdatePersonalData;
import solution.TemplateMethod.UpdateTemplate;
import solution.models.Student;
import solution.singleton.StudentRepository;

public class UpdateStudentStrategy implements StudentOperationStrategy{
	private Scanner sc = new Scanner(System.in);
	@Override
	public void execute() {
		System.out.println("1. Student Personal Data");
		System.out.println("2. Student Academic Data");
		switch(sc.nextLine()) {
		case "1": 
			new UpdatePersonalData().update();sc.nextLine();
			break;
		case "2": 	
			new UpdateAcademicData().update();sc.nextLine();
			break;
		}
	}
}
