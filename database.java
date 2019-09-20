import java.util.*;
import java.lang.*;
import java.io.*;
//===========================================================================================================================================
public class database extends mainApp
{	
static int pos=0;
//===========================================================================================================================================
public static void dbreader() 
{
	disks object;
	prints.printlnString("Welcome to the DataBase Builder!");
	String numb ="";
	boolean go = true;
	boolean status,l;
	int choice,age,cnum,z;
	String achoice,cchoice;
	String name,c,company,director,scriptwriter,a,platform;
	String categories="";
	String actors="";
	double duration;
	while(go)
	{
	prints.printlnString("===================================================================-[ DataBase ]");
	prints.printlnString("Available choices : ");
	prints.printlnString("[1] -- To Insert a New DVD Movie .");
	prints.printlnString("[2] -- To Insert a New BlueRay Movie .");
	prints.printlnString("[3] -- To Insert a New Game .");
	prints.printlnString("[0] -- To Stop Adding Disks .");
	prints.printlnString("Disks In Database : ["+pos+"] .");
	prints.printlnString("================================================================================");
	
	choice = reads.readInt();
	switch(choice)
	{
		//===========================================================================================================================================
        default :
		prints.printlnString("Please Insert a number between (0-3)");
		break;
		//===========================================================================================================================================
        
		case 0:
		go=false;
		break;
		
		//===========================================================================================================================================
        case 1 :
		
		prints.printlnString("Please insert the [name] of the DVD movie : ");
		name = reads.readLine();
		prints.printlnString("Please insert the [age] of the DVD movie : ");
		age = reads.readInt();
		prints.printlnString("Please insert the [company] of the DVD movie : ");
		company = reads.readLine();
		prints.printlnString("Please insert the [director] of the DVD movie : ");
		director = reads.readLine();
		prints.printlnString("Please insert the [scriptwriter] of the DVD movie : ");
		scriptwriter = reads.readLine();
		prints.printlnString("Please insert the [duration] of the DVD movie : ");
		duration = reads.readDouble();
		while(true)
		{
		prints.printlnString("Please insert [actor] of the DVD movie : ");
		a = reads.readLine();
		actors=actors+a+" ";
		prints.printlnString("Do you want to add an other actor?");
		achoice=reads.readyn();
		if(achoice.equalsIgnoreCase("no"))
			break;
		}
		while(true)
		{
		prints.printlnString("Please insert the [category] of the DVD movie : ");
		c = reads.readLine();
		categories=categories+c+" ";
		prints.printlnString("Do you want to add an other category?");
		cchoice=reads.readyn();
		if(cchoice.equalsIgnoreCase("no"))
			break;
		}
		prints.printlnString("Is This a New Movie? : ");
		l = reads.readBoolean();
		prints.printlnString("Please insert the [number] of Copies : ");
		cnum = reads.readInt();
	    z=pos;
		while(pos<z+cnum)
		{
		object = new dvd(name,age,categories,company,director,scriptwriter,actors,duration);
		rents.adddisk(object,pos); // stelnw t disk sto rent
		object.setType("DVD");
		object.setIslate(l);
		prints.printlnString("Please insert the [status] of the Disk : [" +object.getName()+"] with id [ "+object.getId()+" ] .");
	    prints.printlnString("Is the Disk Available?(Boolean True/False)");
	    status = reads.readBoolean(); 
		object.setIsavailable(status);
		if(!status) //setting status
		rents.rentingdvd(pos);
		
		pos++;
		}
		
		break;
		//===========================================================================================================================================
     	case 2 :
		prints.printlnString("Please insert the [name] of the BlueRay movie : ");
		name = reads.readLine();
		prints.printlnString("Please insert the [age] of the BlueRay movie : ");
		age = reads.readInt();
		prints.printlnString("Please insert the [company] of the BlueRay movie : ");
		company = reads.readLine();
		prints.printlnString("Please insert the [director] of the BlueRay movie : ");
		director = reads.readLine();
		prints.printlnString("Please insert the [scriptwriter] of the BlueRay movie : ");
		scriptwriter = reads.readLine();
		prints.printlnString("Please insert the [duration] of the BlueRay movie : ");
		duration = reads.readDouble();
		while(true)
		{
		prints.printlnString("Please insert [actor] of the BlueRay movie : ");
		a = reads.readLine();
		actors=actors+a+" ";
		prints.printlnString("Do you want to add an other actor?");
		achoice=reads.readyn();
		if(achoice.equalsIgnoreCase("no"))
			break;
		}
		while(true)
		{
		prints.printlnString("Please insert the [category] of the BlueRay movie : ");
		c = reads.readLine();
		categories=categories+c+" ";
		prints.printlnString("Do you want to add an other category?");
		cchoice=reads.readyn();
		if(cchoice.equalsIgnoreCase("no"))
			break;
		}
		prints.printlnString("Please insert the [number] of Copies : ");
		cnum = reads.readInt();
		z=pos;
		while(pos<z+cnum)
		{
		object = new blueray(name,age,categories,company,director,scriptwriter,actors,duration);
		rents.adddisk(object,pos); // stelnw t disk sto rent
		object.setType("BlueRay");
		prints.printlnString("Please insert the [status] of the Disk : [" +object.getName()+"] with id [ "+object.getId()+" ] .");
	    prints.printlnString("Is the Disk Available?(Boolean True/False)");
	    status = reads.readBoolean(); 
		object.setIsavailable(status);
		if(!status) //setting status
		rents.rentingblueray(pos);	
		
		
		pos++;
		}
		
		break;
		//===========================================================================================================================================
	    case 3 :
		prints.printlnString("Please insert the [name] of the  Game : ");
		name = reads.readLine();
		prints.printlnString("Please insert the [age] of Game : ");
		age = reads.readInt();
		prints.printlnString("Please insert the [company] of Game : ");
		company = reads.readLine();
		prints.printlnString("Please insert the [platform] of the Game : ");
		platform = reads.readLine();
		while(true)
		{
		prints.printlnString("Please insert the [category] of the Game : ");
		c = reads.readLine();
		categories=categories+c+" ";
		prints.printlnString("Do you want to add an other category?");
		cchoice=reads.readyn();
		if(cchoice.equalsIgnoreCase("no"))
			break;
		}
		prints.printlnString("Please insert the [number] of Copies : ");
		cnum = reads.readInt();
	    z=pos;
		while(pos<z+cnum)
		{
		object = new games(name,age,company,platform,categories);
		rents.adddisk(object,pos); // stelnw t disk sto rent
		object.setType("Game");
		prints.printlnString("Please insert the [status] of the Disk : [" +object.getName()+"] with id [ "+object.getId()+" ] .");
	    prints.printlnString("Is the Disk Available?");
	    status = reads.readBoolean(); 
		object.setIsavailable(status);
		if(!status) //setting status
		rents.rentinggames(pos);
		
		pos++;
		}
		
	   
		break;
		//===========================================================================================================================================
  	
	}
		
	 } //while

	rents.savefile();
}







}