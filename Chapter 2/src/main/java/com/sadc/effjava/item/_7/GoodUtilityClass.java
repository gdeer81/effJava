package com.sadc.effjava.item._7;

public class GoodUtilityClass{
   public GoodUtilityClass(){
     throw new AssertionError();
       }
   public static int randomNumber(){
     return 42;
     }
  public static void printJoke(){
    System.out.println("Why don't dinosaurs dirve?");
    try{Thread.sleep(4000);}catch(Exception e){}
     System.out.println("...because they're all dead");
   }
}
