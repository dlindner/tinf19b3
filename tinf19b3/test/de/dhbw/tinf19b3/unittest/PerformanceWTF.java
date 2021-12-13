package de.dhbw.tinf19b3.unittest;

import java.util.Arrays;
import java.util.Random;

public class PerformanceWTF {

    public static void main(String[] args)
    {
        // Generate data
        int arraySize = 32768;
        int data[] = new int[arraySize];

        Random rnd = new Random(0);
        for (int c = 0; c < arraySize; ++c)
            data[c] = rnd.nextInt() % 256;

        // Test
        long start = System.nanoTime();
        //Arrays.sort(data);
        long sum = 0;
        for (int i = 0; i < 100_000; ++i)
        {
            for (int c = 0; c < arraySize; ++c)
            {   // Primary loop
                if (data[c] >= 128)
                    sum += data[c];
            }
        }

        System.out.println((System.nanoTime() - start) / 1_000_000_000.0);
        System.out.println("sum = " + sum);
    }
}
