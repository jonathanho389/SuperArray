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

  public static SuperArray zip(SuperArray a, SuperArray b){
    SuperArray newArr = new SuperArray(a.capacity() + b.capacity());
    if(a.size() > b.size()){
      for(int i = 0;i < a.size();i++){
        newArr.add(a.get(i));
        newArr.add(b.get(i));
      }
    }
    if(b.size() > a.size()){
      for(int i = 0;i < b.size();i++){
        newArr.add(a.get(i));
        newArr.add(b.get(i));
      }
    }
    return newArr;
  }
}
