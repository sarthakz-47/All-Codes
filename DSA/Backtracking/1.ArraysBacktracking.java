package DSA.Backtracking;

class backtrackingOnArrays{
    
    public static void backtrack(int arr[],int i,int val){
        // Base Class:
        if(i==arr.length){
            printarr(arr);
            return;
        }
        
        // Recursive Function:
        arr[i] = val;
        backtrack(arr,i+1,val+1);

        // Backtracking update:
        arr[i] = arr[i] - 2;
    }
    
    public static void printarr(int arr[]){
        for(int nums: arr){
	        System.out.print(nums+" ");
	    }
	    System.out.println();
    }
    
	public static void main(String[] args){
	    int arr[] = new int [5];
	    backtrack(arr,0,1);
	    for(int nums: arr){
	        System.out.print(nums+" ");
	    }
	}
}