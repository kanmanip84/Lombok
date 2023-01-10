import java.util.Scanner;

public class Record {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Student id Number : ");
        int idNumber = input.nextInt();
        System.out.print("Enter the Student contact Number : ");
        long contactNumber = input.nextLong();
        System.out.print("Enter the Student Name : ");
        String name = input.next();
        StudentRecord record = new StudentRecord();
        record.setStudentId(idNumber);
        record.setStudentContactNo(contactNumber);
        record.setStudentName(name);
        System.out.println("Student Records:");
        System.out.println("-----------------:");
        System.out.println("Student Id  / Student No  /  Student Name");
        System.out.println(record.getStudentId()+"        / "+record.getStudentContactNo()+"   /   "+record.getStudentName());

    }
}