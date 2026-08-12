interface Computer{
  void code();
}

class Desktop implements Computer{
  public void code(){
    System.out.println("code,run, debug,faster...");
  }
}

class Laptop implements Computer{
  public void code (){
    System.out.println("code, run, debug");
  }
}

class Developer {
  void devApps(Computer comp){
    comp.code();
  }
}

public class P38_need_of_interface {
  public static void main (String args[]){
    Developer obj = new Developer();
    obj.devApps(new Laptop());
  }
}
