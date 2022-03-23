//package codingAssignments;
//
//public class Week3Java {
    //    public static void main(String[] args) {
// 1. Create an array of int called ages that contains the following values: 3, 9, 23, 64, 2, 8, 28, 93.
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

// 1a. Programmatically subtract the value of the first element in the array from the value in the last element of the array (i.e. do not use ages[7] in your code). Print the result to the console.
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
//        int subtractFirstFromLast = ages[ages.length - 1] - ages[0];
//        System.out.println("The difference is " + subtractFirstFromLast);
//    }
//}
// 1b. Add a new age to your array and repeat the step above to ensure it is dynamic (works for arrays of different lengths).
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
//        int subtractFirstFromLast = ages[ages.length - 1] - ages[0];
//        System.out.println("The difference with a new age is " + subtractFirstFromLast);
//    }
//}
// 1c. Use a loop to iterate through the array and calculate the average age. Print the result to the console.
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
//        int sumOfAges = 0;
//        int averageOfAges = 0;
//        for (int num : ages) {
//            sumOfAges += num;
//        }
//        averageOfAges = sumOfAges / ages.length;
//        System.out.println("Average of ages is: " + averageOfAges);
//    }
//}
// 2. Create an array of String called names that contains the following values: “Sam”, “Tommy”, “Tim”, “Sally”, “Buck”, “Bob”.
//        String[] names = {"Sam","Tommy","Tim","Sally","Buck","Bob"};

// 2a. Use a loop to iterate through the array and calculate the average number of letters per name. Print the result to the console.
//        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//        int sum = 0;
//        int averageNumOfLetters = 0;
//        for (int i = 0; i < names.length; i++) {
//            sum += names[i].length();
//        }
//        averageNumOfLetters = sum / names.length;
//        System.out.println("The average number of letters is: " + averageNumOfLetters);
//    }
//}
// 2b. Use a loop to iterate through the array again and concatenate all the names together, separated by spaces, and print the result to the console.
//        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//        String concatNames = "";
//        for (String name : names) {
//            concatNames += (name + " ");
//        }
//        System.out.println("Concatenated names: " + concatNames);
//    }
//}
// 3. How do you access the last element of any array?
//  Accessed by using length -1, example array:
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
//        lastElement = ages[ages.length - 1];
//
// 4. How do you access the first element of any array?
//  Accessed by using index[0], example array:
//        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93, 26};
//        firstElement = ages[0];

// 5. Create a new array of int called nameLengths. Write a loop to iterate over the previously created names array and add the length of each name to the nameLengths array.
//        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//        int[] nameLengths = new int[names.length];
//        for (int i = 0; i < names.length; i++) {
//            nameLengths[i] = names[i].length();
//            System.out.println("The length of name " + names[i] + " is: " + nameLengths[i]);
//        }
//    }
//}
// 6. Write a loop to iterate over the nameLengths array and calculate the sum of all the elements in the array. Print the result to the console.
//        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
//        int[] nameLengths = new int[names.length];
//        int sumNameLengths = 0;
//        for (int i = 0; i < names.length; i++) {
//            nameLengths[i] = names[i].length();
//        }
//        for (int num : nameLengths) {
//            sumNameLengths += num;
//        }
//        System.out.println("The length of all the names is " + sumNameLengths);
//    }
//}
// 7. Write a method that takes a String, word, and an int, n, as arguments and returns the word concatenated to itself n number of times. (i.e. if I pass in “Hello” and 3, I would expect the method to return “HelloHelloHello”).
//    public static void main (String[]args){
//        String word = "Hello!";
//        int n = 6;
//        repeatString(word, n);
//    }
//
//    public static String repeatString (String word,int n){
//        String result = "";
//        for (int i = 0; i < n; i++) {
//            result += word;
//        }
//        System.out.println(result);
//        return result;
//    }
//}

    // 8. Write a method that takes two Strings, firstName and lastName, and returns a full name (the full name should be the first and the last name as a String separated by a space).
//    public static void main(String[] args) {
//        String firstName = "Linda";
//        String lastName = "Forlizzi";
//        System.out.println(takesTwoNames(firstName, lastName));
//    }
//
//    public static String takesTwoNames(String firstName, String lastName) {
//        return firstName + " " + lastName;
//    }
//}

    //9. Write a method that takes an array of int and returns true if the sum of all the ints in the array is greater than 100.
//    public static void main(String[] args) {
//        int[] array = {3, 30, 4, 40};
//        System.out.println(sumAll(array));
//    }
//
//    public static boolean sumAll(int[] array) {
//        int sum = 0;
//        for (int num : array) {
//            sum += num;
//        }
//        return sum > 100;
//    }
//}

// 10. Write a method that takes an array of double and returns the average of all the elements in the array.
//    public static void main(String[] args) {
//        double[] array = {45.7, 30.2, 67.3};
//        System.out.println(doubleAverage(array));
//    }
//
//    public static double doubleAverage(double[] array) {
//        double sum = 0;
//        for (double number : array) {
//            sum += number;
//        }
//        return sum / array.length;
//    }
//}

    //11. Write a method that takes two arrays of double and returns true if the average of the elements in the first array is greater than the average of the elements in the second array.
//    public static void main(String[] args) {
//        double[] array1 = {45.7, 30.2, 67.3};
//        double[] array2 = {75.4, 20.3, 37.6};
//        System.out.println(firstArrayGreater(array1, array2));
//    }
//
//    public static boolean firstArrayGreater(double[] array1, double[] array2) {
//        double sum1 = 0;
//        double sum2 = 0;
//        for (double number : array1) {
//            sum1 += number;
//        }
//        for (double number : array2) {
//            sum2 += number;
//        }
//        return (sum1 / array1.length) > (sum2 / array2.length);
//    }
//}
//12. Write a method called willBuyDrink that takes a boolean isHotOutside, and a double moneyInPocket, and returns true if it is hot outside and if moneyInPocket is greater than 10.50.
//    public static void main(String[] args) {
//        double moneyInPocket = 22;
//        boolean isHotOutside = true;
//        System.out.println(willBuyDrink(isHotOutside, moneyInPocket));
//    }
//
//    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
//        return (isHotOutside && (moneyInPocket > 10.50));
//    }
//}
// 13. Create a method of your own that solves a problem. In comments, write what the method does and why you created it.
// If I wasn't so tired I would have written a better method, but I'm thinking ahead to tomorrow and work commute
//    public static void main(String[] args) {
//        boolean isSaturday = true;
//        boolean isSnowing = true;
//        System.out.println(willDriveSlowly(isSaturday, isSnowing));
//    }
//
//    public static boolean willDriveSlowly(boolean isSaturday, boolean isSnowing) {
//        return isSaturday && isSnowing;
//    }
//}
//}
