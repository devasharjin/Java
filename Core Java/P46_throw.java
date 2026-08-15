class MyException extends Exception{
  public MyException(String msg){
    super(msg);
  }
}

public class P46_throw {
  public static void main (String[] args) {
      int i =20;
      int j = 0;
      try{
        j= 18/i;
        if (j==0){
          // throw new ArithmeticException("Result should not be zero");
          throw new MyException("Result should not be zero");
        }
      } 
      catch (MyException e){
        System.out.println(e.getMessage());
      }
      catch (ArithmeticException e){
        j= 18/1;
        System.out.println(e.getMessage());
      }   

      System.out.println(j);
  }
}
