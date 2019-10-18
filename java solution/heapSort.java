import java.util.*;
class Heap_Sort{

    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        Heap_Sort hs = new Heap_Sort();
        int arr[] = new int[1000000];
        int T = sc.nextInt();
        while(T-- >0){
            int n = sc.nextInt();
            for(int i=0;i<n;i++)
                arr[i] = sc.nextInt();
            hs.heapSort(arr,n);
            hs.printArray(arr,n);
        }
    }

    void buildHeap(int arr[], int n){
        for(int i=n/2-1;i>=0;i--)
            heapify(arr,n,i);
    }

    void heapify(int arr[], int n, int i){
        int largest = i; // Initialize largest as root 
        int l = 2*i + 1; // left = 2*i + 1 
        int r = 2*i + 2; // right = 2*i + 2 
    
        // If left child is larger than root 
        if (l < n && arr[l] > arr[largest]) 
            largest = l; 
    
        // If right child is larger than largest so far 
        if (r < n && arr[r] > arr[largest]) 
            largest = r; 
    
        // If largest is not root 
        if (largest != i) { 
            int swap = arr[i]; 
            arr[i] = arr[largest]; 
            arr[largest] = swap; 
    
            // Recursively heapify the affected sub-tree 
            heapify(arr, n, largest); 
        } 
        
    }


    void printArray(int arr[],int n){

        for (int i=0; i<n; ++i)
            System.out.print(arr[i]+" ");
        System.out.println();
    }
    
    public void heapSort(int arr[], int n){
        buildHeap(arr, n);
        for (int i=n-1; i>=0; i--){
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }
}

