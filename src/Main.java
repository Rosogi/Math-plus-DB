public class Main {
    public static void main(String args[]) {
        //Нужен обработчик ошибок
        long a = 0;
        try {
            while (a < 10000000) {
                a = a + 1;
                System.out.println(a);
            }
        }
        catch (Exception e) {
            System.out.print(e);
        }

    }
}
