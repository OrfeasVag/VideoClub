public class blueray extends dvd
{
//===========================================================================================================================================
//constructor 
 public blueray(String name,int age,String categories,String company,String director,String scriptwriter,String actors,double duration)
  {
	  super(name,age,categories,company,director,scriptwriter,actors,duration);
  }
  public blueray(){
	   	super();
	}
  public String toString()
  {   
        
	     return super.toString()+"\n";
  }
  
//===========================================================================================================================================
}