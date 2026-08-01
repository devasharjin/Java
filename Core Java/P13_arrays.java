public class P13_arrays {
  public static void main(String args[]){
    int a[] = {1,2,3};
    int b[] = new int[10];
    b[1] =1;
    b[2] = 2;

    for (int i=0;i<a.length;i++){
      System.out.println(a[i]);
    }

    for (int i= 0; i< b.length;i++){
      System.out.println(b[i]);
    }
  }
}
