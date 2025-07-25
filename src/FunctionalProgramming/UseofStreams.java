package FunctionalProgramming;

import java.util.List;
import java.util.stream.Collectors;

public class UseofStreams {


    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,4,64,53,23,53);

        List<Integer> newNumbers  = numbers.stream()
                .sorted()
                .distinct()
                .toList();
        System.out.println(newNumbers);
    }
}

