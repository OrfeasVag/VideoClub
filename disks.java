public class disks extends mainApp
{
//===========================================================================================================================================

String name,categories,company,type;
int age,id;

//Setting Default Renters data
int rentdays = 0;
int rentcost = 0;
int rentfine = 0;
long rentersnumber = 0;
String rentersname = "";
String rentersdate = "";
boolean status = true;
boolean islate = false;
//===========================================================================================================================================
//constructor
public disks(String name,int age,String categories,String company)
{
	this.name=name;
	this.age=age;
	this.categories=categories;
	this.company=company;
	
}
public disks(){
	   
}

//===========================================================================================================================================
//sets
public void setName(String name) 
{
	this.name=name;
}
public void setAge(int age)
{
	this.age=age;
}
public void setCategories(String categories)
{
	this.categories=categories;
}
public void setCompany(String company)
{
	this.company=company;
}
//===========================================================================================================================================
public void setIsavailable(boolean status)
{
	this.status=status;
}
public void setId(int id)
{
	this.id=id;
}
public void setType(String type)
{
	this.type=type;
}

public void setRentersname(String rentersname)
{
	this.rentersname=rentersname;
}
public void setRentersnumber(long rentersnumber)
{
	this.rentersnumber=rentersnumber;
}
public void setRentersdate(String rentersdate)
{
	this.rentersdate=rentersdate;
}
public void setRentdays(int rentdays)
{
	this.rentdays=rentdays;
}
public void setRentcost(int rentcost)
{
	this.rentcost=rentcost;
}
public void setRentfine(int rentfine)
{
	this.rentfine=rentfine;
}

//===========================================================================================================================================
//gets
public String getName()
{
	return name;
}
public int getAge()
{
	return age;
}
public String getCategories()
{
	return categories;
}
public String getCompany()
{
	return company;
}

//===========================================================================================================================================
public int getId()
{
	return id;
}
public boolean getIsavailable()
{
	return status;
}
public String getType()
{
	return type;
}

public String getRentersname()
{
	return rentersname;
}
public long getRentersnumber()
{
	return rentersnumber;
}
public String getRentersdate()
{
	return rentersdate;
}
public int getRentdays()
{
	return rentdays;
}
public int getRentcost()
{
	return rentcost;
}
public int getRentfine()
{
	return rentfine;
}
//===========================================================================================================================================
public void setIslate(boolean islate)
{
    this.islate=islate;
}
public boolean getIslate()
{
    return islate;
}
//
  public String toString()
  {   
	return "\n---------------------------------------------------------"+
	"\nDisk Info: \nType : "+getType()+"\nIs The Disk Available : "+getIsavailable()+"\nRented to : "+getRentersname()+"\nRenter's Number : "+getRentersnumber()+"\nRenting Date : "+getRentersdate()+"\nRenting Days : "+getRentdays()+"\nRenting Cost : "+getRentcost()+"\nRenting Fine In Case Of Delay (per day) : "+getRentfine() ;
		  
  }
}