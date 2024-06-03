package project06;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class pro03_01 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int line = Integer.parseInt(br.readLine());
        int groupWordCount = 0;
        
        for(int i = 0; i < line; i++) {
            String word = br.readLine();
            if (isGroupWord(word)) {
                groupWordCount++;
            }
        }

        bw.write(groupWordCount + "\n");
        bw.flush();
        bw.close();
        br.close();
    }

    public static boolean isGroupWord(String word) {
        boolean[] seen = new boolean[26];
        char prevChar = '\0';

        for (int i = 0; i < word.length(); i++) {
            char currentChar = word.charAt(i);

            if (currentChar != prevChar) {
                if (seen[currentChar - 'a']) {
                    return false;
                }
                seen[currentChar - 'a'] = true;
                prevChar = currentChar;
            }
        }

        return true;
    }
}
