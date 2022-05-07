import java.util.ArrayList;
import java.util.Random;

public class Progression {
  private static ArrayList<String> randomMajorChords = new ArrayList<String>();
  private static ArrayList<String> randomMinorChords = new ArrayList<String>();

  private Random rand = new Random();
  private int length;
  private String key;

  public Progression(int length, String key) {
    this.length = length;
    this.key = key;
    randomMajorChords.add("I"); randomMajorChords.add("ii"); randomMajorChords.add("iii"); randomMajorChords.add("IV"); randomMajorChords.add("V"); randomMajorChords.add("vi"); randomMajorChords.add("vii");
    randomMinorChords.add("i"); randomMinorChords.add("ii"); randomMinorChords.add("III"); randomMinorChords.add("iv"); randomMinorChords.add("v"); randomMinorChords.add("VI"); randomMinorChords.add("VII");      

  }

}
