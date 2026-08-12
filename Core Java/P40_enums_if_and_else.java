enum Status {
  running, loading, success, failure
}

public class P40_enums_if_and_else {
  public static void main(String[] args) {

    Status stat = Status.success ;

    // if (stat == Status.success) {
    //   System.out.println("success");
    // } else if (stat == Status.failure) {
    //   System.out.println("failure");
    // } else if (stat == Status.running) {
    //   System.out.println("running");
    // } else {
    //   System.out.println("loading");
    // }

    switch (stat){
      case loading :
        System.out.println("loading");
        break;
      case running :
        System.out.println("running");
        break;
      case failure :
        System.out.println("failure");
        break;
      default :
        System.out.println("success");
        break;
    }
  }
}
