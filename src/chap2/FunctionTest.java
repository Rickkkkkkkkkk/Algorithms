package chap2;

import edu.princeton.cs.algs4.StdRandom;

public class FunctionTest {

    public static void main(String[] args) {
        int N = 1000;
        Double[] a = new Double[N];
        for (int  i = 0; i < N; i++) {
            a[i] = StdRandom.uniform();
        }

//        TopDownMergeSort.sort(a);
//        System.out.println(TopDownMergeSort.isSorted(a));

        DownTopMergeSort.sort(a);
        System.out.println(DownTopMergeSort.isSorted(a));
    }
}
