import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String party;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your party affiliation (D, R, I, or other).");
        party = scan.nextLine();
        if (party.equalsIgnoreCase("D")) {
            System.out.println("You got a Democratic Donkey.");
        } else if (party.equalsIgnoreCase("R")) {
            System.out.println("You got a Republican Elephant");
        } else if (party.equalsIgnoreCase("I")) {
            System.out.println("You got an Independent Person.");
        } else {
            System.out.println("You party affiliation is \"other\".");
        }
    }
}