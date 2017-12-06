package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class AOCDay1 {

    private final static String PATH = "C:\\Users\\e882pv\\Desktop\\Day1AOC.txt";


    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader(PATH);
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String currentLine;
        String inputSequence = null;
        int seqLength;
        int sum = 0;
        int midLength;

        try {
            while ((currentLine = bufferedReader.readLine()) != null) {
                inputSequence = currentLine;
            }

            if (inputSequence != null && !(inputSequence.equalsIgnoreCase(""))) {

                seqLength = inputSequence.length();
                midLength = seqLength / 2;

                int counter = 0;

                int[] numbers1 = new int[seqLength];
                int[] numbers2 = new int[seqLength];
                for (int i = 0; i < midLength; i++) {
                    numbers1[i] = Integer.parseInt(Character.toString(inputSequence.charAt(i)));
                    counter++;
                }

                for (int i = 0; i < midLength; i++) {
                    numbers2[i] = Integer.parseInt(Character.toString(inputSequence.charAt(counter)));
                    counter++;
                }


                for (counter = 0; counter < midLength; counter++) {
                    if (numbers1[counter] == numbers2[counter]) {
                        sum += numbers1[counter] + numbers2[counter];
                    } else {
                        sum += 0;
                    }
                }
                System.out.println("Sum is " + sum);
            }
        } catch (IOException ex) {
            System.out.println("Input file not found");
        } finally {
            try {
                bufferedReader.close();
                fileReader.close();
            } catch (IOException ex) {
                System.out.println("Input file cannot be closed/found");
            }
        }
    }
}
