import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int sum=0;
		int n=sc.nextInt(); //11
		int[] a=new int[n]; //n=11
			
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt(); //1 4 1 2 4 2 4 2 3 4 4
		}
		int v=sc.nextInt();
		
		for(int j=0; j<a.length; j++) {
			if(v==a[j]) {
				sum++;
			}
		}
		System.out.println(sum);
	}
}