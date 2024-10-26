public class petle {
    public static void main (String[] args) {

        for (int j = 0; j < 10; j++) {
            for (int i = 0; i < 10; i++) {
                if (i < 9) {
                    System.out.print(i + ", ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
    }

}
