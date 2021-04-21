public class SimpleFor {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) {
            System.out.println("i的值是" + i);
            System.out.println("66");
        }

        //一行的时候可以省略大括号
        for (int i = 0; i <= 10; i++)
            System.out.println("i的值是" + i);

        // 判断一百以内能被3整除的数
        int diveded = 1;
        int divisor = 3;

        int num = 0;

        for (int i = 0; i <= 100; i++) {
            if (diveded % divisor == 0) {
                System.out.println(diveded + "可以整除" + divisor + "，商为" + (diveded / divisor));
                num++;
            }
            if (num == 20){
                System.out.println("num=" + num + "，循环退出");

                //break语句，跳出循环
                break;
            }
            diveded ++;
        }

    }
}
