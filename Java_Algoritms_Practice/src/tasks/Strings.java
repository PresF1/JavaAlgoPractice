package tasks;

public class Strings {

    public static String reverse(String input) {
        char[] arr = new char[input.length()];

        for (int i = input.length(); i > 0; i--) {
            arr[input.length() - i] = input.charAt(i-1);
        }

        return new String(arr);
    }
}