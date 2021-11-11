import java.util.*;
class Hashset {
        int id;
        String name,department;
        int salary;
        public Hashset(int id, String name, String department, int salary) {
            this.id = id;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }
    }
    class HashSet1 {
        public static void main(String[] args) {
            HashSet<Hashset> set=new HashSet<Hashset>();

            //Details
            Hashset h1=new Hashset(10,"ABC", "doc",1200);
            Hashset h2=new Hashset(10,"DEF","stud",1000);
            Hashset h3=new Hashset(10,"GHI","teaach",850);

            //Adding Details
            set.add(h1);
            set.add(h2);
            set.add(h3);

            //Traversing HashSet
            for(Hashset h:set){
                System.out.println(h.id+" "+h.name+" "+h.department+" "+h.salary);
            }
        }
    }

