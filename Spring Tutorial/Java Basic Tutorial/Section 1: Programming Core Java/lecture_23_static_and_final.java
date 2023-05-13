class Thing {

  public String name;
  public static String description;
  public static final int LUCKY_NUMBER = 10;
  public static int count = 0;
  public int id;

  public Thing() {
    id = count; // Gives each object a unique ID based on the static variable count
    count++;
  }

  public void showName() {
    System.out.println(
      "Object id " +
      id +
      "\n" +
      "Static variable called : " +
      description +
      "\n" +
      "Instance variable called : " +
      name +
      "\n"
    );
  }

  public static void showInfo() {
    System.out.println("Static variable called : " + description + "\n");
    // ERROR : System.out.println(name); CANNOT USE INSTANCE VARIABLE IN STATIC METHOD
  }
}

public class lecture_23_static_and_final {

  public static void main(String[] args) {
    Thing.description = "I am a static thing";
    Thing.showInfo(); // System.out.println("Static variable called: " + Thing.description);

    System.out.println(
      "Before creating objects, count is : " + Thing.count + "\n"
    );

    Thing thing1 = new Thing();
    Thing thing2 = new Thing();

    System.out.println(
      "After creating objects, count is : " + Thing.count + "\n"
    );

    thing1.name = "Bob";
    thing2.name = "Susan";

    thing1.showName(); // System.out.println("Thing 1 name: " + thing1.name);
    thing2.showName(); // System.out.println("Thing 2 name: " + thing2.name);

    System.out.println(Math.PI); // This is a constant , a final field
    // ERROR : Math.PI = 10; CONSTANTS(FINAL FIELDS) CANNOT BE REASSIGNED
    System.out.println(
      "Use of static variable to create class level constants \nlike LUCKY_NUMBER : " +
      Thing.LUCKY_NUMBER
    );
  }
}
/* NOTES:
 * Instance variables (variables which are not static) -> Every object has their own copy of instance variables -> Hence instance variables are associated with the objects of a class.
 *
 * Static variables are called class variables because they are associated with the class itself and not its objects. They are called by the classname. Ex: Thing.description
 *
 * Static methods are also called by the classname.
 *
 * Static methods in a class can access the static data of that class, but cannot access the instance variables. This is because instance variables are associated with the objects of a class but static variables are associated with the class itself.
 *
 * Static data and methods exists before any objects of the class is created.
 *
 * Instance methods can access static as well as non-static data(because by the time the object is created, the class is definitely created)
 *
 * Use of static -> if any method donot need to access instance variables, its good to make them static.
 *
 * Use of static -> to create class level constant variables. final keyword is used to make constants. constants value cannot be changed later. By convention, constant are written in UPPER CASE.
 *
 * Since there is only one static variable copy at the class level, so every time any constructor / instance methods changes the static variable, it is reflected globally for the static variable.
 *
 * Instance variables are initialized to default values during object creation. (Due to constructor)
 */
