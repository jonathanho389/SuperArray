public class SuperArray{
  private String[] data;
  private int size;
  private int capacity;

  public void resize(){
    String[] newArr = new String[data.length * 2 + 1];
    for(int i = 0;i < size;i++){
      newArr[i] = data[i];
    }
    data = newArr;
    capacity = capacity * 2 + 1;
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
    if(size >= data.length){
      resize();
    }
    data[size] = element;
    size++;
    return true;
  }

  public String get(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }
    return data[index];
  }

  public String set(int index, String element){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }
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
    if(initialCapacity < 0){
      throw new IllegalArgumentException("initialCapacity " + initialCapacity + " cannot be negative");
    }
    data = new String[initialCapacity];
    capacity = initialCapacity;
  }

  public void add(int index, String element){
    if(index < 0 || index > size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }
    if(size + 1 >= data.length){
      resize();
    }
    String[] newArr = new String[capacity];
    for(int i = 0;i < index;i++){
      newArr[i] = data[i];
    }
    newArr[index] = element;
    for(int i = index;i < size;i++){
      newArr[i + 1] = data[i];
    }
    size++;
    data = newArr;
  }
  //look at add and resize
  public String remove(int index){
    if(index < 0 || index >= size()){
      throw new IndexOutOfBoundsException("Index " + index + " is out of bounds.");
    }
    String removed = data[index];
    for(int i = index;i < size - 1;i++){
      data[i] = data[i + 1];
    }
    size--;
    return removed;
  }

  public int indexOf(String s){
    for(int i = 0;i < size;i++){
      if(data[i].equals(s)){
        return i;
      }
    }
    return -1;
  }

  public String[] toArray(){
    String[] newArr = new String[size];
    for(int i = 0;i < size;i++){
      newArr[i] = data[i];
    }
    return newArr;
  }

  public int lastIndexOf(String value){
    for(int i = size - 1;i >= 0;i--){
      if(data[i] == null){
        i--;
      }
      if(data[i].equals(value)){
        return i;
      }
    }
    return -1;
  }

  public boolean equals(SuperArray other) {
    boolean same = false;
    for (int i = 0; i < size; i++) {
      if (data[i].equals(other.data[i])) {
        return true;
      }
    }
    if (size != other.size) {
      return false;
    }
    return true;
  }
}
