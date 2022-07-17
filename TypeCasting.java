package Casting;
import java.util.*;
public class TypeCasting {
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		//implicit conversion
		System.out.println("Illustrating Implicit Type Casting");
		
		char a;
		System.out.print("Enter any Charater : ");
		a= sc.next().charAt(0);
		
		System.out.println("Entered Value of a: "+a);
		
		int b=a;
		System.out.println("Int Value of b: "+b);
		
		float c=a;
		System.out.println("Float Value of c: "+c);
		
		long d=a;
		System.out.println("Long Value of d: "+d);
		
		double e=a;
		System.out.println("Double Value of e: "+e);
		
				
		System.out.println("\n");
		
		System.out.println("Illustrating Explicit Type Casting");
		//explicit conversion
		double x;
		System.out.print("Enter any value : ");
		x= sc.nextDouble();
		int y=(int)x;
		char z= (char)x;
		System.out.println("Value of x: "+x);
		System.out.println("Value of y: "+y);
		System.out.println("Value of z: "+z);
	}
}
