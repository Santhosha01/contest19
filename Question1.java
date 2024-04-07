
public class Question1 {

	public static void main(String[] args) {
		int arr[] = {10,20,7,5,1,3,4,6};
		if (arr.length == 0) {
			System.out.println(0);
		} else {
			int min = arr[0], profit = 0;
			for (int i = 1; i < arr.length; i++) {
				if (arr[i] > min) {
					profit = Math.max(profit, arr[i] - min);
				}
				if (arr[i] < min) {
					min = arr[i];
				}
			}
			System.out.println(profit);
		}		
	}

}
