public class attack extends Thread {
    private static int hp = 100;

int harm=20;

String name;

    public attack(String name) {
        this.name = name;
    }



   @Override
    public synchronized void run() {
        int count=0;
       loop: while (count++<3) {

            if(hp==harm){
               System.out.println
                       (name +"attack..."+'\n'+"当前player的hp值=0"+'\n'+name
                               +" player is dead"+'\n'+name+" end");

               break loop;}
            System.out.println(name
                    + " attack..."+'\n'+name
                    + ":当前player的hp值=" +(hp-=harm ));


        }
    }

   /* @Override
    public  void run() {
        synchronized (this) {
            int count = 0;

            while (count++ < 3) {

                if (hp == harm) {
                    System.out.println
                            (name + "当前player的hp值=0" + '\n' + name
                                    + " player is dead" + '\n' + name + " end");

                   System.exit(0);
                }
                System.out.println(name
                        + " attack..." + '\n' + name
                        + ":当前player的hp值=" + (hp -= harm));
                
            }
        }
    }*/
}