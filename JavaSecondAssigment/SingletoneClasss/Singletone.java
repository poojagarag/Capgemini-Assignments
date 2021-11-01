package SingletoneClasss;

public class Singletone {

                                                           //Instance will be created at load time
        private static Singletone obj = new Singletone();
        public String string;
                                                               //Creating private constructor
        private Singletone()
        {
            string = "Welcome Pooja";
        }
                                                                    //Declaring static method
        public static Singletone getInstance()
        {
            return obj;
        }
        public static void main(String args[])
        {
            Singletone text = Singletone.getInstance();
                                                            //original string
            System.out.println("Original String:");
            System.out.println(text.string);
                                                           //text in upper case
            System.out.println("String in Upper Case:");
            text.string = (text.string).toUpperCase();
            System.out.println(text.string);
        }
    }

