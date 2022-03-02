package HackerrankChalleges;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Stream;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here
        HashSet<Integer> set = new HashSet<Integer>(); // create hashset to remove duplicates
        int c = 0; // declare count
        for(int i = 0; i < n; i++){
            int element = ar.get(i); // declare element to get and remove
            if(set.contains(element)){
                set.remove(element); // if set is found remove the element
                c++; // increment the count
            }
            else {
                set.add(element); // else add the element
            }
        }
        return c;

    }

}

public class SalesbyMatch {public static void main(String[] args) throws IOException {
    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int n = Integer.parseInt(bufferedReader.readLine().trim());

    List<Integer> ar = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

    int result = Result.sockMerchant(n, ar);

    bufferedWriter.write(String.valueOf(result));
    bufferedWriter.newLine();

    bufferedReader.close();
    bufferedWriter.close();
}
}

