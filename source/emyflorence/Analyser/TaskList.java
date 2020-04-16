package emyflorence.Analyser;
import java.util.ArrayList;
import javax.swing.*;
import java.awt.*;

public class TaskList
{
    ArrayList<Task> tasks = new ArrayList<Task>();
    String title = "Task List";
    JPanel panel = new JPanel();
    
    public TaskList() {
        addTask("task1");
        addTask("task2");
        setUpPanel();
        updateDisplay();
    }

    private void setUpPanel(){
        GridLayout layout = new GridLayout(0,2);
        panel.setLayout(layout);
        panel.add(new JLabel("Task Name"));
        panel.add(new JLabel("Status"));
        for(int i=0; i<40; i++){
            panel.add(new JLabel("-"));
        }
    }

    private void updateDisplay() {
        int i = 0;
        for (Task t : tasks) {
            panel.getComponentAt(2,0).setText(t.name);
            panel.add(new JLabel("."));
            i+=1;
        } 
    }

    private void addTask(String name) {
        Task t = new Task(name);
        tasks.add(t);
    }
    
}