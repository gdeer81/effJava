public class item_05_avoid_creating_unnecessary_objects{
  public static void main(String[] args){
  try{ Thread.sleep(1000);}catch(Exception e){} 
   System.out.println("please open up the visualvm to see the travesty unfold before your eyes...");
  
  Long sum = 0L;
  Float fsum = 0F;
  for(long i=0; i < Integer.MAX_VALUE; i++){
    sum +=i;
  }
  for(float i=0; i < Integer.MAX_VALUE; i++){
   fsum +=i;
   }
  
  System.out.println(sum);
  System.out.println(fsum);

}}
