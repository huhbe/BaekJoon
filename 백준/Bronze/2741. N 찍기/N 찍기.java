import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int result = Integer.parseInt(input);
        
        for(int i=1; i<=result; i++) {
        	System.out.println(i);
        }
    }	
}