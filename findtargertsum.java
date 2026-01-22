import java.util.Scanner;
public class findtargertsum {
    public static void main(String args[]){
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
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
        int target = 10;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i + " "+ j);
                    break;
                }
                else{
                    System.out.println("not");
                }

            }
        }

            }
        }

