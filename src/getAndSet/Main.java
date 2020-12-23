package getAndSet;

public class Main {
    public static void main(String[] args){
        Test test = new Test();
       int a = test.getA();
        test.setB(100);
        int b = test.getB();
        System.out.println(a);
        System.out.println(b);

    }
}
