/*
* The following program list the order of category Name ascending.It outputs
* the unsorted array list, and then the Sorted array list via comparator method
* through java built in sort operations. It has an output explanation of why
* java built in sort is more apropriate than buble or quick sort.
*/
package javasort;

import static java.util.Arrays.sort;

/**
 * @Date 11/07/2019.
 * @author Jeff/Antony Jones 92019124.
 */
public class JavaSort {

    /* Prints the array */
    void printArray(CatalogueItem arr[])
    {
        long startTime = System.nanoTime();
        int n = arr.length;
        for (int i=0; i<n; ++i)
            System.out.print(
                    "id: " + arr[i].getItemId() + " "
                    + "name: " + arr[i].getItemName() + " "
                    + "category: " + arr[i].getCategory() + "\n");
        long endTime = System.nanoTime();
        System.out.println();
        System.out.println();
        System.out.println("Time taken for execution was: " + (endTime - startTime) + " (NanoSeconds)\n");
    }
    
    // Driver method to test above
    public static void main(String args[])
    {
        JavaSort ob = new JavaSort();
        //Catalogue array set new Catelogue Items.
        CatalogueItem arr[] = {
            new CatalogueItem( 3, "Life of Pi","Books"),
            new CatalogueItem( 7, "Deelongie 4 way toaster","Home and Kitchen"),
            new CatalogueItem( 2, "Glorbarl knife set","Home and Kitchen"),
            new CatalogueItem( 4, "Diesorn vacuum cleaner","Appliances"),
            new CatalogueItem( 5, "Jennie Olivier sauce pan","Home and Kitchen"),
            new CatalogueItem( 6, "This book will save your life","Books"),
            new CatalogueItem( 9, "Kemwould hand mixer","Appliances"),
            new CatalogueItem( 1, "Java for Dummies","Books"),
        };
        
        //unsorted array print out ob array via the Method printArray
        System.out.println("The Unsorted array is\n");
        ob.printArray(arr);
        
         //apply java built in sort(arr); to sort the array by name acsending
        sort(arr);
        System.out.println("The array sorted by category using Java built in sort is\n");
        ob.printArray(arr);
        //explanation on bubble sort vs java built in sort.
        System.out.println("Which algoritim is more efficient - Java built in Sort \n"
                + "or Bubble Sort?\n\nReal world scenarios more often require sorting \n"
                + "for complex objects, Such as people and places. As an example: \n"
                + "we may need to a list of customers by id numbers and only print \n"
                + "out to the user thier names bubble sort algoritim is a good\n"
                + "alternative for this purpose.\nHowever - The basic bubble \n"
                + "sort is a non adaptive algorithm. meaning it traverses every \n"
                + "array pair for each pass. As we don't need to parse array elements\n"
                + "that have already been sorted bubble Sort and Quick Sort are used\n"
                + "for primitave arrays as they are slightly more efficient however when objects\n"
                + "which are deemed equal according to their equalsimplementation or the\n"
                + "provided Comparator change their order. Therefore, Quicksort or\n"
                + "bubble sort is not an option. So a variant of MergeSort is used,\n"
                + "a java built in sort - the current Java versions use TimSort. This\n"
                + "this applies to both Arrays.sort and Collections.sort. Java built in\n"
                + "Sort may perform better and the code is more easily read.");
    }//End of Main.
}//End of JavaSort class.