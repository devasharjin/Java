import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student {
  int age;
  String name;

  public Student(int age, String name) {
    this.age = age;
    this.name = name;
  }

  // without this when we print object stud it will call stud.tostring() but it
  // display object code not the values
  @Override
  public String toString() {
    return "A [age=" + age + ", name=" + name + "]";
  }

}

public class P56_comparetor_2 {
  public static void main(String args[]) {
    List<Student> studs = new ArrayList<>();
    studs.add(new Student(18, "Kholi"));
    studs.add(new Student(17, "abd"));
    studs.add(new Student(33, "hardik"));
    studs.add(new Student(77, "Gill"));

    // Comparator<Student> comps = new Comparator<Student>() {
    //   public int compare(Student i, Student j) {
    //     if (i.age > j.age)
    //       return 1;
    //     else
    //       return -1;
    //   }
    // };


    // Comparator is a functional interface so we can use lambda expressions...

    Comparator <Student> comps = (i ,j)->
      i.age > j.age ? 1 : -1;

    Collections.sort(studs, comps);

    for (Student s : studs)
      System.out.println(s);

  }
}
