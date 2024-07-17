/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupcourseproject;

import java.util.Random;

/**
 *
 * @author User
 */
//this class store and print data about booking
public class BookPlace {
    private int number;
    private int time;
    private String ch;
    private IdNumber ID;
    private static String place;
    private static String word;
 /*
    this constructor initializes the number,time and place.
    @param ID the id number
    @param time as integer 
    @param number as integer
    */
    
    public BookPlace(int number,int time,IdNumber I){
    this.number=number;
    this.time=time;
    ID=new IdNumber(I);
    place="Normal place";
    }
    /*
    this consrtuctor creat object of IdNumber.
    @param I as IdNumber object
    */ 
    public BookPlace(IdNumber I){
        ID=new IdNumber(I);
        place="Normal place";  
    }
    /*
    this consrtuctor initializes the ID, number,ch and time  .
    @param A as BookPlace object
    */ 
    public BookPlace(BookPlace A){
        this.number=A.number;
        this.ch=A.ch;
        this.time=A.time;
        this.ID=A.ID;
        place="privet place because you have a membership in the library";
    }
      /*
    this consrtuctor initializes the number, type and object A of class BookPlace .
    @param A as BookPlace object
    @param number as integer
    @param type as integer
    */ 
        public BookPlace(BookPlace A,int number,int type){
        this.number=number;
        this.ch=A.ch;
        this.time=A.time;
        this.ID=A.ID;
         if(type==1){
                word="meeting purpose with "+getNumber()+ " "+ID.getDorS()+"(s)";
       }
          else if(type==2){
                 word="studying alone purpose ";
       }
    }
        /*
    the setNumberOfVistor method Number field.
    @param number as integer to set number field
    */ 
    public void setNumberOfVistor(int number){
        this.number=number;
    }
     /*
    getNumberOfVistor method return integer
    @return The number field 
    */
    public int getNumberOfVistor(){
        return number;
    }
    /*
    the setTime method time field.
    @param time as integer to set time field
    */ 
    public void setTime(int time){
        this.time=time;
    }
    /*
    getTime method return integer
    @return The time field 
    */
    public int getTime(){
        return time;
    }
    /*
    getChar method return string
    @return The cha field 
    */
    public String getCha(){

        if(time>=6&&time!=12){
            ch="AM";
        }
          else if(time<=5||time==12){
          ch="PM";
        }
          return ch;
    }
     /*
    numberOfReservation method return integer
    @return random number 
    */
    public int numberOfReservation(){
           Random ran=new Random();
           return ran.nextInt(1000)+100;}
    /*
    getPlace method return string
    @return The place field 
    */
    public String getPlace() {
        return place;
    }
  /*
    the setPlace method place field.
    @param place as integer to set place field
    */ 
    public void setPlace(String place) {
        this.place = place;
    }
    /*
      getId method 
      @return the ID object of the user
      */
    public IdNumber getID() {
        return new IdNumber(ID);
    }
    /*
    the setID method creat object ID from IdNumber class.
    @param ID as object of IdNumber class.
    */ 
    public void setID(IdNumber ID) {
        this.ID = ID;
    }  
 /*
    getNumber method return integer
    @return The number field 
    */
    public int getNumber() {
        return number;
    }
 /*
    the setNumber method number field.
    @param number as integer to set number field
    */ 
    public void setNumber(int number) {
        this.number = number;
    }
    /*
    the setCha method ch field.
    @param ch as String to set ch field
    */ 
    public void setCh(String ch) {
        this.ch = ch;
    }
    /*
    getWord method return String
    @return The word field 
    */
    public static String getWord() {
        return word;
    }
    /*
    the setWord method word field.
    @param word as String to set word field
    */ 
    public static void setWord(String word) {
        BookPlace.word = word;
    }
    
    /*
    toString method 
    @return A string containing the resrevation information.
    */
   public String toString() {
                 //creat a string representing the object.
           String str ="- The resrevation has been done by "+ID.getDorS()+" " +ID.getName()+" with ID number: "+ID.getId()+'\n'+
                     "- The library going to be visit for "+ getWord()+
                     "- at time "+getTime()+" "+ getCha()+'\n'+
                   "- in a "+getPlace()+'\n'+
                     "- your reservation number is "+ numberOfReservation();
           return str;
    }}
