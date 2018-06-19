package Pizza_hut_AbstractFactory;

import java.util.Scanner;

import Pizza_hut_AbstractFactory.PizzaHutSingleton.ClassObj;

public class PizzaHutSingleton {
	
		
	public static void main(String[] args) {
		
		
		 int prize1;
		 //PizzaHutFac pizza=new PizzaHutFac();
			
			PizzaHut p1=PizzaHutFac.getPizzaOrder(ClassObj.veg);
			
			System.out.println(p1);

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


	


	static class PizzaHutFac{
		
		public static PizzaHut getPizzaOrder(ClassObj veg){
			
							 return veg.getPizza();
						
	}
		
	}
	enum ClassObj{
		veg,
		nonveg;

		public PizzaHut getPizza() {
			// TODO Auto-generated method stub
			return null;
		}
	}
	
}
