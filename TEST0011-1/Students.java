import java.util.concurrent.Semaphore;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*public class Students extends Thread implements Comsumer {

    static int count2=0;
    String name;

    public Students(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println(name+":吨吨吨...");
    }

    @Override
    public synchronized void run() {


        while (++count2<=11) {
           if (count2<=10){
                if (Production.LemonWater >= 1) {
                    Production.LemonWater--;
                    drink();

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } else {
                    count2--;
                    try {
                        wait(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }

            }
           else {
               System.out.println(name + ":终于喝饱了");
           }
            }

    }
}*/
public class Students extends Thread implements Comsumer {

    static int count2=0;
    String name;

    public Students(String name) {
        this.name = name;
    }

    @Override
    public void drink() {
        System.out.println(name+":吨吨吨...");
    }

    @Override
    public synchronized void run() {


               while (count2 <= 10) {

            if (count2 <= 9) {


                if (Production.LemonWater >= 1) {


                    Production.LemonWater--;
                    drink();
                    count2++;


                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                else {

                    try {
                        wait(1500);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }


            } else {
                System.out.println(name + ":终于喝饱了");
           break;
        }
      }



    }
}
