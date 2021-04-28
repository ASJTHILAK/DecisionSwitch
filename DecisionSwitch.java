package decisionswitch;

import java.util.Scanner;

public class DecisionSwitch {

    public static void main(String[] args) {
        
       //IF...ELSE IF...ELSE CONDITION (DECISION MAKING)
       
       int input;
       System.out.println("Enter your age : ");
       Scanner s = new Scanner(System.in);
       input = s.nextInt();
       if(input > 18){
           System.out.println("You are eligible to vote");
       }
       else if(input < 18){
           System.out.println("You are not eligible to vote");
       }
       else{
           System.out.println("Correct age to vote. Vote wisely!!!");
       }
       
       // SWITCH CASE
       
       int choice;
       System.out.println("Pick one \n 1. Hi \n 2.Hello \n 3.Hey");
       Scanner t = new Scanner(System.in);
       choice = t.nextInt();
       switch(choice){
           case 1: System.out.println("You said Hi");
                   break;
           case 2: System.out.println("You said Hello");
                   break;
           case 3: System.out.println("You said Hey");
                   break;        
           default : System.out.println("Invalid Choice Bye");        
       }
    }
}
