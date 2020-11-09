public class Demo{
  public static void removeDuplicates(SuperArray s){
    int first = 0;
    for(int i = 0;i < s.size();i++) {
      first += s.indexOf(s.get(i));
      if(first < i && first != i) {
        s.remove(i);
        i--;
      }
      first = 0;
    }
  }
  public static SuperArray findOverlap(SuperArray a, SuperArray b){
    SuperArray newArr = new SuperArray();
    int arrSize = 0;
    for(int i = 0;i < a.size();i++) {
      if(b.contains(a.get(i))){
        newArr.add(a.get(i));
      }
    }
    removeDuplicates(newArr);
    return newArr;
  }
  public static void main(String[]args){
    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");

    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);
  }
}
