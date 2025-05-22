public class ArrayAndMethodsAssignment {

    public static void main(String[] args) {
        // 1. Ages Array
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93}; // Ages array

        // 1.a. Subtract first from last
        int diff_1a = ages[ages.length - 1] - ages[0]; // Last - first
        System.out.println("1a: " + diff_1a);

        // 1.b. New array 'ages2'
        int[] ages2 = new int[9]; // ages2, 9 elements
        ages2[0] = 1; ages2[8] = 100; // Example values for ages2

        // 1.b.i. (implicitly done by new int[9])
        // 1.b.ii. Repeat subtraction for 'ages2'
        int diff_1b = ages2[ages2.length - 1] - ages2[0]; // Last - first for ages2
        System.out.println("1b_ii: " + diff_1b);

        // 1.b.iii. Dynamic access shown by using ages.length - 1 and ages2.length - 1

        // 1.c. Calculate average age for 'ages'
        double sumAges = 0; // Sum for avg
        for (int age : ages) {
            sumAges += age; // Add to sum
        }
        double avgAge = sumAges / ages.length; // Calc avg
        System.out.println("1c: " + avgAge);

        // 2. Names Array
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"}; // Names array

        // 2.a. Average letters per name
        double totalLetters = 0; // Sum of letters
        for (String name : names) {
            totalLetters += name.length(); // Add name length
        }
        double avgLetters = totalLetters / names.length; // Calc avg letters
        System.out.println("2a: " + avgLetters);

        // 2.b. Concatenate names
        StringBuilder concatNames = new StringBuilder(); // String builder
        for (int i = 0; i < names.length; i++) {
            concatNames.append(names[i]); // Append name
            if (i < names.length - 1) {
                concatNames.append(" "); // Add space
            }
        }
        System.out.println("2b: " + concatNames.toString());

        // 3. Access last element: array[array.length - 1]
        System.out.println("3: Use arrayName[arrayName.length - 1]");

        // 4. Access first element: array[0]
        System.out.println("4: Use arrayName[0]");

        // 5. nameLengths array
        int[] nameLengths = new int[names.length]; // nameLengths array
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length(); // Store name length
        }
        System.out.print("5: "); // Print nameLengths elements
        for (int length : nameLengths) { System.out.print(length + " "); }
        System.out.println();


        // 6. Sum of nameLengths
        int sumNameLengths = 0; // Init sum
        for (int length : nameLengths) {
            sumNameLengths += length; // Add length
        }
        System.out.println("6: " + sumNameLengths);

        // 7. Call concatenateWord method
        String wordResult = concatenateWord("Loop", 3); // "Loop" * 3
        System.out.println("7: " + wordResult);

        // 8. Call getFullName method
        String fullNameResult = getFullName("First", "Last"); // Combine names
        System.out.println("8: " + fullNameResult);

        // 9. Call isSumGreaterThan100 method
        boolean sumCheck1 = isSumGreaterThan100(new int[]{50, 51}); // Sum = 101
        boolean sumCheck2 = isSumGreaterThan100(new int[]{10, 20}); // Sum = 30
        System.out.println("9a: " + sumCheck1);
        System.out.println("9b: " + sumCheck2);

        // 10. Call calculateAverageDouble method
        double avgDouble = calculateAverageDouble(new double[]{10.0, 20.0, 30.0}); // Avg of 10,20,30
        System.out.println("10: " + avgDouble);

        // 11. Call isFirstArrayAverageGreater method
        double[] dArr1 = {15.0, 25.0}; // Avg 20
        double[] dArr2 = {5.0, 10.0};  // Avg 7.5
        boolean avgCompare = isFirstArrayAverageGreater(dArr1, dArr2); // Compare avgs
        System.out.println("11: " + avgCompare);

        // 12. Call willBuyDrink method
        boolean buyDrink1 = willBuyDrink(true, 15.50); // Hot, enough money
        boolean buyDrink2 = willBuyDrink(true, 10.00); // Hot, not enough money
        System.out.println("12a: " + buyDrink1);
        System.out.println("12b: " + buyDrink2);

        // 13. Call custom method (isEven)
        boolean evenCheck = isNumberEven(10); // Check if 10 is even
        System.out.println("13: " + evenCheck);
    }

    // 7. Repeats word n times
    public static String concatenateWord(String word, int n) {
        StringBuilder result = new StringBuilder(); // Builder
        for (int i = 0; i < n; i++) { result.append(word); } // Append n times
        return result.toString(); // Result
    }

    // 8. Creates full name from first and last
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName; // First + space + Last
    }

    // 9. True if int array sum > 100
    public static boolean isSumGreaterThan100(int[] numbers) {
        int sum = 0; // Init sum
        for (int number : numbers) { sum += number; } // Sum elements
        return sum > 100; // Check sum
    }

    // 10. Calculates double array average
    public static double calculateAverageDouble(double[] numbers) {
        if (numbers == null || numbers.length == 0) { return 0.0; } // Handle empty
        double sum = 0; // Init sum
        for (double number : numbers) { sum += number; } // Sum elements
        return sum / numbers.length; // Return avg
    }

    // 11. True if first double array's average is greater
    public static boolean isFirstArrayAverageGreater(double[] array1, double[] array2) {
        double avg1 = calculateAverageDouble(array1); // Avg of array1
        double avg2 = calculateAverageDouble(array2); // Avg of array2
        return avg1 > avg2; // Compare avgs
    }

    // 12. True if hot outside AND money > 10.50
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50; // Conditions
    }

    // 13. Custom method: Checks if a number is even.
    // Why: A simple utility function for number property checking.
    public static boolean isNumberEven(int number) {
        return number % 2 == 0; // True if remainder is 0
    }
}