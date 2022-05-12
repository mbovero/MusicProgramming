import java.util.Scanner;
import Guitar-Programming.*;

public class ProgressionGenerator {

  public static boolean again = true;


  public static void main(String[] args) {
    Scanner scnr = new Scanner(System.in);

    do {printMenu(scnr);} while(again);
  }//end main

  public static void printMenu(Scanner scnr) {
    char option = 'x';
    String optionsPossible = "rsikbq";
    again = true;

    System.out.println("\nMAIN MENU\nr - Generate completely random chord progression\ns - Generate random standard chord progression\ni - Input a custom chord progression to randomize\nk - Generate chord progression with specific chord quality\nb - Build a custom chord progression one chord at a time\nq - Quit\n");
    while (optionsPossible.indexOf(option) == -1) {
      System.out.println("Choose an option:");
      option = scnr.next().charAt(0);
      scnr.nextLine();
    }
    switch(option) {
      case 'r':
      System.out.println("\nRANDOM PROGRESSION\nInput your desired progression length:");
      new Progression(scnr.nextInt()).completelyRandom();
      scnr.nextLine();
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


}//end ProgressionGenerator
