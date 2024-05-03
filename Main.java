import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] arr = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            arr[i] = s.nextInt();
        }

        System.out.println("Element repeating 2 times are: ");
        for (int i = 0; i < arr.length-1;i++){
            int repeatCount = 1;
            for (int j = i + 1 ; j < arr.length ; j++){

                if(arr[i] == arr[j]){
                    repeatCount++;
                    arr[j] = 0;
                }
            }
            if(repeatCount == 2 && arr[i] != 0){
                System.out.println(arr[i]);
            }
        }

    }
}


