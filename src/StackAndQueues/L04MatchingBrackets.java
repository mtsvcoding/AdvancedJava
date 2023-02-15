package StackAndQueues;


import java.util.ArrayDeque;
import java.util.Scanner;

public class L04MatchingBrackets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        ArrayDeque<Integer> data = new ArrayDeque<>();

        for (int i = 0; i < input.length(); i++) {

            if(input.charAt(i) == '('){
                data.push(i);
            }else if (input.charAt(i) == ')'){
            int startIndexOpenBrackets = data.pop();
            String expression = input.substring(startIndexOpenBrackets, i + 1);
                System.out.println(expression);
            }
        }
    }
}
