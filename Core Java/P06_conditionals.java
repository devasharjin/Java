/**
 * P06
 */
public class P06_conditionals {
  public static void main (String args[]){
    int a = 10;
    int b = 20;
    int c = 30;

    // if (a<b) {
    //   System.out.println(a);
    // }


    // if (a>b){
    //   System.out.println(a);
    // }
    // else {
    //   System.out.println(b);
    // }


    if(a>b && a>c)
      System.out.println(a);
    else if (b>c) 
      System.out.println(b);
    else
      System.out.println(c);


  } 
}