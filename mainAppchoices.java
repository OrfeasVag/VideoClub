public class mainAppchoices extends mainApp 
{
//===========================================================================================================================================
public static int mainchoice()
{                                                                                           
int a;
 while(true)
 {
 prints.printlnString("==================================================================-[ Main Menu ]");
 prints.printlnString("Available Choices Are :");
 prints.printlnString("[1] -- To See All Available Disks .");
 prints.printlnString("[2] -- To See Rented Disks.");
 prints.printlnString("[3] -- To See All Disks.(Full Info)");
 prints.printlnString("[4] -- To Add More Disks in the Database.");
 prints.printlnString("[0] -- To Exit the program .");
 prints.printlnString("================================================================================");
 prints.printlnString("Please Insert Your Choice :");
  a=reads.readInt();
 if(a==0||a==1||a==2||a==3||a==4)
 {
 break;
 }
 else
 {
	 System.out.println("ERROR  -- Bad Number Inserted [ "+a+" ] .");
 }
 }
  return a;
}
//===========================================================================================================================================
 public static int choice1()
 {
	int a;
	while(true)
	{
	prints.printlnString("============================================================-[ Available Disks ]");
	rents.availablelistname();
	prints.printlnString("============================================================-[ Available Disks ]");
	prints.printlnString("Available Choices Are :");
	prints.printlnString("[1] -- To See all Available DVD Disks .");
    prints.printlnString("[2] -- To See all Available BlueRay Disks .");
    prints.printlnString("[3] -- To See all Available Game Disks .");
	prints.printlnString("[4] -- To See all Available Disks (Full Info).");
    prints.printlnString("[0] -- To Go Back. ");
    prints.printlnString("================================================================================");
    prints.printlnString("Please Insert Your Choice :");
    a=reads.readInt();
   if(a==0||a==1||a==2||a==3||a==4)
   {
    break;
   }
  else
   {
	 System.out.println("ERROR  -- Bad Number Inserted [ "+a+" ] .");
   }
   }
  return a;
 }
//===========================================================================================================================================
public static int choice2()
 {
	int a;
	while(true)
	{
    prints.printlnString("===============================================================-[ Rented Disks ]");
	rents.rentedlistname();
	prints.printlnString("===============================================================-[ Rented Disks ]");
	prints.printlnString("Available Choices Are :");
	prints.printlnString("[1] -- To See all Rented DVD Disks.");
    prints.printlnString("[2] -- To See all Rented BlueRay Disks.");
    prints.printlnString("[3] -- To See all Rented Game Disks.");
	prints.printlnString("[4] -- To See all Rented Disks (Full Info)");
    prints.printlnString("[0] -- To Go Back. ");
    prints.printlnString("================================================================================");
    prints.printlnString("Please Insert Your Choice :");
    a=reads.readInt();
   if(a==0||a==1||a==2||a==3||a==4)
   {
    break;
   }
  else
   {
	 System.out.println("ERROR  -- Bad Number Inserted [ "+a+" ] .");
   }
   }
  return a;
 }
//===========================================================================================================================================
 

 
 
}