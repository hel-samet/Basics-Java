import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        String name;
        String geander;
        int age, hour;
        double wage, total;

        System.out.println("==================================");

        Scanner st = new Scanner(System.in);

        System.out.print("name=");
        name = st.next();

        System.out.print("Gender=");
        geander = st.next();

        System.out.print("age=");
        age = st.nextInt();

        System.out.print("wage=");
        wage = st.nextDouble();

        System.out.print("hour=");
        hour = st.nextInt();

        System.out.println("==========================================");

        total = wage * hour;

        System.out.println("name:" + name + "\n" + "Geader:" + geander + "\n" + "Age:" + age + "\n" + "Wage:" + wage
                + "\n" + "Hour:" + hour + "\n" + "total:" + total);

        System.out.println("==========================================");
    }
}
