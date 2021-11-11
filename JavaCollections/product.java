import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;
import java.util.Set;


    class Product {
        private String name;
        private int price;

        public Product(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getPrice() {
            return price;
        }

        public void setPrice(int price) {
            this.price = price;
        }

        @Override
        public String toString() {
            return "Product{" +
                    "name='" + name + '\'' +
                    ", price=" + price +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return price == product.price &&
                    Objects.equals(name, product.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, price);
        }

        public static void main(String[] args) {

            Scanner s = new Scanner(System.in);
            Set<Product> productHashSet = new HashSet<>(10);
            System.out.println("Enter 10 products enter name first then price :");
            for(int i = 0 ;i < 10 ;i++){
                Product p = new Product(s.next(), s.nextInt());
                productHashSet.add(p);
            }


            for (Product p: productHashSet) {
                System.out.println(p);
            }

        }
    }



