package emyflorence.Analyser;
import java.util.ArrayList; // import the ArrayList class
import java.time.*;
public class Task {
    int id;
    String name;
    int projectID;
    enum Type {
        PROJECT,
        TASK,
        PLAN,
        CONTACT
    }
    boolean inbox;
    LocalDateTime dueDate;
    ArrayList<Context> contexts;
    ArrayList<Task> dependsOn;
    ArrayList<Task> depending;
    double totalPriority;
    int priority;
    ArrayList<Task> subTasks;
    String path;
    LocalDateTime dateAdded;
    int order;
    enum Status {
        INCOMPLETE,
        WAITING,
        THINKING,
        IN_PROGRESS,
        NEARLY_FINISHED,
        DONE,
        SOMEDAY
    }

}