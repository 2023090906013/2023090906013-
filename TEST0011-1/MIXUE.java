import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class MIXUE extends Thread implements Producer {

    static int count1 = 0;

    @Override
    public void produce() {
        System.out.println("雪王正在制作柠檬水...");
    }

    @Override
    public void run() {

            while (++count1 <= 11) {
                if (count1 <= 10) {
                    Production.LemonWater++;
                    produce();
                    try {
                        Thread.sleep(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    System.out.println("下班！");
                }
            }
        }
    }
