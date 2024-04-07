
public class Question10 {

	public static void main(String[] args) {
		String num="769452";
		int sum=0;
		for(int i=0;i<num.length();i++) {
			sum+=num.charAt(i)-'0';
		}
		if(sum%3==0) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
	}

}
