package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01ReverseNumbersWithAStack {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int [] inputNumbers = Arrays.stream(scanner.nextLine().split("\\s++"))
                                            .mapToInt(Integer :: parseInt)
                                            .toArray();

        ArrayDeque <Integer> numbers = new ArrayDeque<>();

        for (int inputNumber : inputNumbers) {
            numbers.push(inputNumber);
        }

        for (int j = 0; j < inputNumbers.length; j++) {
            System.out.print(numbers.peek() + " ");
            numbers.pop();
        }
    }
}
