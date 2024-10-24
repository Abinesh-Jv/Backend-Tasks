package multithreading;

import java.util.concurrent.TimeUnit;

public class MultiThreading extends Thread{

    private final String screenName;
    private final int duration;
    MultiThreading(String screenName,int duration){
        this.screenName = screenName;
        this.duration = duration;
    }

    @Override
    public void run() {
        System.out.println("Movie Started in "+this.screenName);
        System.out.println("The Duration of the "+this.screenName+" is "+this.duration+" seconds");
        for(int i =this.duration;i>=0;i--){
            System.out.println("Time Remaining for "+screenName+" : "+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
