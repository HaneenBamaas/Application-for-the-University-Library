/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package groupcourseproject;

/**
 *
 * @author User
 */
public class PrintingService {
     public int paper;
    private double price;
    private int divide;
    private String survice;
    private static String word;
    
    /*
    this consrtuctor initializes the id number,the number of paper and the selected service.
    @param paper the number of paper
    @param divide the selected service.
    */
    public PrintingService(int paper,int divide){
       this.paper=paper;
       this.divide=divide;
       word=" without membership discount";
        if(divide==1)
            survice="printing service";   
        else if(divide==2)
            survice="phtocopying service";
   
}
       /*
    this consrtuctor initializes the number of paper, the selected service and the price going to give it discount for memeber it will take all from A object .
    @param A as PrintingService object
    */ 
    public PrintingService(PrintingService A){
        this.paper=A.paper;
        this.price=A.price*(70.0/100.0);
        this.survice=A.survice;
        word=" with membership discount";

}
          /*
    the setPrice method set price field.
    @param paper the integer to set paper field
    */ 
    public void setPrice(int paper){
        this.paper=paper;
        price=(double)paper/(2.0*divide);
}
    /*
    getprice method
    @return the price of service
     */
    public double getPrice(){
            return price;
}
    public void setPaper(int paper){
        this.paper=paper;
    }
    /*
    getpaper method
    @return the number of paper
     */
    public int getPaper(){
        return paper;
    }
    /*
    getdicount method
    @return the price after discount
     */
    public double getdicount(){
        return price;
    }
    /*
    /*
    getdivede method
    @return thr number of service (divide)
     */
    public int getDivide() {
        return divide;
    }
    /*
    getsurvice method
    @return a string containing the selected service
     */
    public String getSurvice() {
        return survice;
    }
      /*
    the setDivide method set divide field.
    @param divide as integer to set divide field
    */ 
    public void setDivide(int divide) {
        this.divide = divide;
    }
   /*
    the setSurvice method set Survice field.
    @param survice as String to set survice field
    */ 
    public void setSurvice(String survice) {
        this.survice = survice;
    }
    
   /*
    printDetails method 
    this method print the details of service
    */
    public void  printDetails(){
        System.out.println("you choose printing service with "+ getPaper()+" sheet, and the total price is "
                +getPrice()+" SR");
    }
    /*
    toString method 
    @return A string containing information about photocopy/printing service.
    */
     public String  toString(IdNumber ID){
                 //creat a string representing the object.
        String str=
        String.format(" - %s  name: %s with ID number:%d \n - choose %s with %d  number of paper \n - and the price is %.2fSR \n-%s", ID.getDorS(),ID.getName(),ID.getId()
                    ,survice,getPaper(), getPrice(),word);
        return str;
     }
}
