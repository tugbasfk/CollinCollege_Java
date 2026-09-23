package week5_Arrays;

public class Occurrence {
    public static int occurrence(int[] value, int lookFor) {
        int occurrence = 0;
        for (int i = 0; i < value.length; i++) {
            if (value[i] == lookFor) {
                occurrence++;
            }
        }
        return occurrence;
    }
}


