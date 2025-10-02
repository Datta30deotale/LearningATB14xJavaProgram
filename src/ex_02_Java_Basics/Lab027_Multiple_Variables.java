package ex_02_Java_Basics;

public class Lab027_Multiple_Variables {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 90;
        int _ = 10, $ = 40;
//        System.out.println(a,b,c); // invalid

        System.out.println("a = " + a + ", b = " + b + ", c = " + c); // this is valid

        System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);     // this is valid
    }
}
