
public class Question14 {

	public static void main(String[] args) {
		String str = "abc";
		int index = 0;
		int pro=factorial(str.length());
		String str1[] = new String[pro+1];
		for (int i = 0; i < str.length(); i++) {
			if (strContains(str1, "" + str.charAt(i))) {
				str1[index++] = "" + str.charAt(i);
			} 
			for (int j = i + 1; j < str.length(); j++) {
				if (strContains(str1, str.charAt(i) + "" + str.charAt(j))) {
					str1[index++] = str.charAt(i) + "" + str.charAt(j);
				} 
			}
		}
		str1[index++]=str;
		for (int i = 0; i < str1.length; i++) {
			if(str1[i]!=null) {
			System.out.println(str1[i]);
			}
		}

	}

	private static int factorial(int length) {
		int pro=1;
		while(length>0) {
			pro*=length;
			length--;
		}
		return pro;
	}
	private static boolean strContains(String[] str1, String charAt) {
		for (int i = 0; i < str1.length; i++) {
			if (str1[i] != null && str1[i].equals(charAt)) {
				return false;
			}
		}
		return true;
	}
}
