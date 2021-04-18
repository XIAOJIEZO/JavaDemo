public class TypeOfData {
    public static void main(String[] args){
         /*
         整数类型
         1、byte：占用一个bute，值域是-128~127
         2、short：占用两个byte，值域-32768~32767
         3、int：占4个bute
         4、long：占用8个byte
          */
        byte byteVar = 127;
        System.out.println(byteVar);

        short shortVar = -3000;
        System.out.println(shortVar);

        int intVar = 300000;
        System.out.println(intVar);

        long longVar = 999999999999L;
        System.out.println(longVar);

         /*
         浮点（小数）类型
         1、float：占用4个byte，有精度
         2、double：占用8个bute，精度是float的两倍
          */
        float floatVar = 100.1f;
        System.out.println(floatVar);

        double doubleVar = 100.1;
        System.out.println(doubleVar);

        /*
         布尔和字符数据类型
         1、boolean：占用1个byte，值域是true，false
         2、char：占用2个byte，值域是所有字符
          */
        boolean condition = true;
        boolean fcondition = false;
        System.out.println(condition);

        char ch = 'A';
        System.out.println(ch);
    }
}
