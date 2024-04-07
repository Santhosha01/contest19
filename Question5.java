import java.util.Arrays;

public class Question5 {

	public static void main(String[] args) {
		int arr1[]= {11, 1, 13, 21, 3, 7};
		int arr2[]= {11, 3, 7, 1};
		int count=0;
//		for(int i=0;i<arr2.length;i++) {
//			for(int j=0;j<arr1.length;j++) {
//				if(arr2[i]==arr1[j]) {
//					count++;
//				}
//			}
//			if(count==0) {
//				break;
//			}
//		}
//		if(count==arr2.length) {
//			System.out.println("it is a sub Array");
//		}
//		else {
//			System.out.println("not a sub array");
//		}
		Arrays.sort(arr1);
	    Arrays.sort(arr2);
		int i=0;
		while(i<arr2.length) {
			if(arr1[i]==arr2[i]) {
				count++;
			}
			i++;
		}
		if(count==arr2.length) {
			System.out.println("it is a subarray");
		}
		else {
			System.out.println("not a subarray");
		}
	}
}
