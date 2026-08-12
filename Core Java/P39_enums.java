
enum Status{
  loading, success, failure, running
}

public class P39_enums {
  public static void main (String args[]){
    Status s = Status.success;
    System.out.println(s);
    
    Status ss[] = Status.values();

    for (Status stat : ss){
      System.out.println(stat);
    }

  }
}
