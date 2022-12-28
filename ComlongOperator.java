public class ComlongOperator {
    public static void main(String[] args) {
        // Reational operator Or Comparsion Operator => ==, !=, >, <, >=, <=

         int a=10;
         int b=20;
         System.out.println("10==20"+"\t"+(a==b));
         System.out.println("10!=20"+"\t"+(a!=b));
         System.out.println("10>20"+"\t"+(a>b));
         System.out.println("10<20"+"\t"+(a<b));
         System.out.println("10>=20"+"\t"+(a>=b));
         System.out.println("10<=20"+"\t"+(a<=b));
         System.out.println("\n=============================\n");
         
         // logical operator -> &&=and, ||=or ,!=not

         System.out.println("\n=========== && =================\n");
         System.out.println((20>10) && (20>10)); // true  //បើ ពិតទាំងពីរ true
         System.out.println("\n=============================\n");
         System.out.println((20<10) && (20<10)); // false //បើ មិនពិតទាំងពីរ false
         System.out.println("\n=============================\n");
         System.out.println((20>10) && (20>10)); // ture //បើ ពិតនៅខាងដើម true
         System.out.println("\n=============================\n");
         System.out.println((20>10) && (20<10)); // false //បើ ខាងដើមមិនពិរ false


         System.out.println("\n============ || =================\n");
         //||
         System.out.println((20>10) || (20<10)); // true || true -> true //បើ ពិតទាំងពីរ true
         System.out.println("\n=============================\n");
         System.out.println((20>10) || (20<10)); // true || true -> false //បើ ពិតតែមួយក៏ true
         System.out.println("\n=============================\n");
         System.out.println((20<10) || (20<10)); // false || false -> false //បើ មិនពិតទាំងពីរ false
         System.out.println("\n=============================\n");


         System.out.println("\n=============== ! ==============\n");
         System.out.println(!(20==10)); // !false -> true
         System.out.println(!(20>10));  // !true -> false
    }
}
