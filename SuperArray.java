public class SuperArray{
  private String[] data;
  private int size;
  private int capacity;

  private void resize(){
    String[] newArr = new String[data.length * 2];
    for(int i = 0;i < size;i++){
      newArr[i] = data[i];
    }
    data = newArr;
    capacity *= 2;
  }
  public SuperArray(){
    data = new String[10];
    size = 0;
    capacity = 10;
  }
  public int size(){
    return size;
  }
  public int capacity(){
    return capacity;
  }
  public boolean add(String element){
    if(size >= capacity){
      resize();
    }
      data[size] = element;
      size++;
      return true;
  }
  public String get(int index){
    return data[index];
  }
  public String set(int index, String element){
    String original = data[index];
    data[index] = element;
    return original;
  }
  public boolean isEmpty(){
    if(size == 0){
      return true;
    }
    return false;
  }
  public void clear(){
    size = 0;
    data = new String[10];
  }
  public String toString(){
    String arr = "";
    for(int i = 0;i < data.length;i++){
      if(data[i] == null){
        arr += "";
      }
      else{
        arr += data[i] + ",";
      }
    }
    return "[" + arr.substring(0,arr.length() - 1) + "]";
  }
  public boolean contains(String s){
    for(int i = 0;i < data.length;i++){
      if(data[i] == null){
        i = data.length;
      }
      else if(data[i].equals(s)){
        return true;
      }
    }
    return false;
  }
}
