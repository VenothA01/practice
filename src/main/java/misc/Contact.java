package misc;

public class Contact {

    public String name ;

    public String toString()
    {
        String temp = "";
        if(this instanceof Friend)
        {
              temp = "Friend Name "+name+" phoneNumeber "+((Friend)this).phoneNumber ;
        }

        if(this instanceof  Work)
        {
            temp = "Friend Name "+name+" Email "+((Work)this).email ;
        }

        return  temp ;
    }
}
