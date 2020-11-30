import java.util.Scanner;

public class CandyMachine {

    public static void main(String[] args) {
        verse1();
      System.out.println();
        verse2();
        System.out.println();
      verse3();
      System.out.println();
      verse4();
    }

   public static void verse1() {
        System.out.println("Welcome to Shoreline's Computer Candy Machine!");
       System.out.println("(All candy provided is virtual.)");
   }
   public static void verse2() {
   Scanner console = new Scanner(System.in);
     System.out.print("How much money do you have? >"); //prompts for a whole number
   double money = console.nextDouble();
   System.out.printf("%.2f, that's all?", money);
   }
   public static void verse3() {
   System.out.println("Well, let me tell you what we got here.");
   System.out.println("A $0.65 Twix");
   System.out.println("B $0.50 Chips");
   System.out.println("C $0.75 Nutter Butter");
   System.out.println("D $0.65 Peanut Butter Cup");
   System.out.println("E $0.55 Juicy Fruit Gum");
   }
   public static void verse4() {
      Scanner input = new Scanner(System.in);
     System.out.print("So, What do you want? >"); //prompts for a whole number
   String a = input.next();
   if (a.equals("A"))
      if (money > 0.65)
         System.out.println("Thanks for purchasing candy through us."); 
   else
   }
}
   