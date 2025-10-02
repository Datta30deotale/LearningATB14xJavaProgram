package ex_02_Java_Basics;

public class Lab014_Variables {
    public static void main(String[] args) {

        /*

        public: Accessible from anywhere.
        static: Can be run without creating an object of the class.
        void: Does not return any value.
        main: The method name recognized by the JVM as the starting point.
        String[] args: An array of command-line arguments passed to the program.
         */
    }

    public static void main(String args) {

        /*
        This is another method named main, but it has a different parameter:
        Instead of String[] args, it takes a single String named args.
        This is method overloading — Java allows multiple methods with the same name but different parameter lists.
        ❗ However, this method will not be executed when you run the program because the JVM only looks for the main(String[] args) method as the entry point.
         */
    }
}
