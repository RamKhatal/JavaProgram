package Pkg1;

public class concretClass extends abstarct
{
	

	public static void main(String[] args)
	{
		concretClass 
		k = new concretClass();
	
	    k.son();
	    k.dughter();
	    k.farmer();
	    k.father();
	    k.wife();
	    k.farm();
	    k.mk1();
	    k.mk2();
	}

	@Override
	void farmer() {
		System.out.println("farming");
		
	}

	@Override
	void father() {
		System.out.println("main of the family");
		
	}

	@Override
	void wife() {
		System.out.println("housewife");
		
	}
	void mk1() {
		System.out.println("rate 7500");
		
	}
	void mk2() {
		System.out.println("rate 12500");
		
	}


	
	
}

