package work3;

public class RunnableImpl implements Runnable {

    private int ticket = 1;

    Object obj = new Object();

    @Override
    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket <= 100) {
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("第" + Thread.currentThread().getName() + "售票点卖出第" + ticket + "张票");
                    ticket++;
                }
            }
        }
    }
}
