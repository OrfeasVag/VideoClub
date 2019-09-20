//===========================================================================================================================================
/**
ANAGNOSTAKI IRO    2o e3amhno 3140008
VAGELAKIS ORFEAS   2o e3amhno 3140018
GAZEPIDOU RAFAELLA 2o e3amhno 3140262
**/ 
//===========================================================================================================================================
public class mainApp 
{
public static void main(String[] args) {
 prints.printlnString("================================================================================");
 prints.printlnString("Welcome To Our Program.");
 prints.printlnString("================================================================================");
 //load apo to text
 rents.loadfile();
 prints.printlnString("Loaded ["+database.pos+"] Disks");
 if(database.pos==0)
 System.out.println("Warning The DataBase Is Empty  .");

 boolean end=false;
 int movies;
 String r;
 int choice,choice1,choice2,choice3,id;
//===========================================================================================================================================
 while(!end)
 {	
  choice=mainAppchoices.mainchoice();
  switch(choice)
  {
//===========================================================================================================================================	  
	  default :
	   prints.printlnString("Wrong Input Try Again.");
	  break;
//===========================================================================================================================================	  
	  case 0:
	   end=true;
	   rents.savefile(); //save sto text
	   prints.printlnString("Shutting Down Program.");
	  break;
//===========================================================================================================================================	  
	  case 1: //Available Disks
	  choice1 = mainAppchoices.choice1();
	   switch(choice1)
	   {
		   default:
		    prints.printlnString("Wrong Input Try Again."); //default
		   break;
		   
		   case 0:
		           // exit
		   break;
		   
		   case 1:
		    prints.printlnString("========================================================-[ Available DVD Names ]");
		    rents.checkdvdname(); //dvds
			prints.printlnString("========================================================-[ Available DVD Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// checks 
		    prints.printlnString("Do You want to rent this DVD ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			rents.rentdvd(id);// rent dvd
			}
		
		   break;
		   
		   case 2:
		    prints.printlnString("=====================================================-[ Available BlueRay Names ]");
		    rents.checkbluerayname(); //bluerays
			prints.printlnString("=====================================================-[ Available BlueRay Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// checks 
		    prints.printlnString("Do You want to rent this BlueRay ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			rents.rentblueray(id);// rent blueray
			}
		   break;
		   
		   case 3:
		    prints.printlnString("=======================================================-[ Available Game Names ]");
		    rents.checkgamesname(); //games
			prints.printlnString("=======================================================-[ Available Game Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// checks
            prints.printlnString("Do You want to rent this Game ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			rents.rentgames(id);// rent game		
			}
		   break;
		   
		   case 4:
		    prints.printlnString("==================================================-[ Available Disks Full Info ]");
		    rents.availablelist(); //all
			prints.printlnString("==================================================-[ Available Disks Full Info ]");
		   break;
	   }  
		   
			
	  break;
//===========================================================================================================================================	  
	  case 2: //Rented Disks
	  choice2 = mainAppchoices.choice2();
	   switch(choice2)
	   {
		   default:
		    prints.printlnString("Wrong Input Try Again."); //default
		   break;
		   
		   case 0:
		           // exit
		   break;
		   
		   case 1:
		    prints.printlnString("===========================================================-[ Rented DVD Names ]");
		    rents.checkrdvdname(); //dvds
			prints.printlnString("===========================================================-[ Rented DVD Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// check
			prints.printlnString("Do You want to return this DVD ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes")){
				rents.returndisk(id);
			}
			}
			
		   break;
		   
		   case 2:
		    prints.printlnString("=======================================================-[ Rented BlueRay Names ]");
		    rents.checkrbluerayname(); //bluerays
			prints.printlnString("=======================================================-[ Rented BlueRay Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// check
			prints.printlnString("Do You want to return this BlueRay ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes")){
				rents.returndisk(id);
			}
			}
		   break;
		   
		   case 3:
		    prints.printlnString("==========================================================-[ Rented Game Names ]");
		    rents.checkrgamesname(); //games
			prints.printlnString("==========================================================-[ Rented Game Names ]");
			prints.printlnString("Do You want to see the full info of a Disk ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes"))
			{
			id=rents.checkdisk();// check
			prints.printlnString("Do You want to return this Game ?(yes/no)");
			r=reads.readyn();
			if(r.equalsIgnoreCase("yes")){
				rents.returndisk(id);
			}
			}
		   break;
		   
		   case 4:
		    prints.printlnString("=====================================================-[ Rented Disks Full Info ]");
		    rents.rentedlist(); //all
			prints.printlnString("=====================================================-[ Rented Disks Full Info ]");
		   break;
	   }  
	  break;
	  
//=========================================================================================================================================== 
	  case 3 : //see all info
	   prints.printlnString("==============================================================-[ Full DataBase ]");
	   rents.rentedlist(); 
	   rents.availablelist();
	   prints.printlnString("There are ["+database.pos+"] Disks in Database .");
	   prints.printlnString("==============================================================-[ Full DataBase ]");
	  break;
//=========================================================================================================================================== 
	  case 4 : //add disk
	   prints.printlnString("===================================================================-[ DataBase ]");
	   database.dbreader();
	  break;
//===========================================================================================================================================
  }
	 
 }
//===========================================================================================================================================
  }
}
 
 
 
 
 
 
 
 
 
 
 
 
 