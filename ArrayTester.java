public class ArrayTester{
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    System.out.println(words.set(0, "glen"));
    System.out.println(words.capacity());
    System.out.println(words.toString());
    System.out.println(words.isEmpty());
    words.clear();
    System.out.println(words.isEmpty());
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    words.add("glen");
    System.out.println(words.toString());
    System.out.println(words.contains("glen"));
  }
}
