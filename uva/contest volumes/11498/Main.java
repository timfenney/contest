/*
 * Solution for UVA Problem 11498: Division of Nlogonia
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

        while (true)
        {
            // Read k (or the end of input, 0)
            line = in.readLine();
            int k = Integer.parseInt(line);
            if (k == 0)
            {
                return;
            }

            // Read n and m
            line = in.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            
            // K queries
            for (int query = 0; query < k; ++query)
            {
                // Read x and y
                line = in.readLine();
                st = new StringTokenizer(line);
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());

                // Print result
                if (x < n)
                {
                    if (y < m)
                    {
                        out.println("SO");
                    }
                    else if (y > m)
                    {
                        out.println("NO");
                    }
                    else
                    {
                        out.println("divisa");
                    }
                }
                else if (x > n)
                {
                    if (y < m)
                    {
                        out.println("SE");
                    }
                    else if (y > m)
                    {
                        out.println("NE");
                    }
                    else
                    {
                        out.println("divisa");
                    }
                }
                else
                {
                    out.println("divisa");
                }
            }
        }
    }
}
