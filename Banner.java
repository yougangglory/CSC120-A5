/*
 * Banner class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */
public class Banner {
    
    /* Message to print on Banner */
    private String message;

    /* Constructor */
    public Banner(String m) {
        this.message = m;
        

        
    }

    /*
     *  Print a decorative banner, resized to fit the message
     */
    public void display() {
       
       
       for (int i=0; i<this.message.length(); i++){
        System.out.print("*"+"~");
        
         }
       System.out.println(" ");
       
       for (int i=0; i<this.message.length(); i++){
        System.out.print("="+"+");
         }
        System.out.println(" ");

        System.out.println("~* "+this.message +"*~");
        
       for (int i=0; i<this.message.length(); i++){
            System.out.print("+"+"+");
        }
        System.out.println(" ");
        for (int i=0; i<this.message.length(); i++){
            System.out.print("*"+"~");
        }
            System.out.println(" ");
    }
                       

    /* main method (for testing) */
    public static void main(String[] args) {
        Banner myBanner = new Banner(" Happy fall everyone ");
        myBanner.display();
    }
}
