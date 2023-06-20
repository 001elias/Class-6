package june14th;

import java.util.Scanner;

public class MyProgram {

	 public static void main(String[] args) {
	        double principle = 1000;
	        double interestRate = 0.0625;
	        int numOfYears = 5;

	        double profit = principle * Math.pow(1 + interestRate, numOfYears) - principle;
	        System.out.println("Profit after " + numOfYears + " years: " + profit);

	        numOfYears = 8;
	        profit = principle * Math.pow(1 + interestRate, numOfYears) - principle;
	        System.out.println("Profit after " + numOfYears + " years: " + profit);
	        System.out.println(" ");
	        
	        
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the length of the rectangle: ");
	        double length = scanner.nextDouble();
	        System.out.print("Enter the breadth of the rectangle: ");
	        double breadth = scanner.nextDouble();
	        if (length == breadth) {
	            System.out.println("The rectangle is a square.");
	        } else {
	            System.out.println("The rectangle is not a square.");
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the score: ");
	        int score = scanner.nextInt();

	        String grade;

	        if (score < 25) {
	            grade = "F";
	        } else if (score >= 25 && score <= 45) {
	            grade = "E";
	        } else if (score > 45 && score <= 50) {
	            grade = "D";
	        } else if (score > 50 && score <= 60) {
	            grade = "C";
	        } else if (score > 60 && score <= 80) {
	            grade = "B";
	        } else {
	            grade = "A";
	        }

	        System.out.println("Grade: " + grade);
	        System.out.println(" ");
	        
	        

	        System.out.print("Enter the first number: ");
	        int number1 = scanner.nextInt();

	        System.out.print("Enter the second number: ");
	        int number2 = scanner.nextInt();

	        System.out.print("Enter the third number: ");
	        int number3 = scanner.nextInt();

	        System.out.print("Enter the fourth number: ");
	        int number4 = scanner.nextInt();

	        int greatestNumber = number1;

	        if (number2 > greatestNumber) {
	            greatestNumber = number2;
	        }
	        if (number3 > greatestNumber) {
	            greatestNumber = number3;
	        }
	        if (number4 > greatestNumber) {
	            greatestNumber = number4;
	        }

	        System.out.println("The greatest number is: " + greatestNumber);
	        System.out.println(" ");
	        
	        
	        System.out.print("Enter the value of a: ");
	        double a = scanner.nextDouble();

	        System.out.print("Enter the value of b: ");
	        double b = scanner.nextDouble();

	        System.out.print("Enter the value of c: ");
	        double c = scanner.nextDouble();

	        double root1, root2;
	        double discriminant = b * b - 4 * a * c;

	        if (a == 0) {
	            System.out.println("This is not a quadratic equation.");
	        } else if (discriminant > 0) {
	            root1 = (-b + Math.sqrt(discriminant)) / (2 * a);
	            root2 = (-b - Math.sqrt(discriminant)) / (2 * a);
	            System.out.println("Root 1: " + root1);
	            System.out.println("Root 2: " + root2);
	        } else if (discriminant == 0) {
	            root1 = -b / (2 * a);
	            System.out.println("Root: " + root1);
	        } else {
	            double realPart = -b / (2 * a);
	            double imaginaryPart = Math.sqrt(-discriminant) / (2 * a);
	            System.out.println("Root 1: " + realPart + " + " + imaginaryPart + "i");
	            System.out.println("Root 2: " + realPart + " - " + imaginaryPart + "i");
	        }
	        System.out.println(" ");
	        
	        int currentFibonacci = 0;
	        int nextFibonacci = 1;

	        System.out.println("Fibonacci numbers until 300:");
	        System.out.println(currentFibonacci);  

	        while (nextFibonacci <= 300) {
	            System.out.println(nextFibonacci);
	            int temp = nextFibonacci;
	            nextFibonacci = currentFibonacci + nextFibonacci;
	            currentFibonacci = temp;
	        }
	        System.out.println(" ");
	        
	        

	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        long factorial = 1;

	        for (int i = 2; i <= number; i++) {
	            factorial *= i;
	        }

	        System.out.println("Factorial of " + number + " is: " + factorial);
	        System.out.println(" ");
	        

	        System.out.print("Enter temperature in Fahrenheit: ");
	        double fahrenheit = scanner.nextDouble();

	        double celsius = (fahrenheit - 32) * 5 / 9;

	        System.out.println("Temperature in Celsius: " + celsius);
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of minutes: ");
	        long minutes = scanner.nextLong();

	        long minutesInYear = 60 * 24 * 365;
	        long years = minutes / minutesInYear;
	        long days = (minutes % minutesInYear) / (60 * 24);

	        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
	        System.out.println(" ");
	        
	        
	        System.out.print("Enter the first number: ");
	        double number11 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double number21 = scanner.nextDouble();

	        System.out.print("Enter the third number: ");
	        double number31 = scanner.nextDouble();

	        double average = (number11 + number21 + number31) / 3;

	        System.out.println("Average of the three numbers is: " + average);
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines = scanner.nextInt();

	        for (int i = lines; i >= 1; i--) {
	            for (int j = i; j <= lines; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        

	        System.out.print("Enter the number of lines: ");
	        int lines1 = scanner.nextInt();

	        for (int i = lines1; i >= 1; i--) {
	            for (int j = lines1; j >= i; j--) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines2 = scanner.nextInt();

	        for (int i = 1; i <= lines2; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines3 = scanner.nextInt();

	        for (int i = 1; i <= lines3; i++) {
	            for (int j = 1; j <= lines3 - i + 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= lines3 - 1; i++) {
	            for (int j = 1; j <= i + 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines4 = scanner.nextInt();

	        for (int i = 1; i <= lines4; i++) {
	            for (int j = 1; j <= lines4 - i + 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= lines4; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines5 = scanner.nextInt();

	        for (int i = 1; i <= lines5; i++) {
	            for (int j = 1; j <= lines5 - i + 1; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }

	        for (int i = 1; i <= lines5; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print("* ");
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines: ");
	        int lines6 = scanner.nextInt();

	        int count = 1;

	        for (int i = 1; i <= lines6; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(count++ + " ");
	            }
	            System.out.println();
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines (should be odd): ");
	        int lines7 = scanner.nextInt();

	        int spaces = lines7 / 2;
	        int numbers = 1;

	        for (int i = 1; i <= lines7; i++) {
	            for (int j = 1; j <= spaces; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= numbers; k++) {
	                System.out.print(k);
	            }

	            if (i <= lines7 / 2) {
	                spaces--;
	                numbers += 2;
	            } else {
	                spaces++;
	                numbers -= 2;
	            }

	            System.out.println();
	            
	        }
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of lines (should be odd): ");
	        int lines8 = scanner.nextInt();

	        int spaces1 = lines8 / 2;
	        int stars = 1;

	        for (int i = 1; i <= lines8; i++) {
	            for (int j = 1; j <= spaces1; j++) {
	                System.out.print(" ");
	            }

	            for (int k = 1; k <= stars; k++) {
	                System.out.print("*");
	            }

	            if (i <= lines8 / 2) {
	                spaces1--;
	                stars += 2;
	            } else {
	                spaces1++;
	                stars -= 2;
	            }

	            System.out.println();
	        }
	        System.out.println(" ");
	        

	        System.out.print("Input the number of terms: ");
	        int numberOfTerms = scanner.nextInt();

	        for (int i = 1; i <= numberOfTerms; i++) {
	            int cube = i * i * i;
	            System.out.println("Number is: " + i + " and cube of " + i + " is: " + cube);
	        }
	        System.out.println(" ");
	        
	        System.out.print("Input the number of terms: ");
	        int numberOfTerms1 = scanner.nextInt();

	        int sum = 0;
	        int term = 1;

	        System.out.print("Series: ");
	        for (int i = 1; i <= numberOfTerms1; i++) {
	            System.out.print(term);

	            sum += term;
	            term = term * 10 + 1;

	            if (i < numberOfTerms1) {
	                System.out.print(" + ");
	            }
	        }

	        System.out.println("\nThe Sum is: " + sum);
	        System.out.println(" ");
	        
	        System.out.print("Enter the number of elements: ");
	        int n = scanner.nextInt();

	        int sum1 = 0;

	        System.out.println("Enter the elements:");

	        for (int i = 0; i < n; i++) {
	            int number111 = scanner.nextInt();
	            sum1 += number111;
	        }

	        double average1 = (double) sum1 / n;

	        System.out.println("Sum: " + sum1);
	        System.out.println("Average: " + average1);
	        System.out.println(" ");
	        
	        System.out.print("Input the grade: ");
	        String grade1 = scanner.nextLine().toUpperCase();

	        String description;

	        switch (grade1) {
	            case "E":
	                description = "Excellent";
	                break;
	            case "V":
	                description = "Very Good";
	                break;
	            case "G":
	                description = "Good";
	                break;
	            case "A":
	                description = "Average";
	                break;
	            case "F":
	                description = "Fail";
	                break;
	            default:
	                description = "Invalid Grade";
	        }

	        System.out.println("You have chosen: " + description);
	        System.out.println(" ");
	        
	        int tableSize = 10;

	        for (int i = 1; i <= tableSize; i++) {
	            for (int j = 1; j <= tableSize; j++) {
	                int result = i * j;
	                System.out.printf("%4d", result);
	            }
	            System.out.println();
	            System.out.println(" ");
	            
	            System.out.print("Input the number (Table to be calculated): ");
	            int number111 = scanner.nextInt();

	            System.out.println("Multiplication Table of " + number111 + ":");

	            for (int j = 1; j <= 10; j++) {
	                int result = number111 * j;
	                System.out.println(number111 + " X " + j + " = " + result);
	            }
	        scanner.close();
	    }

	 }
}
