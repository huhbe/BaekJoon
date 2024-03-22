import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		String text=sc.nextLine();
		
		StringTokenizer st=new StringTokenizer(text);
		
		int count=st.countTokens();
		
		System.out.println(count);
		
	}
}