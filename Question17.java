import java.util.Arrays;

public class Question17 {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 0, 4, 3, 0, 5, 0 };
		int len = arr.length;
		int index = 0, temp = 0;
		for (int i = 0; i < len; i++) {
			if (arr[i] != 0) {
				temp = arr[i];
				arr[i] = arr[index];
				arr[index] = temp;
				index++;
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
