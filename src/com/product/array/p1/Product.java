package com.product.array.p1;

public class Product 
{
	private int pid;
	private String pname;
	private double price;
	private String company;
	private int qt;
	
	public Product()
	{
		
	}

	public Product(int pid, String pname, double price, String company, int qt) 
	{
		super();
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.company = company;
		this.qt = qt;
	}

	public int getPid() 
	{
		return pid;
	}

	public void setPid(int pid) 
	{
		this.pid = pid;
	}

	public String getPname() 
	{
		return pname;
	}

	public void setPname(String pname) 
	{
		this.pname = pname;
	}

	public double getPrice() 
	{
		return price;
	}

	public void setPrice(double price) 
	{
		this.price = price;
	}

	public String getCompany() 
	{
		return this.company;
	}

	public void setCompany(String company) 
	{
		this.company = company;
	}

	public int getQt() 
	{
		return qt;
	}

	public void setQt(int qt) {
		this.qt = qt;
	}
	public void set(int pid,String pname,double price,String company,int qt) {
		this.pid = pid;
		this.pname = pname;
		this.price = price;
		this.company = company;
		this.qt = qt;
		
	}
}
