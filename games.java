public class games extends disks
{
	
String platform;
	
//===========================================================================================================================================
//constructor
public games(String name,int age,String platform,String categories,String company)
{
	super(name,age,categories,company);
	this.platform=platform;
	
}
public games(){
	   	super();
	}
//===========================================================================================================================================
//sets
public void setPlatform(String platform)
{
	this.platform=platform;
}
//===========================================================================================================================================
//gets
public String getPlatform()
{
	return platform;
}
//===========================================================================================================================================
 public String toString()
  {   
   
	    return super.toString()+"\nName : "+name+" \nAge : "+age+" \nCategories : "+categories+" \nCompany : "+company+" \nPlatform : "+platform+"\n"+"\n";
		  
		  
  }

}