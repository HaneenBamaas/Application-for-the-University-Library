/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupcourseproject;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class borrowBook {
    private IdNumber ID;
    private String[] array;
    private int number;
    private String numberOffice;
    private String section;
    private int numberSection;
    /*
    this constructor initializes the ID,names of books,number of books and the section
    @param ID the id number
    @param array the names of the books in String array
    @param number the number of books
    @param numberSection the Section of books
    */
   public borrowBook(IdNumber ID, String[] array, int number,int numberSection) {
            this.ID = ID;
            ID=new IdNumber(ID);
            this.number=number;
            this.array=array; 
            setNumberOffice(numberSection);
            if(numberSection==1){
                section="Since section";
            }
            else if(numberSection==2){
                section="Information Technology Section";
            }
            else if(numberSection==3){
                section="Literary Section";
            }
    }
 /*
    this constructor for borrowBook class that`s no arg
    */
    public borrowBook() {
    }
    /*
    getNumber method
    @return The number of books
    */
    public int getNumber() {
        return number;
    }
    /*
    getNumberOffice method
    @return The number of office
    */
    public String getNumberOffice() {
        return numberOffice;
    }
    /*
    getSection method
    @return The section of books
    */
    public String getSection() {
        return section;
    }
    /*
    getSection method
    @return The number of section 
    */
    public int getNumberSection() {
        return numberSection;
    }
       /*
    the setNumber method set number field.
    @param number as integer to set number field
    */ 
    public void setNumber(int number) {
        this.number = number;
    }
     /*
    the setNumberSection method set NumberSection field.
    @param numberSection as integer to set numberSection field
    */ 
    public void setNumberSection(int numberSection) {
        this.numberSection = numberSection;
    }
 /*
    the setSection method set setSection field.
    @param section as String to set section field
    */ 
    public void setSection(String section) {
        this.section = section;
    }
     /*
    the setNumberOffice method set numberOffice field.
    @param numberOffice as integer to set numberOffice field
    */ 
     public void setNumberOffice(int number){
       if(number==1){
           numberOffice="A06";
       }
       if(number==2){
           numberOffice="A03";
       }
       if(number==3){
           numberOffice="A05";
       }
   }
     /*
    getID method
    @return The ID number
    */
    public IdNumber getID() {
        return new IdNumber(ID);
    }
    /*
    the setID method set setID field.
    @param ID as IdNumber to set ID field
    */ 
    public void setID(IdNumber ID) {
        this.ID = ID;
    }  
    /*
    the setArray method set setArray field.
    @param array as String[] to set array field
    */ 
    public void setArray(String[] array) {
        this.array = array;
    }
    /*
    inputArray method
    this method put the name of books that the user wants to borrow in string array
    */
    public void inputArray(){
        Scanner s=new Scanner(System.in);
     for (int i = 0; i < number; i++) { //strat for loop
        System.out.print("Enter the name of the book number "+(i+1)+ ": "); //prompt
        array[i] = s.nextLine(); 
             }}
 
    /*
    getArray method
    @return a string containing the number of books
     */
   public String getArray(){
       String str="";
          for (int i = 0; i < array.length; i++) 
             //  System.out.println("Book number "+ (i+1)+ ": "+array[i]);}}
              
     str+= String.format("-Book number %d : %s\n", (i+1),array[i]);  
       return str;
   }
    /*
    toString method 
    @return A string containing information about borrowing books.
    */
    public String toString() {
        //creat a string representing the object.
        String str= "-"+ID.getDorS()+" name:"+ID.getName()+" with ID number: "+ID.getId()+'\n'+
                "-has been borrow "+number+" book(s) from Jeddah Library system from "+ section+'\n'
                   + "-which they are: \n"+  getArray()

           +"-Please visit office number "+numberOffice+" in the library to pick up your books.";
       
        return str;
    }}