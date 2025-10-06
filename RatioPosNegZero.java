// this is a array package!!!!!!1
package array_package;

public class RatioPosNegZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr= {-4, 3, -9, 0, 4, 1};
		int poscount=0;
		int negcount=0;
		int zerocount=0;
		
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>0) {
				poscount++;
			}
			else if(arr[i]<0)
			{
				negcount++;
			}
			else if(arr[i]==0)
			{
				zerocount++;
			}
			
		}
		
		double positive = (double)poscount/arr.length;
		double negative = (double)negcount/arr.length;
		double zero = (double)zerocount/arr.length;
		
		System.out.println(String.format("%.6f", positive));
		System.out.println(String.format("%.6f", negative));
		System.out.println(String.format("%.6f", zero));

	}

}
