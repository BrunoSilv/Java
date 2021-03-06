package code.projects.stopwatch;

import java.util.Calendar;

/**
 * Created by bruno on 24-04-2017.
 */
public class StopWatch extends Thread {
    private Calendar calendar = Calendar.getInstance();
    private StopWatchApp stopwatchapp;
    public boolean runFlag = true;

    public StopWatch( String name ) {
        super( name );
    }

    public void setStopwatchapp(StopWatchApp stopwatchapp) {
        this.stopwatchapp = stopwatchapp;
    }

    public boolean isRunFlag() {
        return runFlag;
    }

    public void setRunFlag(boolean runFlag) {
        this.runFlag = runFlag;
    }



    public void run() {
        System.out.println( "Simple Clock Started " );
        calendar = Calendar.getInstance();

        while( runFlag ) {
            try {
                sleep(998);
            } catch (InterruptedException ex) {

            }
            stopwatchapp.incrementTime();
            stopwatchapp.setTime();

        }

    }




}
