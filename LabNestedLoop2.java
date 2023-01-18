package testpingjava;

public class LabNestedLoop2 {
    public static void main(String[] args){
        int n1 = 1;
        int n2 = 10;
        for(int i=1; i<=n2; i++){
            for(int l=1; l<=n2; l++){
                System.out.printf("%d * %d = %d%n", i, l, i*l);
            }
        }
    }
}
