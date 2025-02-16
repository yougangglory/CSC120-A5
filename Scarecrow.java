

/*
 * Scarecrow class (template)
 * Assignment 5: Bringing it All Together
 * @author R. Jordan Crouser + CSC120 (Fall '22))
 * @version 13 October 2022
 */

class Scarecrow {

    /* Parts of the Scarecrow
     * TODO: Uncomment remaining parts as you implement each class
     */
    private Pumpkin head;
    private Shirt body;
    private Pants legs;
    // private Hat hat;
    private Boot leftFoot;
    private Boot rightFoot;
    private Banner sign;
    //private String message;

    /* Constructor
     * TODO: initialize remaining parts
     */
    public Scarecrow(Banner n,Pumpkin h, Shirt b, Pants p, Boot l , Boot r) {
        sign = n;
        head = h;
        body=b;
        legs=p;
        leftFoot=l;
        rightFoot=r;
    }

    /* Displays the Scarecrow 
     * TODO: call the .display() method of each part... 
     *       ...in the right order!
    */
    public void display() {
        sign.display();
        head.display();
        body.display();
        legs.display();
        leftFoot.display();
        rightFoot.display();
    }

    /* Main method (for testing) */
    public static void main(String[] args) {

        // TODO: Don't forget to update the line below if you modify the constructor
        Scarecrow myScarecrow = new Scarecrow(new Banner("HAPPY FALL TO YOU  !"),new Pumpkin(), new Shirt(), new Pants(),new Boot("left"), new Boot("right"));
      /* use the message passed in the command line to produce the banner 
       *I think this is the constructor to run the Scarescrow on the command line and use the message passed in for the banner
       *  Scarecrow myScarecrow = new Scarecrow(new Banner(args[0]),new Pumpkin(), new Shirt(), new Pants(),new Boot("left"), new Boot("right"));
       */ 
        // If a message was passed in on the command line, extract and store it
        // TODO: in Step 4, you'll pass this value along to your Banner constructor
       // if (args.length > 0) {
       //     myScarecrow.message = args[0];
       // }

        myScarecrow.display();
    }

}

