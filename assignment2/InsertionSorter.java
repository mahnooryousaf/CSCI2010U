/**
 * This class is a subclass of Sorter therefore it extends all methods of Sorter
 * this class implements the Insertion Sort algorithm
 */

package sorting;

public class InsertionSorter extends Sorter{
    @Override
    public void sort(double[] list) {
       insert(list,list.length-1);
    }
    
    void insert(double list1[], int n) {
        int i,j;  // initialize the pointer to point the index of the array
        double key;// intialize the key to find in the array 
        for (i = 1; i < n; i++)  // run the loop until the length of the array 
        {  
            key = list1[i];   //store the value of the specific index in the key 
            j = i - 1;   // we are starting from 0 
       
            while (j >= 0 && list1[j] > key)  // this loop will run until j>=0 and the value of the array index is greater than the key 
            {  
                list1[j + 1] = list1[j];  //swap the elment of the array
                j = j - 1;   //decrementing 
            }  
            list1[j + 1] = key;  //set the value key  in the array 
            this.countOp(); // this will count the number of the operation 
        }
    }
}
