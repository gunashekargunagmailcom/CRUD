package com.product.array.p1;

import java.util.Scanner;

public class Service 
{

	Product[] arr;
	int k = 0;
	Scanner ip = new Scanner(System.in);
	
	void createDataBase(int size)
	{
		arr = new Product[size];
		System.out.println("DataBase has Been Created With Size : "+size);
	}
	
	void addProduct()
	{
		System.out.println("=========Adding Into DataBase===============");
		if(k==arr.length)
		{
			System.out.println("DataBase Is Full"); 
		}
		else
		{
			System.out.println("Enter Product ID : ");
			int pid = ip.nextInt();
			System.out.println("Enter Product Name : ");
			String pname = ip.next();
			System.out.println("Enter Product Price : ");
			double price = ip.nextDouble();
			System.out.println("Enter Product Company : ");
			String company = ip.next();
			System.out.println("Enter Quantity : ");
			int qt = ip.nextInt();
			
			Product p = new Product(pid, pname, price, company, qt);
			arr[k]=p;
			k++;
			System.out.println("Product has been Added to DataBase..!");
		}
		System.out.println("================================================");
	}
		
		void findById()
		{
			System.out.println("===========================================");
			System.out.println("Enter ID");
			int c = 0;
			int pid = ip.nextInt();
			for(Product ele:arr)
			{
				if(ele.getPid()==pid)
				{
					System.out.println("PId : "+ele.getPid());
					System.out.println("PName : "+ele.getPname());
					System.out.println("Price : "+ele.getPrice());
					System.out.println("Company : "+ele.getCompany());
					System.out.println("Qantity : "+ele.getQt());
					c++;
					break;
				}
			}
			if(c==0)
			{
				System.out.println("ID Record Not Found !!");
			}
			System.out.println("============================================");
		}
		
		void findByCompany()
		{
			System.out.println("===========================================");
			System.out.println("Enter Company");
			int c = 0;
			String company = ip.next();
			for(int i=0;i<arr.length;i++)
			{
				char []str=arr[i].getCompany().toCharArray();
				boolean check=true;
				for(int j=0;j<str.length;j++) 
				{
					if(str.length!=company.toCharArray().length)break;
					else if(str[j]!=company.toCharArray()[j]) 
					{
						check=false;
						break;
						
					}
				}
				if(check==true)
				{
					System.out.println("PId : "+arr[i].getPid());
					System.out.println("PName : "+arr[i].getPname());
					System.out.println("Price : "+arr[i].getPrice());
					System.out.println("Company : "+arr[i].getCompany());
					System.out.println("Qantity : "+arr[i].getQt());
					return;
				}
			}
			if(c==0)
			{
				System.out.println("ID Record Not Found !!");
			}
			System.out.println("============================================");
		}
		
		void updateId()
		{
			System.out.println("===========================================");
		
			System.out.println("Enter ID");
			int c = 0;
			int pid = ip.nextInt();
			for(Product ele:arr)
			{
				if(ele.getPid()==pid)
				{
					System.out.println("Enter Product Name : ");
					String pname = ip.next();
					System.out.println("Enter Product Price : ");
					double price = ip.nextDouble();
					System.out.println("Enter Product Company : ");
					String company = ip.next();
					System.out.println("Enter Quantity : ");
					int qt = ip.nextInt();
					ele.set(pid, pname, price, company, qt);
					break;
				}
			}
			if(c==0)
			{
				System.out.println("ID Record Not Found !!");
			}

			System.out.println("============================================");	
		}
		
		void findDisplay()
		{
			System.out.println("============================================");
			for(Product ele:arr)
			{
				System.out.println("PId : "+ele.getPid());
				System.out.println("PName : "+ele.getPname());
				System.out.println("Price : "+ele.getPrice());
				System.out.println("Company : "+ele.getCompany());
				System.out.println("Qantity : "+ele.getQt());
					
			}
			System.out.println("=============================================");
		}
	}
