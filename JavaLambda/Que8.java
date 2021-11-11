import java.util.ArrayList;
import java.util.List;

class Que8 {


        public static void main(String[] args){





            List<Integer> numbers = new ArrayList<>();
            numbers.add(11);
            numbers.add(12);
            numbers.add(13);
            numbers.add(14);

            Thread t = new Thread(() -> numbers.forEach(System.out::println));
            t.start();



        }



    }


