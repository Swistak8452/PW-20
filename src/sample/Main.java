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
    Image excavatorImage = new Image("resources/excavator.png");
    Image smallVehicleImage = new Image("resources/small.png");
    Image largeVehicleImage = new Image("resources/large.png");
    Excavators excavators;
    ImageView imageOfExcavator1 = new ImageView();
    ImageView imageOfExcavator2 = new ImageView();
    ImageView imageOfExcavator3 = new ImageView();
    ImageView imageOfExcavator4 = new ImageView();
    ImageView imageOfExcavator5 = new ImageView();
    ImageView imageOfSmallVehicle1 = new ImageView();
    ImageView imageOfSmallVehicle2 = new ImageView();
    ImageView imageOfSmallVehicle3 = new ImageView();
    ImageView imageOfSmallVehicle4 = new ImageView();
    ImageView imageOfSmallVehicle5 = new ImageView();
    ImageView imageOfSmallVehicle6 = new ImageView();
    ImageView imageOfSmallVehicle7 = new ImageView();
    ImageView imageOfSmallVehicle8 = new ImageView();
    ImageView imageOfSmallVehicle9 = new ImageView();
    ImageView imageOfSmallVehicle10 = new ImageView();
    ImageView imageOfLargeVehicle1 = new ImageView();
    ImageView imageOfLargeVehicle2 = new ImageView();
    ImageView imageOfLargeVehicle3 = new ImageView();
    ImageView imageOfLargeVehicle4 = new ImageView();
    ImageView imageOfLargeVehicle5 = new ImageView();


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
        t1.setTranslateX(-450);
        t1.setTranslateY(-380);
        Platform.runLater(() -> t1.setText(time));
    }

    public void createExcavators() {
        imageOfExcavator1.setImage(excavatorImage);
        imageOfExcavator2.setImage(excavatorImage);
        imageOfExcavator3.setImage(excavatorImage);
        imageOfExcavator4.setImage(excavatorImage);
        imageOfExcavator5.setImage(excavatorImage);
        root.getChildren().add(imageOfExcavator1);
        root.getChildren().add(imageOfExcavator2);
        root.getChildren().add(imageOfExcavator3);
        root.getChildren().add(imageOfExcavator4);
        root.getChildren().add(imageOfExcavator5);
    }

    public void moveExcavator1(double x, double y) {
        imageOfExcavator1.setTranslateX(x);
        imageOfExcavator1.setTranslateY(y);
    }

    public void moveExcavator2(double x, double y) {
        imageOfExcavator2.setTranslateX(x);
        imageOfExcavator2.setTranslateY(y);
    }

    public void moveExcavator3(double x, double y) {
        imageOfExcavator3.setTranslateX(x);
        imageOfExcavator3.setTranslateY(y);
    }

    public void moveExcavator4(double x, double y) {
        imageOfExcavator4.setTranslateX(x);
        imageOfExcavator4.setTranslateY(y);
    }

    public void moveExcavator5(double x, double y) {
        imageOfExcavator5.setTranslateX(x);
        imageOfExcavator5.setTranslateY(y);
    }
}