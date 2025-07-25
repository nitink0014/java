package FunctionalProgramming;

import java.util.List;

public class PrintStringArray {

    public static void main(String[] args) {
        List<String> list = List.of("Nitin", "kumar");
       list.stream()
               .forEach(name -> System.out.println(name));
    }
}
