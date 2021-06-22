package chap2;

public class DownTopMergeSort extends Merge {

    public static void sort(Comparable[] a) {
        Comparable[] aux = new Comparable[a.length];

        for (int sz = 1; sz < a.length; sz = sz + sz) {
            for (int lo = 0; lo < a.length - sz; lo += sz + sz) {
//                if (sz + sz <= 16) {
//                    InsertionSort.sort(a, lo, Math.min(lo + sz + sz -1, a.length - 1));
//                    continue;
//                }

                merge(a, aux, lo, lo + sz - 1, Math.min(lo + sz + sz -1, a.length - 1));
            }
        }
    }
}
