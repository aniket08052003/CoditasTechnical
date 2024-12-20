public class l2 {
    public static void main(String[] args) {
        // int arr[] = {5,4,3,2,1};
        // int count=0;
        // for(int i=0;i<arr.length;i++){
        //     for(int j=i+1;j<arr.length;j++){
        //         if(arr[i] > arr[j]){
        //             count++;
        //         }
        //     }
        //     System.out.println(count);
        // }

        int n = 39;
        int num =n;
        int remainder;
        int mul=1;
        for(int i=0;i<=n;i++){
            mul *= i;
        }
        System.out.println(mul);
    }
}
