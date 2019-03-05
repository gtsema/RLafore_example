package main;

public class BubbleSort {

    public BubbleSort(int max) {
        a = new long[max];
        nElems = 0;
    }

    public void insert(long value) {
        a[nElems++] = value;
    }

    public void display() {
        for(int i = 0; i < nElems; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void bubbleSort() {
        int out, in;
        for(out = nElems - 1; out > 1; out--) {
            for(in = 0;in < out; in++) {
                if(a[in] > a[in + 1]) swap(in, in + 1);
            }
        }
    }

    private void swap(int one, int two) {
        long temp = a[one];
        a[one] = a[two];
        a[two] = temp;
    }

    private long[] a;
    private int nElems;

    public static void main(String[] args) {
        BubbleSort bs = new BubbleSort(10);

        bs.insert(0);
        bs.insert(9);
        bs.insert(1);
        bs.insert(8);
        bs.insert(2);
        bs.insert(7);
        bs.insert(3);
        bs.insert(6);
        bs.insert(4);
        bs.insert(5);

        bs.display();

        bs.bubbleSort();

        bs.display();
    }
}
