import java.util.*;

class Shallow {
  private int array[];
  private String arrayS[];
 
  public Shallow() {
    array = new int[2];
    arrayS = new String[] {"", "", "", "", ""};
  }
 
  public Shallow(int array[], String arrayS[]) {
    this.array = new int[array.length];
    for(int i=0; i< array.length; i++) {
      this.array[i] = array[i];
    }
    this.arrayS = new String[arrayS.length];
    for(int i=0; i< arrayS.length; i++) {
      this.arrayS[i] = arrayS[i];
    }
  }
 
  public Shallow(Shallow obj) {
    this.array = obj.array;
    this.arrayS = obj.arrayS;
  }
 
  public void display() {
    for (int i = 0 ; i < array.length; i++) {
      System.out.println(array[i] + " ");
    }
    for (int i = 0 ; i < arrayS.length; i++) {
      System.out.println(arrayS[i] + " ");
    }
  }
  public void change(){
    array[1] = 100;
    arrayS[2] = "xyz";
  }
}

public class Main {
    public static void main(String[] args) {
      Shallow s1 = new Shallow();
     
      int arr1[] = {1, 2, 3};
      String arr2[] = {"a", "b", "c"};
      Shallow s2 = new Shallow (arr1, arr2);
     
      Shallow s3 = new Shallow (s1);
     
      s1.change();
      arr1[2] = 300;
      arr2[1] = "lmnnnnnn";
      s1.display();
      s2.display();
      s3.display();
    }
}