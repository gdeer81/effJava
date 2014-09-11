package com.sadc.effjava.item._7;

public class BadUtilityClass{
   //the compiler is going to add a default no-arg constructor to this utility class
   //is that what we want?
   //what if we add it ourself?
   BadUtilityClass(){
   System.out.println("Hey I didn't want you to actually create this class, this is just a bag of methods...I know I could have used a private constructor to prevent this, but I assumed you would read the javadocs before using classes in your code...");
   try{Thread.sleep(2000);}catch(Exception e){}
   System.out.println("RIP your console");
   for(int i=0; i<100;i++){ 
     System.out.print("Oh No, You've constructed a utility class!!!");
     if(i == 50){ 
       System.out.println("okay, I'm done...");
       try{Thread.sleep(2000);}catch(Exception e){};
       System.out.print("...not!...");
       }
       }}
   public static int randomNumber(){
     return 42;
     }
  public static void printJoke(){
    System.out.println("Why don't dinosaurs dirve?");
    try{Thread.sleep(4000);}catch(Exception e){}
     System.out.println("...because they're all dead");
   }
}
