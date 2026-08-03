class Students {
  int rollno;
  String name;
  int marks;
}

public class P16_Array_of_objects {
  public static void main (String args[]){
    Students s1 = new Students();
    s1.rollno = 1;
    s1.name = "deva";
    s1.marks =89;
    
    Students s2 = new Students();
    s2.rollno = 2;
    s2.name = "ajin";
    s2.marks =89;

    Students s3 = new Students();
    s3.rollno = 3;
    s3.name = "hari";
    s3.marks =89;

    Students student[] = new Students[3];
    student[0] = s1;
    student[1] = s2;
    student[2] = s3;

    for (Students stud : student){
      System.out.println(stud.name + " : " + stud.marks);
    }

  }
}
