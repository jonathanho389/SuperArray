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
      else if(i == size - 1){
        arr += data[i];
      }
      else{
        arr += data[i] + ", ";
      }
    }
    return "[" + arr + "]";
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
  public SuperArray(int initialCapacity){
    data = new String[initialCapacity];
    capacity = initialCapacity;
  }
  public void add(int index, String element){
    String[] newArr = new String[capacity];
    if(index == capacity){
      resize();
    }
    for(int i = 0;i < index + 1;i++){
      newArr[i] = data[i];
    }
    newArr[index] = data[index];
    for(int i = index + 1;i < size - 1;i++){
      newArr[i] = data[i];
    }
    data[index] = element;
  }
  public String remove(int index){
    String removed = data[index];
    String[] newArr = new String[capacity];
    for(int i = 0;i < index;i++){
      newArr[i] = data[i];
    }
    for(int i = index + 1;i <= size;i++){
        newArr[i] = data[i];
      }
    size--;
    data = newArr;
    return removed;
  }
  public int indexOf(String s){
    int index = 0;
    for(int i = 0;i < data.length;i++){
      if(!s.equals(data[i]) && i == data.length - 1){
        return -1;
      }
      else if(!s.equals(data[i])){
        continue;
      }
      else{
        index += i;
        i = data.length;
      }
    }
    return index;
  }
  public String[] toArray(){
    String[] newArr = new String[size];
    for(int i = 0;i < size;i++){
      newArr[i] = data[i];
    }
    return newArr;
  }
}
