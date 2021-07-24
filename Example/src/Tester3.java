
public class Tester3 {

			public static void main(String args[]) {

				Pal employee = new Pal();
				employee.setEmployeeId("C101");
				employee.setEmployeeName("Steve");
				employee.setSalary(650);
				employee.setJobLevel(3);
				employee.setBonus(500);

				employee.calculateSalary();

				System.out.println("Employee Details");
				System.out.println("Employee Id: " + employee.getEmployeeId());
				System.out.println("Employee Name: " + employee.getEmployeeName());
				System.out.println("Salary: " + employee.getSalary());
	 			System.out.println("bonus: " +employee.getBonus());
	 			System.out.print("Job : " + employee.getJobLevel());

			

	}

}
