public class CompareOprt {
    public static void main(String[] args){
        /*比较运算符，返回值是true或者false*/
        int a = 10;
        int b = 15;
        int c = 10;

        System.out.println(a > b);
        System.out.println(a >= b);
        System.out.println(a < b);
        System.out.println(a <= b);
        System.out.println(a != b);

        System.out.println(a != c);
        System.out.println(a == b);
        System.out.println(a == c);

        /*布尔运算符*/

        boolean d = true;
        boolean e = false;

        System.out.println(a & b);      /*10*/
        System.out.println(d & e);      /*且（and） 运算符*/
        System.out.println(d && e);
        System.out.println(d | e);
        System.out.println(d || e);     /*或（or） 运算符*/
        System.out.println(!d);         /*非（not） 运算符*/
    }
}


