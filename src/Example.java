public class Example {
    public static void main(String[] args) {
        int baozi = 3;

        boolean baozigangchulu = false;

        if (baozigangchulu) {
            System.out.println("包子刚出炉，买了" + baozi + "个肉包子");
        } else {
            System.out.println("无包子");
        }

        int a = 100;
        int b = 10;

        // 省略大括号
        if (a % b == 0)
            System.out.println(a + "可以整除" + b + "商是" + (a / b));

    }
}
