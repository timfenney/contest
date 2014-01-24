/*
 * Solution for UVA Problem 12577: Hajj-e-Akbar
 *
 * by Tim Fenney
 *
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
        int aCase = 1;
        String hajjType = "";
        while(true)
        {
            String line = in.readLine();
            if (line.charAt(0) == '*')
            {
                return;
            }
            else if (line.length() == 4)
            {
                hajjType = "Akbar";
            }
            else
            {
                hajjType = "Asghar";
            }

            // Print output
            out.println("Case " + aCase + ": Hajj-e-" + hajjType);
            aCase++;
        }
    }
}
