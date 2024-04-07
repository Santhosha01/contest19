
public class Question11 {

	public static void main(String[] args) {
		int arr[] = { 3,5,7};
		int gcd = arr[0];
		for (int i = 0; i < arr.length; i++) {
			gcd = gcd(gcd, arr[i]);
		}
		System.out.println(gcd);
	}

	private static int gcd(int i, int j) {
		while (j != 0) {
			int temp = j;
			j = i % j;
			i = temp;
		}
		return i;
	}

}
