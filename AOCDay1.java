package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AOCDay1 {

    public final static String PATH = "C:\\Users\\e882pv\\Desktop\\Day1AOC.txt";


    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String currentLine;
        String inputSequence = null;
        int seqLength = 0;
        int sum = 0;
        int midLength = 0;

        try {
            while ((currentLine = bufferedReader.readLine()) != null) {
                inputSequence = currentLine;
            }

            seqLength = inputSequence.length();
            midLength = seqLength / 2;
            System.out.println("Length is " + seqLength);
            System.out.println("Length is " + midLength);

            int counter = 0;

            int[] numbers1 = new int[seqLength];
            int[] numbers2 = new int[seqLength];
            for (int i = 0; i < midLength; i++) {
                numbers1[i] = Integer.parseInt(Character.toString(inputSequence.charAt(i)));
                counter++;
                //System.out.println("Digit @ position " + (i + 1) + " is " + numbers[i]);
            }
            System.out.println("counter is " + counter);

            for (int i = 0; i < midLength; i++) {
                numbers2[i] = Integer.parseInt(Character.toString(inputSequence.charAt(counter)));
                counter++;
                //System.out.println("Digit @ position " + (i + 1) + " is " + numbers[i]);
            }
            System.out.println("counter is " + counter);

            counter = 0;


            for (counter = 0; counter < midLength; counter++) {
                if (numbers1[counter] == numbers2[counter]) {
                    sum += numbers1[counter] + numbers2[counter];
                } else {
                    sum += 0;
                }
            }
            System.out.println("Sum is " + sum);

        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (bufferedReader != null)
                    bufferedReader.close();

                if (fileReader != null)
                    fileReader.close();

            } catch (IOException ex) {

                ex.printStackTrace();

            }
        }


    }
}
