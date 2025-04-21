package com.practice;

class Product{
	String name;
	double price;
	Product(String name,double price){
		this.name=name;
		this.price=price;
	}
	void disp() {
		System.out.println("The product is: "+ name);
		System.out.println("The product price is: "+ price);
	}
}
class Electronics extends Product{
	String brand;
	int warranty;
	Electronics(String name,double price,String brand,int warranty){
		super(name,price);
		this.brand=brand;
		this.warranty=warranty;
	}
	void disp() {
		System.out.println("The product is: "+ name);
		System.out.println("The product price is: "+ price);
		System.out.println("The product brand is: "+ brand);
		System.out.println("The product warranty is: "+ warranty);
		
	}
	
}
class Clothing extends Product{
	String size;
	String material;
	Clothing(String name,double price,String size,String material){
		super(name,price);
		this.size=size;
		this.material=material;
	}
	void disp() {
		System.out.println("The product is: "+ name);
		System.out.println("The product price is: "+ price);
		System.out.println("The product size is: "+ size);
		System.out.println("The product material is: "+ material);
	}
	
}

public class Product_management {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Electronics e =new Electronics("Mobile",45000,"Samsung",5);
		Clothing c=new Clothing("Kurta",2000,"M","Cotton");
		e.disp();
		c.disp();

	}

}
