package ex_02_Java_Basics;

public class Lab020_Interview_QnA2 {
    public static void main(String[] args) {
//        int enum = 10;
//        System.out.println(enum);  // This code is commented out, so it won't run.
                                    //But if it were active, it would cause a compilation error because:
                                    //enum is a reserved keyword in Java (used to define enumerations).
                                    //You cannot use keywords as variable names.

        int Enum = 10;              //This is valid.
                                    //Java is case-sensitive, so Enum is not the same as enum.
                                    //Enum is treated as a normal variable name here.

//        int datta deotale = 80;   //❌ This will cause a syntax error.
                                    //Variable names cannot contain spaces.
                                    //You must use an underscore _ or camelCase instead.


        int datta_deotale = 90;     // ✅ This is valid.
                                    //Underscores are allowed in variable names.

        int Lab020_Interview_QnA2 = 123;

                                    //✅ This is valid.
                                    //You can name variables using letters, digits, and underscores.
                                    //Variable names can match class names, but it's not recommended for clarity.


    }
}
