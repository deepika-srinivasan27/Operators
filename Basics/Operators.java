package Basics;

public class Operators {
    public static void main(String[] args) {

        // 1. Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("a + b = " + (a + b));  // Addition
        System.out.println("a - b = " + (a - b));  // Subtraction
        System.out.println("a * b = " + (a * b));  // Multiplication
        System.out.println("a / b = " + (a / b));  // Division
        System.out.println("a % b = " + (a % b));  // Modulus (remainder)
        System.out.println();

        // 2. Relational Operators
        System.out.println("Relational Operators:");
        System.out.println("a == b : " + (a == b));  // Equal to
        System.out.println("a != b : " + (a != b));  // Not equal to
        System.out.println("a > b  : " + (a > b));   // Greater than
        System.out.println("a < b  : " + (a < b));   // Less than
        System.out.println("a >= b : " + (a >= b));  // Greater than or equal to
        System.out.println("a <= b : " + (a <= b));  // Less than or equal to
        System.out.println();

        // 3. Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("Logical Operators:");
        System.out.println("x && y : " + (x && y));  // Logical AND
        System.out.println("x || y : " + (x || y));  // Logical OR
        System.out.println("!x     : " + (!x));      // Logical NOT
        System.out.println();

        // 4. Assignment Operators
        System.out.println("Assignment Operators:");
        int c = 10;
        System.out.println("c = " + c);
        c += 5;  // c = c + 5
        System.out.println("c += 5 : " + c);
        c -= 3;  // c = c - 3
        System.out.println("c -= 3 : " + c);
        c *= 2;  // c = c * 2
        System.out.println("c *= 2 : " + c);
        c /= 4;  // c = c / 4
        System.out.println("c /= 4 : " + c);
        c %= 3;  // c = c % 3
        System.out.println("c %= 3 : " + c);
    }
}

