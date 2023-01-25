public class Main {
    public static void main(String[] args) {
        int max = 20;
        int min = 10;
        int randomRange = (int) ((Math.random() * (max - min)) + min);
        System.out.println(randomRange);
        int[] arr = new int[randomRange];
        for (int i =0;i <arr.length; i++){
            int generatedNumber = (int) ((Math.random()* (10-0)+1));
            if (generatedNumber % 2 != 0){
                generatedNumber++;
            }
            arr[i] = generatedNumber;
        }
        System.out.println("В строку");
        for (int i : arr){
            System.out.print(i+" ");
        }
        System.out.println("\n" +"В столбик");
        for (int i : arr)
            System.out.println(i);
        }

    }
