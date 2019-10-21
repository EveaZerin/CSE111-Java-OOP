public class Worker02{
  public int[] copy(int[] array){
    int[] newArray = new int[array.length];
    for(int i = 0; i < array.length; i++){
      newArray[i] = array[i];
    }
    return newArray;
  }
  
  public int[] join(int[] array01, int[] array02){
    int[] newArray = new int[array01.length + array02.length];
    int i = 0;
    for(; i < array01.length; i++){
      newArray[i] = array01[i];
    }
    for (int j = 0; j < array02.length; j++){
      newArray[i++] = array02[j];
    }
    return newArray;
  }
  
  public int[] copyRef(int[] array){
    return array;
  }
  
  public int add(int a, int b){
    return a + b;
  }
}