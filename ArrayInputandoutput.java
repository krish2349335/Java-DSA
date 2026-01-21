import java.util.Scanner;
public class ArrayInputandoutput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of an array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("enter array elememts");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enterd array elements are:");
        for(int num:arr){
            System.out.print(num+ " ");
        }

    }
}
