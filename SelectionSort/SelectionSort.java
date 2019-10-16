// How it works:
// - Find/Select the minimum of maximum element in an unsorted array and then
// putting it in its correct position in a sorted array (in the SAME array)
// Basically SELECT & SWAP

//Time Complexity: O(n) * O(n) = O(n^2)
//Space Compelxity: O(1)

//When to use:
// - When we don't have addtional memory,
// - Want easy implementation
//When not to use:
//- When time complexity is a concern

class SelectionSort {

    private int a[];

    public SelectionSort(int arr[]) {
        this.a = arr;
    }

    void selectionSort() {
        for (int j = 0; j < this.a.length; j++) { // O(n)
            int minimumIndex = j;

            // Find/Select out the smallest element
            for (int i = j + 1; i < this.a.length; i++) { // O(n)
                if (this.a[i] < this.a[minimumIndex]) {
                    minimumIndex = i;
                }
            }

            // As long as the index of the smallest element is not the current index,
            // perform swapping, if the index of the smallest element is the same as current
            // element, then no need to swap
            if (minimumIndex != j) {
                int temp = this.a[j];
                this.a[j] = this.a[minimumIndex];
                this.a[minimumIndex] = temp;
            }
        }
    }

    public void printArray() {
        for (int i = 0; i < this.a.length; i++) {
            System.out.println(this.a[i]);
        }
    }

    public static void main(String args[]) {
        int arr[] = { 100, 99, 88, 77, 56, 11 };

        SelectionSort ss = new SelectionSort(arr);

        ss.selectionSort();

        ss.printArray();
    }
}
