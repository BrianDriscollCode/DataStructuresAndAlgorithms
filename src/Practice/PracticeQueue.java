package Practice;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;

class Helper extends TimerTask
{
    private Queue<String> rollerCoasterLine;

    public Helper(Queue<String> rollerCoasterLine)
    {
        this.rollerCoasterLine = rollerCoasterLine;
    }

    public void run()
    {
        if (!rollerCoasterLine.isEmpty())
        {
            System.out.println(rollerCoasterLine.poll() + " leaves the line.");

            if (!rollerCoasterLine.isEmpty())
            {
                System.out.println(rollerCoasterLine + " left in the line");
            }
        }
        else
        {
            System.out.println("Line is empty.");
            cancel();
            System.exit(0);
        }



    }
}

public class PracticeQueue {
    public static void main(String[] args)
    {
        Queue<String> rollerCoasterLine = new LinkedList<>();

        rollerCoasterLine.offer("Karen");
        rollerCoasterLine.offer("Bob");
        rollerCoasterLine.offer("Steve");
        rollerCoasterLine.offer("Harold");

        System.out.println("Are in line: " + rollerCoasterLine);

        Timer timer = new Timer();
        TimerTask task = new Helper(rollerCoasterLine);

        timer.schedule(task, 1000, 1000);
    }


}