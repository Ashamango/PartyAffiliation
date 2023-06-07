import java.util.Scanner;
public class PartyAffiliation {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // Prompt and input
        System.out.print("Enter your party affiliation (D, R, I, or other):  "); // output "Enter your party affiliation, (D, R, I, or other): "
        String DRIO = in.next(); // input DRI

        if (DRIO.equals("D")) //if DRIO == "D" then
        {
            System.out.print("You get a democratic donkey."); // output "You get a democratic donkey."
            in.nextLine();
        }
        else if (DRIO.equals("R")) // else if DRIO == "R" then
        {
            System.out.print("You get a republic elephant."); // output "You get a republic elephant."
            in.nextLine();
        }
        else if (DRIO.equals("I")) // else if DRIO == "I" then
        {
            System.out.print("You get an independent man."); // output "You get an independent man."
            in.nextLine();
        }
        else
        {
            System.out.print("You get other."); // output "You get other."
        }// endif
    } // return
} // end class

