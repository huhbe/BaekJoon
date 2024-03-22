import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		boolean[] student=new boolean[31];
		
		int a=0;
		
		for(int i=0; i<28; i++) {
			a=sc.nextInt();
			student[a]=true;
		}
		for(int j=1; j<student.length; j++) {
			if(student[j]==false) {
				System.out.println(j);
			}
		}
	}
}