
abstract class Car {
  abstract public void drive ();

  abstract public void cooler ();

  public void playMusic(){
    System.out.println("playing");
  }
}

abstract class advCar extends Car {
   public void drive(){
    System.out.println("driving");
  }
}

class Benz extends advCar {
  public void cooler(){
    System.out.println("cooling");
  }
}

public class P34_abstract_class {
  public static void main (String args []){
    Benz obj = new Benz();
    obj.drive();
    obj.playMusic();
    obj.cooler();
  }
}
