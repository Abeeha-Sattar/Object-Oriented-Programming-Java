import java.util.*;

class Vehicle {
  private String licensePlateNum;
  protected int chassisNumber;
  
  public Vehicle(String VNum, int cNum) {
    System.out.println("Inside Super(Parent Constructor)");
    licensePlateNum = VNum;
    chassisNumber = cNum;
  }
  
  public String getLicensePlate(){
    return licensePlateNum;
  }
  
}

class Car extends Vehicle {
  public Car(String vNum, int cNum) {
    System.out.println("Before Super");
    super(vNum, cNum);
    System.out.println("After Super");
  }
  
  public void showDetails() {
    System.out.println("LP Num: " + getLicensePlate());
    System.out.println("chassis Number: " + chassisNumber);
    
  }
  
}

public class Main {
    public static void main(String[] args) {
     Car c1 = new Car("ACB-132", 4321);
     Car c2 = new Car("XYZ-098", 9876);
     Vehicle v = new Vehicle("V", 1);
     c1.showDetails();
     c2.showDetails();
    }
}