/**
 * The MergeSorter class is a subclass of Sorter and it uses the Merge Sort 
 * The merge sort function uses the divide and conquer method to sort an array.
 */

package sorting;
public class MergeSorter extends Sorter {

     void merge(double[] list, int left, int mid, int right) //this funcation is designed to merge the array after division
    {
        // Find sizes of two subarrays to be merged

        int x1 = mid - left + 1;  //Size of the first sub array
        int x2 = right - mid; //size of the second sub array
 

        // Creating temp arrays for left and right side 
        double L[] = new double[x1];  //left array
        double R[] = new double[x2];    //right array
 
        for (int i = 0; i < x1; ++i){

            L[i] = list[left + i];         //Copy data to temp arrays
        }
        for (int j = 0; j < x2; ++j){

            R[j] = list[mid + 1 + j];
        }
        //Merge the temp arrays of left and right sides
 
        // Initializing indexes of first and second subarrays

        int i = 0, j = 0;
 

        // Initial index of merged subarry
        int k = left;

        while (i < x1 && j < x2) {
            if (L[i] <= R[j]) {
                this.countOp();   //counting the operations.
                
                list[k] = L[i];   //copying left devided array
                i++;
            }

            else {
                this.countOp();   //counting the operations. 
                
                list[k] = R[j];   //copying right divided array
                j++;
            }
            k++;
        }

        while (i < x1) {
            this.countOp();  //counting the operations
            
            list[k] = L[i];         // Copy remaining elements of L[] in case they are 
            i++;
            k++;

        }
 
        while (j < x2) {
            this.countOp();  //counting the operations
            
            list[k] = R[j]; //Copy remaining elements of R[] in case they are 
            j++;
            k++;
        }

    }
 
    
   public void Msort(double[] list,int left ,int right) {
        if (left < right) {
            int mid = (left + right) / 2;     // Find the middle point of the array
            
            Msort(list, left, mid); // Sort first halve of the array
        
            Msort(list, mid + 1, right); // Sort second halve of the array

            merge(list, left, mid, right);   // Merge the sorted halves together
        }
    }
    
    public void sort(double[] list) {
       Msort(list,0,list.length-1);     //indirect recursion. 
    }
     
}
