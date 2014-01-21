/*
 * Solution for UVA Problem 11727: Cost Cutting
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
        int[] salaries = new int[3];

        // Do each case at a time
        for (int aCase = 1; aCase <= t; ++aCase)
        {
            // Read 3 salaries: a, b, c
            line = in.readLine();
            StringTokenizer st = new StringTokenizer(line);
            for (int i = 0; i < 3; ++i) {
                salaries[i] = Integer.parseInt(st.nextToken());
            }

            // Result is middle value
            // Fastest is probably some nested conditional
            // but it is so ugly and hard to debug
            // we will take the 2nd element of the sorted array
            Arrays.sort(salaries);
            out.println("Case " + aCase + ": " + salaries[1]);
        }
    }
}
