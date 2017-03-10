package CoreJava;

public class thisdemo {
	
	int a = 2;
	
	public void getData()
	{
		int a =3;
		int b =a+this.a; // this is a keyword
		
		// this* is a keyword in Java
		System.out.println(a);
		System.out.println(this.a); // this refers to current object - object scope lies in class level
		System.out.println(b);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		thisdemo td= new thisdemo();
		td.getData();
		

	}

}
