import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Que5 {


        public static void main(String[] args){




            System.out.println("---------Question-5---------");
            List<String> stringList = new ArrayList<>();
            stringList.add("pooja");
            stringList.add("Garag");
            stringList.add("Kiran");
            stringList.add("Asha");


            StringBuilder sb = new StringBuilder();

            Consumer<Character> createString = st->
            {   sb.append(st);
                System.out.println(sb);
            };
            for (String st: stringList) {
                createString.accept(st.charAt(0));
            }



        }


    }

