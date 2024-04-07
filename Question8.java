import java.util.Arrays;

public class Question8 {

	public static void main(String[] args) {
		int d1[] = {01,01,2000};
		int d2[]= {01,01,2004};
		if(d1[0]==d2[0]&&d1[1]==d2[1]&&d1[2]==d2[2]) {
			System.out.println(0);
		}
		else {
			int arr[]=new int[3];
			int sum=0,leap=0;
            arr[0]=d2[2]-d1[2];
            arr[1]=d2[1]-d1[1];
            arr[2]=d2[0]-d1[0];
            System.out.println(Arrays.toString(arr));
			sum+=arr[0]*365;
			for(int i=d1[2];i<d2[2];i++) {
			if(i%400==0||i%4==0) {
					leap++;
				}
			}
			sum+=leap;
			System.out.println(leap);
			if(!(d2[1]==(d1[1]))) {
				for(int k=d2[1]-d1[1];k>0;k--) {
				if(k==1||k==3||k==5||k==7||k==8||k==10||k==12) {
				sum+=1*31;
			}
			else if(k==4||k==6||k==9||k==11) {
				sum+=1*30;
			}
			else if(k==2) {
					sum+=1*28;
			}
			}
			}
			sum+=Math.abs(arr[2]);
			System.out.println(sum);
		}
	}
}
//       int d1[]= {1,2,2000};
//       int d2[]= {1,2,2004};
//       SimpleDateFormat sd=new SimpleDateFormat("MM-dd-yyyy");
//       String str1="0"+d1[1]+"-0"+d1[0]+"-"+d1[2];
//       String str2="0"+d2[1]+"-0"+d2[0]+"-"+d2[2];
//      try {
//       Date date1=sd.parse(str1);
//       Date date2=sd.parse(str2);
//       long dates=date2.getTime()-date1.getTime();
//       System.out.println(dates);
//       long remainingDate=(dates/(1000*60*60*24))%365;
//       System.out.println(remainingDate);
//      }
//      catch(Exception e) {
//      }
//		SimpleDateFormat dateFormat=new SimpleDateFormat("MM-dd-yyyy");
//		String str1="01-01-2020";
//		String str2=dateFormat.format(new Date());
//		Date date1;
//		try {
//			date1 = dateFormat.parse(str1);
//			Date date2=dateFormat.parse(str2);
//			long dates=date2.getTime()-date1.getTime();
//			long remainingDate=(dates/(1000l*60*60*24*365));
//			System.out.println(remainingDate);
//		} catch (ParseException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		


