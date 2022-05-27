import java.util.*;
import java.io.*;

public class Progression {
  private static List<String> randomChords = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII");
  private static List<String> MajorChords = Arrays.asList("I", "ii", "iii", "IV", "V", "vi", "vii");
  private static List<String> MinorChords = Arrays.asList("i", "ii", "III", "iv", "v", "VI", "VII");
  private static List<String> randomQualities = Arrays.asList("", "m", "dim", "aug", "sus2", "sus4", "m7b5", "dim7", "aug7", "minmaj7", "maj7(#5)", "6", "m6", "add9", "madd9", "add11", "9", "11", "13", "maj13", "7b9", "#9", "sus9", "maj9");
//Keys - 8th letter is for identifying name of key
  //private static List<String> allKeys = Arrays.asList("A", "Bb", "B", "Cb", "C", "C#", "Db", "D", "Eb", "E", "F", "F#", "Gb", "G", "Ab", "a", "a#", "bb", "b", "c", "c#", "d", "d#", "eb", "e", "f", "f#", "g", "g#", "ab");
  private static List<String> AKey = Arrays.asList("A", "B", "C#", "D", "E", "F#", "G#", "A");
  private static List<String> BbKey = Arrays.asList("Bb", "C", "D", "Eb", "F", "G", "A", "Bb");
  private static List<String> BKey = Arrays.asList("B", "C#", "D#", "E", "F#", "G#", "A#", "B");
  private static List<String> CbKey = Arrays.asList("Cb", "Db", "Eb", "Fb", "Gb", "Ab", "Bb", "Cb");
  private static List<String> CKey = Arrays.asList("C", "D", "E", "F", "G", "A", "B", "C");
  private static List<String> CSharpKey = Arrays.asList("C#", "D#", "E#", "F#", "G#", "A#", "B#", "C#");
  private static List<String> DbKey = Arrays.asList("Db", "Eb", "F", "Gb", "Ab", "Bb", "C", "Db");
  private static List<String> DKey = Arrays.asList("D", "E", "F#", "G", "A", "B", "C#", "D");
  private static List<String> EbKey = Arrays.asList("Eb", "F", "G", "Ab", "Bb", "C", "D", "Eb");
  private static List<String> EKey = Arrays.asList("E", "F#", "G#", "A", "B", "C#", "D#", "E");
  private static List<String> FKey = Arrays.asList("F", "G", "A", "Bb", "C", "D", "E", "F");
  private static List<String> FSharpKey = Arrays.asList("F#", "G#", "A#", "B", "C#", "D#", "E#", "F#");
  private static List<String> GbKey = Arrays.asList("Gb", "Ab", "Bb", "Cb", "Db", "Eb", "F", "Gb");
  private static List<String> GKey = Arrays.asList("G", "A", "B", "C", "D", "E", "F#", "G");
  private static List<String> AbKey = Arrays.asList("Ab", "Bb", "C", "Db", "Eb", "F", "G", "Ab");

  private static List<String> aKey = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "Am");
  private static List<String> aSharpKey = Arrays.asList("A#", "B#", "C#", "D#", "E#", "F#", "G#", "A#m");
  private static List<String> bbKey = Arrays.asList("Bb", "C", "Db", "Eb", "F", "Gb", "Ab", "Bbm");
  private static List<String> bKey = Arrays.asList("B", "C#", "D", "E", "F#", "G", "A", "Bm");
  private static List<String> cKey = Arrays.asList("C", "D", "Eb", "F", "G", "Ab", "Bb", "Cm");
  private static List<String> cSharpKey = Arrays.asList("C#", "D#", "E", "F#", "G#", "A", "B", "C#m");
  private static List<String> dKey = Arrays.asList("D", "E", "F", "G", "A", "Bb", "C", "Dm");
  private static List<String> dSharpKey = Arrays.asList("D#", "E#", "F#", "G#", "A#", "B", "C#", "D#m");
  private static List<String> ebKey = Arrays.asList("Eb", "F", "Gb", "Ab", "Bb", "Cb", "Db", "Ebm");
  private static List<String> eKey = Arrays.asList("E", "F#", "G", "A", "B", "C", "D", "Em");
  private static List<String> fKey = Arrays.asList("F", "G", "Ab", "Bb", "C", "Db", "Eb", "Fm");
  private static List<String> fSharpKey = Arrays.asList("F#", "G#", "A", "B", "C#", "D", "E", "F#m");
  private static List<String> gKey = Arrays.asList("G", "A", "Bb", "C", "D", "Eb", "F", "Gm");
  private static List<String> gSharpKey = Arrays.asList("G#", "A#", "B", "C#", "D#", "E", "F#", "G#m");
  private static List<String> abKey = Arrays.asList("Ab", "Bb", "Cb", "Db", "Eb", "Fb", "Gb", "Abm");

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
    if (this.keyString.equals("r")) {
      this.key = allKeys.get(rand.nextInt(allKeys.size()));
    }
    else {
      this.key = allKeys.get(keyAssignment(this.keyString));
    }
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
    System.out.println("\n" + "Key: " + this.key.get(7) + "\n" + this.progressionChordNums + "\n" + this.progressionFinal + "\n");
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

  public static int keyAssignment(String keyString) {
    int keyIndex = 4;
    switch (keyString) {
      case "A":
      keyIndex = 0;
      break;
      case "Bb":
      keyIndex = 1;
      break;
      case "B":
      keyIndex = 2;
      break;
      case "Cb":
      keyIndex = 3;
      break;
      case "C":
      keyIndex = 4;
      break;
      case "C#":
      keyIndex = 5;
      break;
      case "Db":
      keyIndex = 6;
      break;
      case "D":
      keyIndex = 7;
      break;
      case "Eb":
      keyIndex = 8;
      break;
      case "E":
      keyIndex = 9;
      break;
      case "F":
      keyIndex = 10;
      break;
      case "F#":
      keyIndex = 11;
      break;
      case "Gb":
      keyIndex = 12;
      break;
      case "G":
      keyIndex = 13;
      break;
      case "Ab":
      keyIndex = 14;
      break;

      case "a":
      keyIndex = 15;
      break;
      case "Am":
      keyIndex = 15;
      break;
      case "a#":
      keyIndex = 16;
      break;
      case "A#m":
      keyIndex = 16;
      break;
      case "bb":
      keyIndex = 17;
      break;
      case "Bbm":
      keyIndex = 17;
      break;
      case "b":
      keyIndex = 18;
      break;
      case "Bm":
      keyIndex = 18;
      break;
      case "c":
      keyIndex = 19;
      break;
      case "Cm":
      keyIndex = 19;
      break;
      case "c#":
      keyIndex = 20;
      break;
      case "C#m":
      keyIndex = 20;
      break;
      case "d":
      keyIndex = 21;
      break;
      case "Dm":
      keyIndex = 21;
      break;
      case "d#":
      keyIndex = 22;
      break;
      case "D#m":
      keyIndex = 22;
      break;
      case "eb":
      keyIndex = 23;
      break;
      case "Ebm":
      keyIndex = 23;
      break;
      case "e":
      keyIndex = 24;
      break;
      case "Em":
      keyIndex = 24;
      break;
      case "f":
      keyIndex = 25;
      break;
      case "Fm":
      keyIndex = 25;
      break;
      case "f#":
      keyIndex = 26;
      break;
      case "F#m":
      keyIndex = 26;
      break;
      case "g":
      keyIndex = 27;
      break;
      case "Gm":
      keyIndex = 27;
      break;
      case "g#":
      keyIndex = 28;
      break;
      case "G#m":
      keyIndex = 28;
      break;
      case "ab":
      keyIndex = 29;
      break;
      case "Abm":
      keyIndex = 29;
      break;
    }
    return keyIndex;
  }//end keyAssignment

  public static void main(String[] args) {
  }
}//end Progression
