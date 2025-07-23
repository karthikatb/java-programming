import java.util.Scanner;
public class Odd {
	public static void main(String[] args) {
		Scanner n=new Scanner(System.in);
		System.out.println("number:");
		int n1=n.nextInt();
		int i;
		for (i=0;i<=n1;i++) {
			if(i%2!=0) {
				System.out.println(+i);
			}
		}
		
	}

}
