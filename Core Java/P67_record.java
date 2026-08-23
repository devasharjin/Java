// class Students {
//   private int id;
//   private String name;

//   public Students(int id, String name) {
//     this.id = id;
//     this.name = name;
//   }

//   @Override
//   public String toString() {
//     return "Students [id=" + id + ", name=" + name + "]";
//   }

//   public int getId() {
//     return id;
//   }

//   public String getName() {
//     return name;
//   }

// }

record Students (int id, String name){
  public String toString(){
    return "id  : " + id + ",  name  : " + name;
  }
}

public class P67_record {
  public static void main(String args[]) {
    Students obj1 = new Students(1, "deva");
    Students obj2 = new Students(1, "deva");
    System.out.println(obj1);
    System.out.println(obj1.equals(obj2));
    System.out.println(obj2.name());
  }
}
