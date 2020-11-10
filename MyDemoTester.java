public class MyDemoTester{
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray nums1 = new SuperArray();
    SuperArray nums2 = new SuperArray();
    SuperArray letters1 = new SuperArray();
    SuperArray nums3 = new SuperArray();
    SuperArray letters2 = new SuperArray();
    SuperArray nums4 = new SuperArray();

    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    nums1.add("9"); nums1.add("1"); nums1.add("2");
    nums1.add("2"); nums1.add("3"); nums1.add("4");

    nums2.add("0"); nums2.add("4"); nums2.add("2");
    nums2.add("2"); nums2.add("9");

    letters1.add("a"); letters1.add("b"); letters1.add("c");
    letters1.add("d"); letters1.add("e"); letters1.add("f");

    nums3.add("0"); nums3.add("1");
    nums3.add("2"); nums3.add("3");

    letters2.add("a"); letters2.add("b"); letters2.add("c");

    nums4.add("0"); nums4.add("1"); nums4.add("2");
    nums4.add("3"); nums4.add("4");

    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);
    System.out.println(Demo.findOverlap(nums1, nums2));
    System.out.println(Demo.zip(letters1, nums3));
  }
}
