package ua.com.gurskaya.list;

import java.io.*;
import java.util.List;

public class ListWriter implements Runnable {

    private static final String PATH_TO_FILE = "src/main/resources/list.txt";

    private List<String> list;

    public ListWriter(List list) {
        this.list = list;
    }

    public void run() {
        File file = new File(PATH_TO_FILE);
        while (true) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                Thread.sleep(15000);
                for (String element : list) {
                    bufferedWriter.write(element);
                    bufferedWriter.newLine();
                }
                list.clear();
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread is interrupted", e);
            } catch (IOException e) {
                throw new RuntimeException("Couldn't write into file", e);
            }
        }
    }
}