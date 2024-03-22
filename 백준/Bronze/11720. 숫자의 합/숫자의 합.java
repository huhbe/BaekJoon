import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int count=sc.nextInt();
		int sum=0;
		
		String a=sc.next();
		String[] str=a.split("");
		
		for(int i=0; i<count; i++) {
			sum+=Integer.parseInt(str[i]);
		}
		System.out.println(sum);
	}
}
