package com.projects.lib1;
import java.util.*;

class Mobile 
{
	private int mobileid;
	private String mobilename;
	private String mobilecompany;
	private Double price;
	private int quantity;
	
	public Mobile(int mobileid, String mobilename, String mobilecompany, Double price, int quantity) 
	{
		this.mobileid = mobileid;
		this.mobilename = mobilename;
		this.mobilecompany = mobilecompany;
		this.price = price;
		this.quantity = quantity;
	}

	public int getMobileid() 
	{
		return mobileid;
	}

	public String getMobilename() 
	{
		return mobilename;
	}

	public String getMobilecompany() 
	{
		return mobilecompany;
	}

	public Double getPrice() 
	{
		return price;
	}

	public int getQuantity() 
	{
		return quantity;
	}
	
	public String toString()
	{
		return mobileid+" "+mobilename+" "+mobilecompany+" "+price+""+quantity;
	}
}

class CRUDMain
{
	public static void main(String[] args) 
	{
		
		Collection<Mobile> c = new ArrayList<Mobile>();
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		int ch;
		do
		{
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("5.UPDATE");
			System.out.println("Enter Your Choice : ");
			ch = s.nextInt();
			
//			c.add(new Mobile(1001,"Oneplus 12","Oneplus",35000.00,5));
//			c.add(new Mobile(1002,"IPhone 14","Apple",135000.00,5));
//			c.add(new Mobile(1003,"Samsung S24","Samsung",95000.00,5));
			
			switch(ch)
			{
			
			case 1:
				System.out.print("Enter Mobile ID : ");
				int mid = s.nextInt();
				System.out.print("Enter Mobile Name : ");
				String mname = s1.nextLine();
				System.out.print("Enter Mobile Company : ");
				String mcompany = s1.nextLine();
				System.out.print("Enter Mobile Price : ");
				double pri = s2.nextDouble();
				System.out.print("Enter Quantity : ");
				int quant = s.nextInt();
				
				c.add(new Mobile(mid,mname,mcompany,pri,quant));
				break;
				
			case 2:
//				System.out.println(c);
				Iterator<Mobile> i = c.iterator();
				while(i.hasNext())
				{
					Mobile m = i.next();
					System.out.println(m);
				}
				break;
			
			
		case 3:
			boolean found = false;
//			System.out.println(c);
			System.out.println("Enter Mobile ID To Search");
			mid = s.nextInt();
			i=c.iterator();
			while(i.hasNext())
			{
				Mobile m = i.next();
				if(m.getMobileid()==mid)
				{
					System.out.println(m);
					found = true;
				}
//				System.out.println(m);
				if(!found)
				{
					System.out.println("Record Not Found");
				}
			}
			break;
			
		case 4:
			found = false;
//			System.out.println(c);
			System.out.println("Enter Mobile ID To Delete");
			mid = s.nextInt();
			i=c.iterator();
			while(i.hasNext())
			{
				Mobile m = i.next();
				if(m.getMobileid()==mid)
				{
					System.out.println(m);
					i.remove();
					found = true;
				}
//				System.out.println(m);
				if(!found)
				{
					System.out.println("Record Not Found");
				}
				else
				{
					System.out.println("Record Deleted successfully !!");
				}
			}
			break;
			
		default:
			System.out.println("Enter Valid Input");
			break;
		}
		}while(ch!=0) ;
	}
}
