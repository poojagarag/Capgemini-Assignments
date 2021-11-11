import java.util.HashMap;
import java.util.Map;

class Que7 {

        public static void main(String[] args){



            Map<Integer,String> map = new HashMap<>();
            map.put(1," pooja ");
            map.put(2," garag");
            map.put(3," kiran");
            map.put(4," ahsa ");


            StringBuilder stringBuilder = new StringBuilder();

            for(Map.Entry<Integer,String> e : map.entrySet()){
                stringBuilder.append(e.getKey().toString()).append(e.getValue());
            }
            System.out.println(stringBuilder);




        }

    }
