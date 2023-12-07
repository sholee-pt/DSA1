package s과제1_이승호;

import java.io.*;

public class S과제1_이승호 {

    public static void main(String[] args) {
        System.out.println("===========================================");

        String fname = "c:\\임시\\s과제1_이승호_student.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(fname))) {
            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("===========================================");
    }
}
