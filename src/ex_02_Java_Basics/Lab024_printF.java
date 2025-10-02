package ex_02_Java_Basics;

//printf() (Print Formatted)

public class Lab024_printF {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;



        //System.out.printf("Age: %d, Name: %s", 25, "Pramod");

            //Output: Age: 25, Name: Pramod
            //Used for formatted output, similar to C language.
            //You can use format specifiers:

            //%d → integer
            //%s → string
            //%f → float/double
            //%c → character

        System.out.printf("value of a=%d",a);       //printf() stands for print formatted.
                                                    //It allows you to format the output using placeholders.
                                                    //%d is a format specifier for integers.
                                                    //a is the variable whose value will replace %d.

        System.out.println();                       //This prints a blank line (just moves the cursor to the next line).
                                                    //It’s used here to separate the output of a and b.

        System.out.printf("value of b=%d",b);       //Same as the first line, but for variable b.
                                                    //Again, %d is used for integer formatting.

        System.out.println();
        int table = 9;
        System.out.printf("%dx1=%d", table, table*1);           //table replaces the first %d, and table*1 replaces the second %d.



    }
}
