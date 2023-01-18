package testpingjava;

import java.util.Scanner;

public class LabNestedLoop4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int starting = Integer.parseInt(scanner.nextLine());
        int finals = Integer.parseInt(scanner.nextLine());
        int magic = Integer.parseInt(scanner.nextLine());
        boolean flag = false;

        int combination =0;
        for(int i = starting; i<=finals; i++){
            for(int j = starting; j<= finals; j++){
                combination ++;
                if(i+j==magic){
                    System.out.printf("Combination N:%d (%d + %d = %d)%n", combination, i, j, magic);
                    flag = true;
                    break;
                }
            }
            if(flag){
                break;
            }
            if(i==finals && flag==false){
                System.out.printf("%d combinations - neither equals %d", combination, magic);
            }
        }
    }
}
