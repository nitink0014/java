package FunctionalProgramming;

import java.util.List;

public class FilterAndConcatenate {

    public static void main(String[] args) {

        List<String> str = List.of("Hello My name is","Nitin kumar","i", "am", "a java developer");
      String res =  str.stream()
                .filter(st->st.length()>10)
                .reduce("",(a,b)->a+" "+b);
        System.out.println(res);
    }
}
