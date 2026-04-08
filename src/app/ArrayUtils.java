package app;

public class ArrayUtils {

    @MethodInfo(
            name = "sumArray",
            returnType = "int",
            description = "Count sum of array's elements"
    )
    @Author(firstName = "Theodor", lastName = "Draiser")
    public static int sumArray(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum;
    }

    @MethodInfo(
            name = "findMax",
            returnType = "int",
            description = "Find element with maximum value "
    )
    @Author(firstName = "John", lastName = "Miller")
    public static int findMax(int[] array) {
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}
