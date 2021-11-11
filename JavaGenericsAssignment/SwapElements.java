public class SwapElements {
   public static final  <T> void swap(T[] array, int i , int j){
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void main(String[] args) {
        Integer [] a = {10,30,05,01,70,48,13,};
        swap(a,1,2);
        for(Integer e : a){
            System.out.print(e +" ");
        }
        System.out.println();
        String [] b = {"pooja","garag","MCA","Dharwad","jj"};
        swap(b,1,3);
        for (String s: b) {
            System.out.print(s +" ");
        }
    }
}

