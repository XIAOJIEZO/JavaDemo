public class SimpleSwitch {
    public static void main(String[] args) {
        int n = 3;

        String str = n + "对应的中文数字是：";

        switch (n) {                    //n 匹配值
            case 1:                     //case后面是目标值，case值不能重复
                str += "壹";
                break;
            case 2:
                str += "贰";
                break;
            case 3:
                str += "贰";
                break;
            case 4:
                str += "贰";
                break;
            default:
                System.out.println("对应数字不存在");
        }
        System.out.println(str);
    }
}


/*
switch语句语法点总结：
* 1、switch中用于比较的值，必须是int类型
* 2、switch语句适用于有固定多个目标值匹配，然后执行不同的逻辑的情况
* 3、必须使用break语句显示的结束一个case语句，没有break，匹配到的额case向下会全部执行
* 4、default字句是可选的，只有所有的case都没有匹配上，才会执行default
*/