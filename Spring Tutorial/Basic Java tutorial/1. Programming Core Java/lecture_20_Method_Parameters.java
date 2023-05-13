class Robot {

  public void speak(String text) { // text is called the parameter to the method. It is actually a way to give input to a method
    System.out.println(text);
  }

  public void jump(int height) {
    System.out.println("Jumping : " + height + " Metres");
  }

  public void move(String direction, double distance) {
    System.out.println(
      "Moving " + distance + " metres in direction " + direction
    );
  }
}

public class lecture_20_Method_Parameters {

  public static void main(String[] args) {
    Robot sam = new Robot();
    sam.speak("Hi! I am Sam the robot"); // This is passing the parameter to the method
    sam.jump(10);
    sam.move("North", 28.6);

    String greeting = "Bye Bye !";
    sam.speak(greeting); // You can also pass variables as parameter to a method
  }
}
