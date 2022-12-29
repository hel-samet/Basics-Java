public class for_Loop {
    public static void main(String[] args) {
        /*
         * loop or iteration កឺជា Statement មួយរបស់ Java
         * ដែរត្រូវបានគេប្រើសម្រាប់បង្ហាញឬដំណើរការ (execute)
         * កូដដែរធ្វើដ៏ដែលៗ
         */

        // syntax : for_Loop
        for (int i = 1; i < 10; i++) {
            System.out.println(i);
        }

        // syntax: While Loop

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;

        }

        // syntax : Do..While

        int j = 1;
        do {
            System.out.println(j);
            j++;
        } while (i < 10);

    }
}
