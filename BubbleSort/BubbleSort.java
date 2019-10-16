//How it works:
// Swap side by side until all are sorted

// When to use:
// - When input is already sorted
// - Space is a concern
// - Easy to implement

//When not to use:
//- Average case time complexity is poor

//Time Complexity = O(n) * O(n) = O(n^2)
//Space Complexity = O(1)

class BubbleSort {

    private int arr[];

    public BubbleSort(int arr[]) {
        this.arr = arr;
    }

    void bubbleSort() {
        int n = this.arr.length; // O(1)

        for (int i = 0; i < n - 1; i++) // run from firsrt cell to last second cell //O(n)
        {
            for (int j = 0; j < n - i - 1; j++) { // O(n)
                if (this.arr[j] > this.arr[j + 1]) { // O(1)
                    int temp = this.arr[j]; // O(1)
                    this.arr[j] = this.arr[j + 1];
                    this.arr[j + 1] = temp;
                }
            }
        }
    }

    void printArray() {
        int n = this.arr.length;

        for (int i = 0; i < n; ++i) {
            System.out.println(this.arr[i] + "");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 100, 99, 88, 77, 56, 11 };

        BubbleSort bs = new BubbleSort(arr);

        bs.bubbleSort();

        bs.printArray();
    }
}
