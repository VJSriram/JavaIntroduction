package CoreJava;

public class ArraysDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	int a;
		a=4;*/
		
		// A container which stores mutliple values of same data type
		
		int a[] = new int[5]; // Declare an array and allocate memory for the values
		a[0] = 2;
		a[1] = 5;
		a[2] = 8;
		a[3] = 6;
		a[4] = 12; // initailized values into the array
		
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]); // retieve values which are present in the array
		}
		
		//Single dimensational array
		int b[] = {1,4,6,7,10,23};
		
		for(int i=0; i<b.length; i++)
		{
			System.out.println(b[i]);
		}
		

	}

}
