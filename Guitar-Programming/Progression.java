import java.util.*;

public class Progression {
  private static List<String> randomChords = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII");
  private static List<String> randomMajorChords = Arrays.asList("I", "ii", "iii", "IV", "V", "vi", "vii");
  private static List<String> randomMinorChords = Arrays.asList("i", "ii", "III", "iv", "v", "VI", "VII");
  private static List<String> randomQualities = Arrays.asList("", "m", "dim", "aug", "sus2", "sus4", "m7b5", "dim7", "aug7", "minmaj7", "maj7(#5)", "6", "m6", "add9", "madd9", "add11", "9", "11", "13", "maj13", "b9", "#9", "sus9");
//Keys
  private static List<String> allKeys = Arrays.asList("A", "Bb", "B", "Cb", "C", "C#", "Db", "D", "Eb", "E", "F", "F#", "Gb", "G", "Ab", "a", "a#", "bb", "b", "c", "c#", "d", "d#", "eb", "e", "f", "f#", "g", "g#", "ab");
  private static List<String> majorKeys = Arrays.asList("A", "Bb", "B", "Cb", "C", "C#", "Db", "D", "Eb", "E", "F", "F#", "Gb", "G", "Ab");
  private static List<String> minorKeys = Arrays.asList("a", "Am", "a#", "A#m", "bb", "Bbm", "b", "Bm", "c", "Cm", "c#", "C#m", "d", "Dm", "d#", "D#m", "eb", "Ebm", "e", "Em", "f", "Fm", "f#", "F#m", "g", "Gm", "g#", "G#m", "ab", "Abm");

  private static List<String> AKey = Arrays.asList("A", "B", "C#", "D", "E", "F#", "G#");
  private static List<String> BbKey = Arrays.asList("Bb", "C", "D", "Eb", "F", "G", "A");
  private static List<String> BKey = Arrays.asList("B", "C#", "D#", "E", "F#", "G#", "A#");
  private static List<String> CbKey = Arrays.asList("Cb", "Db", "Eb", "Fb", "Gb", "Ab", "Bb");
  private static List<String> CKey = Arrays.asList("C", "D", "E", "F", "G", "A", "B");
  private static List<String> C#Key = Arrays.asList("C#", "D#", "E#", "F#", "G#", "A#", "B#");
  private static List<String> DbKey = Arrays.asList("Db", "Eb", "F", "Gb", "Ab", "Bb", "C");
  private static List<String> DKey = Arrays.asList("D", "E", "F#", "G", "A", "B", "C#");
  private static List<String> EbKey = Arrays.asList("Eb", "F", "G", "Ab", "Bb", "C", "D");
  private static List<String> EKey = Arrays.asList("E", "F#", "G#", "A", "B", "C#", "D#");
  private static List<String> FKey = Arrays.asList("F", "G", "A", "Bb", "C", "D", "E");
  private static List<String> F#Key = Arrays.asList("F#", "G#", "A#", "B", "C#", "D#", "E#");
  private static List<String> GbKey = Arrays.asList("Gb", "Ab", "Bb", "Cb", "Db", "Eb", "F");
  private static List<String> GKey = Arrays.asList("G", "A", "B", "C", "D", "E", "F#");
  private static List<String> AbKey = Arrays.asList("Ab", "Bb", "C", "Db", "Eb", "F", "G");

  private static List<String> aKey = Arrays.asList("A", "B", "C", "D", "E", "F", "G");
  private static List<String> a#Key = Arrays.asList("A#", "B#", "C#", "D#", "E#", "F#", "G#");
  private static List<String> bbKey = Arrays.asList("Bb", "C", "Db", "Eb", "F", "Gb", "Ab");
  private static List<String> bKey = Arrays.asList("B", "C#", "D", "E", "F#", "G", "A");
  private static List<String> cKey = Arrays.asList("C", "D", "Eb", "F", "G", "Ab", "Bb")
  private static List<String> c#Key = Arrays.asList("C#", "D#", "E", "F#", "G#", "A", "B");
  private static List<String> dKey = Arrays.asList("D", "E", "F", "G", "A", "Bb", "C");
  private static List<String> d#Key = Arrays.asList("D#", "E#", "F#", "G#", "A#", "B", "C#");
  private static List<String> ebKey = Arrays.asList("Eb", "F", "Gb", "Ab", "Bb", "Cb", "Db");
  private static List<String> eKey = Arrays.asList("E", "F#", "G", "A", "B", "C", "D");
  private static List<String> fKey = Arrays.asList("F", "G", "Ab", "Bb", "C", "Db", "Eb");
  private static List<String> f#Key = Arrays.asList("F#", "G#", "A", "B", "C#", "D", "E");
  private static List<String> gKey = Arrays.asList("G", "A", "Bb", "C", "D", "Eb", "F");
  private static List<String> g#Key = Arrays.asList("G#", "A#", "B", "C#", "D#", "E", "F#");
  private static List<String> abKey = Arrays.asList("Ab", "Bb", "Cb", "Db", "Eb", "Fb", "Gb");



  private Random rand = new Random();
  private int length;
  private String key;
  private ArrayList<String> progressionInitial = new ArrayList<String>;
  private String progressionFinal;

  public Progression() {
    this.length = 0;
    this.key = "C";
    this.progressionFinal = "none";
  }

  public Progression(int length, String key) {
    this.length = length;
    this.key = key;
  }

  public String completelyRandom() {
    for (int i=0; i<this.length; i++) {
      int randomIndex = rand.nextInt(randomChords.size());
      String chordNum = randomChords.get(randomIndex);
      this.progressionInitial.add(chordNum)
    }
    int keyNum =rand.nextInt(allKeys.size());
    for (int j=0; i<this.length; j++) {

    }
  }


  public static void main(String[] args) {
  }
}//end Progression
