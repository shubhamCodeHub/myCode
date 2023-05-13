class Person {

  /* Classess can contain
   * 1. Data (Instance variables)
   * 2. Methods
   */

  String name;
  int age;
}

public class lecture_17_class_and_objects {

  public static void main(String[] args) {
    Person person1 = new Person(); // Object creation, new operator allocates memory, basically new person() creates an object and it is stored in person1 variable of Person(class) type
    person1.name = "Tyson and Dragoon";
    person1.age = 20;

    Person person2 = new Person();
    person2.name = "Kai and Dronzer";
    person2.age = 21;

    System.out.println(person1.name);
  }
}
/* NOTES:
 *
 * Only one public class in once file. Many non - public class possible but only 1 public class
 * A class is a template/blue-print for creating objects.
 * Class can contain data, which represents the state of your objects.
 * A class is a type of which you can get objects.
 */
