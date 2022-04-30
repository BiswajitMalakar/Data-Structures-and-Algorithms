class Demo {
    public static <T, U> void print (T a, T b) {
        System.out.println(a);
        System.out.println(b);
    }
}

class Main {
    public static void main (String[] args) {
        Integer a = 100;
        String b = "Biswajit";
        Demo.print (a, b);
    }
}