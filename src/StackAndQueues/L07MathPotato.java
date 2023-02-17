package StackAndQueues;


import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;

public class L07MathPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesKids = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        PriorityQueue<String> kids = new PriorityQueue<>();
        Collections.addAll(kids, namesKids);
        int currentSteps = 1;

        while (kids.size() > 1){
            for (int i = 1; i < count; i++) {
                String hotKid = kids.poll();
                kids.offer(hotKid);
            }

            if (isPrime(currentSteps)){
                System.out.println("Prime " + kids.peek());
            }else {
                String burnKid = kids.poll();
                System.out.println("Removed " + burnKid);
            }
            currentSteps ++;
        }

        System.out.println("Last is " + kids.poll());
    }

    private static boolean isPrime (int num){
        if (num == 1){
            return false;
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
