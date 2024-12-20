import java.util.Arrays;
import java.util.Scanner;

public class codeArray {
    public static void rev(int arr[]){
        int start=0;
        int end=arr.length-1;
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void sort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }

    public static void add(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        System.out.println(sum);
    }

    public static boolean prime(int n){
        if(n==1){
            return false;
        }
        if(n==2 || n==3){
            return true;
        }
        if(n%2==0 || n%3==0){
            return false;
        }
        for(int i=5;i*i<=n;i=i+6){
            if(n%i==0 || n%(i+2)==0){
                return false;
            }
        }
        return true;
    }

    public static void unique(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i]!=arr[i-1]){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        // System.out.println(arr[i]);
                        count++;
                        // break;
                    }
                }
                if(count>1){
                    System.out.println(arr[i]+": "+count+" times");
                }
            }
        }
    }

    public static void removeDuplicates(int arr[]){
        Arrays.sort(arr);
        int n[] = {};
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i] != arr[i-1]){
                // System.out.print(arr[i]+" ");
            }
        }
    }

    public static void occur(int arr[]){
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(i==0 || arr[i] != arr[i-1]){
                int count=1;
                for(int j=i+1;j<arr.length;j++){
                    if(arr[i]==arr[j]){
                        count++;
                        break;
                    }
                }
                System.out.println(arr[i]+": "+count+" times");
            }
        }
    }

    public static void secondLargest(int arr[]){
        Arrays.sort(arr);
        int secondSmallest = 1;
        int secondLargest =1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] != arr[i-1]){              // 1 2 3 4 5 6 7 8 9 67 
                secondSmallest=arr[i];
                break;
            }
        }

        for(int i=arr.length-2;i>=0;i--){
            if(arr[i] != arr[i+1]){
                secondLargest=arr[i];
                break;
            }
        }
        if(secondLargest != 1 && secondSmallest != 1){
            System.out.println(secondLargest+" and "+secondSmallest);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.println("Size of array: ");
        // int n = sc.nextInt();
        // System.out.println("Enter array: ");
        // int arr[] = new int[n];
        // for(int i=0;i<arr.length;i++){
        //     arr[i] = sc.nextInt();
        // }
        // System.out.print("Array is: ");
        // // System.out.println(Arrays.toString(arr));
        // for(int i=0;i<arr.length;i++){
        //     System.out.print(arr[i]+" ");
        // }


        // Sort Array
        // int arr[] = {1,2,5,3,4};
        // rev(arr);
        // sort(arr);
        // Arrays.sort(arr);
        // System.out.println(Arrays.toString(arr));

        // Add array
        // int arr[] = {1,2,3,4,5};
        // add(arr);

        // Missing No
        // int arr[]={1,2,3,5};
        // int n = arr.length+1;
        // int sum=0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        // // System.out.println(n);
        // int nn = n*(n+1)/2;
        // System.out.println(nn);
        // int res = nn - sum;
        // System.out.println(res);

        // check prime from array
        // int arr[] = {1,2,3,4,5,6,7,8,9};
        // for(int e: arr){
        //     if(prime(e)){
        //         System.out.println(e);
        //     }
        // }

        // find element is present or not
        // int arr[] = {1,2,3,4,5,6};
        // int target = 55;
        // boolean b=false;
        // for(int e: arr){
        //     if(e==target){
        //         b = true;
        //     }
        // }
        // if(b){
        //     System.out.println("Present");
        // }
        // else{
        //     System.out.println("Absent");
        // }


        // find addition of 2 elements is 12
        // int arr[] = {1,2,3,5,7};
        // int target = 12;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i]+arr[j]==target){
        //             System.out.println(arr[i]+" + "+arr[j]+" = "+target);
        //         }
        //     }
        // }

        // nth largest and nth smallest no
        // int arr[] = {1,2,3,4,5,6,7,8,9,67};
        // int k=1;
        // int smallest = arr[k-1];
        // int largest = arr[arr.length-k];
        // System.out.println("smallest: "+smallest+" and largest: "+largest);

        // find repeated nos from array
        // int arr[] = {1,2,1,2,3,4,5,6,5,5,5};
        // unique(arr);
        // removeDuplicates(arr);
        // occur(arr);

        // Coditas Technical Round
        // int arr[] = {1,2,3,4,5,6,7,8,9,67};
        // secondLargest(arr);


    }
}
