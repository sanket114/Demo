package Pizza_hut_AbstractFactory;

import java.util.Scanner;

public  class TestPizzaHut {

	
public static void main(String[] args) {
	do {
	Scanner sc=new Scanner(System.in);
	System.out.println("\n********************Welcome to Pizza Hut******************");
	System.out.println("*************************VEG og NonVeg**********************");
	String s=sc.next();
	if("Veg".equalsIgnoreCase(s)) {
		
	
	System.out.println("********************Enter below flavor******************** \n\t\t****Margita,DobleCheez,Spice*****");
	
	String s1=sc.next();
	
	
	 int prize1;
	 if("Margita".equalsIgnoreCase(s1))
	 {	
		 System.out.println("\n********************Enter below flavor ************************\n\t*******Small, Medium,  Large********");
		 String s2=sc.next();

		 if("Small".equalsIgnoreCase(s2))
	 
	 {
		  prize1=130;
		  PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else
	 if("Medium".equalsIgnoreCase(s2))
	 {
		 prize1=200;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else
	 if("Large".equalsIgnoreCase(s2))
	 {
		 prize1=300;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }
	 else {
		 System.out.println("not valid");
	 
	 }
	 }
	 //***********************************************************************************************************
	 else 
		 if("DobleCheez".equalsIgnoreCase(s1))
	 {	
		 System.out.println("\n********************Enter below flavor ************************\n\t*******Small, Medium,  Large********");
		 String s2=sc.next();

		 if("Small".equalsIgnoreCase(s2))
	 
	 {
		  prize1=150;
		  PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else
	 if("Medium".equalsIgnoreCase(s2))
	 {
		 prize1=250;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else
	 if("Large".equalsIgnoreCase(s2))
	 {
		 prize1=350;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else {
		 System.out.println("not valid");
	 }
	 }
	 
 //**********************************************************************************************************************8
		 else
			 if("Spice".equalsIgnoreCase(s1))
	 {	
		 System.out.println("\n********************Enter below flavor ************************\n\t*******Small, Medium,  Large********");
		 String s2=sc.next();

		 if("Small".equalsIgnoreCase(s2))
	 
	 {
		  prize1=200;
		  PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else
	 if("Medium".equalsIgnoreCase(s2))
	 {
		 prize1=250;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }
	 else
	 if("Large".equalsIgnoreCase(s2))
	 {
		 prize1=400;
		 PizzaHutFactory pizza=new VegPizzaFactory(s1,prize1,s2);
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
			
			System.out.println(p1);
	 }else {
		 System.out.println("not valid");
	 }
	 }
	 else {
		 System.out.println("Enter proper data");
	 }
	 
	}
	//******************************************************************************************************************************************************************************************************
	//*******************************************************************************************************************************************************************************
	//**********************************************************************
	else
		if("nonveg".equalsIgnoreCase(s)){

			
			
			System.out.println("********************Enter below flavor******************** \n\t\t****nonVeg-Margita,nonVeg-DobleCheez,nonVegSpice*****");
			
			String s1=sc.next();
			
			
			 int prize1;
			 if("nonVeg-Margita".equalsIgnoreCase(s1))
			 {	
				 System.out.println("\n********************Enter below flavor size ************************\n\t*******Small, Medium,  Large********");
				 String s2=sc.next();

				 if("Small".equalsIgnoreCase(s2))
			 
			 {
				  prize1=250;
				  PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else
			 if("Medium".equalsIgnoreCase(s2))
			 {
				 prize1=350;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else
			 if("Large".equalsIgnoreCase(s2))
			 {
				 prize1=450;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }
			 else {
				 System.out.println("not valid");
			 
			 }
			 }
			 //***********************************************************************************************************
			 else 
				 if("nonVeg-DobleCheez".equalsIgnoreCase(s1))
			 {	
				 System.out.println("\n********************Enter below flavor size ************************\n\t*******Small, Medium,  Large********");
				 String s2=sc.next();

				 if("Small".equalsIgnoreCase(s2))
			 
			 {
				  prize1=210;
				  PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else
			 if("Medium".equalsIgnoreCase(s2))
			 {
				 prize1=280;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else
			 if("Large".equalsIgnoreCase(s2))
			 {
				 prize1=390;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else {
				 System.out.println("not valid");
			 }
			 }
			 
		 //**********************************************************************************************************************8
				 else
					 if("nonVeg-Spice".equalsIgnoreCase(s1))
			 {	
				 System.out.println("\n********************Enter below flavor size ************************\n\t*******Small, Medium,  Large********");
				 String s2=sc.next();

				 if("Small".equalsIgnoreCase(s2))
			 
			 {
				  prize1=300;
				  PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else
			 if("Medium".equalsIgnoreCase(s2))
			 {
				 prize1=400;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }
			 else
			 if("Large".equalsIgnoreCase(s2))
			 {
				 prize1=500;
				 PizzaHutFactory pizza=new NonVegPizzaFactory(s1,prize1,s2);
					
					PizzaHut p1=PizzaHutFac.getPizzaOrder(pizza);
					
					System.out.println(p1);
			 }else {
				 System.out.println("not valid");
			 }
			 }
			 else {
				 System.out.println("Enter proper data");
			 }
			 
			
			
		}
		else {
			System.out.println("enter proper data");
		}
	 
	
	}
	while(true);
}
}
abstract class PizzaHut {

	
	abstract String getFlavour();
	abstract int getPrize();
	abstract String getSize();
	
	public String toString() {
		return "Flavour "+this.getFlavour()+"\nPrize ="+this.getPrize()+"\n Size="+this.getSize();
	}
	
}

class VegPizza extends PizzaHut{
	String flavor;
	int prize;
	String size;
	
	
public VegPizza(String flavor, int prize, String size) {
		super();
		this.flavor = flavor;
		this.prize = prize;
		this.size = size;
	}
String getFlavour() {
	// TODO Auto-generated method stub
	return flavor;
}
@Override
int getPrize() {
	// TODO Auto-generated method stub
	return prize;
}
@Override
String getSize() {
	// TODO Auto-generated method stub
	return size;
}

}


class NonVegPizza extends PizzaHut{

	String flavor;
	int prize;
	String size;
	
	public NonVegPizza(String flavor, int prize, String size) {
		super();
		this.flavor = flavor;
		this.prize = prize;
		this.size = size;
	}

	@Override
	String getFlavour() {
		// TODO Auto-generated method stub
		return flavor;
	}

	@Override
	int getPrize() {
		// TODO Auto-generated method stub
		return prize;
	}

	@Override
	String getSize() {
		// TODO Auto-generated method stub
		return size;
	}

	
	
}


abstract class PizzaHutFactory{
	
	
	abstract PizzaHut getPizza();
}


class VegPizzaFactory extends PizzaHutFactory{

	String flavor;
	int prize;
	String size;
	
	
	public VegPizzaFactory(String flavor, int prize, String size) {
		super();
		this.flavor = flavor;
		this.prize = prize;
		this.size = size;
	}


	@Override
	PizzaHut getPizza() {
		// TODO Auto-generated method stub
		
		return new VegPizza(flavor,prize,size);
	}
	
}

class NonVegPizzaFactory extends PizzaHutFactory{

	String flavor;
	int prize;
	String size;
	
	public NonVegPizzaFactory(String flavor, int prize, String size) {
		super();
		this.flavor = flavor;
		this.prize = prize;
		this.size = size;
	}

	@Override
	PizzaHut getPizza() {
		// TODO Auto-generated method stub
		return new NonVegPizza(flavor,prize,size);
	}
	
}


class PizzaHutFac{
	
	public static PizzaHut getPizzaOrder(PizzaHutFactory pizza){
		
						 return pizza.getPizza();
					
}
	
}