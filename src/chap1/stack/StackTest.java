package chap1.stack;

import java.util.Objects;

public class StackTest {

    public static void main(String[] args) {
        Stack<String> stackArray = new StackArray<>();
        Stack<String> stackLink = new StackLink<>();

        test(stackArray);
        test(stackLink);
    }

    private static void test(Stack stack) {
        System.out.println(stack.isEmpty());

        stack.push("zzb1");
        System.out.println(stack.isEmpty());
        stack.push("zzb2");
        stack.push("zzb3");
        stack.push("zzb4");
        stack.push("zzb5");
        stack.push("zzb6");
        stack.push("zzb7");
        stack.push("zzb8");
        stack.push("zzb9");
        stack.push("zzb10");
        stack.push("zzb11");


        stack.forEach(System.out::println);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();

        System.out.println(stack.isEmpty());


        stack.forEach(System.out::println);
    }
}
