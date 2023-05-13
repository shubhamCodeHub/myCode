class Machine {

  String name;
  int code;

  public Machine() {
    this("Arnie", 0); // Calling constructor from within constructor
    System.out.println("First Constructor Running");
    // this.name = "Arnie";
  }

  public Machine(String name) {
    this(name, 1);
    System.out.println("Second Constructor Running");
    // this.name = name;
  }

  public Machine(String name, int code) {
    System.out.println("Third constructor running");
    this.name = name;
    this.code = code;
  }
}

public class lecture_22_Constructors {

  public static void main(String[] args) {
    Machine machine1 = new Machine(); // Object created of machine class
    Machine machine2 = new Machine("Bertie");
    Machine machine3 = new Machine("Chalky", 7);

    System.out.println("--------------------------------------------------");

    System.out.println(
      "Name : " + machine1.name + "           Code : " + machine1.code
    );
    System.out.println(
      "Name : " + machine2.name + "           Code : " + machine2.code
    );
    System.out.println(
      "Name : " + machine3.name + "           Code : " + machine3.code
    );
  }
}
/* NOTES:
 * Constructor is a special method which is run everytime you create an instance/object of your class.
 * Constructor has the same name as the class
 * Constructor donot have a return type
 * Constructor is mainly used for initialization of instance variable
 * Multiple constructors can have same name but they should have different parameter list. So when constructor is called during object creation with its own parameter list, java determines which version of constructor is getting called. This is true for Methods also.
 * We can call one constructor from inside another constructor. For that, we use this(parameter list of needed const.). Note that this(....) should be the first line inside the constructor.
 *
 */
