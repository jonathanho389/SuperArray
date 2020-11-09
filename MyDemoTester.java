public class MyDemoTester{
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    SuperArray nums1 = new SuperArray();
    SuperArray nums2 = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    nums1.add("9"); nums1.add("1"); nums1.add("2");
    nums1.add("2"); nums1.add("3"); nums1.add("4");

    nums2.add("0"); nums2.add("4"); nums2.add("2");
    nums2.add("2"); nums2.add("9");

    System.out.println(words);
    Demo.removeDuplicates(words);
    System.out.println(words);
    System.out.println(Demo.findOverlap(nums1, nums2));
  }
}
