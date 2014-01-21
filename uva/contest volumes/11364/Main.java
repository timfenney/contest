/*
 * Solution for UVA Problem 11374: Optimal Parking
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
        // Read the number of test cases t
        String line;
        line = in.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        // Run through the test cases
        for (int aCase = 0; aCase < t; ++aCase)
        {

            // Read the number of stores n
            line = in.readLine();
            st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            // Read the store locations, look for the min and max
            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;
            line = in.readLine();
            st = new StringTokenizer(line);
            for (int i = 0; i < n; ++i)
            {
                // Read each location x
                int x = Integer.parseInt(st.nextToken());

                // Update min and max
                if (x < min)
                {
                    min = x;
                }
                if (x > max)
                {
                    max = x;
                }
            }

            // Calculate and print total distance
            int distance = (max - min) * 2;
            out.println(distance);
        }
    }
}
