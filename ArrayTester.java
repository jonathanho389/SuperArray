import java.util.Arrays;
public class ArrayTester{
  public static void main(String[] args) {
    SuperArray words = new SuperArray(10);
    words.add("kani");
    words.add("ubi");
    words.add("ebi");
    System.out.println(words.set(0, "glen"));
    System.out.println(words.capacity());
    System.out.println(words.toString());
    System.out.println(words.isEmpty());
    words.clear();
    System.out.println(words.isEmpty());
    words.add("kani");
    words.add("ubi");
    words.add("ebi");
    words.add("glen");
    System.out.println(words.toString());
    System.out.println(words.contains("glen"));
    words.add(3, "glen");
    System.out.println(words.toString());
    System.out.println(words.remove(2));
    System.out.println(words.toString());
    System.out.println(words.indexOf("glen"));
  }
}
