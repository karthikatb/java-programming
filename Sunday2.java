package helloworld;
import java.util.Scanner;
public class Sunday2 {
	public static void main(String[] args) {
	Sunday1 stu=new Sunday1();
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Name:");
	stu.name=sc.nextLine();
	System.out.println("Enter the Department:");
	stu.dep=sc.nextLine();
	System.out.println("Enter the Roll No:");
	stu.roll=sc.nextInt();
	stu.details();
	
	}	
}
