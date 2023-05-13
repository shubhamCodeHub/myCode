class Person_1 {

  /* Classess can contain
   * 1. Data (Instance variables)
   * 2. Methods
   */

  String name;
  int age;

  void speak() {
    System.out.println(
      "My name is " + name + " and i am " + age + " years old"
    );
  }

  void sayHello() {
    System.out.println("Hello There!");
  }
}

public class lecture_18_Methods {

  public static void main(String[] args) {
    Person_1 person1 = new Person_1(); // Object creation, new operator allocates memory, basically new person() creates an object and it is stored in person1 variable of Person(class) type
    person1.name = "Tyson and Dragoon";
    person1.age = 20;
    person1.speak();
    person1.sayHello();

    Person_1 person2 = new Person_1();
    person2.name = "Kai and Dronzer";
    person2.age = 21;
    person2.speak();
    person2.sayHello();
    // System.out.println(person1.name);
  }
}
/* NOTES:
 * Methods represent the behavior of objects.
 * Instance variables represent the state of objects.
 * Class represent the template of objects.
 * Methods are also called sub-routines.
 */
