import org.w3c.dom.ls.LSOutput;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Carpet carpet = new Carpet(123);
        Floor floor = new Floor(10, 25);
        Room theRoom = new Room(carpet, floor);
        Printer thePrinter1 = new Printer(50, 245, true);
        thePrinter1.PrintPage(9);

        //SimpleCalculator sc = new SimpleCalculator();
        //BankAccount na = new BankAccount ();

//        Scanner scanner = new Scanner(System.in);
//        int maxnumber = Integer.MIN_VALUE;
//        int minnumber = Integer.MAX_VALUE;
//        while (true) {
//            System.out.print("Enter Number");
//
//            boolean isInt = scanner.hasNextInt();
//
//            if (isInt) {
//                int number = scanner.nextInt();
//                if (number > maxnumber) {
//                    maxnumber = number;
//                }
//                if (number < minnumber) {
//                    minnumber = number;
//                }
//            } else {
//                break;
//            }
//        }
//        System.out.println("MaxNumber=" + maxnumber);
//        System.out.println("MinNumber=" + minnumber);
//        scanner.close();
        //System.out.println(getBucketCount(6.26, 2.2));
    }

    public static boolean isEvenNumber (int number) {
        if (number % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean isLeapYear(int year) {
        if (year < 1 || year > 9999) {
            return false;
        }
        int leapFour = year % 4;
        int leapHund = year % 100;
        int leapFourHung = year % 400;

        switch (leapFour) {
            case 0:
                switch (leapHund) {
                    case 0:
                        switch (leapFourHung) {
                            case 0:
                                return true;
                            default:
                                return false;
                        }
                    default:
                        return true;
                }
            default:
                return false;
        }

    }

    public static int getDaysInMonth(int month, int year) {
        if (month < 1 || month > 12 || year < 1 || year > 9999) {
            return -1;
        } else if (isLeapYear(year)) {
            switch (month) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    return 31;
                case 4:
                case 6:
                case 9:
                case 11:
                    return 30;
                case 2:
                    return 29;
            }
        }
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
        }

        return -1;

    }
    public static boolean isOdd (int number) {
        if (number <= 0 ) {
            return false;
        } else if (number % 2 == 0) {
            return false;
        } else {
            return true;
        }
    }

    public static long sumOdd (int start, int end) {
        long sum = 0;
        if ((end < start) || (start <= 0)) {
            return -1;
        } else {
            for (int i=start; i <=end; i++) {
                if (isOdd(i)) {
                    sum += i;
                }
            }
            return sum;
        }
    }

    public static boolean IsEvenNumber (int number) {
        if (number%2==0) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumDigits (int number) {
        if (number<10) {
            return -1;
        }

        int sum = 0;
        do {
            sum = sum + number % 10;
            number /= 10;

        } while (number>0);
        return sum;
    }

    public static boolean isPalindrome (int number) {
        int revertNumber = 0;
        int absNumber = Math.abs(number);

        while (absNumber != 0) {
            revertNumber *= 10;
            revertNumber = revertNumber + absNumber % 10;
            absNumber /=10;
        }

        absNumber = Math.abs(number);
        if (revertNumber == absNumber) {
            return true;
        } else {
            return false;
        }
    }

    public static int sumFirstAndLastDigit (int number) {
        int sum = 0;

        if (number < 0 ) {
            return -1;
        }

        sum = number % 10;

        while (number>9) {
            number /= 10;
        }
        sum += number %10;
        return sum;
    }

    public static int getEvenDigitSum (int number) {
        int sum = 0;

        if (number < 0) {
            return -1;
        }

        while (number!=0) {
            int digit = number % 10;
            if (digit % 2 == 0) {
                sum += digit;
            }
            number /= 10;
        }
        return sum;
    }

    public static boolean hasSharedDigit (int firstNumber, int secondNumber) {
        if ((firstNumber<10) || (firstNumber) > 99 || (secondNumber < 10) || (secondNumber > 99)) {
            return false;
        }

        while (firstNumber > 0 ) {
            int calcSecondNumber = secondNumber;

            while (calcSecondNumber >0) {

                if (firstNumber % 10 == calcSecondNumber % 10) {
                    return true;
                }
                calcSecondNumber /= 10;
            }
            firstNumber /= 10;
        }
        return false;
    }

    public static boolean hasSameLastDigit (int firstParam, int secondParam, int thirdParam) {
        if ((firstParam<10) || (firstParam>1000) || (secondParam<10) || (secondParam>1000) || (thirdParam<10) || (thirdParam>1000)) {
            return false;
        }

        int lastOne = firstParam % 10;
        int lastTwo = secondParam % 10;
        int lastThree = thirdParam % 10;

        if ((lastOne == lastTwo) || (lastOne == lastThree) || (lastTwo == lastThree)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValid (int number) {
        if ((number >= 10) && (number<=1000)) {
            return true;
        } else {
            return false;
        }
    }

    public static int getGreatestCommonDivisor (int first, int second) {
        int number;
        int i;

        if (first < 10 || second < 10) {
            return -1;
        }

        if (first<second) {
            number = first;
        } else {
            number = second;
        }

        do {
            if ((first % number == 0) && (second % number == 0)) {
                return number;
            }
            number --;
        } while (number>1);
        return number;
    }

    public static void printFactors (int number) {
        if (number < 1) {
            System.out.println("Invalid Value");
        } else {
            for (int i=1; i <= number /2; i++) {
                if (number % i ==0) {
                System.out.println(i);
                }
            }
            System.out.println(number);
        }

    }

    public static boolean isPerfectNumber (int number) {
        int validation = 0;
        if (number < 1) {
            return false;
        }
        for (int i=1; i<=number/2; i++) {
            if (number % i == 0) {
                validation += i;
            }
        }

        if (validation == number) {
            return true;
        }

        return false;
    }

    public static void numberToWords (int number) {
        int digits = 0;
        int curDigit;
        int i = getDigitCount(number);

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            number = reverse(number);

            do {
                digits ++;
                curDigit = number % 10;
                number /= 10;

                switch (curDigit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
            } while (number > 0);

            while (digits < i) {
                System.out.println("Zero");
                digits++;
            }
        }
    }

    public static int reverse (int number) {
        int reverted = 0;
        int flag = 1;
        if (number < 0 ) {
            flag = -1;
            number = Math.abs(number);
        }

        do {
            reverted *= 10;
            reverted = reverted + number % 10;
            number /= 10;
        } while (number >0);
        return reverted * flag;
    }

    public static int getDigitCount (int number) {
        int digits = 0;
        if (number < 0) {
            return -1;
        }
        do {
            digits ++;
            number /= 10;
        } while (number > 0);
        return digits;
    }

    public static boolean canPack (int bigCount, int smallCount, int goal) {
        int reqQtyBig;
        int reqQtySmall;

        if ((bigCount <0) || (smallCount < 0) || (goal < 0)) {
            return false;
        }

        reqQtyBig = goal / 5;
        if (reqQtyBig > bigCount) {
            reqQtySmall = ((reqQtyBig - bigCount) * 5) + goal % 5;
            if (reqQtySmall <= smallCount) {
                return true;
            } else {
                return false;
            }
        } else {
            reqQtySmall = goal % 5;
            if (reqQtySmall <= smallCount) {
                return true;
            } else {
                return false;
            }
        }
    }

    public static int getLargestPrime (int number) {
        int primeFactor = number;
        int numberCycles = number/2;

        if (number < 2) {
            return -1;
        }

        for (int i=2; i <= numberCycles; i++) {
            if (number % i == 0) {
                primeFactor = i;
                number /= i;

                while (number % i == 0) {
                    number /= i;
                }
            }
        }
        return primeFactor;
    }

    public static void printSquareStar (int number) {
        if (number < 5) {
            System.out.print("Invalid Value");

        } else {
            for (int i = 1; i < number + 1; i++) {
                for (int j = 1; j < number + 1; j++) {
                    if ((i == 1) || (j == 1) || (i == number) || (j == number) || (i == j) || (j == number - i + 1)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
    }
    public static void inputThenPrintSumAndAverage () {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int avrg = 0;
        int counter =0 ;
        boolean num = scanner.hasNextInt();

        while (num) {
            int i = scanner.nextInt();
            counter++;
            sum +=i;
            num = scanner.hasNextInt();
        }

        if (counter > 0) {
            avrg = (int) Math.round ((double) sum / counter);
        }

        System.out.println("SUM = " + sum + " AVG = " + avrg + "   " + counter);
        scanner.close();
    }

    public static int getBucketCount (double width, double heigth, double areaPerBucket, int extraBuckets) {
        double area = 0;
        int buckets = 0;
        int reqBuckets = 0;

        if ((width <= 0) || (heigth <= 0) || (areaPerBucket <= 0) || (extraBuckets < 0)) {
            return -1;
        }

        area = width * heigth;
        reqBuckets = (int) Math.ceil (area / areaPerBucket);
        buckets = reqBuckets - extraBuckets;
        if (buckets <= 0) {
            return 0;
        } else {
            return buckets;
        }
    }

    public static int getBucketCount (double width, double heigth, double areaPerBucket) {
        double area;
        int reqBuckets;

        if ((width <= 0) || (heigth <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        area = width * heigth;
        reqBuckets = (int) Math.ceil (area / areaPerBucket);

        return reqBuckets;
    }

    public static int getBucketCount (double area, double areaPerBucket) {
        int buckets;

        if ((area <= 0) || (areaPerBucket <= 0)) {
            return -1;
        }

        buckets = (int) Math.ceil(area/areaPerBucket);
        return buckets;
    }
}