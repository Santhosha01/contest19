import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Value");
		int num=sc.nextInt();
		System.out.println("Enter the value you want to multiple with ");
		int mul=sc.nextInt();
		float sum=multiply(num,mul);
		System.out.println(sum);
		System.out.println("Enter the Even number");
        int num1=sc.nextInt();
        System.out.println("Enter the value you want to multiple with ");
		float mul1=sc.nextFloat();
		float sum1=multiply(num1,mul1);
		System.out.println(sum1);
		System.out.println("Enter the value");
        int num3=sc.nextInt();
        System.out.println("Enter the value you want to divide with");
         int div=sc.nextInt();
        int sum2=division(num3,div);
        float ans=multiply(sum2, 15);
		System.out.println(ans);
	}

	private static int division(int num3, int div) {
	   int count=0;
		while(num3>0) {
		   count++;
		   num3=num3-div;
	   }
		return count;
	}

	private static float multiply(int num,float mul) {
	float sum=0;
		for(int i=1;i<=num;i++) {
		sum+=mul;
	}
		return sum;
	}

}
