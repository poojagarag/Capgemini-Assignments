import java.util.ArrayList;
import java.util.List;

class Que4 {


        public static void main(String[] args){




            List<String> names = new ArrayList<>();
            names.add("Pooja");
            names.add("Garag");
            names.add("pooh");
            names.add("kiran");
            names.add("asha");




            names.removeIf(x -> x.length()%2!= 0);
            System.out.println(names);





        }

    }
