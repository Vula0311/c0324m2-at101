import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int size;
        int[] array;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter a size: ");
            size = scanner.nextInt();
            if (size > 20) System.out.println("Size does not exceed 20");
        } while (size > 20);

        array = new int[size];
        int i = 0;
        while (i < array.length) {
            System.out.printf("Enter element " + (i + 1) + ":");
            array[i] = scanner.nextInt();
            i++;
        }

        System.out.print("Element in list: ");
        for(int j = 0;j<array.length;j++){
            System.out.print(array[j]+"\t");
        }

        int max = array[0];
        for(int number : array){
            max = Math.max(max,number);
        }
        System.out.println("\nMaximum element in array: "+max);
    }
}