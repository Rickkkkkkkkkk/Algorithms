package chap2;

import edu.princeton.cs.algs4.StdRandom;
import edu.princeton.cs.algs4.Stopwatch;

public class SortCompare {
    public static double time(String alg, Comparable[] a) {
        Stopwatch stopwatch = new Stopwatch();
        switch (alg) {
            case "selection" :
                SelectionSort.sort(a);
                if (!SelectionSort.isSorted(a)) {
                    System.out.println("selection");
                    SelectionSort.show(a);
                }
                break;
            case "insertion" :
                InsertionSort.sort(a);
                if (!InsertionSort.isSorted(a)) {
                    System.out.println("insertion");
                    InsertionSort.show(a);
                }
                break;
            case "shell" :
                ShellSort.sort(a);
                if (!ShellSort.isSorted(a)) {
                    System.out.println("shell");
                    ShellSort.show(a);
                }
                break;
            case "insertionX" :
                InsertionXSort.sort(a);
                if (!InsertionXSort.isSorted(a)) {
                    System.out.println("insertionX");
                    InsertionXSort.show(a);
                }
                break;
            case "topDownMergeSort" :
                TopDownMergeSort.sort(a);
                if (!TopDownMergeSort.isSorted(a)) {
                    System.out.println("topDownMergeSort");
                    TopDownMergeSort.show(a);
                }
                break;
            case "downTopMergeSort" :
                DownTopMergeSort.sort(a);
                if (!DownTopMergeSort.isSorted(a)) {
                    System.out.println("downTopMergeSort");
                    DownTopMergeSort.show(a);
                }
                break;
            default :
                throw new RuntimeException("Please enter the correct alg");
        }
        return stopwatch.elapsedTime();
    }

    public static double timeRandomInput(String alg, int N, int T) {
        double total = 0.0;
        Double[] a = new Double[N];
        for (int t = 0; t < T; t++) {
            for (int i = 0; i < N; i++) a[i] = StdRandom.uniform();
            total += time(alg, a);

        }
        return total;
    }

    public static void main(String[] args) {
        int N = 1000000;
        int T = 1;
//        double selection
////
////        System.out.println("insertion / selection :" + (selection / insertion));
////        System.out.println("shell / insertion :" + (insertion / shell)); = timeRandomInput("selection", N, T);
//        double insertion = timeRandomInput("insertion", N, T);
        double shell = timeRandomInput("shell", N, T);
//        double insertionX = timeRandomInput("insertionX", N, T);
        double topDownMerge = timeRandomInput("topDownMergeSort", N, T);
        double downTopMergeSort = timeRandomInput("downTopMergeSort", N, T);

//        System.out.println("selection cost: " + selection);
//        System.out.println("insertion cost: " + insertion);
        System.out.println("shell cost: " + shell);
        System.out.println("topDownMe" +
                "                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                     rge cost: " + topDownMerge);
        System.out.println("downTopMergeSort cost: " + downTopMergeSort);
//        System.out.println("insertionX cost: " + insertionX);

        System.out.println("topDownMerge / shell :" + (shell / topDownMerge));
        System.out.println("downTopMergeSort / shell :" + (shell / downTopMergeSort));
    }
}
