import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

public class Challenges {
    /**
     * Create a function which returns the number of true values there are in an array.
     */
    public static int countTrueFalse(boolean[] arr) {
        int amountOfTrue = 0;
        for (int x = 0; x < arr.length; x++) {
            if (arr[x] == true) {
                amountOfTrue++;
            }
        }
        return amountOfTrue;
    }

    /**
     * Create a function that takes an array and returns the absolute difference between the biggest and smallest numbers.
     */
    public static int differenceMinMax(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];

        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > largest) {
                largest = nums[x];
            }
            if (nums[x] < smallest) {
                smallest = nums[x];
            }
        }
        return largest - smallest;
    }

    /**
     * Stutter
     * Write a function that stutters a word as if someone is struggling to read it.
     * The first two letters are repeated twice with an ellipsis ... and space after each,
     * and then the word is pronounced with a question mark ?
     */
    public static String stutter(String str) {
        return str.substring(0, 2) + "... " + str.substring(0, 2) + "... " + str + "?";
    }

    /**
     * Write a function that takes an array of numbers and returns the second largest number.
     */
    public static int secondLargestNumber(int[] nums) {
        int largest = nums[0];
        int smallest = nums[0];
        // get the largest number
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > largest) {
                largest = nums[x];
            }
            if (nums[x] < smallest) {
                smallest = nums[x];
            }
        }
        // check for largest number again that is not equal to first largest
        int secondLargest = smallest;
        for (int x = 0; x < nums.length; x++) {
            if (nums[x] > secondLargest && nums[x] != largest) {
                secondLargest = nums[x];
            }
        }
        return secondLargest;
    }

    /**
     * FizzBuzz
     * Create a function that takes a number as an argument and returns "Fizz", "Buzz" or "FizzBuzz".
     * If the number is a multiple of 3 the output should be "Fizz".
     * If the number given is a multiple of 5, the output should be "Buzz".
     * If the number given is a multiple of both 3 and 5, the output should be "FizzBuzz".
     * If the number is not a multiple of either 3 or 5, the number should be output on its own as shown in the examples below.
     * The output should always be a string even if it is not a multiple of 3 or 5.
     **/
    public static String fizzBuzz(int num) {
        String returnString = "";
        if (num % 3 == 0) {
            returnString += "Fizz";
        }
        if (num % 5 == 0) {
            returnString += "Buzz";
        }

        if ((num % 3 != 0) && (num % 5 != 0)) {
            return Integer.toString(num);
        }

        return returnString;
    }

    /**
     * Skip Counting
     * Write a program that gets three integers from the user.
     * Count from the first number to the second number in increments of the third number.
     */
    public static String skipCount(int countFrom, int countTo, int countBy) {
        if (countFrom > countTo) {
            return "Try again with better numbers!";
        }
        int pos = countFrom;
        String returnString = "";
        while (pos <= countTo) {
            returnString += pos;
            pos += countBy;
            if (pos <= countTo) {
                returnString += ".. ";
            }
        }
        return returnString;
    }

    /**
     * The "Reverser"
     * takes a string as input and returns that string in reverse order, with the opposite case.
     */
    public static String reverser(String reverseMe) {
        String returnString = "";
        for (int x = reverseMe.length() - 1; x >= 0; x--) {
            if (Character.isUpperCase(reverseMe.charAt(x))) {
                returnString += Character.toLowerCase(reverseMe.charAt(x));
            } else {
                returnString += Character.toUpperCase(reverseMe.charAt(x));
            }
        }
        return returnString;
    }

    /**
     * Reverse An Array
     * Write a function that reverses the order of an array
     */
    public static int[] reverseArray(int[] arr) {
        int[] reversedArray = new int[arr.length];
        int y = 0;
        for (int x = arr.length - 1; x >= 0; x--) {
            reversedArray[y] = arr[x];
            y++;
        }
        return reversedArray;
    }

    /**
     * Write a function that finds the word "bomb" in the given string (not case sensitive).
     * Return "DUCK!" if found, otherwise,"Relax, there's no bomb.".
     */
    public static String duckTheBomb(String checkMe) {

        if (checkMe.toLowerCase().contains("bomb")) {
            return "DUCK!";
        }
        return "Relax, there's no bomb.";
    }

    /**
     * Sort in Ascending Order
     * Create a method that takes an array of integers and returns a new array, sorted in ascending order (smallest to biggest).
     * If the function's argument is null, an empty array or undefined, return an empty array
     */
    public static int[] sortNumsAscending(int[] nums) {
        List<Integer> newArray = new ArrayList<>();
        for (int num : nums) {
            newArray.add(num);
        }
        Collections.sort(newArray);
        int[] returnArray = new int[newArray.size()];
        for (int x = 0; x < newArray.size(); x++) {
            returnArray[x] = newArray.get(x);
        }
        return returnArray;
    }

    /**
     * Remove Duplicates
     * Create a method that takes an array of strings,removes all duplicate items
     * and returns a new array in the same sequential order as the old array (minus duplicates).
     */
    public static String[] removeDups(String[] str) {
        LinkedHashSet<String> noDups = new LinkedHashSet<>();
        for (String s : str) {
            noDups.add(s);
        }
        String[] newArray = new String[noDups.size()];
        int x = 0;
        for (String item : noDups) {
            newArray[x] = item;
            x++;
        }

        return newArray;
    }
}
