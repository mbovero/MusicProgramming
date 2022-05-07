import java.util.*;

public class Progression {
  private static List<String> randomChords = Arrays.asList("I", "II", "III", "IV", "V", "VI", "VII");
  private static List<String> randomMajorChords = Arrays.asList("I", "ii", "iii", "IV", "V", "vi", "vii");
  private static List<String> randomMinorChords = Arrays.asList("i", "ii", "III", "iv", "v", "VI", "VII");
  private static List<String> randomQualities = Arrays.asList("", "m", "dim", "aug", "sus2", "sus4", "m7b5", "dim7", "aug7", "minmaj7", "maj7(#5)", "6", "m6", "add9", "madd9", "add11", "9", "11", "13", "maj13", "b9", "#9", "sus9");


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
    int keyNum =rand.nextInt(12)
    for (int j=0; i<this.length; j++) {
      
    }
  }


  public static void main(String[] args) {
  }
}//end Progression
