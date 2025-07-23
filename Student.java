import java.util.Scanner;
public class Student {
	public static void main(String[] args) {
		StudentDetails stu=new StudentDetails();
		Scanner sc=new Scanner(System.in);
		System.out.println("Name");
		stu.name=sc.nextLine();
		System.out.println("Age:");
		stu.age=sc.nextInt();
		stu.displayDetails();
	}
}
