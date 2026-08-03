public class P15_jagged_array {
  public static void main (String args[]){
    int a[][] = new int[2][];
    a[0] = new int[2];
    a[1] = new int [4];

    for (int i =0; i<a.length; i++) {
      for (int j =0; j<a[i].length;j++) {
        a[i][j] = (int)(Math.random()*10);
      }
    }

    for (int i[] : a){
      for (int j : i){
        System.out.print(j + " ");
      }
      System.out.println();
    }
  }
}
