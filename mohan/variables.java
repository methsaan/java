//package variables;

public class variables {
    public static void main(String[] args) {
        System.out.println("We are going to sample all the available variables"); 
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - ");

        System.out.println("byte: 1 byte, integers: -128 and +128");
        byte aByte = -55;
        System.out.println(aByte);

        System.out.println("short: 2 bytes, integers:-32768 to 32767");
        short aShort = -31000;
        System.out.println(aShort);

        System.out.println("int: 4 bytes, integers: -21474883648 to 2147483647");
        int anInt = 19999999;
        System.out.println(anInt);

        System.out.println("long: 8 bytes, integers: 2^63 and 2^63-1, add L to end");
        long aLong = 77166261717234818L;
        System.out.println(aLong);

        System.out.println("float: 4 byte, -3.402823347x10^38 to 3.40282347x10^38");
        float aFloat = -3.818277188271;
        System.out.println(aFloat);

        System.out.println("double: 8 byte, decimal: -1.7976xxxx x 10^308; 1.79xxxx x 10^308");
        double dDouble = -0.000018281938193747;
        System.out.println(dDouble);
    }
}
