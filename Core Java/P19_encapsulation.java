class Human {
  private int age;
  private String name;

  public int getAge() {
    return age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

}

// this refers to the current object

public class P19_encapsulation {
  public static void main(String args[]) {
    Human obj = new Human();
    obj.setAge(19);
    obj.setName("deva");

    System.out.println(obj.getName() + " : " + obj.getAge());

  }
}
