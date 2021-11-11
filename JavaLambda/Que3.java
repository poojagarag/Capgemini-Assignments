import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Collectors;

class Que3 {

        public static void main(String[] args){




            Consumer<Integer> func = x-> System.out.println(x+1);
            func.accept(6);

            Consumer<String> func1 = System.out::println;
            func1.accept(" Consumer Interface");


            getText(()->"jjjj");


            Predicate<Integer> func3 = x -> x > 5;
            List<Integer> l = Arrays.asList(3,9,2,1,5,7,4,8,3,10);

            List<Integer> collect = l.stream().filter(func3).collect(Collectors.toList());
            System.out.println(collect);

            List<Integer> clist = l.stream().filter(x -> x >5 && x<8).collect(Collectors.toList());
            System.out.println(clist);



        }


        public static void getText(Supplier<String> text){
            System.out.println(text.get());
        }



    }
