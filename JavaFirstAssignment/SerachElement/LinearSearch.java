package SerachElement;

public class LinearSearch {

        public static void main(String[] args) {

            int i,Seachkey=19;
            int array[]={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

            for (i= 0; i < array.length; i++)
            {
                if (array[i] ==Seachkey)          // To Check wether the searching element present in the array or not
                {
                    System.out.println(Seachkey+" is Found in the array ");
                    break;
                }
            }
            if (i == array.length)
                System.out.println(Seachkey+ " doesn't exist in array.");
        }
    }


