public class Array {
    public static void bublleSort(int n, int a[]){
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
    }

    public int binarySearch(int[] a, int k){
        int left = 0;
        int right = a.length-1;
        while(left<=right){
            int mid = (left+(right-left)/2);
            if(a[mid] == k){
                return k;
            }
            else if(a[mid]<k){
                left = mid +1;
            }
            else{
                right = mid -1;
            }
        }
        return left;
    }
    public static  void printArray(int n, int a[]){
        for(int i=0; i<n; i++){
            System.out.println(a[i]+"");
        }
    }

    public static void main(String[] args) {
        int a[]={2,54,84,96,7,8,15,75};
        int n=a.length;
        bublleSort(n, a);
        System.out.println("Sorted arr: ");
        printArray(n, a);
    }

}
