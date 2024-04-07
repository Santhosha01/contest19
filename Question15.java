import java.util.Scanner;

public class Question15 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String str=sc.nextLine();
		int sum=0,flag=0;
		for(int i=0;i<str.length();i++)
		{
			if(i%2!=0) {
	        if(str.charAt(i)>='0'&&str.charAt(i)<='9') {
	        	System.out.println(-1);
	        	flag=1;
	        	break;
	        	}
			}
			if(i+2<str.length()&&i+1<str.length()) {
	        	sum+=calculate(str.charAt(i+1),str.charAt(i),str.charAt(i+2));
			}
	        }
		if(flag==0) {
		System.out.println(sum);
		}
	}

	private static int calculate(char sign,char n1, char n2) {
		int num1=n1-'0';
		int num2=n2-'0';
		switch (sign) {
		case '+': {
			return num1 + num2;
		}
		case '-': {
			return num1 - num2;
		}
		case '*': {
			return num1 * num2;
		}
		case '/': {
			return num1 / num2;
		}
		default:
			return 0;
		}	}

}
