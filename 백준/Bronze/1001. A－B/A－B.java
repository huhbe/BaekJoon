import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] abc=a.split(" ");
		int result = Integer.parseInt(abc[0])-Integer.parseInt(abc[1]);
		System.out.println(result);
	}
}