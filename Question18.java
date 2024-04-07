import java.util.Arrays;

public class Question18 {

	public static void main(String[] args) {
		int arr[] = { 1, 9, 8, 4, 0, 0, 2, 7, 0, 6, 0 };
		int arr2[]=new int[arr.length];
		int index=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
                 arr2[index++]=arr[i];  
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

}
