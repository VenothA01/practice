package misc;

public class TestContact {


    public static void main(String args[])
    {
        Contact friend      = new Friend();
        friend.name = "Alex";
        ((Friend) friend).phoneNumber = "555" ;

        Contact work        = new Work();
        work.name           = "sara";
        ((Work) work).email = "sara@example.com" ;


        System.out.println(friend);
        System.out.println(work);


    }



}
