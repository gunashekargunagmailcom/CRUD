package com.product.array.p1;

import java.util.Scanner;


public class App 
{
	public static void main(String[] args) 
	{
		Service s = new Service();
		System.out.println("===============Product Management System=============");
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Size of DataBase..!!");
		int size = ip.nextInt();
		s.createDataBase(size);
		while(true)
		{
			System.out.println("=====Menu======");
			System.out.println("1.Add Product \n");
			System.out.println("2.Find By ID \n");
			System.out.println("3.Find By Company \n");
			System.out.println("4.Update BY ID \n");
			System.out.println("5.Display Details \n");
			System.out.println("6.Exit \n");
			System.out.println("Enter The Option:-");
			int op = ip.nextInt();
			
			switch(op)
			{
			case 1 : s.addProduct(); 
			break;			
			case 2 : s.findById(); 
			break;		
			case 3 : s.findByCompany(); 
			break;			
			case 4 : s.updateId(); 
			break;			
			case 5 : s.findDisplay(); 
			break;
			case 6 : System.out.println("Thank You..!!"); 
				     System.exit(0);
			default : System.out.println("InValid Option");
			break;
			}
			
		}
		
	}
}
