import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt(); //3
		int x=sc.nextInt(); //5
		
		int[] a=new int[n]; //1, 4, 7
		
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		for(int i=0; i<a.length; i++) {
			if(a[i]<x) {
				System.out.println(a[i]+"");
			}
		}
		
	}
}
