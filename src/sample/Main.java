package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
    StackPane root = new StackPane();
    Time time;
    Text t1 = new Text();
    Image img = new Image("resources/koparka.png");
    Koparka koparka;
    ImageView iv1 = new ImageView();


    @Override
    public void start(Stage primaryStage) throws Exception {
        root.setStyle("-fx-background-color: #00FF00");
        primaryStage.setTitle("My App");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.show();
        checkTime();
        createKoparka();


        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent t) {
                Platform.exit();
                System.exit(0);
            }
        });
    }


    public static void main(String[] args) {
        launch(args);
    }

    public void checkTime() {
        time = new Time(this);
        time.start();
        root.getChildren().add(t1);
    }

    public void updateTime(int hour, int minute, int second) {
        String time = hour + ":" + minute + ":" + second;
        Platform.runLater(() -> t1.setText(time));
    }

    public void createKoparka() {
        iv1.setImage(img);
        koparka = new Koparka(this);
        koparka.start();
        root.getChildren().add(iv1);
    }

    public void moveKoparka(double x, double y){
        iv1.setTranslateX(x);
        iv1.setTranslateY(y);
    }
}