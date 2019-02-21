package main;

public class Array {
    private long[] a;
    private int nElems;

    public Array(int max) {
        a = new long[max];
        nElems = 0;
    }

    public boolean find(long searchKey) {
        int j;
        for(j = 0; j < nElems; j++)
            if(a[j] == searchKey)
                break;
        if(j == nElems)
            return false;
        else
            return true;
    }

    public void insert(long value) {
        a[nElems++] = value;
    }

    public boolean delete(long value) {
        int j;
        for(j = 0; j < nElems; j++)
            if(value == a[j])
                break;

        if(j == nElems)
            return false;
        else {
            for(int k = j; k < nElems; k++)
                a[k] = a[k + 1];
            nElems--;
            return true;
        }
    }

    public void diplay() {
        for(int i = 0; i < nElems; i++)
            System.out.print(a[i] + " ");
        System.out.println("");
    }

    public static void main(String[] args) {
        int maxSize = 100;
        Array arr = new Array(maxSize);

        arr.insert(77);
        arr.insert(99);
        arr.insert(44);
        arr.insert(55);
        arr.insert(22);
        arr.insert(88);
        arr.insert(11);
        arr.insert(00);
        arr.insert(66);
        arr.insert(33);

        arr.diplay();

        int searchKey = 35;
        if(arr.find(searchKey))
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

        arr.delete(00);
        arr.delete(55);
        arr.delete(99);

        arr.diplay();
    }
}
