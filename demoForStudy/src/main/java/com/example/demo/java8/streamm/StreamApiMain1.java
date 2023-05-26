package com.example.demo.java8.streamm;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamApiMain1 {
    public static void main(String[] args)
    {
        List<Integer> integerList= Arrays.asList(1,56,7,60,99,75);
        Stream<Integer> integerStream = integerList.stream();
        List<Integer> newList= integerStream.filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(newList);

        List<Integer> newList1=integerList.stream().filter(a->a%2==0).collect(Collectors.toList());
        System.out.println(newList1);

        //integerList.stream().filter(a->a%2==0).forEach(a->);
        String[] name={"Ram","Uttam","Durgesh","Deepak","Anuj"};
        System.out.println("mappeed values");
        Arrays.stream(name).map(s-> s+" Mr").forEach(System.out::println);
        List<String> nameList = Arrays.asList(name);
        System.out.println("original values");
        nameList.stream().sorted().forEach(System.out::println);

       Integer e= integerList.stream().min((x,y)->x.compareTo(y)).get();
       System.out.println(e);

       List<String> vehicleList =Arrays.asList("Car","Bus","Van","Bus","Jeep","Van");
       vehicleList.stream().distinct().forEach(System.out::println);//will only print unique values

        long count = vehicleList.stream().distinct().count();
        System.out.println (count);

        vehicleList.stream().limit(4).forEach(System.out::println);//print only 4 object

        List<String> fruits = Arrays.asList("Apple","Mango","Litchi","Papaya","Grapes","xyz");
        Optional<String>examFruit =fruits.stream().reduce((value, combinedValue)-> value+combinedValue);
        System.out.println ("reduced operation: "+examFruit.get());

        //Sorted List
        List<Integer> unsortedList = Arrays.asList(9,2,13,1,4,32,36,24,18);
        //-----  Ascending order  ----------
        unsortedList.stream().sorted().collect(Collectors.toList()).stream().forEach(System.out::println);
        //-----  Descending order  ----------
        unsortedList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).stream().forEach(System.out::println);


        System.out.println(fruits.stream().anyMatch(value->value.startsWith("A")));
        System.out.println(fruits.stream().allMatch(value->value.startsWith("A")));
        System.out.println(fruits.stream().noneMatch(value->value.startsWith("z")));
        CharSequence[] vowels={"a", "e", "i", "o", "u"};

        fruits.stream().map(e1-> e1 + " = " + e1.length()).forEach(System.out::println);

        System.out.println("Vowels are poresent in the values of list are: ");
        fruits.stream().filter(a-> a.toLowerCase().matches(".*[aeiou].*")).forEach(System.out::println);

        List<String> whiteSpacedString= Arrays.asList(new String[]{"App  le", "   Boy", "C  a t"});
        whiteSpacedString.stream().map(e1->e1.replaceAll("\\s+","")).forEach(System.out::println);
    }
}
