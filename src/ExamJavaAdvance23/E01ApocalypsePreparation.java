package ExamJavaAdvance23;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class E01ApocalypsePreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayDeque<Integer> queueTextile = new ArrayDeque<>();
        ArrayDeque<Integer> stackMedicament = new ArrayDeque<>();
        ArrayList<String> production = new ArrayList<>();

        String[] firstInput = scanner.nextLine().split(" ");
        for (String item : firstInput){
            queueTextile.offer(Integer.parseInt(item));
        }
        String[] secondInput = scanner.nextLine().split(" ");
        for (String item : secondInput){
            stackMedicament.push(Integer.parseInt(item));
        }

        int patch = 0;
        int bandage = 0;
        int medKit = 0;

       while (!queueTextile.isEmpty() && !stackMedicament.isEmpty()){
           int textileMaterial = queueTextile.poll();
           int medicineMaterial = stackMedicament.pop();
           int sum = textileMaterial + medicineMaterial;
           if (sum == 30){
               patch++;
           } else if (sum == 40) {
               bandage++;
           } else if (sum == 100) {
                medKit++;
           } else if (sum > 100) {
                medKit++;
                stackMedicament.push(sum - 100);
           }else {
                stackMedicament.push(medicineMaterial);
           }


       }

       if (queueTextile.isEmpty() && stackMedicament.isEmpty()){
           System.out.println("Textile and medicaments are both empty.");
       } else if (stackMedicament.isEmpty()) {
           System.out.println("Medicaments are empty.");
       }else {
           System.out.println("Textiles are empty.");
       }

       if (patch != 0 || bandage != 0 || medKit != 0){

       }
    }

}
