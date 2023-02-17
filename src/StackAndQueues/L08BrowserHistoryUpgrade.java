package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        String inputText = scanner.nextLine();

        boolean exclusion = false;

        while (!inputText.equals("Home")){
            if (!inputText.contains("back") && !inputText.contains("forward")){
                stack.push(inputText);
                exclusion = false;
                System.out.println(inputText);
            }
            if (inputText.equals("back")) {
                if (exclusion && !stack.isEmpty()){
                    System.out.println(stack.peek());
                    exclusion = false;
                    inputText = scanner.nextLine();
                    continue;
                }

                if (stack.isEmpty() || stack.size() == 1){
                    System.out.println("no previous URLs");
                    inputText = scanner.nextLine();
                    continue;
                }else {
                    String permanent = stack.pop();
                    queue.addFirst(permanent);
                    System.out.println(stack.peek());
                }
            }

            if (inputText.equals("forward")){
                if (queue.isEmpty()){
                    System.out.println("no next URLs");
                    exclusion = true;
                    inputText = scanner.nextLine();
                    continue;
                }else {
                    System.out.println(queue.peek());
                    String permanent = queue.peek();
                    stack.push(permanent);
                    //queue.clear();
                }

            }

            inputText = scanner.nextLine();
        }

    }
}
