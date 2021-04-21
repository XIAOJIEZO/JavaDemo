public class SimpleWhile {
    public static void main(String[] args) {
        //找出10个可以整除
        int num = 0;

        int dividend = 100;
        int divisor = 89;

        while (num < 10) {
            if (dividend % divisor == 0) {
                System.out.println(dividend+"可以整除"+divisor+"，商是"+(dividend/divisor));
                num++;
            }
            dividend++;
        }


        do {
            System.out.println("至少会执行一次，当条件为false执行一次，为true死循环，此循环很少使用");
        } while (true);

    }
}
