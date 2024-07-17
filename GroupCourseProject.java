/* student names
- Abeer Ahmed. ID: 2216615
- Haneen Saleh. ID: 2216622

*/


package groupcourseproject;
import java.util.Scanner;
import java.io.*;
import java.util.*;


/**
 *
 * @author lenovo
 */
/*
 in this program, the student or instructors can use 
the services of the library.
*/
public class GroupCourseProject {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws IOException 
    {
        //creat a scanner object for keyboard input
        Scanner keyboard=new Scanner(System.in);
        Scanner s=new Scanner(System.in);
        System.out.println("****************************************Welcome to University Of Jeddah Library******************************************************************************");
        space();
        System.out.print("to be able to use this service you have to be part of the university\n");
        System.out.println();
        System.out.print("Enter '1' if you are a student\nEnter '2' if you are an instructor\n"
                + "Please Enter your choice: ");
        int choose =keyboard.nextInt();
          choose=validtion(choose,1,2);
             System.out.print("Please Enter yor ID number: (should be 7 numbers for students or 4 numbers for instructors) ");
    
             int ID =keyboard.nextInt(); //input the ID number from the user
             IdNumber student=new IdNumber(ID); //creat object from IdNumber 
             ArrayList <IdNumber> list= new ArrayList <IdNumber>(); //creat arrayList for objects
             list.add(student);
       if(choose==1){

            IdNumber student2 =new IdNumber(student,7); //creat object if user is student
             list.add(student2);
       }
        else if(choose==2){

            IdNumber Dr =new IdNumber(student,4); //creat object if user is doctor
               list.add(Dr);
       }
         
         checkAndPrintFile(student,ID); //
 

      int choice; //deaclr a virable
  
      do{
          System.out.println(); //new line
          space();
          space();
          menue(); //print the services from the method
          choice=keyboard.nextInt(); //input the user`s choice service from the menue
        
      
          switch(choice){ //strat switch
      
            case 1: //lable one
               System.out.println( 
                         "\n1- if you want to meeting with other people\n" //menue
                        + "2- if you want to studying alone");
                System.out.print("Enter the number of your purpose: "); //prompt 
                int purpose=keyboard.nextInt();
                purpose=validtion(purpose,1,2); 
                ArrayList <BookPlace> bookList= new ArrayList <BookPlace>(); //creat arrayList for objects
                BookPlace book=new BookPlace(student); //creat bject from BookPlace class
                bookList.add(book);
                  
          if(purpose==1){
            System.out.println();
            System.out.print("Enter the number of visotirs (maximim 10 vistors): "); //
            int num= keyboard.nextInt(); //input the number of vistors from the user
            num= validtion(num,1,10);
            BookPlace meet =new BookPlace(book,num,1);
             bookList.add(meet);
             
           }
           else if(purpose==2){
             BookPlace study =new BookPlace(book,1,2);
             bookList.add(study);
          }
            
           space();
             System.out.print("\nEnter the Time you want to visit the library, from 6 AM to 5 PM (Enter just number of hour): ");
             int time= keyboard.nextInt(); //input the time to visit the library
             time =validtion(time,1,12); //checking the user input should be withing the rang
             book.setTime(time);
             space();
             System.out.println("The library provide private room for memebership members only.\nDo you want to have one?(y:yes n:no) ");
             if(membership()){
                 BookPlace member=new BookPlace(book);
                  bookList.add(member);
                 System.out.println("your private room has been booked");
             
             }
            
             System.out.println(); //new line
             System.out.println();
             String str=book.toString(); 
             printDetailsOnFile(str); //print the information in 'book' file  
             printDetailsOnScreen(); //print the information in the screen
                
                break; //end case 1
                
            case 2:
                System.out.println(); //new line 
                System.out.println("1-science Section\n"  
                        + "2-Information Technology Section\n"
                        + "3-Literary Section");
                System.out.print("Enter the number of section: "); //prompt
                int section=keyboard.nextInt(); //input wich section the user wants to borrow from
                section=validtion(section,1,3); //checking the user input within the range

                System.out.print("How many books do you want to borrow? (maximim 8 books) "); //prompt
                int numberOfBook=keyboard.nextInt(); //input the number of book the user want to borrow
                System.out.println(); //new line 
                numberOfBook=validtion(numberOfBook,1,8); //checking the user input within the range

               String[] array = new String[numberOfBook]; //creat array from type string 
               ArrayList <borrowBook> borrowList= new ArrayList <borrowBook>(); //creat arrayList for objects
                     
               space();
                if(section==1){
                  borrowBook science= new borrowBook(student,array,numberOfBook,1); //creat object from borrowBook class
                  science.inputArray();
                  borrowList.add(science);
                  space();
                  System.out.println(); //new line
                  System.out.println();
                  String st=science.toString(); 
                  printDetailsOnFile(st);
                  printDetailsOnScreen(); //print the information in the screen
                }
              else if(section==2){ 
                 borrowBook InformationTechnology = new borrowBook(student,array,numberOfBook,2);
                 InformationTechnology.inputArray();
                 borrowList.add(InformationTechnology);
                 space();
                 System.out.println(); //new line
                 System.out.println();
                 String st=InformationTechnology.toString(); 
                 printDetailsOnFile(st);
                 printDetailsOnScreen(); //print the information in the screen
             
                }
                  else  if(section==3){
                   borrowBook Literary= new borrowBook(student,array,numberOfBook,3);
                   Literary.inputArray();
                   borrowList.add(Literary);
                   space();
                   System.out.println(); //new line
                   System.out.println();
                   String st=Literary.toString(); 
                   printDetailsOnFile(st);
                  printDetailsOnScreen(); //print the information in the screen
                }
         
                 break; //end case 2
            case 3:
                System.out.println( 
                         "\n1- if you want to Printing Service\n" //menue
                        + "2- if you want to Photocopying Service");
                System.out.print("Enter the number of service: "); //prompt
                int survice=keyboard.nextInt(); //input the survice that the user want

                survice= validtion(survice,1,2); 
                ArrayList <PrintingService> printList= new ArrayList <PrintingService>(); //creat arrayList for objects
                if(survice==1){ //if user want priting survice
                   space();
                    System.out.print("printing two papers costs 1 riyal\n" //the price and prompt
                            +"How many papers do you want to print? (maximum 200 sheets of paper): ");
                    int numberOfpaper=keyboard.nextInt(); //input the number of paper to calcute the price
                    numberOfpaper= validtion(numberOfpaper,1,200); //checking the user input within the range from 1 to 200
                    PrintingService print= new PrintingService(numberOfpaper,1); //creat object from PrintingService class
                    print.setPrice(numberOfpaper); //send number of paper to set the price
                    System.out.println("The price is: "+print.getPrice()+" SR"); //calling the price by method in class
                    space();
                    change(print,200);
                    System.out.println("The library provide 30% discount for members \nDo you want to get the discount? (y:for yes, n:for no) ");
                    
                   if(membership()){ //if the user have membershipe or wants to regsried for it
                        PrintingService printDiscount= new PrintingService(print);
                        printList.add(printDiscount);
                          System.out.println(); //new line
                          System.out.println();
                           String st=printDiscount.toString(student); 
                          printDetailsOnFile(st);
                          printDetailsOnScreen(); //print the information in the screen
                   }
                   else{ //if the user does not have membershipe
                        printList.add(print);
                        System.out.println(); //new line
                        System.out.println();
                          String st=print.toString(student); 
                          printDetailsOnFile(st);
                          printDetailsOnScreen(); //print the information in the screen
                   }
                }
                else if(survice==2){ //if user want photocoping survice
                    space();
                    System.out.print("copying Four papers costs 1 riyals\n" //price and prompt
                            +"How many papers do you want to copy? (maximum 1000 sheets of paper): ");
                    int numberOfpaper=keyboard.nextInt(); //input the number of paper
                    numberOfpaper= validtion(numberOfpaper,1,1000); //checking the user input within the range from 1 to 1000
                    PrintingService phtocopy= new PrintingService(numberOfpaper,2); //creat new object from PrintingService class
                    phtocopy.setPrice(numberOfpaper); //send number of paper to set the price
                    
                   System.out.println("The price is: "+phtocopy.getPrice()+" SR"); //calling the price by method in class PrintingService
                   space();
                   change(phtocopy,1000); 
                    if(membership()){
                        PrintingService phtocopyDiscount= new PrintingService(phtocopy);
                        printList.add(phtocopyDiscount);
                        System.out.println(); //new line
                        System.out.println();
                         String st=phtocopyDiscount.toString(student); //print details using method 'printPrintingDetails()'
                         printDetailsOnFile(st);
                         printDetailsOnScreen(); //print the information in the screen
                   }
                   else{
                         printList.add(phtocopy); //add to arrayList
                         System.out.println(); //new line
                         System.out.println();
                         String st=phtocopy.toString(student); //print details using method 'printPrintingDetails()'
                         printDetailsOnFile(st);
                         printDetailsOnScreen(); //print the information in the screen
                   }
                }
          

                break; //end case 3
                
            case 4:
                System.out.println(); //new line 
                System.out.println("THANK YOU FOR VISTING OUR PROGRAM!!"); //sending massege ending program to the user
                System.out.println(); //new line
                break;        
        }//end switch
  
        }while(choice!=4); //end do while statment
      
    } //end main method

     
    
    /**
     * @param args the command line arguments
     */ 
       
   public static void menue(){//menu method details
    space();
       System.out.println("we have many services\n"+
               "choose one of them:");
       System.out.println("1- to book a place for studying or meeting\n" +
               "2- to bowrow books \n" +
               "3- to Photocopying / Printing Service \n"+
               "4- to end the appliction");
       System.out.print("Enter your choice: ");//prompt
 
    }
        
    /**
     * @param args the command line arguments
     */
   /*
        validation method check if the number with in the range 
        @return the number selected from the user
   */
   public static int validtion(int number, int x ,int y){
      
       while(number<x||number>y ){//loop
          System.out.println();
           System.out.println("Sorry, your number not within the range");
           System.out.print("Pleas, Try again: ");
           Scanner keyboard= new Scanner (System.in);//input the number from the user and check again
           number= keyboard.nextInt();}
      return number;
       } 
   
   /*
        checkAndPrintFile method check if the ID number belong to Jeddah university 
   */
    public static void checkAndPrintFile(IdNumber student,int ID) throws IOException
    {
              String input=String.valueOf(ID); //change ID from integer to string
      if(!(input.length()==student.getNum())){ //make sure that the user inter only 7 or 4 numbers
              System.out.println("Sorry, this ID number does not belong to Jeddah university\nyou can't use this programm.");
              System.exit(0);
             
             }           


      if((student.checkID())==0){ //if the program can not find the ID number in the file
            space();
            Scanner s=new Scanner(System.in);
            System.out.println("You are not regested in the system before.");
            System.out.print("Enter your name to be part of library : "); 
            String nameReg;
            nameReg=s.nextLine();
            
            student.setName(nameReg);
            FileWriter fw=new FileWriter(student.getFileName(),true);
            PrintWriter pw=new PrintWriter(fw);
            pw.println(nameReg);
             pw.close();
             
           FileWriter f=new FileWriter(student.getFileID(),true);
           PrintWriter p=new PrintWriter(f);
           p.println(ID);
           p.close();
           System.out.println( student.toString()); //print the name and ID number
        } //end if

      else  if((student.checkID()>0)){ 
          String name=student.checkName(); //search the name of the user on the file from "check" object
          System.out.println( student.toString()+" again!"); //print the name and ID number of the user using "check" object
          System.out.println(); //new line
      }
    }

    /*
        membership method check if the user want a membership in the library
        @return true if the user want a membership
        @return false if the user didn't want a membership
       
   */
        public static boolean membership() throws IOException
        {
          Scanner keyboard=new Scanner(System.in);
          String letter=keyboard.nextLine();
          char ch=letter.charAt(0);
          
          if(ch=='Y'||ch=='y'){
          System.out.println("Enter the membership number: ");
          int nn= keyboard.nextInt(); 
          
              if(checkFile(nn,"membership.txt")){
                  System.out.println("********you have the membership, you will get the discount****** ");
                  return true;}
              else{
                  System.out.println("Sorry, you don't have a membership ");
                  space();
        
                   System.out.println("would you like to register for it? ( y:Yes, n:No) ");
                   Scanner s=new Scanner(System.in);
                   String let=s.nextLine();
                   char cha=let.charAt(0);

                       if(cha=='Y'||cha=='y'){
                          Random ran=new Random();
                          int x= ran.nextInt(1000)+1000;
           
                      while(checkFile(x,"membership.txt")){
                          x= ran.nextInt(1000)+1000;
                        }
                        FileWriter fw=new FileWriter("membership.txt",true);
                        PrintWriter pw=new PrintWriter(fw);
                       pw.println(x);
                       pw.close();
                       space();
             System.out.println("##############Congratulations, you are now a member in the University of Jeddah Library#####################");
             System.out.println("Your membership number is: "+ x+"\nPlease save it to use it another time");
             System.out.println();
           space();
           return true;
        }    
                     else if (cha=='n'||cha=='N'){
                      System.out.println("OK!");
                      System.out.println();
                      return false;  
}}}
        

          else if (ch=='n'||ch=='N'){
              
              System.out.println("OK!");
              System.out.println();
               return false;
          }    return false;
        }
 /*
        checkFile method checkin the file if the user have a membership in the library
        @return true if the user have a membership
        @return false if the user didn't want a membership
       
   */
    public static boolean checkFile(int x,String fileI) throws IOException
    {
        File file=new File(fileI);
        Scanner b=new Scanner(file);
        while(b.hasNext()){
            if(x==b.nextInt()){
                b.close();
                return true;
            } }
        b.close();
        return false;
    } 

        /*
        change method change the number of papers if the user want to change it
        
   */
    public static void change(PrintingService print,int max){
        
        Scanner keyboard=new Scanner(System.in);
        System.out.println("DO YOU WANT TO CHANGE THE NUMBER OF PAPERS? (y:for yes, n:for no)"); //if user want to modfiy the number of paper
          String letter=keyboard.nextLine();
          char ch=letter.charAt(0);
          if(ch=='Y'||ch=='y'){
                    System.out.println("Enter the new number of papers: "); //prompt
                    int newNumber=keyboard.nextInt(); //input the nwe number of paper
                    newNumber=validtion(newNumber,1,max); //checking the user input within the range
                    keyboard.nextLine(); //cleaning the input
                    print.setPrice(newNumber); //send the new number to modfiy the price
                    System.out.println("The new price is: "+ print.getPrice()+" SR"); //print the new price on the screen
                    System.out.println("*******************************OVERVIEW FOR YOUR SURVICE**************************************");
                    print.printDetails(); //print details using method 'printPrintingDetails()'
                    System.out.println(); //new line
                  }
            else if (ch=='n'||ch=='N'){ //if user do not want to modfiy the number of paper
                   System.out.println("*******************************OVERVIEW FOR YOUR SURVICE**************************************");
                   print.printDetails(); //print details using method 'printPrintingDetails()'
                   System.out.println(); //new line
                  }}

/*
        printDetailsOnFile method print the details on file
        
   */
  public static void printDetailsOnFile(String name) throws IOException{
       
            FileWriter fw=new FileWriter("allServices.txt",true);
            PrintWriter p=new PrintWriter(fw);
            p.println(name);
            p.println();
            p.close();
             
        PrintWriter pw=new PrintWriter("survice.txt");
          pw.println(name);
             pw.close();
  }
  /*
        printDetailsOnFile method print the details on screen by reading it from file
        
   */
   public static void printDetailsOnScreen() throws IOException{
          File file=new File("survice.txt") ;
          Scanner s=new Scanner(file);
             String str;
          while(s.hasNext()){    
            str=s.nextLine();
            System.out.println(str);}
      
  }
   /*
        space method print ** charecter
        
   */
   public static void space(){
         System.out.println("**************************************************************************************************************************************************************");
  }
}