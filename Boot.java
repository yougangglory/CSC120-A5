/*
 * Boot class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Boot {
  
    private String direction;
  

/* Constructor */
public Boot(String direction) {
  this.direction = direction.toLowerCase();
  
}

public Boot() {
}

/*
* TODO: Modify this method to print ASCII Art Boot
*/
public void display() {
  if (this.direction.equals("left")) {
    System.out.print("        |_____|");
  } else if (this.direction.equals("right")) {
    System.out.print("|_____|");
  } else {
    System.out.print("which boot?");
  }
}

/* main method (for testing) */
public static void main(String[] args) {
  Boot myLeftBoot = new Boot("left");
  Boot myRightBoot = new Boot("right");
  myLeftBoot.display();
  myRightBoot.display();
}
}
