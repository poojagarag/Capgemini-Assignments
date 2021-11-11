import java.util.ArrayList;
import java.util.List;
import java.util.function.UnaryOperator;

class Que6 {

        public static void main(String[] args){

            List<String> stringList = new ArrayList<>();
            stringList.add("pooja");
            stringList.add("garag");
            stringList.add("kiran");
            stringList.add("asha");


            UnaryOperator<String> uppercase = s -> s.toUpperCase();
            for (String str : stringList) {
                System.out.println(uppercase.apply(str));
            }




        }


    }

