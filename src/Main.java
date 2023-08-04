//JAVA Week 1 Code talk
//        Please analyze the pieces of code given and give an explanation to the class.
//
//        Problem 1. Factorial calculation:

public class Factorial {
    public static int factorial(int n) { //accepting the integar n as input
        int result = 1; //integer titled result that is set as a placeholder
        for (int i = 1; i <= n; i++) { //loop that iterated the accepted n amount of times.
            result *= i; //result = result * i
        }
        return result;
    }

    public static void main(String[] args) {
        int number = 5; // integer variable set to 5
        int result = factorial(number);  //  computes the factorial of any given positive integer
        System.out.println("Factorial of " + number + " is: " + result);
    }
}

//Problem 2. Prime Number Check

public class PrimeNumber { //a public class that can be accessed easily
    public static boolean isPrime(int number) { //one method taking in number as an input
        if (number <= 1) { //checking if the number is less than or equal to one and if it is false will be returned
            return false; //boolean is returned and nested within an if statement
        }
        for (int i = 2; i < number; i++) { //for loop including the proper steps
            if (number % i == 0) {  //nested a for loop to check additional conditions
                return false;
            }
        }
        return true; // if the number is above 1 then return true and execute the rest of the code.
    }

    public static void main(String[] args) { // second main method
        int number = 17; //setting the number variable to 17
        if (isPrime(number)) { //if the previously set boolean is true then print that it is a prime number
            System.out.println(number + " is a prime number.");
        } else { //if the previously set isPrime boolean is false it will print that it is not a prime number.
            System.out.println(number + " is not a prime number.");
        }
    }
}

//Problem 3: Array sorting

        import java.util.Arrays; //importing a external library

public class ArraySorting {
    public static void main(String[] args) { //code will not work properly without a main.
        int[] numbers = {5, 2, 8, 1, 9};  //setting up an array of numbers
        Arrays.sort(numbers); //a method used to sort through the array in ascending order.
        System.out.print("Sorted Array: "); //printing the array after it is sorted
        for (int number : numbers) { //a for each loop to go through each array element
            System.out.print(number + " "); // Prints the numbers in the array with spaces.
        }
    }
}
