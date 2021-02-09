package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {


        int[] ages = new int[]{3, 9, 23, 64, 2, 8, 28, 93};
        //subtract the value of the first element in the array from the value in the last element of the array
        int agesSize = ages.length;
        int first = +ages[ 0 ];
        int last = +ages[ agesSize - 1 ];
        int firstLast = last - first;
        System.out.println("-------------------------");
        System.out.println("------------1------------");

        System.out.println("Last element of the array " + last + " subtracted by the first element in the " +
                "array " + first + " equals " + firstLast + ".");
        //Add a new age to your array
        int[] agesNew = new int[]{3, 9, 23, 64, 2, 8, 28, 93, 111};
        int[] numLow = new int[]{3, 9, 3, 4, 2, 8, 28, 3, 1};

        int agesSizeNew = agesNew.length;
        int firstNew = +agesNew[ 0 ];
        int lastNew = +agesNew[ agesSizeNew - 1 ];
        int firstLastNew = lastNew - firstNew;
        System.out.println("Last element of the array " + lastNew + " subtracted by the first element in the " +
                "array " + firstNew + " equals " + firstLastNew + ".");
        //Use a loop to iterate through the array and calculate the average age
        double sum = 0;
        for (int j : agesNew) {
            sum += j;
            System.out.println("Let the numbers hit the floor: " + sum);
        }
        System.out.println("-------------------------");

        System.out.println("-------------------------");

        double average = sum / agesSizeNew;
        System.out.println("Average value of all the array elements is: " + average + ". Use a calculator if you do " +
                "not trust Java logic.");
        System.out.println("-------------------------");
        System.out.println("-----------2-------------");

//2) Create an array of String called names that contains the following values
        String[] names = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        sum = 0;
        int sum1 = 0;
        int count = 0;
        int namesNew = names.length;

        StringBuilder nameString = new StringBuilder("Adding names together is fun:");
        //adds all characters in the array
        System.out.println("-------------------------");
        System.out.println("------------a------------");
        //a)   finds average of all the characters per name in the array
        for (String name : names) {
            int avgChar = name.length();
            System.out.println(sum += avgChar);
        }
        System.out.println("-------------------------");
        System.out.println("------------b------------");
        double charAvg = average = sum / namesNew;
        String avgString = "The average of numbers of characters per name is: ";
        System.out.println(avgString + charAvg);
        //b) Use a loop to iterate through the array again and concatenate all the names together, separated by spaces
        for (String name : names) {
            int nameL = name.length();
            System.out.println(nameString.append(" ").append(name));
        }
        System.out.println("-------------------------");
        System.out.println("------------5-----------");

        //5)   Create a new array of int called nameLengths. Write a loop to iterate over the previously created
        //   names array and add the length of each name to the nameLengths array.
        String nameString2 = "This is the number of characters in each element added into nameLengths ";
        String[] names1 = new String[]{"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        int sumLetters = 0;
        int nameLengths[] = new int[ namesNew ];

        for (int i = 0; i < namesNew; i++) {
            nameLengths[ i ] = +names1[ i ].length();
            sumLetters += nameLengths[ i ];
            System.out.println(nameString2 + sumLetters);
        }
        System.out.println("-------------------------");
        System.out.println("------------6------------");
        //6)	Write a loop to iterate over the nameLengths array and calculate
        //    the sum of all the elements in the array. Print the result to the console.
        String nameString3 = "This is the sum of each element added into nameLengths ";
        for (String name : names) {
            int nameL = name.length();
            System.out.println(nameString3 + (sum1 += nameL));
        }
////
//    7)	Write a method that takes a String, word, and an int, n,
//         as arguments and returns the word concatenated to itself n number of times.
        System.out.println("-------------------------");
        System.out.println("------------7------------");
        System.out.println("Combine words together here: " + wordMultiply("Help", 11));

        //8)   firstName and lastName, and returns a full name
        System.out.println("-------------------------");
        System.out.println("------------8------------");
        System.out.println(fullName("Tom", "Cruise"));


        System.out.println("-------------------------");
        System.out.println("-------------9-----------");
        System.out.println("-------------------------");
        System.out.println(intArray(agesNew));
        System.out.println(intArray(numLow));


        System.out.println("-------------10-----------");
        System.out.println("-------------------------");
        double[] doubles = new double[]{11.2, 3.4, 24.5, 44, 56.2, 115.8, 65};
        double[] doubles2 = new double[]{131.2, 33.4, 4.5, 44, 16.2, 45.8, 54};

        System.out.println(doubleArrayAverage(doubles));

        System.out.println("-------------11-----------");
        System.out.println("-------------------------");
        System.out.println(twoArrays(doubles, doubles2));


        System.out.println("-------------12-----------");
        //12)	Write a method called willBuyDrink
        System.out.println(willBuyDrink(true, 11.5));

        System.out.println("-------------13-----------");
        //13)	Write a method
        System.out.println(airInTire(false, 15, true));
    }

    //    7)	Write a method that takes a String, word, and an int, n,
//    as arguments and returns the word concatenated to itself n number of times.
    public static String wordMultiply(String word, int n) {
        return word.repeat(n);
    }

    //8)   method that takes two Strings, firstName and lastName, and returns a full name
    public static String fullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    //9)	Write a method that takes an array of int and returns true
    //    if the sum of all the ints in the array is greater than 100.

    public static boolean intArray(int[] nums) {
        Random ranNum = new Random();
        int sumInt = 0;
        for (int num : nums) {
            sumInt += num;
        }
        if (sumInt > 100) {
            System.out.println("Adding all the numbers in the array equals " + sumInt + " which is greater than 100. CSI " +
                    "yell here.");
            return true;
        } else {
            System.out.println("Adding all the numbers in the array equals " + sumInt + " which is less than 100. I " +
                    "am a saaaaad panda.");
            return false;
        }

    }


    //10)	Write a method that takes an array of double and
    //    returns the average of all the elements in the array.
    public static double doubleArrayAverage(double[] doubleArr) {
        double sums = 0;
        double doubleLength = doubleArr.length;
        for (double doubleAverage : doubleArr) {
            sums += doubleAverage;
        }
        return sums / doubleLength;
    }

    //11)	Write a method that takes two arrays of double and returns true if the average of the elements in
    // the first array is greater than the average of the elements in the second array
    public static double twoArrays(double[] double1, double[] double2) {
        double d1 = 0;
        double d2 = 0;
        double d1l = double1.length;
        double d2l = double2.length;
        for (double d1a : double1) {
            d1 += d1a;
        }
        for (double d2a : double2) {
            d2 += d2a;
        }
        if (d1 > d2) {
            System.out.println("The first array average is " + d1 + " and the 2nd is " + d2 + ". The first is higher.");
            return d1;
        } else {
            System.out.println("The first array average is " + d1 + " and the 2nd is " + d2 + ". The second array " +
                    "average is higher" +
                    ".");
            return d2;
        }

    }

    ;

    //12)	Write a method called willBuyDrink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        if (!isHotOutside && (moneyInPocket <= 10.50)) {
            System.out.println("I am not buying a drink. It is not hot outside and I am way too broke.");
        } else if (!isHotOutside && (moneyInPocket >= 10.50)) {
            System.out.println("I am not buying a drink. It is not hot outside.");
        } else {
            System.out.println("It is hot outside, I just got paid, and now we drink like kings.");
        }
        return isHotOutside;
    }
    //13)	Create a method of your own that solves a problem.
    // In comments, write what the method does and why you created it.

    //put air in tire if boolean weather is cold, int air pressure is less than 65%, boolean  wife is happy,

    public static boolean airInTire(boolean weatherIsCold, int airPressure, boolean wifeIsHappy) {
        if (!weatherIsCold && airPressure <= 65 && !wifeIsHappy) {
            System.out.println("It is not cold outside, my air pressure is fine, and my wife is not happy. Stay home.");
        } else if (!weatherIsCold && airPressure <= 65 && wifeIsHappy) {
            System.out.println("My air pressure is fine and its warm out, but my wife is happy. Happy wife happy life" +
                    ".");
        } else if (weatherIsCold && airPressure <= 65 && wifeIsHappy) {
            System.out.println("It's warm, my air pressure is low, but my wife is happy. In I stay.");
        } else if (!weatherIsCold && airPressure >= 65 && wifeIsHappy) {
            System.out.println("It's warm, my wife is happy, and my air pressure is good. I am not leaving the house.");
        } else if (weatherIsCold && airPressure >= 65 && wifeIsHappy) {
            System.out.println("It's cold, my wife is happy, but my air pressure is fine. What me worry.");
        } else if (weatherIsCold && airPressure >= 65 && !wifeIsHappy) {
            System.out.println("It's cold, my air pressure is fine, but my wife isn't. Marriage counselor time.");
        } else if (!weatherIsCold && airPressure >= 65 && !wifeIsHappy) {
            System.out.println("My air pressure is ok, but it's hot but my wife isn't. Strip club.");
        } else {
            System.out.println("Time to put air in my tires.");
        }
        return weatherIsCold;
    }

}

