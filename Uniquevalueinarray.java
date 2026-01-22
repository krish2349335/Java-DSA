import java.util.Scanner;

public class Uniquevalueinarray {
    public static void  main(String args[]) {
        int arr[] = new int[5];
        System.out.println("enter the array elemsts");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("entered array elemsnts are ");
        for (int x : arr) {
            System.out.print(x + " ");
        }
        int index = -1;
        for (int i = 0; i < 5; i++) {
            for (int j = i + 1; j < 5; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int ans = -1;
        System.out.println("unique elemen are");
        for (int i = 0; i < 5; i++) {
            if (arr[i] > 0) {
                ans = arr[i];
                System.out.println(  ans);
            } else {
                System.out.println("no");
            }
        }

    }
}

