package array;

public class Average {

	public static void main(String[] args) {
		
		int[] num=new int[6];
		num[0]=20;
		num[1]=40;
		num[2]=60;
		num[3]=80;
		num[4]=100;
		num[5]=90;
		num[6]=70;
		double avg=0.0;
		int sum=0;
		 for(int i=0;i<6;i++)
			 sum=sum+num[i];
		 avg=(double)sum/6;
		 System.out.println("sum of six numbers:"+sum);
		 System.out.println("average of six numbers:"+avg);
		 
			
	}

}
