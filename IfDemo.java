public class IfDemo {
    public static void main(String[] args) {
        // if stament
        // comparsion -> ==, !=, >,<,>=,
        int a = 10;
        if (a > 5) {
            // body if
            System.out.println("a is greater than 5");

        }
        System.out.println("====================================");
        // if...else
        int b = 17;
        if (b > 18) {
            // body if
            System.out.println("b is greater than 18"); // ប្រសិនបើ​ (17>18) នោះលក្ខណ័វាមិនដើរទេ
        } else {
            // body else
            System.out.println("b is smaller than 18");// ប៉ុន្ដែរ វានឹងមករក Else​ (18>17) នោះលក្ខណ័វាមិនដើរទេ

        }
        System.out.println("====================================");

        // if....else if ...else
        int score = 90;

        if (score <= 50) {
            // body if
            System.out.println("you are greate E"); // ប្រសិនបើ 90<=50 នោះលក្ខណ័វាមិនដើរទេ
        } else if (score <= 60) {
            // body else if
            System.out.println("You are greate D"); // ប្រសិនបើ 90<=60 នោះលក្ខណ័វាមិនដើរទេ
        } else if(score <=90){
             System.out.println("You are greate C"); // ប្រសិនបើ 90<=90 នោះលក្ខណ័ដើរ 
        } else {
            // else
            System.out.println("You've done a good greade");
        }

    }
}
