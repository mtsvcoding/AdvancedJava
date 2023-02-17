package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> printerQue = new ArrayDeque<>();
        while (!command.equals("print")) {
            if (command.equals("cancel")) {
                String firstTask = printerQue.poll();
                if (firstTask == null){
                    System.out.println("Printer is on standby");
                }else {
                    System.out.println("Canceled " + firstTask);
                }
            } else {
                printerQue.offer(command);
            }
            command = scanner.nextLine();
        }
        while (!printerQue.isEmpty()){
            System.out.println(printerQue.poll());
        }
    }
}
