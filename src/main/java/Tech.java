public class Tech {
    public static void main(String[] args) {
        int base = 3000;
        int bonus = 1000;

        Worker[] workers = new Worker[3];
        workers[0] = new Worker(1, "wusiyu", 1, "2345");
        workers[1] = new Worker(2, "wuxuguang", 2, "23456");
        workers[2] = new Worker(3, "qinzhizhuo", 3, "234567");

        for (Worker w : workers) {
            System.out.println("需要给" + w.getName() + "发" + (base + bonus * w.getLevel()) + "元");
        }

    }
}
