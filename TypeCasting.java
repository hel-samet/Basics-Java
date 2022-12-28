public class TypeCasting {
    public static void main(String[] args) {

        // 1. Widening Casting -> Auto 
        //Example -> byte -> short -> Char -> int -> long -> float -> doube
        byte c=127;
        int a = c;
        double b=a;
        System.out.println(a);
        System.out.println(b);

        //2. Narrowing Casting -> manual 
        //Example -> doube-> float -> long -> int -> char -> short -> byte

          double d=13.12;
          int i=(int)d;
          System.out.println(i);

    }
}
