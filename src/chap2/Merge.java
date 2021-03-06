package chap2;

public class Merge extends Sort {

    protected static void merge(Comparable[] a, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

//        for (int k = lo; k <= hi; k++) {
//            aux[k] = a[k];
//        }

        System.arraycopy(a, lo, aux, lo, hi - lo + 1);

        for (int k = lo; k <= hi; k++) {
            if (i > mid) a[k] = aux[j++];
            else if (j > hi) a[k] = aux[i++];
            else if (less(aux[j], aux[i])) a[k]  = aux[j++];
            else a[k] = aux[i++];
        }
    }
}
