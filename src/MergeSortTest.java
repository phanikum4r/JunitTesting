
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
class MergeSortTest {
    @Test
    @DisplayName("Test Case-1")
    void sortTest1() {
        int []arr = {85,9,31,67,30,8,75,-76,15,-98,87};
        int l=0;
        int r=arr.length-1;
        MergeSort ob = new MergeSort();
        ob.sort(arr,l,r);

        // Test the sorted result
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                fail("Sort Unsuccessful");
            }
        }
    }


    @Test
    @DisplayName("Test Case-2")
    void sortTest2() {
        int []arr = {75,-10,12,90,-2,0,11,19};
        int l=0;
        int r=arr.length-1;
        MergeSort ob = new MergeSort();
        ob.sort(arr,l,r);

        // Test the sorted result
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                fail("Sort Unsuccessful");
            }
        }
    }

    @Test
    @DisplayName("Test Case-3")
    void sortTest3() {
        int []arr = {1,4,3,12,8,6,99,26};
        int l=0;
        int r=arr.length-1;
        MergeSort ob = new MergeSort();
        ob.sort(arr,l,r);

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                fail("Sort Unsuccessful");
            }
        }
    }

    @Test
    @DisplayName("Test Case-4")
    void sortTest4() {
        int []arr = {5,40,17,11,7,2,-210,225};
        int l=0;
        int r=arr.length-1;
        MergeSort ob = new MergeSort();
        ob.sort(arr,l,r);

        // Test the sorted result
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                fail("Sort Unsuccessful");
            }
        }
    }

    @Test
    @DisplayName("Test Case-5")
    void sortTest5() {
        int []arr = {0,-15,21,80,9,27,123,36,99};
        int l=0;
        int r=arr.length-1;
        MergeSort ob = new MergeSort();
        ob.sort(arr,l,r);

        // Test the sorted result
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                fail("Sort Unsuccessful");
            }
        }
    }


}