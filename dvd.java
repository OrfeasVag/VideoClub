public class dvd extends disks
{
	
	String director,scriptwriter,actors;
	double duration;
	
	
//===========================================================================================================================================
//constructor  
public dvd(String name,int age,String categories,String company,String director,String scriptwriter,String actors,double duration)
  {
	  super(name,age,categories,company);
	  this.director=director;
	  this.scriptwriter=scriptwriter;
	  this.actors=actors;
	  this.duration=duration;
  }
  
 public dvd(){
	   	super();
	}
 
//===========================================================================================================================================
//sets
public void setDirector(String director)
{
    this.director=director;
}

public void setScriptwriter(String scriptwriter)
{
    this.scriptwriter=scriptwriter;
}
public void setActors(String actors)
{
    this.actors=actors;
}
public void setDuration(double duration)
{
	this.duration=duration;
}
//===========================================================================================================================================
//gets
public String getDirector()
{
	return director;
}
public String getScriptwriter()
{
	return scriptwriter;
}
public String getActors()
{
	return actors;
}
public double getDuration()
{
	return duration;
}

//===========================================================================================================================================
 public String toString()
  {   
          
	      return super.toString()+"\nName : "+name+" \nAge : "+age+" \nCategories : "+categories+" \nDirector : "+director+" \nScriptWriter : "+scriptwriter+" \nActors : "+actors+" \nDuration : "+duration+"\n"+"\n";
		  
  }
	
}