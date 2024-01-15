import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		String[] abc=a.split(" ");
		int plusResult = Integer.parseInt(abc[0])+Integer.parseInt(abc[1]);
		int minusResult = Integer.parseInt(abc[0])-Integer.parseInt(abc[1]);
		int multyplyResult = Integer.parseInt(abc[0])*Integer.parseInt(abc[1]);
		int dividedResult = Integer.parseInt(abc[0])/Integer.parseInt(abc[1]);
		int remainderResult = Integer.parseInt(abc[0])%Integer.parseInt(abc[1]);
		
		System.out.println(plusResult);
		System.out.println(minusResult);
		System.out.println(multyplyResult);
		System.out.println(dividedResult);
		System.out.println(remainderResult);
	}
}