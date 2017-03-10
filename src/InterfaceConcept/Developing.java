package InterfaceConcept;

public class Developing implements BankingClient,DomainClient{
	// Now this class is responsible to implement ALL the Methods of this BankingClient Interface

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Developing d=new Developing(); //Developing is return type
		//Object.method (Syntax)
		d.paycreditcard();
		d.transferbalance();
		d.checkingbalance();
		d.login();

		// Interface 1 (We can use multiple interfaces with one class)
		BankingClient d1=new Developing(); // Runtime polymorphism 
		//d1.
		
		// Interface 2
		DomainClient d2=new Developing();
		d2.investment();

	}

	@Override
	public void paycreditcard() {
		// TODO Auto-generated method stub
		//
		System.out.print("paycreditcard implemented");
		
	}

	@Override
	public void transferbalance() {
		// TODO Auto-generated method stub
		//
		System.out.print("transferbalance implemented");
	}

	@Override
	public void checkingbalance() {
		// TODO Auto-generated method stub
		//
		System.out.print("checkingbalance implemented");
		
	}
    
	public void login()
	{
		System.out.println("Loggedin");
	}

	@Override
	public void investment() {
		// TODO Auto-generated method stub
		System.out.println("Investing Something");
	}
}
