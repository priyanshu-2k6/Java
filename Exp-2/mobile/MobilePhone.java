class Mobile{	
	String brand,model;
	double price;	
	Mobile(){		
		brand = "Unknown";
		model = "Unknown";
		price = 0.0;		
	}	
	Mobile(String a, String b, double c){		
		brand = a;
		model = b;
		price = c;		
	}	
	void showInfo(){		
		System.out.println("Model = " + model);
		System.out.println("Brand = " + brand);
		System.out.println("Price = Rs. " + price);		
	}	
}
public class MobilePhone{	
	public static void main(String[] args){		
		Mobile m1 = new Mobile(),m2 = new Mobile("Samsung","A35",25000.00);		
		System.out.println("Phone1 (Default Constructor):");
		m1.showInfo();		
		System.out.println("Phone2 (Parameterized Constructor):");
		m2.showInfo();			
	}	
}