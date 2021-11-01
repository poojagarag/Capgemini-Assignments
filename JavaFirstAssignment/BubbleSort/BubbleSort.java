package BubbleSort;

public class BubbleSort {


        static void bubbleSort(int[] array) {
            int n=array.length;
            int temp=0;
            for(int i=0;i<n;i++){
                for(int j=1;j<(n-i);j++){
                    if(array[j-1]>array[j]){     //swap elements

                        temp = array[j-1];
                        array[j-1] = array[j];
                        array[j] = temp;
                    }

                }
            }

        }

        public static void main(String[] args) {
            int array[] ={5,12,14,6,78,19,1,23,26,35,37,7,52,86,47};

            System.out.println("Array Before Bubble Sort");
            for(int i=0; i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            System.out.println();

            bubbleSort(array);          //sorting array elements

            System.out.println("Array After Bubble Sort");
            for(int i=0; i<array.length;i++){
                System.out.print(array[i] + " ");
            }
        }
    }


