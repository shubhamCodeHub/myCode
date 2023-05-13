class Frog {

  String name;
  int age;

  private int rollNo;

  /* GETTER METHODS */
  public String getName() {
    return name;
  }

  public int getAge() {
    return age;
  }

  /* SETTER METHODS */

  // public void setName(String newName) {
  //   name = newName;
  // }

  public void setName(String name) {
    this.name = name; // this refers to the object which is calling the variable, so this.name is actually the reference variable name and name is the parameter variable to the function name. this keyword needs to be used here since reference variable and parameter variable have the same names and due to this ambiguity , java gives priority to the parameter variable inside the method because it is his scope.
  }

  // public void setAge(int newAge) {
  //   age = newAge;
  // }

  public void setAge(int age) {
    this.age = age;
  }

  // public void setRollNo(int newRollno) {
  //   rollNo = newRollno;
  // }

  public void setRollNo(int rollNo) {
    this.rollNo = rollNo;
  }
}

public class lecture_21_Setters_and_this {

  public static void main(String[] args) {
    Frog frog1 = new Frog();
    frog1.name = "Bertie";
    frog1.age = 1;
    // frog1.rollNo = 10;  This is an error since private variables cannot be directly accessed in another class

    frog1.setName("Cutie");
    frog1.setAge(2);
    frog1.setRollNo(10); // This is ok since we are not directly accessing the private variable, we are using setter methods to indirectly access private reference variable.

    System.out.println(frog1.getName() + " is of age " + frog1.getAge());
  }
}
/* NOTES
 * Getters helps in getting values of reference variables of a class without directly accessing them.
 * Setter helps in setting values to the reference variables without directly accessing them.
 * Getter and Setter helps in accessing private variables outside the class indirectly.
 * this keyword refers to the object with which the method or the instance variable is called. this refers to the current class object.
 */
