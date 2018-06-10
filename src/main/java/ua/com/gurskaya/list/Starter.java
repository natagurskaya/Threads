package ua.com.gurskaya.list;


public class Starter {

    public static void main(String[] args) {
        ListReader listReader = new ListReader();
        ListWriter listWriter = new ListWriter(listReader.getList());

        Thread threadReader = new Thread(listReader);
        Thread threadWriter = new Thread(listWriter);

        threadReader.start();
        threadWriter.start();
    }
}
