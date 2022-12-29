class Ternaryoperator {
    public static void main(String[] args) {
        int num = -18;
        if (num >= 0) {
            System.out.println("This is Positive number");
        } else {
            System.out.println("This is Negative number");
        }
        // ពីនឹងប្រើមួយណាក៏បានដែរ
        // Ternary
        // Condition ? Expression True : Expression False;

        String str = (num >= 0) ? "This is Positive number" : "This is Negative number";
        System.out.println("string:" + str);

    }
}