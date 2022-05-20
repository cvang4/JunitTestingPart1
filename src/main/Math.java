package main;

public class Math {
    public static void main(String[] args) {

        hello();
        adding(11, 3);
        bye();
        subtraction(22, 21);

    }
    public static int adding(int a, int b) {
        return (a + b);
    }
    public static int subtraction(int c, int d) {
        return(c - d);
    }
    public static String hello() {
        return("This is how math looks!");
    }
    public static String bye() {
        return("This is how subtraction looks like!");
    }

}
