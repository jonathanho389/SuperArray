public class SuperArray{
  private String[] data;
  private int size;
  private int capacity;

  private void resize(){
    String[] newArr = new String[data.length + 1];
    for(int i = 0;i < size;i++){
      newArr[i] = data[i];
    }
    data = newArr;
    capacity++;
  }
  public SuperArray(){
    data = new String[10];
    size = 0;
    capacity = 10;
  }
  public int size(){
    return size;
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
}
