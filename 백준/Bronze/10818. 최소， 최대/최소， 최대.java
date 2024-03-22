import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int n=sc.nextInt();
		
		int[] ary=new int[n];
		
		for(int i=0; i<ary.length; i++) {
			ary[i]=sc.nextInt();
		}
		
		int min=ary[0];
		int max=ary[0];
		
		for(int i=0; i<ary.length; i++) {
			if(min>ary[i]) {
				min=ary[i];
			}
			if(max<ary[i]) {
				max=ary[i];
			}
		}
		sc.close();
		System.out.println(min+" "+max);
	}
}