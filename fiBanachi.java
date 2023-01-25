import java.util.Scanner;

public class fiBanachi {
    public static void main(String[] args){
        int[] arr = new int[20];
        int zero = 0;
        int n0 = 1;
        int n1 = 1;
        int n2;
        System.out.print(zero + " " +n0+" "+n1+" ");
        for(int i : arr){
            n2=n0+n1;
            System.out.print(n2+" ");
            n0=n1;
            n1=n2;
        }
        System.out.println();

    }
}
