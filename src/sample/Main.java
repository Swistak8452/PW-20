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
    Vehicles vehicles;
    Text t1 = new Text();
    Text t2 = new Text();
    Image excavatorImage = new Image("resources/excavator.png");
    ImageView imageOfExcavator1 = new ImageView(excavatorImage);
    ImageView imageOfExcavator2 = new ImageView(excavatorImage);
    ImageView imageOfExcavator3 = new ImageView(excavatorImage);
    ImageView imageOfExcavator4 = new ImageView(excavatorImage);
    ImageView imageOfExcavator5 = new ImageView(excavatorImage);

    @Override
    public void start(Stage primaryStage) {
        root.setStyle("-fx-background-color: #00FF00");
        primaryStage.setTitle("My App");
        primaryStage.setScene(new Scene(root, 1200, 800));
        primaryStage.show();
        checkTime();
        createExcavators();
        moveVehicles();
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

    public void moveVehicles() {
        vehicles = new Vehicles(this);
        vehicles.start();
    }

    public void checkTime() {
        time = new Time(this);
        time.start();
        root.getChildren().add(t1);
        root.getChildren().add(t2);
    }

    public void updateTime(int hour, int minute, int second) {
        String time = hour + ":" + minute + ":" + second;
        t1.setTranslateX(-450);
        t1.setTranslateY(-380);
        Platform.runLater(() -> t1.setText(time));
    }

    public void createExcavators() {
        root.getChildren().addAll(imageOfExcavator1, imageOfExcavator2, imageOfExcavator3, imageOfExcavator4, imageOfExcavator5);
    }

    public void createVehicles(ImageView img) {
        root.getChildren().add(img);
    }
}