import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		int TestCase=sc.nextInt();
		sc.nextLine();
		
		for(int i=1; i<=TestCase; i++) {
			String input=sc.nextLine();
			char first=input.charAt(0);
			
			char last=input.charAt(input.length()-1);
			
			System.out.println(first+""+last);
		}
    }
}