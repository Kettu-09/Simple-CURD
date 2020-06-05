import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AllMethodsEmployee {

	List<EmployeeInfo> list = new ArrayList();
	// Scanner sc = new Scanner(System.in);

	// -------------------------Create Method-------------------------------------

	public void createEmp() {

		Scanner sc = new Scanner(System.in);

		System.out.println("How many Employee you want to add");
		int no = sc.nextInt();

		for (int i = 0; i < no; i++) {

			EmployeeInfo ef = new EmployeeInfo();

			System.out.println("Enter the Employee ID");

			ef.setEmployeeID(sc.nextInt());

			System.out.println("Enter the Enployee Name");

			ef.setEmployeeName(sc.next());

			list.add(ef);

		}

	}

	// -------------------------Display Method-------------------------------------

	public void display() {

		if (list.isEmpty())

			System.out.println("No Details Found");

		else {

			for (Object object : list) {

				System.out.println(object);

			}

		}
	}

	// -------------------------Remove Method-------------------------------------

	public void deleteEmp() {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the Employee ID which is want to delete");
		int id = sc.nextInt();

		EmployeeInfo employeeInfo = null;

		for (EmployeeInfo object : list) {

			if (object.getEmployeeID() == id) {

				employeeInfo = object;

			} else {

				System.out.println("Invalid Employee ID");

			}
		}
		list.remove(employeeInfo);
		System.out.println("Remove Succesfully");

	}

	// -------------------------Update Method-------------------------------------

	public void updateEmpInList() {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Emp ID to update");
		int id = sc.nextInt();
		System.out.println("Enter Emp Name ");
		String empName = sc.next();
		int index;
		for (EmployeeInfo employeeInfo : list) {
			// System.out.println(employeeInfo.getEmployeeID());
			if (employeeInfo.getEmployeeID() == id) {
				index = list.indexOf(employeeInfo);
				// System.out.println(index);
				employeeInfo.setEmployeeID(id);
				employeeInfo.setEmployeeName(empName);
				list.set(index, employeeInfo);
			}
			/*
			 * else { System.out.println("Invalid "); }
			 */
		}

		System.out.println("Successfully updated.........!!!!!!!!!");
	}

	/*
	 * public void updateEmp() { Scanner sc = new Scanner(System.in);
	 * System.out.println("Enter the Employee ID which is want to update"); int id =
	 * sc.nextInt(); //EmployeeInfo employeeInfo = null; for (EmployeeInfo object :
	 * list) { if (object.getEmployeeID() == id) { int index = list.indexOf(object);
	 * // employeeInfo = object;
	 * System.out.println("Update Employee Details through Employee ID"); // Scanner
	 * sc = new Scanner(System.in); // EmployeeInfo e1 = list.get(sc.nextInt());
	 * System.out.println("Enter the new employee ID"); int eId = sc.nextInt();
	 * object.setEmployeeID(eId); System.out.println("Enter the new Employee Name");
	 * object.setEmployeeName(sc.next()); list.set(index, object); } else {
	 * System.out.println("Invalid Employee ID"); } } }
	 */
}
