package solution.TemplateMethod;

import java.util.Scanner;

import solution.models.Student;

public abstract class UpdateTemplate {
	protected final Scanner sc = new Scanner(System.in);
	
    public final void update() {
    	show();
        Student student = findStudent();
        if (student != null) {
            displayCurrentData(student);
            performUpdate(student);
            System.out.println("Data updated successfully.");
        } else {
            System.out.println("Student not found.");
        }
    }
    
    protected abstract void show();
    
    protected abstract Student findStudent();

    protected abstract void displayCurrentData(Student student);

    protected abstract void performUpdate(Student student);
}
