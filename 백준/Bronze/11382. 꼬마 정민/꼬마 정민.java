import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] abc=a.split(" ");
		long plusResult =Long.parseLong(abc[0])+Long.parseLong(abc[1])+Long.parseLong(abc[2]);
		System.out.println(plusResult);
	}
}
