// class A implements Runnable {
//   public void run() {
//     for (int i = 1; i < 10; i++)
//       System.out.println("Hi");
//   }
// }

// class B implements Runnable {
//   public void run() {
//     for (int i = 1; i < 10; i++)
//       System.out.println("Hello");
//   }
// }

// 2 types can be used to create thread
// extend Thread
// implements Runnable --> we can also extend another classes

// public class P50_runnable {
// public static void main(String[] args) {
// A obj1 = new A();
// B obj2 = new B();

// Thread t1 = new Thread(obj1);
// Thread t2 = new Thread(obj2);
// t1.start();
// t2.start();
// }
// }

// Lambda expression --> Runnable is a functional interface

public class P50_runnable {

  public static void main(String[] args) {
    Runnable obj1 = () -> {
      for (int i = 1; i < 10; i++)
        System.out.println("Hi");
    };
    Runnable obj2 = ()->{
      for (int i = 1; i < 10; i++)
      System.out.println("Hello");
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();
  }
}
