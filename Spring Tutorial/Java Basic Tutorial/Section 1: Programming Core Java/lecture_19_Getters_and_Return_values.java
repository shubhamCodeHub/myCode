class Person_2 {

  String name;
  int age;

  void speak() {
    System.out.println("My name is : " + name);
  }

  /* void calculateYearsToRetirement() {
    int yearsLeft = 65 - age;
    System.out.println("Years left to retirement : " + yearsLeft);
  } */

  int calculateYearsToRetirement() { // Method returning values
    int yearsLeft = 65 - age;
    return yearsLeft;
  }

  // Getter methods - methods returning values of instance variables.
  int getAge() {
    return age;
  }

  String getName() {
    return name;
  }
}

public class lecture_19_Getters_and_Return_values {

  public static void main(String[] args) {
    Person_2 man = new Person_2();
    man.name = "Shubham";
    man.age = 27;

    //man.speak();
    int yearsLeft = man.calculateYearsToRetirement();
    System.out.println("Years left to retirement : " + yearsLeft);

    // Accessing the getter methods
    int age = man.getAge();
    String name = man.getName();
    System.out.println("Name is : " + name);
    System.out.println("Age is : " + age);
  }
}
/* NOTES:
 *
 */
