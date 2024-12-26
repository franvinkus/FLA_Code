import java.util.Scanner;

public class Main {
	Scanner sc = new Scanner(System.in);
	public Main() {
		System.out.print("Username : ");
		String name = sc.nextLine();
		System.out.print("Pass : ");
		String pass = sc.nextLine();
		if(name.equals("admin") && pass.equals("admin")) {
			new Admin(); //call constructor
		}
	}
	public static void main(String[] args) {
		new Main();
	}

}
