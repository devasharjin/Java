class Human {
  private int age;
  private String name;

  Human() {
    age = 12;
    name = "deva";
  }

  Human(int age ,String name){
    this.age = age;
    this.name = name;
  }

  public int getAge() {
    return age;
  }

  public String getName() {
    return name;
  }

}

public class P20_constructor {
  public static void main(String args[]) {
    Human obj = new Human(13,"sha");

    System.out.println(obj.getName() + " : " + obj.getAge());

  }
}
