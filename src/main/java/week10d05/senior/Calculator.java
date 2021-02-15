package week10d05.senior;

import java.util.*;

public class Calculator {

    public static void main(String[] args) {


            System.out.println("Enter number of elements");
            Scanner scanner = new Scanner(System.in);
            int arrSize = Integer.parseInt(scanner.nextLine());
            int[] numberArray = new int[arrSize];
            System.out.println("Enter numbers: ");
            for (int i = 0; i < arrSize; i++) {
                numberArray[i] = Integer.parseInt(scanner.nextLine());
            }

            new Calculator().findMinMaxSum(numberArray);


        }


    public void findMinMaxSum(int[] arr) {
        if (arr == null) {
            throw new IllegalArgumentException("Array must be valid");
        }
        int minSum = 0;
        int maxSum = 0;
        if (arr.length <= 4) {
            for (Integer i : arr) {
                minSum += i;
                maxSum += i;
            }

            } else{
                Arrays.sort(arr);
                minSum = arr[0] + arr[1] + arr[2] + arr[3];
                maxSum = arr[arr.length - 1] + arr[arr.length - 2] + arr[arr.length - 3] + arr[arr.length - 4];
            }
            System.out.println("Smallest sum is: " + minSum);
            System.out.println("Biggest sum is: " + maxSum);
        }


    }



//Készítsünk egy Calculator nevű osztályt, melynek van egy findMinMaxSum(int[] arr) metódusa. A metódus feladata,
// hogy kiírja a legnagyobb és a legkisebb összegeket 4 számból, amiket lehetséges összerakni az arr tömb elemeiből.
// Példa: ha az arr tartalma [1, 3, 5, 7, 9], akkor a minimum összeg 1+3+5+7=16 , a maximum összeg 3+5+7+9=24.
//
//A Calculator osztály tartalmazzon egy main metódust is, amely a konzolról olvassa be a számokat és azokból
// készít tömböt, amivel meghívja a findMinMaxSum metódust.
