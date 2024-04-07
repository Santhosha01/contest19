import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Question19 {
	 static Scanner sc=new Scanner(System.in);
		public static void main(String[] args) {
	System.out.println("Enter Number of trips form A to B");
	int noOfA = sc.nextInt();
	System.out.println("Enter Number of trips form B to A");
	int noOfB = sc.nextInt();
	String[][] trainA = new String[noOfA][2];
	String[][] trainB = new String[noOfB][2];
	if(noOfA==0) {
		System.out.println("There is no Train Schedule Station A");
	}
	else {
		System.out.println("Enter the Train schedule A in 'HH:MM' format:");
		for (int i = 0; i < noOfA; i++) {
			trainA[i][0] = sc.next();
			trainA[i][1] = sc.next();
		}
	}
	if(noOfB==0) {
		System.out.println("There is no Train Schedule Station B");
	}
	else {
		System.out.println("Enter the Train schedule B in 'HH:MM' format:");
		for (int i = 0; i < noOfB; i++) {
			trainB[i][0] = sc.next();
			trainB[i][1] = sc.next();
		}
	}
	System.out.println();
	findNoofTrains(trainA, trainB);
}
public static int findNoofTrains(String[][] aTrips, String[][] bTrips) {
	List<String> depA = new ArrayList<String>();
	List<String> arrA = new ArrayList<String>();
	List<String> depB = new ArrayList<String>();
	List<String> arrB = new ArrayList<String>();
	int countA = 0, countB = 0;
	for (int i = 0; i < aTrips.length; i++) {
		depA.add(aTrips[i][0]);
		arrA.add(aTrips[i][1]);
	}
	for (int i = 0; i < bTrips.length; i++) {
		depB.add( bTrips[i][0]);
		arrB.add( bTrips[i][1]);
	}
	for (int i = 0; i < depA.size(); i++) {
		if (arrB.isEmpty()) {
			countA = depA.size();
			break;
		}
		if (Collections.min(arrB).compareTo(depA.get(i)) < 0) {
			arrB.remove(Collections.min(arrB));
			continue;
		} 
		else {
			countA++;
		}
	}
	for (int i = 0; i < depB.size(); i++) {
		if (arrA.isEmpty()) {
			countB = depB.size();
			break;
		}
		if (Collections.min(arrA).compareTo(depB.get(i)) < 0) {
			arrA.remove(Collections.min(arrA));
			continue;
		} else {
			countB++;
		}
	}
	System.out.println("Total Train need in station A : " + countA);
	System.out.println("Total Train need in station B : " + countB);
	return 0;
}
	
//    static Scanner sc=new Scanner(System.in);
//	public static void main(String[] args) {
//		System.out.println("First Length of the Array1");
//		int len1=sc.nextInt();
//		System.out.println("Second Length of the Array1");
//		int len2=sc.nextInt();
//		String str1[][]=new String[len1][len2];
//		System.out.println("First Length of the Array2");
//		int len3=sc.nextInt();
//		System.out.println("Second Length of the Array2");
//		int len4=sc.nextInt();
//		String str2[][]=new String[len3][len4];
//		System.out.println("Enter the array elements");
//		for(int i=0;i<len1;i++) {
//			for(int j=0;j<len2;j++) {
//				str1[i][j]=sc.next();
//			}
//		}
//		System.out.println("Enter the array elements");
//		for(int i=0;i<len3;i++) {
//			for(int j=0;j<len4;j++) {
//				str2[i][j]=sc.next();
//			}
//		}
//	    int ans[]=findNoofTrains(str1, str2);
//	    System.out.println(Arrays.toString(ans));
//	}
//
//	public static int[] findNoofTrains(String s1[][],String s2[][]) {
//		int countA=0;
//		int countB=0;
//		List<String> DepA = new ArrayList<String>();
//		List<String> ArrA = new ArrayList<String>();
//		List<String> DepB = new ArrayList<String>();
//		List<String> ArrB = new ArrayList<String>();
//		
//		for (int i = 0; i < s1.length; i++) {
//			DepA.add(s1[i][0]);
//			ArrA.add(s1[i][1]);
//		}
//		for (int i = 0; i < s2.length; i++) {
//			DepB.add( s2[i][0]);
//			ArrB.add( s2[i][1]);
//		}
//		for (int i = 0; i < DepA.size(); i++) {
//			if (ArrB.isEmpty()) {
//				countA = DepA.size();
//				break;
//			}
//			if (Collections.min(ArrB).compareTo(DepA.get(i)) < 0) {
//				ArrB.remove(Collections.min(ArrB));
//				continue;
//			} 
//			else {
//				countA++;
//			}
//		}
//		for (int i = 0; i < DepB.size(); i++) {
//			if (ArrA.isEmpty()) {
//				countB = DepB.size();
//				break;
//			}
//			if (Collections.min(ArrA).compareTo(DepB.get(i)) < 0) {
//				ArrA.remove(Collections.min(ArrA));
//				continue;
//			} else {
//				countB++;
//			}
//		}
//		int[] ans= {countA,countB};
//		return ans;
//	}
}
