// How it works:
// - Divide given array into 2 PARTS i.e. sorted and unsorted (in the SAME array)
// - Then, from unsorted array we pick the 1st element and find its correct
// position in sorted array
// - Repeat till unsorted array is not empty

class InsertionSort {

    private int arr[];

    public InsertionSort(int arr[]) {
        this.arr = arr;
    }

    public void insertionSort() {
        for (int i = 1; i < this.arr.length; i++) {
            int tmp = this.arr[i], j = i;

            while (j > 0 && this.arr[j - 1] > tmp) {
                this.arr[j] = this.arr[j - 1];
                j--;
            }
            this.arr[j] = tmp;
        }
    }

    public void printArray() {
        for (int i = 0; i < this.a.length; i++) {
            System.out.println(this.a[i]);
        }
    }

    public static void main(String args[]) {

    }
}