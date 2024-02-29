public class Main {

    public static void main(String[] args) {
        // widening
        int x = 10;

        double y = x;
        System.out.println("x = " + x + " y = " + y);

        // narrowing, possible data loss
        double d = 258.72345667788;

        float f = (float) d;
        System.out.println("d = " + d + " f = " + f);

        long l = (long) d;
        System.out.println("d = " + d + " l = " + l);

        int i = (int) d;
        System.out.println("d = " + d + " i = " + i);

        short s = (short) d;
        System.out.println("d = " + d + " s = " + s);

        byte b = (byte) d;
        System.out.println("d = " + d + " b = " + b);

        // compatible, just you need to understand what you will get
        char c = (char) d;
        System.out.println("d = " + d + " c = " + c);

        // wrapper classes
        int a = 5; // a i primitive, stored in the stack
        Integer aWrapper = 5; // aWrapper is object, stored in the heap

        Integer aObj = Integer.valueOf(a);
        Integer aObj2 = a; // auto-boxing, valueOf() will be called implicitly
        int aa = aObj.intValue();
        short ss = aObj.shortValue();
        int aa2 = aObj; // unboxing, intValue() will be called automatically
        short ss2 = (short)(int) aObj; // not practical, use shortValue() method
    }
}