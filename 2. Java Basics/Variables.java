public class Variables {
    public static void main(String[] args) {
        // Variables are used to store values in a program.
        // Each variable has a type associated with it, defined at the time of declaration.

        // variable name: A label that refers to a memory location
        // value: The actual data stored in the variable
        // storage: The memory (e.g., RAM) where the variable's value is kept
        // declaration: Defining a variable with its type before using it
        // naming convention: A set of rules for naming variables (e.g., camelCase)
        // assignment: The act of giving a value to a variable

        int value = 10;

        // Java is a strongly typed language,
        // so every variable must be declared before it is used.

        // marks = 10; // ❌ Invalid - marks is not declared yet
        int marks;
        marks = 20;     // ✅ Valid - marks is declared first, then assigned a value

        int num = 2;
        int num2 = 4;
        int num3 = 3;

        System.out.println(num + num2 + num3); // Outputs: 9

        // int 3num; // ❌ Not allowed - variable names cannot start with a digit
    }
}
