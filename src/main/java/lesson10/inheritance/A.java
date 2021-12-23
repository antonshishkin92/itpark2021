package lesson10.inheritance;

public class A {

   private String str="";
   private static String Global_STR="Example";

 //  {
 //     str="Test";
 //  }

   static {
      Global_STR="";
   }

   public A(){
      this.str="Constructor";
      System.out.println("Вызван конструктор класса A");
   }

   protected void print(){

   }
}
