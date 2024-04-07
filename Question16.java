import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
				Scanner sc=new Scanner(System.in);
				int a=63;
		     int b = a % 6;
		        if (b== 1 || b == 0)
		            System.out.println("WS");
		        else if (b == 2 || b == 5)
		            System.out.println("MS");
		        else
		            System.out.println("AS");
				
			}

}
