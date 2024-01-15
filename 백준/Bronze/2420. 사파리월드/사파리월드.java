import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        long n = Integer.parseInt(input[0]);
        long m = Integer.parseInt(input[1]);

        long difference = Math.abs(n - m);
        System.out.println(difference);
    }	
}