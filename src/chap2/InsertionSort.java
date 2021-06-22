package chap2;

public class InsertionSort extends Sort {

    public static void sort(Comparable[] a) {
        for (int i = 1; i < a.length; i++) {
//            for (int j = i; j > 0 && less(a[j], a[j - 1]); j--) exch(a, j, j - 1);
            Comparable t = a[i];
            int j = i;
            for (; j > 0 && less(t, a[j - 1]); j--) {
                a[j] = a[j - 1];
            }
            a[j] =t;
        }
    }

    public static void sort(Comparable[] a, int lo, int hi) {
        for (int i = lo + 1; i <= hi; i++) {
            Comparable tmp = a[i];
            int j = i;
            for (; j > lo && less(tmp, a[j - 1]); j--) {
                a[j] = a[j - 1];
            }
            a[j] = tmp;
        }
    }
}
