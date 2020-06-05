import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TestEmployee {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TestEmployee te = new TestEmployee();
		AllMethodsEmployee allM = new AllMethodsEmployee();
		while (true) {
			System.out.println("1. Create the New Employee.");
			System.out.println("2. Display the details about Employees.");
			System.out.println("3. Remove the the Employee.");
			System.out.println("4. Update the employee details.");

			Scanner sc = new Scanner(System.in);
			int key = sc.nextInt();

			switch (key) {

			case 1:
				allM.createEmp();
				break;
			case 2:
				allM.display();
				break;
			case 3:
				allM.deleteEmp();
				break;
			case 4:
				allM.updateEmpInList();
				break;
			default:
				System.exit(0);

			}

		}

	}

}
