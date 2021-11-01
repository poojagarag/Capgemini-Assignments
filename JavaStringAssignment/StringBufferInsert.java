public class StringBufferInsert {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("it is used to  at the specified index position");
        sb.insert(14,"insert text");
        System.out.println(sb);
    }
}

