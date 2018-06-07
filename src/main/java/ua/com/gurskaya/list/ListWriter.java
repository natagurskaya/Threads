package ua.com.gurskaya.list;

import java.io.*;
import java.util.List;

public class ListWriter implements Runnable {

    private ListReader listReader;

    public ListWriter(ListReader listReader) {
        this.listReader = listReader;
    }

    public void run() {
        File file = new File("src/main/resources/list.txt");
        while(true) {
            try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file, true))) {
                Thread.sleep(15000);
                for (int i = 0; i < listReader.getList().size(); i++) {
                    bufferedWriter.write(String.valueOf(listReader.getList().get(i)));
                    bufferedWriter.newLine();
                    bufferedWriter.flush();
                }
                listReader.getList().clear();
            } catch (InterruptedException e) {
                throw new RuntimeException("Thread is interrupted", e);
            } catch (IOException e) {
                throw new RuntimeException("Couldn't write into file", e);
            }
        }
    }
}
