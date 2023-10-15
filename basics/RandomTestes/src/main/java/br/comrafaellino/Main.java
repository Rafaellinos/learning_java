package br.comrafaellino;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  record Person (String name, int age) {

    @Override
    public String toString() {
      return "Person{" +
          "name='" + name + '\'' +
          ", age=" + age +
          '}';
    }
  };

  public static void main(String[] args) {
    List<Person> people = new ArrayList<>(Arrays.asList(
        new Person("Yasmin", 999),
        new Main.Person("Lucy", 23),
        new Person("Nero", 213),
        new Person("Veloso", 12)
    ));
    
    var comparator = new Comparator<Person>() {
      @Override
      public int compare(Person o1, Person o2) {
        return o1.age - o2.age;
      }
    };

    people.sort(comparator);

    people.sort((p1, p2) -> p1.age - p2.age);

    System.out.println(people);
  }
}