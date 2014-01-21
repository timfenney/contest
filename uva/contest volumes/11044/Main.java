/*
 * Solution for UVA Problem 11044: Searching for Nessy
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

        line = in.readLine();
        int t = Integer.parseInt(line);
        
        // Read case input
        for (int i = 0; i < t; ++i)
        {
            line = in.readLine();
            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());
            int m = Integer.parseInt(st.nextToken());
            int sonars = (n / 3) * (m / 3);
            out.println(sonars);
        }
    }
}
