/*
 * Solution for UVA Problem 12403: Save Setu
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
        // Read the number of operations t
        String line;
        line = in.readLine();
        StringTokenizer st = new StringTokenizer(line);
        int t = Integer.parseInt(st.nextToken());

        // Set up the balance
        int balance = 0;

        // Run through the operations
        for (int op = 0; op < t; ++op)
        {

            // Read in the operation
            line = in.readLine();
            st = new StringTokenizer(line);

            // Consume a Token and check for more
            st.nextToken();
            if (st.hasMoreTokens())
            {
                // This is a donate operation, read the amount and update
                int amount = Integer.parseInt(st.nextToken());
                balance += amount;
            }
            else
            {
                // This is a report operation, print the balance
                out.println(balance);
            }
        }
   }
}
