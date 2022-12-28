public class NestedIf {
    public static void main(String[] args) {
        // First if
        int num = 18;
        if (num >= 0) {
            // body First if
            System.out.println("The number id postive!!");// ប្រសិនបើ 18>=0 នោះវានឹងចូលលក្ខណ័ទី១
            if (num % 2 == 0) {
                // even = លេខគួរ​​​ num/2 =? -> ? (%) -> num %2==0

                System.out.println("This is even number:");
            } else {
                // odd = លេខសេស
                System.out.println("This is odd number:");
            }

        } else {
            // body else
            System.out.println("The number is Negative!!");// ប្រសិនបើ -18>=0 នោះវានឹងចូលលក្ខណ័ទី2
        }

    }
}
