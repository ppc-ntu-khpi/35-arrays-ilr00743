package test;

import domain.Exercise;
import java.util.Scanner;
import java.util.Arrays;

public class TestResult {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        fillArray(array);
        System.out.println("Array: " + Arrays.toString(array));
    }
}
