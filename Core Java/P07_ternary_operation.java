public class P07_ternary_operation {
  public static void main(String args []){
    int a = 10;
    int b = 20;
    int c = 30;

    int result = ( a>b && a>c) ? a : ( b>c ) ? b : c;
    System.out.println(result); 

  }
}
