package Lab4;
import java.util.Scanner;
public class TwoDimension {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the row");
		int r=sc.nextInt();
		System.out.println("Enter the column:");
		int c=sc.nextInt();
		int [][]matrix=new int[r][c];
		int [][]transpose=new int[r][c];
		System.out.println("Enter the elements:");
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				matrix[i][j]=sc.nextInt();
				
			}
			System.out.println();
		}
		for (int i=0;i<matrix.length;i++) {
			for(int j=0;j<matrix[i].length;j++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				transpose[j][i]=matrix[i][j];
			}
		}
		System.out.println("Transpose");
		for (int j=0;j<matrix.length;j++) {
			for(int i=0;i<matrix[j].length;i++) {
				System.out.print(matrix[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
