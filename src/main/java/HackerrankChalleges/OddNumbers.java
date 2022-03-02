package HackerrankChalleges;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.joining;

public class OddNumbers {
    public static List<Integer> oddNumbers(int l, int r) {
        // Write your code here
        List<Integer> output = new ArrayList<Integer>();
        if(l%2 == 0)
        {
            l = l + 1;
        }
        while(l <= r)
        {
            output.add(l);
            l = l + 2;
        }
        return output;
    }
}
 class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int l = Integer.parseInt(bufferedReader.readLine().trim());

        int r = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> result = OddNumbers.oddNumbers(l, r);

        bufferedWriter.write(
                result.stream()
                        .map(Object::toString)
                        .collect(joining("\n"))
                        + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
