public class SuperArray{
  private String[] data;
  private int size;

  public SuperArray(){
    String[] data = new String[10];
    size = 0;
  }
  public int size(){
    return size;
  }

  public boolean add(String element){
    for(int i = 0;i < size;i++){
      if(data[i] == null){
        data[i] = element;
        size++;
        return true;
      }
    }
    return false;
  }
}
