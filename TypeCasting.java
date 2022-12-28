public class TypeCasting {
    public static void main(String[] args) {

        // 1. Widening Casting -> Auto
        // Example -> byte -> short -> Char -> int -> long -> float -> doube
        byte c = 127;
        int a = c;
        double b = a;
        System.out.println(a);
        System.out.println(b);
      System.out.println("===========================");
        // 2. Narrowing Casting -> manual
        // Example -> doube-> float -> long -> int -> char -> short -> byte

        double d = 13.12;
        int i = (int) d;
        double l = (double) d;
        System.out.println(i);
        System.out.println(l);

        // string -> int -> double -> long -> byte
        System.out.println("===========================");
        String s = "3.14";
        double j = Double.valueOf(s);
        double sumDoube = j + 3.1;
        System.out.println("String -> Doube" + "\t" + j);
        System.out.println("Sum Double" + "\t" + sumDoube);
        System.out.println("===========================");
        // String -> Byte
        String m = "127";
        byte sbyte = Byte.valueOf(m);
        System.out.println("String -> Byte" + "\t" + sbyte);
        System.out.println("===========================");
        // String -> int
        String cd = "127";
        int sbytes = Integer.valueOf(cd);
        System.out.println("String -> Byte" + "\t" + sbytes);
        System.out.println("===========================");
        // String -> long
        String ab = "127";
        long slong = Byte.valueOf(ab);
        System.out.println("String -> Byte" + "\t" + slong);

        System.out.println("===========================");
       // int , long . short , double, ,...-> string

       long num =120;
       String stnum= String.valueOf(num);
       System.out.println(" long -> string"+"\t"+1+1234);
       System.out.println("===========================");


    }
}
