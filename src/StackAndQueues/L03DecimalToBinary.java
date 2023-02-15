package StackAndQueues;


import java.util.ArrayDeque;
import java.util.Scanner;

public class L03DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int inputNum = Integer.parseInt(scanner.nextLine());

        ArrayDeque <Integer> stack = new ArrayDeque<>();

        if (inputNum == 0){
            System.out.println(inputNum);
            return;
        }else {
            while (inputNum != 0){
                stack.push(inputNum % 2);
                inputNum /= 2;
            }
        }

        while (!stack.isEmpty()){
            System.out.print(stack.pop());
        }
    }
}
