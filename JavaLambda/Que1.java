class AirthmeticOperations {

    public static void main(String args[]){
        Myadd Add=( a,b)->a+b;
        System.out.println(Add.myadd(2,4));

        Mysubstract sub=(a,b)->a-b;
        System.out.println(sub.mysubstract(8,7));

        MyMultiple mul=(a,b)->a*b;
        System.out.println(mul.mymultiple(7,7));

        MyDivide divide=(a, b)->a/b;
        System.out.println(divide.mydivide(2,8));

    }
}

@FunctionalInterface
interface Myadd{
    int myadd(int a, int b);

}

@FunctionalInterface
interface Mysubstract{
    int mysubstract(int a,int b);
}

@FunctionalInterface
interface MyMultiple{
    int mymultiple(int a,int b);
}


@FunctionalInterface
interface MyDivide{
    int mydivide(int a,int b);
}