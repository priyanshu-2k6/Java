

class Shapes{	
	String type;
	double radius, length, width,perimeter,area;	
	Shapes(double r){		
		type = "Circle";
		radius = r;
		area = Math.PI*r*r;
		perimeter = 2*Math.PI*r;		
	}	
	Shapes(double l, double w){
		if(!(l==w)){
			type = "Rectangle";
			length = l;
			width = w;
			area = l*w;
			perimeter = 2*(l+w);
			return;
		}
		type = "Square";
		length = l;
		area = l*l;
		perimeter = 4*l;
	}	
	void display(){		
		if(type=="Circle"){			
			System.out.println("Type = "+type);
			System.out.println("Radius = "+radius);
			System.out.println("Area = "+area);
			System.out.println("Perimeter = "+perimeter);
			return;			
		}
		else if(type=="Rectangle"){			
			System.out.println("Type = "+type);
			System.out.println("Length = "+length);
			System.out.println("Width = "+width);
			System.out.println("Area = "+area);
			System.out.println("Perimeter = "+perimeter);
			return;			
		}
		System.out.println("Type = "+type);
		System.out.println("Side length = "+length);
		System.out.println("Area = "+area);
		System.out.println("Perimeter = "+perimeter);		
	}	
}
public class GeoSha{	
	public static void main(String[] args){		
		Shapes s1 = new Shapes(5), s2 = new Shapes(2,4), s3 = new Shapes(2,2);
		s1.display();
		s2.display();
		s3.display();		
	}	
}