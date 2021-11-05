public class Solution {
    public String reverseWords(String s) {
        int low = 0;
        int up;
        char[] array = s.toCharArray();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == ' ' || i == array.length - 1) {
                if (array[i] == ' ') {
                    up = i - 1;
                } else {
                    up = i;
                }
                while (low < up) {
                    char temp = array[low];
                    array[low] = array[up];
                    array[up] = temp;
                    low ++;
                    up --;
                }
                low = i + 1;
            }
        }
        return String.valueOf(array);
    }
}
