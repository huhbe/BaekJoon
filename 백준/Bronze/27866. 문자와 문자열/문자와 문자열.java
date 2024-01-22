import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String input = sc.nextLine();
		int input2 = sc.nextInt();
		
		char result=input.charAt(input2-1);
		System.out.println(result);
    }
}