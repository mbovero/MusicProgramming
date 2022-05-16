import java.util.Scanner;
import java.util.ArrayList;

public class ProgressionGenerator {

  public static boolean again = true;
  public static boolean subMenuAgain = true;
  public static ArrayList<Progression> storedProgressions = new ArrayList<Progression>();
  public static int storedProgressionsIndex = -1;

  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    do {printMenu(scnr);} while(again);
  }//end main


  public static void printMenu(Scanner scnr) {
    char option = 'x';
    String optionsPossible = "rsikbq";
    again = true;

    System.out.println("\nMAIN MENU\nr - Generate completely random chord progression\ns - Generate standardized chord progression\ni - Input a custom chord progression to randomize\nk - Generate chord progression with specific chord quality\nb - Build a custom chord progression one chord at a time\nq - Quit\n");
    while (optionsPossible.indexOf(option) == -1) {
      System.out.println("Choose an option:");
      option = scnr.next().charAt(0);
      scnr.nextLine();
    }
    switch(option) {
      case 'r':
    completelyRandomMenu(scnr);
      break;

      case 's':
      break;

      case 'i':
      break;

      case 'k':
      break;

      case 'b':
      break;

      case 'q':
      again = false;
      break;
    }
  }//end printMenu

  public static void completelyRandomMenu(Scanner scnr) {
    String optionsPossible = "req";
    char option = 'x';
    subMenuAgain = true;
    int progressionLength;

    System.out.println("\n\nRANDOM PROGRESSION\nInput your desired progression length:");
    progressionLength = scnr.nextInt();
    storedProgressions.add(new Progression(progressionLength));
    storedProgressionsIndex ++;
    storedProgressions.get(storedProgressionsIndex).completelyRandom();
    scnr.nextLine();
    System.out.println("Press 'r' to randomize again, 'e' to export progression, or 'q' to return to Main Menu:");

    do {
      while (optionsPossible.indexOf(option) == -1) {
        option = scnr.next().charAt(0);
        scnr.nextLine();
      }
      switch (option) {
        case 'r':
        storedProgressions.add(new Progression(progressionLength));
        storedProgressionsIndex ++;
        storedProgressions.get(storedProgressionsIndex).completelyRandom();
        option = 'x';
        break;

        case 'e':
        System.out.println("\nEnter the name of the file you wish to export to:");
        String exportFile = scnr.nextLine();
        storedProgressions.get(storedProgressionsIndex).exportProgression(exportFile);
        option = 'x';
        break;

        case 'q':
        subMenuAgain = false;
        break;
      }
    } while(subMenuAgain);
  }//end completelyRandomMenu

}//end ProgressionGenerator
