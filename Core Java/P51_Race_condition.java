class Counter {
  public int count = 0;

  public synchronized void increment() {  //synchronized --> one by one
    count++;
  }
}

public class P51_Race_condition {
  public static void main(String[] args) throws InterruptedException {
    Counter counter = new Counter();

    Runnable obj1 = () -> {
      for (int i = 1; i < 2000; i++)
        counter.increment();
    };

    Runnable obj2 = () -> {
      for (int i = 1; i < 2000; i++)
        counter.increment();
    };

    Thread t1 = new Thread(obj1);
    Thread t2 = new Thread(obj2);

    t1.start();
    t2.start();

    t1.join();  // it waits until t1 completes
    t2.join();  // it waits until t2 completes

    System.out.println(counter.count);

  }
}
