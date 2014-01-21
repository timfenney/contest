/*
 * Solution for UVA Problem 272: TEX Quotes
 *
 * by Tim Fenney
 *
 */


import java.io.*;
import java.util.*;

public class Main
{
    static final int EVEN = 0;
    static final int ODD = 1;

    public static void main(String[] args) throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        runSolution(in, out);

        out.close();
    }

    public static void runSolution(BufferedReader in, PrintWriter out) throws IOException
    {
        int state = EVEN;

        int check = in.read();
        while(check != -1) {
            char ch = (char) check;

            if (ch != '"') {
                // print the characters other than "
                out.print(ch);
            }
            else if (state == EVEN) {
                // when an even number of "s have been seen, output ``
                out.print("``");

                // update the state
                state = ODD;
            }
            else {
                // when an odd number of "s have been seen, output ''
                out.print("''");

                // update the state
                state = EVEN;
            }

            check = in.read();
        }
    }
}
