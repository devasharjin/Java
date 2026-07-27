public class P09_loops {

  public static void main(String[] args) {

    // while loop

    int i = 1;

    while (i < 4) {
      System.out.println(i);
      i++;
    }

    // Nested While

    while (i < 4) {
      System.out.println(i);

      int j = 1;

      while (j < 3) {
        System.out.println("sub  " + j);
        j++;
      }

      i++;
    }


    // Do While

    do {
      System.out.println(i);
      i++;
    }while (i>4);


    // for Loop

    for (int a =0; a<4; a++){
      System.out.println(a);
    }

    //nested Forloop

    for (int a =0; a<4 ; a++){
      System.out.println(a);
      for (int b = 0; b< 5;b++){
        System.out.println("sub  " + b);
      }
    }

  }

}
