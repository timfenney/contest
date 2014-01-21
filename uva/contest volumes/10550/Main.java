/*
 * Solution for UVA Problem 10550: Combination Lock
 *
 * by Tim Fenney
 *
 */

import java.io.*;
import java.util.*;

public class Main {

    public static final int ITEMS = 4;
    public static final int DEG40_TO_DEGREES = 9;
    public static final int DEG40 = 40;

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        boolean unfinished = true;

        while (unfinished)
        {
            String line = in.readLine();
            unfinished = solveLine(line, out);
        }
    }

    public static boolean solveLine(String line, PrintWriter out) throws IOException
    {
        StringTokenizer st = new StringTokenizer(line);
        int[] turns = new int[ITEMS];
        boolean unfinished = false;
        for (int i = 0; i < ITEMS; ++i)
        {
            String token = st.nextToken();
            turns[i] = Integer.parseInt(token);
            if (turns[i] != 0)
            {
                unfinished = true;
            }
        }
        
        // Check for all zero input line (end of cases)
        if (!unfinished)
        {
            return unfinished;
        }

        int deg40 = calcDeg40(turns);
        int degrees = deg40 * 9;
        out.println(degrees);

        return unfinished;
    }

    public static int calcDeg40(int[] turns)
    {
        int deg40 = 

            // 2 + 1 complete turns
            DEG40 * 3 
            
            // CW from turns[0] to turns[1]
            + (turns[0] >= turns[1]
                    ? turns[0] - turns[1]
                    : turns[0] + DEG40 - turns[1])

            // CCW from turns[1] to turns[2]
            + (turns[1] >= turns[2]
                    ? DEG40 - turns[1] + turns[2]
                    : turns[2] - turns[1])

            // CW from turns[2] to turns[3]
            + (turns[2] >= turns[3]
                    ? turns[2] - turns[3]
                    : turns[2] + DEG40 - turns[3]);

        return deg40;
    }
}
