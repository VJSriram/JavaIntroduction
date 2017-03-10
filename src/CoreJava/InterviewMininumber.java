package CoreJava;

public class InterviewMininumber {

	
	/* 2 4 5
	 * 
	 * 3 4 7
	 * 
	1 2 9 */
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		int abc[][]={{2,3,4},{2,6,8},{5,9,4}};
		int min=abc[0][0];
		long time1 = System.currentTimeMillis();
		for (int i=0; i<abc.length; i++)
		{
			for(int j=0; j<abc[i].length; j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
				}
			}
		}
		
		for(long i = 0; i< 1000000000000l; i++){
			
		}
		
		long time2 = System.currentTimeMillis();
		
		
		
		System.out.println(min);
		
		System.out.println("Time taken: " + (time2-time1) + " ms");
		
		


	}

}
