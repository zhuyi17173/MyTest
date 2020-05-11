public class MyThread extends Thread {
    @Override
    public void run() {
       long strat =  System.currentTimeMillis();
        for (int i = 0; i <500 ; i++) {
            System.out.println(i);
        }
        long end =  System.currentTimeMillis();
        System.out.println(getName()+"花费时间："+(end-strat));
    }

    public static void main(String[] args) {
        MyThread t1=new MyThread();
        MyThread t2=new MyThread();
        MyThread t3=new MyThread();

        t1.start();
        t2.start();
        t3.start();

    }
}
