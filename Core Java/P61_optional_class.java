import java.util.List;
// import java.util.Optional;

public class P61_optional_class {
  public static void main (String args []){
    List <String> names = List.of("Deva","Hari","abi", "Xavier");

    // Optional <String> s = names.stream()
    //               .filter(name -> name.contains("x"))
    //               .findFirst();


    String s = names.stream()
                  .filter(name -> name.contains("x"))
                  .findFirst()
                  .orElse("Not Found");

    // System.out.println(s.orElse("Not Found"));
    System.out.println(s);
  }
}
