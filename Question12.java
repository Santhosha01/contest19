
public class Question12 {
	    public static void main(String[] args) {
	        int l = 3;
	        int w = 5;
	        int result = minimizeSquareSheets(l, w);
	        System.out.println(result); 
	    }
	    public static int minimizeSquareSheets(int l, int w) {
	        int gcd = calculateGCD(l, w);
	        return (l * w) / (gcd * gcd);
	    }
	    public static int calculateGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }
}
