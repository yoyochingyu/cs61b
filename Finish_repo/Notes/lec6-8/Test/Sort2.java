/**
 * Philosophy :
 * 1. Small pieces
 * 2. Test -> Code
 * */
public class Sort2{
    /** Sort things destructively! */
    public static int count = 0;
    public static void sort(int[] input) {
        if (count < input.length) {
            int small = input[count];
            int temp = 0;
            int index = 0;
            //Find the smallest
            for (int i = count; i < input.length; i++) {
                if (input[i] <= small) {
                    small = input[i];
                    index = i;
                }

            }
            //Move it to the front
            temp = input[count];
            input[count] = small;
            input[index] = temp;
            count++;
            sort(input);

            //Selection sort the rest(recursive)

        }
    }
}