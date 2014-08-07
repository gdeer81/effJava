package ch8_general_programming;

/**
 * Created by ChrisPound
 * Date: 8/3/2014.
 */

public class item_45_minimize_the_scope_of_local_variables {
        private static String[] data = {"effictive", "java"};
    private static String[] data2 = {"effictive", "java"};
    public static void main(String[] args) {

        System.out.println("The most powerful technique for minimizing the scope of a local variable is to declare it where it is first used.");
        String thisisbad;

        for(String response: data  ){
              String thisisbetter = response;
        }


        for(String response2: data2){
//            if(response !=null) {
//
//                  response = thisisbad;
//            }
        }

        System.out.println("what kind of loops should we use?");

    }

}
