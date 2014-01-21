/*
 * Solution for UVA Problem 11547: Automatic Answer
 *
 * by Tim Fenney
 */


import java.io.*;
import java.util.*;

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        String line;

        // Read t
        line = in.readLine();
        int t = Integer.parseInt(line);

        // Do each case at a time
        for (int aCase = 0; aCase < t; ++aCase)
        {
            // Read n
            line = in.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int result = n;

            // * 567, / 9
            result *= 63;

            // + 7492
            result += 7492;

            // * 235, / 47
            result *= 5;

            // - 498
            result -= 498;

            // tens column
            result = Math.abs(result);
            result %= 100;
            result -= (result % 10);
            result /= 10;
            
            // Print result
            out.println(result);
        }
    }
}
