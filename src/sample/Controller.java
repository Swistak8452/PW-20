package sample;


import javafx.scene.control.TextArea;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;

import java.util.Calendar;

public class Controller {
    StackPane root = new StackPane();
    Text t1;
    Calendar calendar = Calendar.getInstance();

    static TextArea textArea;
    public static void setTextArea(String s)
    {
        textArea.appendText(s);
    }

    public void displayTime(){
        calendar = Calendar.getInstance();
        int hour = calendar.get(Calendar.HOUR);
        int minute = calendar.get(Calendar.MINUTE);
        int second = calendar.get(Calendar.SECOND);
        t1 = new Text(200, 50, hour + ":" + minute + ":" + second);
        root.getChildren().add(t1);
    }

}
