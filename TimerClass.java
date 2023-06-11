import java.util.*;

public class TimerClass {

    public static void main(String[] args) {
        Timer timer = new Timer();

        TimerTask task = new TimerTask() {
            int counter = 10;

            @Override
            public void run() {
                if (counter > 0) {
                    System.out.println(counter + " seconds");
                    counter--;
                } else {
                    System.out.println("HAPPY NEW YEAR!");
                    timer.cancel();
                }
            }

        };

        // timer.schedule(task, 0);

        Calendar date = Calendar.getInstance();
        date.set(Calendar.YEAR, 2020);
        date.set(Calendar.MONTH, Calendar.JUNE);
        date.set(Calendar.DAY_OF_MONTH, 20);
        date.set(Calendar.MINUTE, 0);
        date.set(Calendar.SECOND, 0);
        date.set(Calendar.MILLISECOND, 0);

        // timer.schedule(task, date.getTime());

        timer.scheduleAtFixedRate(task, 0, 1000);
    }
}
