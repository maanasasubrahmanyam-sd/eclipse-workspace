package com.home.prerp.string;



public class MaximumAllsubarrays {

	public static void main(String[] args) {
                                   //i   j
		int[] i = new int[] {4,1,1,1,2,3,5};
		int k = 5;
		int max = maxOfAllSubArray(i,k);
		System.out.println(max);
	}

	private static int maxOfAllSubArray(int[] arr, int k) {
		int sum = 0;
		int i =0;
		int j =0;
		int mx = 0;
		
		while(j < arr.length) 
		{
			sum = sum + arr[j];
			if(sum < k) 
			{
				j++;
			}
			
			else if(sum == k) 
            {
                System.out.println("Condition Met");
				mx=Math.max(mx,j-i+1);
                j++;
            }
			
			else if(sum>k)
	            {
	                while(sum>k)
	                {
	                    sum=sum-arr[i];
	                    i++;
	                }
	             j++;
				}
		
		  }
		return mx;
	}
}


				
			
			
		

	

