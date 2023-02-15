package StackAndQueues;

import java.util.ArrayDeque;
import java.util.Scanner;

public class L05PrinterQueue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String command = scanner.nextLine();

        ArrayDeque<String> printerQue = new ArrayDeque<>();
        while (!command.equals("print")){
            if(!command.equals("cancel")){
                printerQue.offer(command);
            }else {
                if (!printerQue.isEmpty()){
                    System.out.println("Canceled " + printerQue.poll());
                }else {
                    System.out.println("Printer is on standby");
                }
            }
            command = scanner.nextLine();
        }
        if (printerQue.isEmpty()){
            return;
        }else {
            for (int i = 0; i <= printerQue.size(); i++) {
                System.out.println(printerQue.pop());
            }
        }
    }
}
