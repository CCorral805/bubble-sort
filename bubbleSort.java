import java.util.Scanner;
import java.util.ArrayList;
public class bubbleSort {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int in = 0;
    System.out.print("Input 1 if you would like to use a custom array. Input any other integer to continue with a predetermined array: ");
    int custom = sc.nextInt();
    if(custom==1){
    ArrayList<Integer> arrl = new ArrayList<>();
    do{
    System.out.print("Enter the next number for your array. If done, input the number 0: ");
    in = sc.nextInt();
    if(in==0)break;
    arrl.add(in);
    } while (true);
    int[] arr = arrlToArr(arrl);
    printArr(arr);
    sort(arr);
    printArr(arr);
    } else {
      int[] arr = {5,3,4,69,2,500,-500,9,7,4,1,7};
      printArr(arr);
      sort(arr);
      printArr(arr);
    }
    

  }
  public static int[] arrlToArr(ArrayList<Integer> arrl){        //rather than come up with different methods for ArrayList, convert it to a normal array since it will no longer be modified. 
    int[] arr = new int[arrl.size()];
    for(int i = 0 ; i<arrl.size(); i++){
      arr[i] = arrl.get(i);
    }
    return arr;

  }
  public static void printArr(int[] pArr){
    for(int i : pArr){
      System.out.print(i + " ");
    }
    System.out.println();
  }
  public static void swap(int[]pArr, int a, int b){
    int temp = pArr[a];
    pArr[a]=pArr[b];
    pArr[b]=temp;
  }
  public static void sort(int[] pArr){
    for (int i = 0 ; i<=pArr.length-2 ; i++){             //repeat for length
      for (int j = 0 ; j<=pArr.length-2 ; j++){           //sort through the numbers
        if(pArr[j]>pArr[j+1])swap(pArr, j, j+1);
      }

    }
  }
}