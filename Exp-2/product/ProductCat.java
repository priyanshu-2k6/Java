class Product{
	
	int productID, quantity;
	String name;
	double price1,price2;
	
	Product(){
		
		productID = 0;
		quantity = 0;
		name = "Unknown";
		price1 = 0.0;
		
	}
	
	Product(int p, int q, String n, double pr){
		
		productID = p;
		quantity = q;
		name = n;
		price1 = pr;
		if(quantity>=100 && quantity<200){
			price2 = (pr - ((pr*10)/100))*quantity;
		}
		else if(quantity>=200 && quantity<500){
			price2 = (pr - ((pr*20)/100))*quantity;
		}
		else if(quantity>=500){
			price2 = (pr - ((pr*35)/100))*quantity;
		}
		else{
			price2 = pr*quantity;
		}
		
	}
	
	void displayInfo(){
		
		System.out.println("ProductID = "+productID);
		System.out.println("Quantity = "+quantity);
		System.out.println("Name = "+name);
		System.out.println("Price = Rs. "+price1);	
		System.out.println("Total cost(incl. Discount) = Rs. "+price2);
		
	}
	
}

public class ProductCat{
	
	public static void main(String[] args){
		
		Product p1 = new Product(401,52,"Keyboard",100),p2 = new Product(402,175,"Deskto Mat",75), p3 = new Product(403,217,"Mouse",20), p4 = new Product(404,573,"RAM", 325);
		System.out.println();
		
		p1.displayInfo();
		System.out.println();
		p2.displayInfo();
		System.out.println();
		
		p3.displayInfo();
		System.out.println();
		
		p4.displayInfo();
		
		
	}
	
}