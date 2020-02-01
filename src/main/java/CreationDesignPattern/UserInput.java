
package CreationDesignPattern;

public class UserInput {

    static String currentValue = "" ;

    public static class TextInput {

        public void add(char c)
        {
            StringBuffer sb = new StringBuffer();
            sb.append(c);
            currentValue = currentValue.concat(sb.toString());

        }

        public String getValue()
        {
                return  currentValue ;
        }
    }

    public static class NumericInput extends TextInput
    {
        /** overridden **/
        public void add(char c)
        {
            if(c == '1' ||
                    c == '2' ||
                    c == '3' ||
                    c == '4' ||
                    c == '5' ||
                    c == '6' ||
                    c == '7' ||
                    c == '8' ||
                    c == '9' ||
                    c == '0' )
            {
               super.add(c);
            }
        }
    }

    public static void main(String[] args) {
        TextInput input = new NumericInput();
        input.add('1');
        input.add('a');
        input.add('0');
        System.out.println(input.getValue());
    }
}