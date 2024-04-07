
public class Question9 {

	public static void main(String[] args) {
		int arr[]= {16,17,4,3,1,2};
		int count=0,count1=0;
		for(int i=arr.length-2;i>=0;i--) {
			count=0;
		    count1=0;
			for(int j=i+1;j<arr.length;j++) {	
				count++;
				if(arr[i]>arr[j]) {
					count1++;
				}
			}
			if(count!=0&&count==count1) {
				System.out.println("ans "+arr[i]);
			}
		}
		System.out.println("ans "+arr[arr.length-1]);
	}

}
