package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L08BrowserHistoryUpgrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<String> stack = new ArrayDeque<>();
        ArrayDeque<String> queue = new ArrayDeque<>();

        String inputText = scanner.nextLine();


        while (!inputText.equals("Home")){
            if(inputText.equals("back")){
                if (stack.isEmpty() || stack.size() == 1){
                    System.out.println("no previous URLs");
                    inputText = scanner.nextLine();
                    continue;
                }else {
                    queue.addFirst(stack.pop());
                    System.out.println(stack.peek());
                }
            } else if(inputText.equals("forward")) {
                if (!queue.isEmpty()){
                    stack.push(queue.poll());
                    System.out.println(stack.peek());
                }else {
                    System.out.println("no next URLs");
                }
            }else {
                stack.push(inputText);
                System.out.println(stack.peek());
            }

            inputText = scanner.nextLine();
            if (!inputText.equals("forward") && !inputText.equals("back") && queue.size() == 1){
                queue.clear();
            }
        }

    }
}
