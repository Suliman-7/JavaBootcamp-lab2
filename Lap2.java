import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class Lap2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);


        // Q1


//        String arr[] = { "cat" , "dog" , "red" , "is" , "am" } ;
//        ArrayList<String> newArr = new ArrayList() ;
//
//        int longest = 0 ;
//
//
//        for ( String w:arr ) {
//            if (w.length() > longest) {
//                longest = w.length();
//            }
//        }
//
//        for ( String l:arr ) {
//            if (l.length() == longest) {
//                newArr.add(l);
//            }
//        }
//
//
//        System.out.println(newArr);


        // Q2


//        int array[] = { 1,1,1,3,3,5 } ;
//
//        int count = 0 ;
//
//
//        System.out.println("Please enter a number ");
//        int num = input.nextInt() ;
//
//
//
//        for ( int i:array ) {
//
//            if (num==i) {
//                count++;
//            }
//        }
//
//        System.out.println(num + " occures " + count + " times ");
//        }


        // Q3


//    int array[] = { 1,4,17,7,25,3,100 } ;
//
//    ArrayList<Integer> newArr = new ArrayList() ;
//
//    ArrayList<Integer> newArr1 = new ArrayList() ;
//
//
//                System.out.println("Please enter a number ");
//    int k = input.nextInt() ;
//
//
//                for ( int n:array ) {
//        newArr.add(n) ;
//    }
//
//                newArr.sort(null);
//
//                for (int i=0 ; i<k; i++) {
//        newArr1.add(newArr.get(newArr.size()-1));
//        newArr.remove(newArr.size()-1);
//    }
//                System.out.println(newArr1);
//
//}


// Q4

//    int arr[] = { 5,4,3,2,1 } ;
//    reverse(arr);
//
//
//
//
//public static void reverse (int arr[]) {
//
//    ArrayList<Integer> arrlist = new ArrayList() ;
//    int c = 1 ;
//
//
//
//    for( int n=0 ; n<arr.length ; n++ ) {
//        arrlist.add(arr[arr.length-c]);
//        c++;
//    }
//
//    System.out.println(arrlist);
//}


        // Q5

//        int num;
//        ArrayList<Integer> arrlist = new ArrayList();
//
//
//        do {
//
//
//            System.out.println("*******                Welcome                       *******");
//            System.out.println("*******   Press 1 to Add element to the array        *******");
//            System.out.println("*******   Press 2 to Display element to the array    *******");
//            System.out.println("*******   Press 3 to search for element in the array *******");
//            System.out.println("*******   Press 4 to sort the array                  *******");
//            System.out.println("*******   Press 5 to Stop                            *******");
//
//
//            num = input.nextInt();
//
//            if (num == 1) {
//
//                System.out.println("Please enter the number ");
//                int n = input.nextInt();
//
//                arrlist.add(n);
//
//            } else if (num == 2) {
//
//                System.out.println(arrlist);
//
//            } else if (num == 3) {
//
//                boolean found = false;
//
//                System.out.println("Please enter the element you search for ");
//                int e = input.nextInt();
//
//                for (int n = 0; n < arrlist.size(); n++) {
//
//                    if (arrlist.get(n) == e) {
//                        found = true;
//                        System.out.println(arrlist.get(n) + "element you searched for in index " + n);
//                    }
//                }
//                if (found == false) {
//                    System.out.println("element you searched for not found ");
//                }
//
//
//            } else if (num == 4) {
//                arrlist.sort(null);
//                System.out.println("Array sorted : " + arrlist);
//
//            } else if (num == 5) {
//
//            } else {
//                System.out.println("Please enter number from one to five ");
//            }
//
//        } while (num != 5);


        // Q6


//        System.out.println("Please enter minimum number");
//        int min = input.nextInt();
//
//        System.out.println("Please enter maximum number");
//        int max = input.nextInt();
//
//        System.out.println("Please enter number of random numbers");
//        int num = input.nextInt();
//
//        random(min, max, num);
//
//
//        public static void random ( int min, int max, int num ){
//
//            ArrayList<Integer> arrlist = new ArrayList();
//
//
//            Random rand = new Random();
//
//            int mn = min;
//            int mx = max;
//
//            for (int i = 0; i < num; i++) {
//                int rand_int1 = rand.nextInt(mn, mx+1);
//                arrlist.add(rand_int1);
//
//            }
//
//
//            System.out.println(arrlist);
//
//        }

        // Q7

        String password = "Aa1234**";

        int n1 = checkLength(password);

        int n2 = checkSpecialCharacters(password);

        int n3 = checkUpperCaseLowerCase(password);

        int totalScore = n1 + n2 + n3;


        if (totalScore >= 8) {
            System.out.println("Password is strong");
        } else if (totalScore >= 5) {
            System.out.println("Password is moderately strong");
        } else {
            System.out.println("Password is weak");
        }


    }

    public static int checkLength(String password) {

        if (password.length() >= 8) {
            return 3;
        } else if (password.length() > 5 && password.length() < 8) {
            return 2;
        } else {
            return 0;
        }
    }

    public static int checkSpecialCharacters(String password) {

        for (int i = 0; i < password.length(); i++) {

            System.out.println(Character.getType(password.charAt(i)));

            if (Character.getType(password.charAt(i)) == 24) {

                return 2;

            }
        }
        return 0;
    }


    public static int checkUpperCaseLowerCase(String password) {

        boolean up = false;
        boolean lo = false;

        for (int i = 0; i < password.length(); i++) {

            System.out.println(Character.getType(password.charAt(i)));

            if (Character.getType(password.charAt(i)) == 1) {

                up = true;

            } else if (Character.getType(password.charAt(i)) == 2) {

                lo = true;

            }

        }
        if (up && lo) {
            return 3;
        } else
            return 0;
    }


    // Q8


//    System.out.println("Please enter the number of Fibonacci terms to generate : ");
//
//    int numF = input.nextInt();
//    ArrayList<Integer> arr = new ArrayList();
//
//
//    Fibonacci(numF);
//
//
//    public static void Fibonacci(int numF) {
//
//        ArrayList<Integer> arr = new ArrayList();
//
//
//        int num1 = 0;
//        int num2 = 1;
//        int num3;
//
//        arr.add(num1);
//        arr.add(num2);
//
//        if (numF == 1) {
//            System.out.println(0);
//        }
//
//
//        for (int i = 0; i < numF - 2; i++) {
//
//            num3 = num1 + num2;
//
//            arr.add(num3);
//
//
//            num1 = num2;
//
//            num2 = num3;
//
//
//        }
//        System.out.println("Fibonacci sequence with " + numF + " terms:");
//        System.out.println(arr);
//
//
//    }


}



















