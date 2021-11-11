import java.util.ArrayList;
import java.util.List;

class Que2 {

        public static void main(String[] args){



            Order o1 = new Order(90000,"ACCEPTED");
            Order o2 = new Order(900,"COMPLETED");
            Order o3 = new Order(800,"COMPLETED");
            Order o4 = new Order(300000,"ACCEPTED");
            Order o5 = new Order(8000,"COMPLETED");

            List<Order> orderList = new ArrayList<>();
            orderList.add(o1);
            orderList.add(o2);
            orderList.add(o3);
            orderList.add(o4);
            orderList.add(o5);

            orderList.stream()
                    .filter((x) -> x.getOrderPrice()>10000 &&
                            (x.getOrderStatus().equals("ACCEPTED") ||
                                    x.getOrderStatus().equals("COMPLETED"))).forEach(System.out::println);


        }


    }
