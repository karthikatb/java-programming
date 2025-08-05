package helloworld;
import java.util.Scanner;
public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int number=sc.nextInt();
		int i=0;
		for (i=0;i<number;i++) {
			if(i%2==0) {
				System.out.println(i+"\n");
			}
		}
	}

}
