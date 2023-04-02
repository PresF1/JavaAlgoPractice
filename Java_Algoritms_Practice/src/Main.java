import tasks.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {

        String input, output;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Type your string here: ");
        input = reader.readLine();

        output = Strings.reverse(input);

        System.out.println("Here is your reversed string: ");
        System.out.println(output);
    }
}