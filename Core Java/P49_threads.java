
class A extends Thread {
  @Override
  public void run() {
    for (int i = 1; i < 100; i++) {
      System.out.println("Hi");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

class B extends Thread {
  @Override
  public void run() {
    for (int i = 1; i < 100; i++) {
      System.out.println("Hello");
      try {
        Thread.sleep(10);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}

public class P49_threads {
  public static void main(String[] args) {
    A obj1 = new A();
    B obj2 = new B();

    // obj1.setPriority(1); // value 1 to 10
    // obj2.setPriority(Thread.MAX_PRIORITY);

    obj1.start();
    try {
      Thread.sleep(10);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    obj2.start();
  }
}
