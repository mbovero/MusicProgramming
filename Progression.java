import java.util.*;
import java.io.*;

public class Progression {
  private static List<String> randomChords = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII");
  private static List<String> MajorChords = Arrays.asList("I", "ii", "iii", "IV", "V", "vi", "vii");
  private static List<String> MinorChords = Arrays.asList("i", "ii", "III", "iv", "v", "VI", "VII");
  private static List<String> randomQualities = Arrays.asList("", "m", "dim", "aug", "sus2", "sus4", "m7b5", "dim7", "aug7", "minmaj7", "maj7(#5)", "6", "m6", "add9", "madd9", "add11", "9", "11", "13", "maj13", "7b9", "#9", "sus9", "maj79");
//Keys
  //private static List<String> allKeys = Arrays.asList("A", "Bb", "B", "Cb", "C", "C#", "Db", "D", "Eb", "E", "F", "F#", "Gb", "G", "Ab", "a", "a#", "bb", "b", "c", "c#", "d", "d#", "eb", "e", "f", "f#", "g", "g#", "ab");
  private static List<String> AKey = Arrays.asList("A", "B", "C#", "D", "E", "F#", "G#");
  private static List<String> BbKey = Arrays.asList("Bb", "C", "D", "Eb", "F", "G", "A");
  private static List<String> BKey = Arrays.asList("B", "C#", "D#", "E", "F#", "G#", "A#");
  private static List<String> CbKey = Arrays.asList("Cb", "Db", "Eb", "Fb", "Gb", "Ab", "Bb");
  private static List<String> CKey = Arrays.asList("C", "D", "E", "F", "G", "A", "B");
  private static List<String> CSharpKey = Arrays.asList("C#", "D#", "E#", "F#", "G#", "A#", "B#");
  private static List<String> DbKey = Arrays.asList("Db", "Eb", "F", "Gb", "Ab", "Bb", "C");
  private static List<String> DKey = Arrays.asList("D", "E", "F#", "G", "A", "B", "C#");
  private static List<String> EbKey = Arrays.asList("Eb", "F", "G", "Ab", "Bb", "C", "D");
  private static List<String> EKey = Arrays.asList("E", "F#", "G#", "A", "B", "C#", "D#");
  private static List<String> FKey = Arrays.asList("F", "G", "A", "Bb", "C", "D", "E");
  private static List<String> FSharpKey = Arrays.asList("F#", "G#", "A#", "B", "C#", "D#", "E#");
  private static List<String> GbKey = Arrays.asList("Gb", "Ab", "Bb", "Cb", "Db", "Eb", "F");
  private static List<String> GKey = Arrays.asList("G", "A", "B", "C", "D", "E", "F#");
  private static List<String> AbKey = Arrays.asList("Ab", "Bb", "C", "Db", "Eb", "F", "G");

  private static List<String> aKey = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
  private static List<String> aSharpKey = Arrays.asList("A#", "B#", "C#", "D#", "E#", "F#", "G#");
  private static List<String> bbKey = Arrays.asList("Bb", "C", "Db", "Eb", "F", "Gb", "Ab");
  private static List<String> bKey = Arrays.asList("B", "C#", "D", "E", "F#", "G", "A");
  private static List<String> cKey = Arrays.asList("C", "D", "Eb", "F", "G", "Ab", "Bb");
  private static List<String> cSharpKey = Arrays.asList("C#", "D#", "E", "F#", "G#", "A", "B");
  private static List<String> dKey = Arrays.asList("D", "E", "F", "G", "A", "Bb", "C");
  private static List<String> dSharpKey = Arrays.asList("D#", "E#", "F#", "G#", "A#", "B", "C#");
  private static List<String> ebKey = Arrays.asList("Eb", "F", "Gb", "Ab", "Bb", "Cb", "Db");
  private static List<String> eKey = Arrays.asList("E", "F#", "G", "A", "B", "C", "D");
  private static List<String> fKey = Arrays.asList("F", "G", "Ab", "Bb", "C", "Db", "Eb");
  private static List<String> fSharpKey = Arrays.asList("F#", "G#", "A", "B", "C#", "D", "E");
  private static List<String> gKey = Arrays.asList("G", "A", "Bb", "C", "D", "Eb", "F");
  private static List<String> gSharpKey = Arrays.asList("G#", "A#", "B", "C#", "D#", "E", "F#");
  private static List<String> abKey = Arrays.asList("Ab", "Bb", "Cb", "Db", "Eb", "Fb", "Gb");

  private static List<List<String>> allKeys = Arrays.asList(AKey, BbKey, BKey, CbKey, CKey, CSharpKey, DbKey, DKey, EbKey, EKey, FKey, FSharpKey, GbKey, GKey, AbKey, aKey, aSharpKey, bbKey, bKey, cKey, cSharpKey, dKey, dSharpKey, ebKey, eKey, fKey, fSharpKey, gKey, gSharpKey, abKey);
  private static List<String> majorKeys = Arrays.asList("A", "Bb", "B", "Cb", "C", "C#", "Db", "D", "Eb", "E", "F", "F#", "Gb", "G", "Ab");
  private static List<String> minorKeys = Arrays.asList("a", "Am", "a#", "A#m", "bb", "Bbm", "b", "Bm", "c", "Cm", "c#", "C#m", "d", "Dm", "d#", "D#m", "eb", "Ebm", "e", "Em", "f", "Fm", "f#", "F#m", "g", "Gm", "g#", "G#m", "ab", "Abm");
// gotta do the List of lists thing for major/minor


  private Random rand = new Random();
  private int progressionLength;
  private List<String> key;
  private String keyString;
  private ArrayList<String> progressionInitial = new ArrayList<String>();
  private ArrayList<String> progressionQualities = new ArrayList<String>();
  private String progressionChordNums;
  private String progressionFinal;


  public Progression() {
    this.progressionLength = 0;
    this.keyString = "none";
    this.progressionChordNums = "none";
    this.progressionFinal = "none";
  }
  public Progression(int progressionLength) {
    this.progressionLength = progressionLength;
  }
  public Progression(int progressionLength, String keyString) {
    this.progressionLength = progressionLength;
    this.keyString = keyString;
  }

  public void completelyRandom() {
    //randomize chord numbers
    for (int i=0; i<this.progressionLength; i++) {
      int randomIndex = rand.nextInt(randomChords.size());
      String chordNum = randomChords.get(randomIndex);
      this.progressionInitial.add(chordNum);
    }
    //replace chord numbers with random key's chords
    this.key = allKeys.get(rand.nextInt(allKeys.size()));
    for (int i=0; i<this.progressionLength; i++) {
      if (this.progressionInitial.get(i).equals("VII")) {this.progressionQualities.add(this.key.get(6));}
      else if (this.progressionInitial.get(i).equals("VI")) {this.progressionQualities.add(this.key.get(5));}
      else if (this.progressionInitial.get(i).equals("IV")) {this.progressionQualities.add(this.key.get(3));}
      else if (this.progressionInitial.get(i).equals("V")) {this.progressionQualities.add(this.key.get(4));}
      else if (this.progressionInitial.get(i).equals("III")) {this.progressionQualities.add(this.key.get(2));}
      else if (this.progressionInitial.get(i).equals("II")) {this.progressionQualities.add(this.key.get(1));}
      else if (this.progressionInitial.get(i).equals("I")) {this.progressionQualities.add(this.key.get(0));}
    }
    //randomize chord qualities
    for (int i=0; i<this.progressionLength; i++) {
      int randomIndex = rand.nextInt(randomQualities.size());
      this.progressionQualities.set(i, this.progressionQualities.get(i) + randomQualities.get(randomIndex));
    }
    //format final progression string
    this.progressionChordNums = "";
    this.progressionFinal = "";
    for (int i=0; i<this.progressionLength; i++) {
      this.progressionChordNums += this.progressionInitial.get(i) + " ";
      this.progressionFinal += this.progressionQualities.get(i) + " ";
    }
    System.out.println("\n" + "Key: " + this.key.get(0) + "\n" + this.progressionChordNums + "\n" + this.progressionFinal + "\n");
  }//end completelyRandom

  public void exportProgression(String file_name) {
    boolean successful = true;
    try {
      //File file = new File(file_name);
      PrintWriter writer = new PrintWriter(new BufferedWriter(new FileWriter(file_name, true)));
      writer.println(this.progressionFinal);
      writer.close();
    }
    catch(IOException e){
      System.out.println("Couldn't open the file\n"+e);
      successful = false;
    }
    finally {
      if (successful) {
        System.out.println("Progression exported to \"" + file_name + "\"\n");
        System.out.println("Press 'r' to randomize again, 'e' to export progression, or 'q' to return to Main Menu:");
      }
    }
  }//end exportProgression


  public static void main(String[] args) {
  }
}//end Progression
