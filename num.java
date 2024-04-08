import java.util.Scanner;

public class Main {
    // Function to check if a number is Armstrong
    static boolean isArmstrong(int num) {
        int originalNum, remainder, result = 0, n = 0;

        originalNum = num;

        // Store the number of digits of num
        while (originalNum != 0) {
            originalNum /= 10;
            ++n;
        }

        originalNum = num;

        // Calculate Armstrong value
        while (originalNum != 0) {
            remainder = originalNum % 10;
            result += Math.pow(remainder, n);
            originalNum /= 10;
        }

        // Check if the number is Armstrong
        return result == num;
    }

    // Function to check if a number is Palindrome
    static boolean isPalindrome(int num) {
        int reversedNum = 0, remainder, originalNum;

        originalNum = num;

        // Reverse the number
        while (num != 0) {
            remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }

        // Check if the number is palindrome
        return originalNum == reversedNum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is not a Palindrome number.");
        }
    }
}
