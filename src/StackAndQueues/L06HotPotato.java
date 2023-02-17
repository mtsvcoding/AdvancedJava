package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Collections;
import java.util.Scanner;

public class L06HotPotato {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] namesKids = scanner.nextLine().split(" ");
        int count = Integer.parseInt(scanner.nextLine());

        ArrayDeque<String> kids = new ArrayDeque<>();
        Collections.addAll(kids, namesKids);
        count = count - 1;

        while (kids.size() > 1){
            for (int i = 0; i < count; i++) {
                String hotKid = kids.poll();
                kids.offer(hotKid);
            }
            String burnKid = kids.poll();
            System.out.println("Removed " + burnKid);
        }

        System.out.println("Last is " + kids.poll());
    }
}
