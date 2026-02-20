import java.util.*;

class Person {
  String name;
  Boolean seated;
  
  public Person(String name) {
    this.name = name;
    this.seated = false;
  }
  String getName() {
    return name;
  }
  void setSeated(Boolean seated) {
    this.seated = seated;
  }
  Boolean isSeated() {
    return seated;
  }
}

class Car {
  Person driver;
  Person[] passenger;
  
  public Car () {
    passenger = new Person[3];
    //do nothing else, car is empty
  }
  
  public void occupyDriverSeat (Person driver) {
    this.driver = driver; //yes, shallow copy
  }
  public void occupyPassengerSeat(Person pass) {
    int i = 0;
    for (i = 0; i < 3; i++) {
      if (this.passenger[i] == null && !pass.isSeated()) {
        this.passenger[i] = pass;
        pass.setSeated(true);
        break;
      }
    }
    if (i == 4)
      System.out.println("Seats Full");
  }
  public void removeAllPassengers() {
    for (int i = 0; i < 3; i++) {
      passenger[i].setSeated(false);
      System.out.println("Passenger " + (i+1) + ": " + passenger[i].getName() + ", seated: " + passenger[i].isSeated());
      passenger[i] = null;
    }
  }
  public void showPassengerList(){
    for (int i = 0; i < 3; i++) {
      if (this.passenger[i] != null)
        System.out.println("Passenger " + (i+1) + ": " + passenger[i].getName() + ", seated: " + passenger[i].isSeated());
    }
  }
}

public class Main {
    public static void main(String[] args) {
      Person a, b, c, d;
      a = new Person("John");
      b = new Person("Jane");
      c = new Person("Bob");
      d = new Person("Alice");
      
      Car car = new Car();
      car.occupyDriverSeat(a);
      car.occupyPassengerSeat(b);
      car.occupyPassengerSeat(c);
      car.occupyPassengerSeat(d);
      
      car.showPassengerList();
      car.removeAllPassengers();
      car.showPassengerList();
    }
}