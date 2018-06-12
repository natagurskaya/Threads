package ua.com.gurskaya.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ListReader implements Runnable{
    private List<String> list = Collections.synchronizedList(new ArrayList<String>());

    public List<String> getList() {
        return list;
    }

    public void run() {
        Scanner in = new Scanner(System.in);
        while (true) {
            System.out.println("Enter element: ");
            list.add(in.nextLine());
        }
    }
}