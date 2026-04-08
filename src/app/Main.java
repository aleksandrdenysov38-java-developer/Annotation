package app;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 5, 3, 9, 2};


        System.out.println("Sum: " + ArrayUtils.sumArray(arr));
        System.out.println("Max: " + ArrayUtils.findMax(arr));

        System.out.println("\n--- Information about methods ---");

        Method[] methods = ArrayUtils.class.getDeclaredMethods();

        for (Method method : methods) {

            if (method.isAnnotationPresent(MethodInfo.class)) {
                MethodInfo info = method.getAnnotation(MethodInfo.class);

                System.out.println("Name: " + info.name());
                System.out.println("Type: " + info.returnType());
                System.out.println("Description: " + info.description());
            }

            if (method.isAnnotationPresent(Author.class)) {
                Author author = method.getAnnotation(Author.class);

                System.out.println("Author: " +
                        author.firstName() + " " + author.lastName());
            }

            System.out.println("------------------");
        }
    }
}
