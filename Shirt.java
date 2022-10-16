/*
 * Shirt class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Shirt {

    /*
     * TODO: Modify this method to print ASCII Art Shirt
     */
    public void display() {
        System.out.println("             | |   ");
        System.out.println("       _____-' '-_____");
        System.out.println("      /     \\\\|/      \\  ");
        System.out.println("     /  /|$  ^|^    |  \\      ");
        System.out.println("    /  / |*   |o    |\\  \\    ");
        System.out.println("   /**/  | *  |o    | \\**\\  ");
        System.out.println("  /__/   |$ * |o    |  \\__\\ ");
        System.out.println("         |___*|_____| ");  
        System.out.println("         |____o_____|");  
    }
    

    /* main method (for testing) */
    public static void main(String[] args) {
        Shirt myShirt = new Shirt();
        myShirt.display();
    }
}
