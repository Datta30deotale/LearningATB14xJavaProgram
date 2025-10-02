package ex_02_Java_Basics;

public class Lab022_Numerics_Data_Types {
    public static void main(String[] args) {

        byte b = 10;

            //byte is a 1-byte (8-bit) integer.
            //Range: –128 to 127
            //10 is within range, so this is valid.
            //Used for small numbers to save memory.


        short s = 10;

            //short is a 2-byte (16-bit) integer.
            //Range: –32,768 to 32,767
            //Also valid and used for slightly larger numbers than byte.


        int i = 10;

            //int is a 4-byte (32-bit) integer.
            //Most commonly used integer type.
            //Range: –2,147,483,648 to 2,147,483,647

        char c = 'A';

            //char is a 2-byte (16-bit) Unicode character.
            //'A' is a valid character literal.
            //Internally, 'A' is stored as Unicode value 65.


        long phone = 98764464L;

            //long is an 8-byte (64-bit) integer.
            //You must add L or l at the end to tell Java it's a long literal.
            //L is preferred over l to avoid confusion with the digit 1.


        long phone1 = 36569764l;

            //Same as above, but uses lowercase l.
            //Still valid, but not recommended due to readability issues.

        float f = 3.14f;

            //float is a 4-byte (32-bit) decimal type.
            //You must add f or F to indicate it's a float literal.
            //Without f, Java treats 3.14 as a double by default.


        float f2 = 3.14F;

            //Same as above, but uses uppercase F.
            //Both f and F are valid.

        double d = 3.12123423;

            //double is an 8-byte (64-bit) decimal type.
            //Default type for floating-point numbers.
            //No suffix needed unless you want to be explicit (d or D).


    }
}
