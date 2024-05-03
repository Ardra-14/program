import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);


        System.out.println("Enter the size of the array: ");
        int size = s.nextInt();

        int[] a = new int[size];
        System.out.println("Enter the elements of the array: ");
        for (int i = 0; i < size; i++){
            a[i] = s.nextInt();
        }

        System.out.println("Element repeating 2 times are: ");
        boolean[] counted = new boolean[size];
        for (int i = 0; i < a.length - 1; i++) {
            if (!counted[i]) {
                int count = 1;
                for (int j = i + 1; j < a.length; j++) {
                    if (a[i] == a[j]) {
                        count++;
                        counted[j] = true;
                    }
                }
                if (count == 2) {
                    System.out.println(a[i]);
                }
            }
        }

    }
}


