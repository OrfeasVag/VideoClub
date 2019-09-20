import java.util.*;
import java.lang.*;
import java.io.*;
//===========================================================================================================================================
public class rents extends database {


//================================================================================================================
private static  ArrayList <disks> disk = new ArrayList <disks>();
//==============================================================================================================
 //transfer 
 public static void adddisk(disks a,int id)
 { 
    disk.add(a);
	a.setId(id);
	
 }
//AVAILABLE DISKS <============================================================================================= 
//==============================================================================================================
public static void availablelist()
{
	System.out.println(" ");
	System.out.println("Printing All Available Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
	
	if(disk.get(i).getIsavailable())
	{
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println(disk.get(i));
		System.out.println("");
	}
    }
}
//==============================================================================================================
public static void availablelistname()
{
	System.out.println(" ");
	System.out.println("Printing All Available Disks Names");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
	if(disk.get(i).getIsavailable())
	{
		System.out.println("ID : "+disk.get(i).getId()+"  Type : "+disk.get(i).getType());
		System.out.println("Name : "+disk.get(i).getName());
		System.out.println("");
	}
    }
}
//==============================================================================================================
public static int checkdisk()
{
	int a;
	while(true)
	{
	System.out.println(" ");
	prints.printlnString("Please Type The ID Of the disk That you want to check");
	a=reads.readInt();
	if((a>=0)&&(a<disk.size())) 
	  {
	    System.out.println(" ");
	    System.out.println("Printing All Available Info Of Disk [ "+disk.get(a).getName()+" ] with ID [ "+disk.get(a).getId()+" ] .");
	    System.out.println(" ");
		System.out.println("ID : "+disk.get(a).getId());
		System.out.println(disk.get(a));
		System.out.println("");
		break;
	  }
		 else
	  {
		  prints.printlnString("Bad Input");
	  }
	}
	  return a;
}

//==============================================================================================================
public static void checkdvdname()
{
	System.out.println(" ");
	System.out.println("Printing All Available DVD Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("DVD"))
	{
		System.out.println("ID : "+disk.get(i).getId()+"  Type : "+disk.get(i).getType());
		System.out.println("Name : "+disk.get(i).getName());
		System.out.println("");
	}
    }
}

//==============================================================================================================
public static  void checkbluerayname()
{
	System.out.println(" ");
	System.out.println("Printing All Available BlueRay Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("blueRay"))
	{
		System.out.println("ID : "+disk.get(i).getId()+"  Type : "+disk.get(i).getType());
		System.out.println("Name : "+disk.get(i).getName());
		System.out.println("");
	}
    }
}

//==============================================================================================================
public static void checkgamesname()
{
	System.out.println(" ");
	System.out.println("Printing All Available Games Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("game"))
	   {
		System.out.println("ID : "+disk.get(i).getId()+"  Type : "+disk.get(i).getType());
		System.out.println("Name : "+disk.get(i).getName());
		System.out.println("");
	   }
    }
}
// RENTED DISKS <===============================================================================================
//==============================================================================================================
public static void rentedlist()
{
	System.out.println(" ");
	System.out.println("Printing All Rented Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
	
	
	if(!disk.get(i).getIsavailable())
	{
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println(disk.get(i));
		System.out.println("");
	}
    }
}
//==============================================================================================================
public static void rentedlistname()
{
	System.out.println(" ");
	System.out.println("Printing All Rented Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
	
	
	if(!disk.get(i).getIsavailable())
	{
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println("Name : "+disk.get(i).getName()+"  Type : "+disk.get(i).getType());
		System.out.println("");
	}
    }
}

//==============================================================================================================
public static void checkrdvdname()
{
	System.out.println(" ");
	System.out.println("Printing All Rented DVD Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(!disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("DVD"))
	{
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println(disk.get(i).getName()+"  Type : "+disk.get(i).getType());
		System.out.println("");
	}
    }
}
//==============================================================================================================
public static  void checkrbluerayname()
{
	System.out.println(" ");
	System.out.println("Printing All Rented BlueRay Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(!disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("blueRay"))
	{
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println(disk.get(i).getName()+"  Type : "+disk.get(i).getType());
		System.out.println("");
	}
    }
}
//==============================================================================================================
public static void checkrgamesname()
{
	System.out.println(" ");
	System.out.println("Printing All Rented Games Disks");
	System.out.println(" ");
	for(int i=0;i<disk.size();i++)
	{
		if(!disk.get(i).getIsavailable()&&disk.get(i).getType().equalsIgnoreCase("game"))
	   {
		System.out.println("ID : "+disk.get(i).getId());
		System.out.println(disk.get(i).getName()+"  Type : "+disk.get(i).getType());
		System.out.println("");
	   }
    }
}
//RENTING SERVICE <===============================================================================================
//================================================================================================================
 public static void rentdvd(int a)
 {
	  if((a>=0)&&(a<disk.size())) 
	  {
		  if((disk.get(a).getIsavailable())&&(disk.get(a).getType().equalsIgnoreCase("DVD")))
		  {
            prints.printlnString("You Selected the [ "+disk.get(a).getName()+" ] dvd.");
	        prints.printlnString("Do you want to continue ?");
	        prints.printlnString("(Yes/No)");
	        String c = reads.readyn();
	        if(c.equalsIgnoreCase("yes")){
	        rentingdvd(a);
	        disk.get(a).setIsavailable(false);
	        prints.printlnString("================================================================================");
	        System.out.println(disk.get(a));
	        prints.printlnString("================================================================================");
	         }
	         else
	         {
		      prints.printlnString("Going Back");
	         }
		  }
		  else
		  {
		   prints.printlnString("The Disk [ "+disk.get(a).getName()+" ] is not available .");
		   prints.printlnString("Or This id does not match a DVD Movie .");
		   prints.printlnString("Please insert the right id .");
		 
		  }
	  }
	  else
	  {
		  prints.printlnString("Bad Input");
		 
	  }
	 
	  
 }
//================================================================================================================ 
 public static void rentblueray(int a)
 {
	   if((a>=0)&&(a<disk.size())) 
	  {
		  if((disk.get(a).getIsavailable())&&(disk.get(a).getType().equalsIgnoreCase("blueray")))
		  {
            prints.printlnString("You Selected the [ "+disk.get(a).getName()+" ] blueray.");
	        prints.printlnString("Do you want to continue ?");
	        prints.printlnString("(Yes/No)");
	        String c = reads.readyn();
	        if(c.equalsIgnoreCase("yes")){
	        rentingblueray(a);
	        disk.get(a).setIsavailable(false);
	        prints.printlnString("================================================================================");
	        System.out.println(disk.get(a));
	        prints.printlnString("================================================================================");
	         }
	         else
	         {
		      prints.printlnString("Going Back");
	         }
		  }
		  else
		  {
		   prints.printlnString("The Disk [ "+disk.get(a).getName()+" ] is not available .");
		   prints.printlnString("Or This id does not match a BlueRay Movie .");
		   prints.printlnString("Please insert the right id .");
		  
		  }
	  }
	  else
	  {
		  prints.printlnString("Bad Input");
		  
	  }

	
	  
 }
//================================================================================================================
 public static void rentgames(int a)
 { 
	  if((a>=0)&&(a<disk.size())) 
	  {
		  if((disk.get(a).getIsavailable())&&(disk.get(a).getType().equalsIgnoreCase("game")))
		  {
            prints.printlnString("You Selected the [ "+disk.get(a).getName()+" ] game.");
	        prints.printlnString("Do you want to continue ?");
	        prints.printlnString("(Yes/No)");
	        String c = reads.readyn();
	        if(c.equalsIgnoreCase("yes")){
			rentinggames(a);
	        disk.get(a).setIsavailable(false);
	        prints.printlnString("================================================================================");
	        System.out.println(disk.get(a));
	        prints.printlnString("================================================================================");
	         }
	         else
	         {
		      prints.printlnString("Going Back");
	         }
		  }
		  else
		  {
		   prints.printlnString("The Disk [ "+disk.get(a).getName()+" ] is not available .");
		   prints.printlnString("Or This id does not match a Game Disk .");
		   prints.printlnString("Please insert the right id .");
		 
		  }
	  }
	  else
	  {
		  prints.printlnString("Bad Input");
		
	  }  
 }
//================================================================================================================
 public static void  rentingdvd(int pos)
 {
	  prints.printlnString("================================================================================");
      prints.printlnString("Please Insert renters name :");
	  prints.printlnString("================================================================================");
      String name=reads.readLine();
	  disk.get(pos).setRentersname(name);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert renters phone number :");
	  prints.printlnString("================================================================================");
      long number=reads.readLong();
	  disk.get(pos).setRentersnumber(number);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert the renting date :");
	  prints.printlnString("================================================================================");
      String date=reads.readString();
	  disk.get(pos).setRentersdate(date);
	  int days;
	  if(disk.get(pos).getIslate())
	   {
	       prints.printlnString("================================================================================");
	       prints.printlnString("Please Insert the renting days :");
	       prints.printlnString("================================================================================");
           days=reads.readInt();
	       disk.get(pos).setRentdays(days);
	   }
	   else
	   {
		   days=7;
		   disk.get(pos).setRentdays(days);
		   prints.printlnString("================================================================================");
		   prints.printlnString("DVD :"+disk.get(pos).getName()+" is not a late dvd so it has to be rented for a week.");
		   prints.printlnString("Renting Days Have Been Setted to 7 .");
		   prints.printlnString("================================================================================");
		   
	   }
	   prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting cost per day :");
	   prints.printlnString("================================================================================");
       int cost=reads.readInt();
	   disk.get(pos).setRentcost(cost*days);
	   prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting fine per day :");
	   prints.printlnString("================================================================================");
       int fine=reads.readInt();
	   disk.get(pos).setRentfine(fine);
 }
//================================================================================================================ 
 public static void  rentingblueray(int pos)
 {
	  prints.printlnString("================================================================================");
      prints.printlnString("Please Insert renters name :");
	  prints.printlnString("================================================================================");
      String name=reads.readLine();
	  disk.get(pos).setRentersname(name);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert renters phone number :");
	  prints.printlnString("================================================================================");
      long number=reads.readLong();
	  disk.get(pos).setRentersnumber(number);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert the renting date :");
	  prints.printlnString("================================================================================");
      String date=reads.readString();
	  disk.get(pos).setRentersdate(date);
	  int days;
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert the renting days :");
	  prints.printlnString("================================================================================");
      days=reads.readInt();
	  disk.get(pos).setRentdays(days);
	  prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting cost per day :");
	   prints.printlnString("================================================================================");
       int cost=reads.readInt();
	   disk.get(pos).setRentcost(cost*days);
	   prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting fine per day :");
	   prints.printlnString("================================================================================");
       int fine=reads.readInt();
	   disk.get(pos).setRentfine(fine);
 }
//================================================================================================================
 public static void  rentinggames(int pos)
 {
	  prints.printlnString("================================================================================");
      prints.printlnString("Please Insert renters name :");
	  prints.printlnString("================================================================================");
      String name=reads.readLine();
	  disk.get(pos).setRentersname(name);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert renters phone number :");
	  prints.printlnString("================================================================================");
      long number=reads.readLong();
	  disk.get(pos).setRentersnumber(number);
	  prints.printlnString("================================================================================");
	  prints.printlnString("Please Insert the renting date :");
	  prints.printlnString("================================================================================");
      String date=reads.readString();
	  disk.get(pos).setRentersdate(date);
	   prints.printlnString("================================================================================");
	   prints.printlnString("Games Are Rented only per week.");
	   prints.printlnString("Renting Days Have Been Setted to 7 .");
	   prints.printlnString("================================================================================");
	   int days=7;
	   disk.get(pos).setRentdays(days);
	   prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting cost per day :");
	   prints.printlnString("================================================================================");
       int cost=reads.readInt();
	   disk.get(pos).setRentcost(cost*days);
	   prints.printlnString("================================================================================");
	   prints.printlnString("Please Insert the renting fine per day :");
	   prints.printlnString("================================================================================");
       int fine=reads.readInt();
	   disk.get(pos).setRentfine(fine);
 }
 //RETURNING SERVICE <===============================================================================================
//================================================================================================================
 public static void returndisk(int pos)
 {
	  prints.printlnString("================================================================================");
      prints.printlnString("You Selected To Return The Disk Named : [ "+disk.get(pos).getName()+" ].");
	  prints.printlnString("================================================================================");
	  prints.printlnString("Renting Cost : [ "+disk.get(pos).getRentcost()+" ] .");
	  prints.printlnString("================================================================================");
      prints.printlnString("We Hope You Enjoyed Your Disk , [ "+disk.get(pos).getRentersname()+" ] .");
	  prints.printlnString("================================================================================");
	  disk.get(pos).setIsavailable(true);
	  disk.get(pos).setRentersname("");
	  disk.get(pos).setRentersnumber(0);
	  disk.get(pos).setRentersdate("");
	  disk.get(pos).setRentdays(0);
	  disk.get(pos).setRentcost(0);
	  disk.get(pos).setRentfine(0);
	  
	 
 }
//SAVING SERVICE <===============================================================================================
//================================================================================================================

public static void savefile()
{
	   prints.printlnString("================================================================================");
	   System.out.println("Saving Database . . .");
	   prints.printlnString("================================================================================");
        File f = null;
		BufferedWriter writer = null;

		try	{
			f = new File("databasef.txt");
		}
		catch (NullPointerException e) {
			System.err.println ("File not found.");
		}

		try	{
			writer = new BufferedWriter(new OutputStreamWriter (new FileOutputStream(f)));
		}
		catch (FileNotFoundException e) {
			System.err.println("Error opening file for writing!");
		}
		for(disks item:disk)
		{
		 String info = new String();
		 if (item instanceof dvd)
		 {
		  info = 
		  //dvd
		  "{"+"\r\n"+
		  "Type "+((dvd)item).getType()+"\r\n"+
		  "Title "+((dvd)item).getName()+"\r\n"+
		  "Year "+((dvd)item).getAge()+"\r\n"+
		  "Categories "+((dvd)item).getCategories()+"\r\n"+
		  "Company "+((dvd)item).getCompany()+"\r\n"+
		  "Director "+((dvd)item).getDirector()+"\r\n"+
		  "Scriptwriter "+((dvd)item).getScriptwriter()+"\r\n"+
		  "Actors "+((dvd)item).getActors()+"\r\n"+
		  "Duration "+((dvd)item).getDuration()+"\r\n"+
		  "Isavailable "+((dvd)item).getIsavailable()+"\r\n"+
		  //disks info
		  "Rented to "+item.getRentersname()+"\r\n"+
		  "Renters number "+item.getRentersnumber()+"\r\n"+
		  "Renting date "+item.getRentersdate()+"\r\n"+
		  "Renting days "+item.getRentdays()+"\r\n"+
		  "Renting cost "+item.getRentcost()+"\r\n"+
		  "Renting fine "+item.getRentfine()+"\r\n"+
		  "}"+
		  "\r\n";
		 }
		 else if(item instanceof blueray)
		 {
		  info = 
		  //blueray
		  "{"+"\r\n"+
		  "Type "+((blueray)item).getType()+"\r\n"+
		  "Title "+((blueray)item).getName()+"\r\n"+
		  "Year "+((blueray)item).getAge()+"\r\n"+
		  "Categories "+((blueray)item).getCategories()+"\r\n"+
		  "Company "+((blueray)item).getCompany()+"\r\n"+
		  "Director "+((blueray)item).getDirector()+"\r\n"+
		  "Scriptwriter "+((blueray)item).getScriptwriter()+"\r\n"+
		  "Actors "+((blueray)item).getActors()+"\r\n"+
		  "Duration "+((blueray)item).getDuration()+"\r\n"+
		  "Isavailable "+((blueray)item).getIsavailable()+"\r\n"+
		  //disks info
		  "Rented to "+item.getRentersname()+"\r\n"+
		  "Renters number "+item.getRentersnumber()+"\r\n"+
		  "Renting date "+item.getRentersdate()+"\r\n"+
		  "Renting days "+item.getRentdays()+"\r\n"+
		  "Renting cost "+item.getRentcost()+"\r\n"+
		  "Renting fine "+item.getRentfine()+"\r\n"+
		  "}"+
		  "\r\n"; 
		 }
		 else if(item instanceof games)
		 {
		  info = 
		  //games
		  "{"+"\r\n"+
		  "Type "+((games)item).getType()+"\r\n"+
		  "Title "+((games)item).getName()+"\r\n"+
		  "Year "+((games)item).getAge()+"\r\n"+
		  "Platform "+((games)item).getPlatform()+"\r\n"+
		  "Categories "+((games)item).getCategories()+"\r\n"+
		  "Company "+((games)item).getCompany()+"\r\n"+
		  "Isavailable "+((games)item).getIsavailable()+"\r\n"+
		  //disks info
		  "Rented to "+item.getRentersname()+"\r\n"+
		  "Renters number "+item.getRentersnumber()+"\r\n"+
		  "Renting date "+item.getRentersdate()+"\r\n"+
		  "Renting days "+item.getRentdays()+"\r\n"+
		  "Renting cost "+item.getRentcost()+"\r\n"+
		  "Renting fine "+item.getRentfine()+"\r\n"+
		  "}"+
		  "\r\n"; 
		 }
		  
		  try
		  {
            writer.write(info);
			
		  }
		 catch(IOException e)
		  {
			 System.out.println("Write Error.");
		  }
		}//for
		
		try
		  {
           writer.close();
		  }
		 catch(Exception e)
		  {
			 System.out.println("Error Closing Writer.");
		  }
		
		
}

//LOADING SERVICE <===============================================================================================
//================================================================================================================
public static void loadfile()
{
	prints.printlnString("Loading Database.");
    prints.printlnString("================================================================================");
	File f = null;
	StringTokenizer  st=null;
	BufferedReader reader = null;
	disks product = null;
	int p=0;
	String token;
	String line;
	//================================== [ Load to file ]
	try
	{
			f = new File("databasef.txt"); //txt pou exei to db
	}
	catch (NullPointerException e){
			System.err.println ("File not found !");
	        // an 8elw zhtaw  na balei pali to path
	}
	//================================== [ Load to reader ]
	try{
			reader = new BufferedReader(new FileReader(f));
	}
	catch (FileNotFoundException e ){
			System.err.println("Error opening file!");
	}
	//================================== [ GO ]
	
	try
	{
		boolean go;
		String str;
		 line = reader.readLine();
          while(line!=null)
		  {
			
			  st = new StringTokenizer(line);
			  token = st.nextToken(); 
			  if(token.equals("{"))
				  {
					  go=true; //fresh start
					 while(go)
					 {
					  line = reader.readLine();
					  st = new StringTokenizer(line);
					  token = st.nextToken();
					  if(token.equalsIgnoreCase("type"))
					  {
						  token = st.nextToken();
						  if(token.equalsIgnoreCase("DVD"))
						  {
							  product = new dvd();
							  product.setType("DVD");
							  product.setId(database.pos);
							  database.pos++;
						  }
						  else if(token.equalsIgnoreCase("BLUERAY"))
						  {
							  product = new blueray();
							  product.setType("BLUERAY");
							  product.setId(database.pos);
							  database.pos++;
						  }
						  else if (token.equalsIgnoreCase("GAME"))
						  {
							  product = new games();
							  product.setType("GAME");
							  product.setId(database.pos);
							  database.pos++;
						  }
					  }
					  else if(token.equalsIgnoreCase("title"))
					  {
						    token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      } 
						    product.setName(str);
						  
					  }
					  else if(token.equalsIgnoreCase("year"))
					  {
						  token = st.nextToken();
						  product.setAge(Integer.parseInt (token)); 
					  }
					  else if(token.equalsIgnoreCase("categories"))
					  {
						  token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						  product.setCategories(str);
					  }
					  else if(token.equalsIgnoreCase("company"))
					  {
						  token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						  product.setCompany(str);
				      }
					  else if(token.equalsIgnoreCase("director"))
					  {
						token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						if(product.getType().equalsIgnoreCase("dvd"))
						{
						   ((dvd)product).setDirector(str);
						}
						else if(product.getType().equalsIgnoreCase("blueray"))
						{
						   ((blueray)product).setDirector(str);
						}
					  }
					  else if(token.equalsIgnoreCase("scriptwriter"))
					  {  
						    token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						if(product.getType().equalsIgnoreCase("dvd"))
						{
						   ((dvd)product).setScriptwriter(str); ;
						}
						else if(product.getType().equalsIgnoreCase("blueray"))
						{
						   ((blueray)product).setScriptwriter(str); ;
						}
						
					  }
					  else if(token.equalsIgnoreCase("actors"))
					  {
						token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						if(product.getType().equalsIgnoreCase("dvd"))
						{
						   ((dvd)product).setActors(str); ;
						}
						else if(product.getType().equalsIgnoreCase("blueray"))
						{
						   ((blueray)product).setActors(str); ;
						}
					  }
					  else if(token.equalsIgnoreCase("duration"))
					  {
						token = st.nextToken();	
						if(product.getType().equalsIgnoreCase("dvd"))
						{
						   ((dvd)product).setDuration(Double.parseDouble (token)); 
						}
						else if(product.getType().equalsIgnoreCase("blueray"))
						{
						   ((blueray)product).setDuration(Double.parseDouble (token)); 
						}
					  }
					  else if(token.equalsIgnoreCase("platform")) 
					  {
						  token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
						  ((games)product).setPlatform(str);
						  
					  }
					  else if(token.equalsIgnoreCase("isavailable"))
					  {
						 token = st.nextToken();
						 product.setIsavailable(Boolean.parseBoolean (token));
					  }
					  else if(!product.getIsavailable())
					  {
						  if(token.equalsIgnoreCase("rented"))
						  {
							token = st.nextToken();
							token = st.nextToken();
						    str = token;
						  while(st.hasMoreTokens())
						  {
						    token = st.nextToken();
							str = str +" "+ token;
					      }
							product.setRentersname(str);
						  }
						  else if(token.equalsIgnoreCase("renters"))
						  {
						    token = st.nextToken();
							token = st.nextToken();
							product.setRentersnumber(Long.parseLong (token));
						  }
						  else if(token.equalsIgnoreCase("renting"))
						  {
							  token = st.nextToken();
							  if(token.equalsIgnoreCase("date"))
							  {
								token = st.nextToken();
						        str = token;
                              while(st.hasMoreTokens())
						       {
						        token = st.nextToken();
						     	str = str +" "+ token;
					           }
								product.setRentersdate(str);
								
							  }
							  else if(token.equalsIgnoreCase("days"))
							  {
								token = st.nextToken();
								product.setRentdays(Integer.parseInt(token));
							  }
							  else if(token.equalsIgnoreCase("cost"))
							  {
								token = st.nextToken(); 
								product.setRentcost(Integer.parseInt (token));
							  }
							  else if(token.equalsIgnoreCase("fine"))
							  {
								 token = st.nextToken();
								 product.setRentfine(Integer.parseInt(token));
							  }
					    }
					  }
					 if(token.equals("}"))
						 go=false;
					 }
	                //-------
			  }
			  
			  
			  if(product!=null){
			  System.out.println("ID : "+product.getId()+" .");
			  System.out.println("Type : "+product.getType()+" .");
			  System.out.println("Name : "+product.getName()+" .");
			  adddisk(product,database.pos-1);
			  product=null;
			  }
	          line=reader.readLine();
			
			 
			 
				  
		  }
          //while
		}
		catch (IOException e){
			System.err.println("Error reading line. ");
		}
		

		try {
			reader.close();
		}
		catch (IOException e){
			System.err.println("Error closing file.");
		}
	
 }
}