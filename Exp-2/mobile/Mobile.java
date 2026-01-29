class MobilePhone{	
	String brand,model;
	double price;	
	MobilePhone(){		
		brand = "Unknown";
		model = "Unknown";
		price = 0.0;		
	}	
	MobilePhone(String a, String b, double c){		
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
public class Mobile{	
	public static void main(String[] args){		
		MobilePhone m1 = new MobilePhone(),m2 = new MobilePhone("Samsung","A35",25000.00);		
		System.out.println("Phone1 (Default Constructor):");
		m1.showInfo();		
		System.out.println("Phone2 (Parameterized Constructor):");
		m2.showInfo();			
	}	
}