package sample;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.StackPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.stage.WindowEvent;


public class Main extends Application {
    StackPane root = new StackPane();
    Time time;
    Text t1 = new Text();
    Image img = new Image("resources/koparka.png");
    Excavators excavators;
    ImageView iv1 = new ImageView();
    ImageView iv2 = new ImageView();
    ImageView iv3 = new ImageView();
    ImageView iv4 = new ImageView();
    ImageView iv5 = new ImageView();


    @Override
    public void start(Stage primaryStage) throws Exception {
        root.setStyle("-fx-background-color: #00FF00");
        primaryStage.setTitle("My App");
        primaryStage.setScene(new Scene(root, 1000, 800));
        primaryStage.show();
        checkTime();
        createExcavators();


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

    public void createExcavators() {
        iv1.setImage(img);
        excavators = new Excavators(this);
        excavators.start();
        root.getChildren().add(iv1);
        iv2.setImage(img);
        root.getChildren().add(iv2);
        iv3.setImage(img);
        root.getChildren().add(iv3);
        iv4.setImage(img);
        root.getChildren().add(iv4);
        iv5.setImage(img);
        root.getChildren().add(iv5);
    }

    public void moveExcavator1(double x, double y) {
        iv1.setTranslateX(x);
        iv1.setTranslateY(y);
    }

    public void moveExcavator2(double x, double y) {
        iv2.setTranslateX(x);
        iv2.setTranslateY(y);
    }

    public void moveExcavator3(double x, double y) {
        iv3.setTranslateX(x);
        iv3.setTranslateY(y);
    }

    public void moveExcavator4(double x, double y) {
        iv4.setTranslateX(x);
        iv4.setTranslateY(y);
    }

    public void moveExcavator5(double x, double y) {
        iv5.setTranslateX(x);
        iv5.setTranslateY(y);
    }
}