package testpingjava;

import java.util.Scanner;

public class LabNestedLoop6 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int floor = Integer.parseInt(scanner.nextLine());
        int room = Integer.parseInt(scanner.nextLine());
        String f = "";

        for(int i = floor; i>=1; i--){
            for(int j = 0; j<room; j++){
                if(i==floor){
                    System.out.printf("L%d%d ",i, j);
                }
                else if(i%2==0){
                    System.out.printf("O%d%d ",i, j);
                }
                else{
                    System.out.printf("A%d%d ",i, j);
                }
            }
            System.out.println();
        }
    }
}
