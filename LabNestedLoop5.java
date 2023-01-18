package testpingjava;

import java.util.Scanner;

public class LabNestedLoop5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double sum = 0;

        for(int i = 1; i>=1; i++){
            String destination = scanner.nextLine();
            if(destination.equals("End")){
                break;
            }
            double money_need = Double.parseDouble(scanner.nextLine());
            while(!destination.equals("End")){
                sum += Double.parseDouble(scanner.nextLine());
                if(sum>=money_need){
                    System.out.printf("Going to %s!%n", destination);
                    sum = 0;
                    break;
                }
            }
        }
    }
}
