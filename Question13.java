
public class Question13 {

	public static void main(String[] args) {
		int number=9237;
		String str=""+number;
		int flag=0;
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				String sqr=""+str.charAt(i)+str.charAt(j);
                if(checkSquare(sqr)) {
                	flag=1;
                	System.out.println(sqr+" "+2);
                	break;
                }
			}
		}
		if(flag==0) {
			System.out.println(-1);
		}
	}

	private static boolean checkSquare(String sqr) {
        int i=2;
        int num=Integer.parseInt(sqr);
		while(i*i<=num) {
			if(i*i==num) {
				return true;
			}
			i++;
		}
		return false;
	}

}
