enum Status {
  success , failure, running, loading
}

public class P41_enum_class {
  public static void main(String[] args) {
    // Status s = Status.success;
    // System.out.println(s.ordinal());

    Status s[] = Status.values();
    System.out.println(s[0]);
  }
}
