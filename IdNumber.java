/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupcourseproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class IdNumber {
    private int ID;
    private String name;
    private static String DorS;
    private static String fileID;
    private static String fileName;
    private static int num;
    
    /*
    this consrtuctor initializes the name and the id number
    @param name the name of student/instructor
    @param ID the ID number
    */
      public IdNumber(String name,int ID){
        this.ID=ID;
        this.name=name;
    }
       /*
    this consrtuctor initializes the ID .
    @param ID as integer to ID field
    */ 
      public IdNumber(int ID){
     this.ID=ID;  
    }
  /*
    this consrtuctor initializes the ID and name.
    @param I as IdNumber object
    */ 
   public IdNumber(IdNumber I) {
       ID=I.ID;
       name=I.name;
    }
    //this consrtuctor check if the id number for instructors or students
    //and initializes the DorS student or doctor 
      public IdNumber(IdNumber I,int num) {
       ID=I.getId();
       name=I.getName();
       this.num=num;
       
       
      if(num==4){//id number for instructors
         DorS="instructor";
         fileID="IdDr.txt";
         fileName="namesDr.txt";
       }
      else if(num==7){//id number for student
         DorS="student"; 
         fileID="ID.txt";
         fileName="names.txt";
       }
    }
     /*
    the setID method setID field.
    @param ID as String to set ID field
    */ 
      public void setID(int ID) {
        this.ID = ID;
    }  
     /*
      checkID method check from file if the user registered before
      @return 0 if user doesn`t registered before and number if user already registered 
      */
      public int checkID() throws IOException
    {
        File file=new File(fileID);
        Scanner b=new Scanner(file);
        int count=0;
        while(b.hasNext()){
            count++;
            if(ID==b.nextInt()){
                b.close();
                return count;
            }
        }
        b.close();
        
        return 0;
    } 
    /*
      checkName method take the name from the user and write it in file
      @return the name of the user
      */
    public String checkName() throws IOException
   {
        File file=new File(fileName);
        Scanner n=new Scanner(file);
        String name=null;
        
        for(int i=0;checkID()>i; i++){
             name=n.nextLine();  }
        this.name=name;
        n.close();
        return name;
   }
    /*
      getName method 
      @return the name of the user
      */
      public String getName(){
       return name;
   }
      /*
      getId method 
      @return the ID object of the user
      */
      public int getId(){
       return ID;
   }
       /*
    the setName method setName field.
    @param name as String to set name field
    */ 
      public void setName(String name){
       this.name=name;
   }  
    /*
      getDorS method 
      @return if the user is student or instructor
      */
    public String getDorS() {
        return DorS;
    }
    /*
      getFileID method 
      @return the Id file
      */
    public String getFileID() {
        return fileID;
    }
    /*
      getFileName method 
      @return the name file
      */
    public String getFileName() {
        return fileName;
    }
   /*
    the setDorS method setDorS field.
    @param DorS as String to set DorS field
    */ 
    public void setDorS(String DorS) {
        this.DorS = DorS;
    }
  /*
    the setDorS method setDorS field.
    @param DorS as String to set DorS field
    */ 
    public void setFileID(String fileID) {
        this.fileID = fileID;
    }
 /*
      getNum method 
      @return the num
      */
    public static int getNum() {
        return num;
    }
  /*
    the setNum method setNum field.
    @param num as String to set num field
    */ 
    public static void setNum(int num) {
        IdNumber.num = num;
    }
     /*
    the setFileName method setFileName field.
    @param fileName as String to set fileName field
    */ 
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /*
    toString method 
    @return A string containing the user information
    */
     public String toString(){
                          //creat a string representing the object.
       String str = ("Hello "+DorS+" "+name+" with ID number "+ID+" to university laibrary system");
       return str ;
       
   }
}
