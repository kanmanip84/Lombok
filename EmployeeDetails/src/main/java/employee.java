public class employee {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        System.out.println("-----------------");
        EmployeeDetails ed = new EmployeeDetails(1, "Mani", 12345678, "gmail");
        EmployeeDetails ed1 = new EmployeeDetails(2, "Raji", 87654345, "gmail");
        EmployeeDetails ed2 = new EmployeeDetails(3, "Prem", 98765410, "gmail");
        EmployeeDetails[] emp = new EmployeeDetails[3];
        emp[0] = ed;
        emp[1] = ed1;
        emp[2] = ed2;

        for (int i = 0; i < emp.length; i++) {

            System.out.println(emp[i].getEmployeeId()+"  "+emp[i].getName()+" "+emp[i].getPhoneNo()+"  "+emp[i].getEmailId());

        }

        }
}