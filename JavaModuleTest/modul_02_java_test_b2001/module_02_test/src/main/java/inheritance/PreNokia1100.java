package inheritance;

public abstract class PreNokia1100 implements SymbianPhone{


    public void sendText(){
        System.out.println("This will let me send text");
    }

    public void makeCall(){
        System.out.println("this lets me make a call");
    }

    public void contactList(){
        System.out.println("This lets me access contact list");
    }



    /**
     *
     * Implement interface SymbianPhone
     * Make necessary changes to make this class abstract
     *
     * Think Nokia company is planning to add a colorful display in future
     * but they cant implement that feature now. This implementation can be done by display()
     * Declare and assign value to a String instance variable called nameOfTheClass
     *
     *
     * */


}
