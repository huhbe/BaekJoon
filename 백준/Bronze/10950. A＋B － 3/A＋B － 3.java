import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int testCase=Integer.parseInt(sc.nextLine());
        
        for(int i=1; i<=testCase; i++) {
        	String input = sc.nextLine();
            String[] a=input.split(" ");
            int result = Integer.parseInt(a[0])+Integer.parseInt(a[1]);
            System.out.println(result);
        }
    }	
}