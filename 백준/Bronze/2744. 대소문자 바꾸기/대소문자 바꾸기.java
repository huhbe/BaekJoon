import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		String input=sc.next();
		String output="";
		
        for (int i = 0; i < input.length(); i++) {
            char a = input.charAt(i);

            if ((65 <= a) && (a <= 90)) {
                output += Character.toLowerCase(a);
            } else if ((97 <= a) && (a <= 122)) {
                output += Character.toUpperCase(a);
            }
        }
        System.out.println(output);
    }
}