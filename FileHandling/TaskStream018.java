package FileHandling;
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TaskStream018 {
    public static void main(String[] args) {

        Stream<Integer> nums = Stream.iterate(1, n -> n+1).limit(20);

                nums.limit(10)
                .forEach(System.out::println);





    }
}