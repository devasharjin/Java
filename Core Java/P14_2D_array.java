public class P14_2D_array {
  public static void main (String args[]){
    int a[][] = {{1,2,3},{1,2,3}};
    int b[][] = new int[2][3];

    b[0][0]=1;
    b[0][1]=2;
    b[0][2]=3;
    b[1][0]=4;
    b[1][1]=5;
    b[1][2]=6;

    for (int[] i : a){
      for (int j : i){
        System.out.println(j);
      }
    }

    for (int i = 0; i<2;i++){
      for (int j=0; j<3 ; j++){
        System.out.println(b[i][j]);
      }
    }

  }
}
