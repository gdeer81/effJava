//package ch2_creating_and_destroying_objects;


public class item_04_enforce_noninstantiability_with_a_private_constructor{

public static void main(String[] args){
 
  String[] highlights = {"Attempting to enforce noninstatiability by making a class abstract doesn't work", "a class can be made noninstantiable by including a private constructor"};

  String codeBlock1 = "//Noninstantiable utility class\n"+
                             "public class UtilityClass{\n"+
			     "   private UtilityClass(){\n"+
			     "     throw new AssertionError();"+
			     "   }  //Remainder omitted }";


  System.out.println("The highlights of this sections are: ");
  System.out.println(highlights[0]);
  System.out.println(highlights[1]);
  System.out.println(codeBlock1);

  if(args[0].equals("bad")){
    System.out.println("going to try to instantiate our bad Util class now...");
    BadUtilityClass buc = new BadUtilityClass();
  }else{
    System.out.println("going to try to instantiate our good Util class now...");
    try{    
      GoodUtilityClass guc = new GoodUtilityClass();
      }catch(AssertionError ae){
        System.out.println("this is what happens when you try to instantiate this one...");
	ae.printStackTrace();
	}

	System.out.println("Instead lets just use it like it was meant to be used...");
	GoodUtilityClass.printJoke();
      for(int i=0;i < 5;i++){
      System.out.println("calling utility class static method randomNumber...");
      System.out.println(GoodUtilityClass.randomNumber());
      }
  }
  



}
}
