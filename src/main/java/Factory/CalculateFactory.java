package Factory;

public class CalculateFactory {

    public Calculate getCalculate(String type)
    {
        Calculate calculate = null;

        if(type.toLowerCase().equals("Add"))
        {
            calculate =  new Add() ;
        }
        else if (type.toLowerCase().equals("subtract"))
        {
            calculate = new Subtract();
        }
        else if( type.toLowerCase().equals("Divide"))
        {
            calculate = new Divide() ;
        }
        else
        {

        }

        return calculate ;

    }
}
