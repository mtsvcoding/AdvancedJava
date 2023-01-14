package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L01BrowserHistory {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();

        String inputText = scanner.nextLine();

        while (!inputText.equals("Home")){
            if (!inputText.contains("back")){
                stack.push(inputText);
                System.out.println(inputText);
            }else {

                if (stack.isEmpty() || stack.size() == 1){
                    System.out.println("no previous URLs");
                    inputText = scanner.nextLine();
                    continue;
                }else {
                    stack.pop();
                    System.out.println(stack.peek());
                }
            }
            inputText = scanner.nextLine();
        }
    }
}
