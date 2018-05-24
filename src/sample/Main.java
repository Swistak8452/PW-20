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
        createSmallVehicle();
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

    public void moveVehicles(){
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

    public void takeBreak() {
        Platform.runLater(() -> t2.setText("Now we have got break!"));
    }

    public void stopBreak() {
        takeBreak();
        t2.setTranslateY(-1000);
        t2.setTranslateX(-1000);
    }

    public void startBreak() {
        takeBreak();
        t2.setTranslateY(0);
        t2.setTranslateX(0);
    }

    public void createExcavators() {
        imageOfExcavator1.setImage(excavatorImage);
        imageOfExcavator2.setImage(excavatorImage);
        imageOfExcavator3.setImage(excavatorImage);
        imageOfExcavator4.setImage(excavatorImage);
        imageOfExcavator5.setImage(excavatorImage);
        root.getChildren().addAll(imageOfExcavator1, imageOfExcavator2, imageOfExcavator3, imageOfExcavator4, imageOfExcavator5);
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

    public void createSmallVehicle() {
        imageOfSmallVehicle1.setImage(smallVehicleImage);
        imageOfSmallVehicle2.setImage(smallVehicleImage);
        imageOfSmallVehicle3.setImage(smallVehicleImage);
        imageOfSmallVehicle4.setImage(smallVehicleImage);
        imageOfSmallVehicle5.setImage(smallVehicleImage);
        imageOfSmallVehicle6.setImage(smallVehicleImage);
        imageOfSmallVehicle7.setImage(smallVehicleImage);
        imageOfSmallVehicle8.setImage(smallVehicleImage);
        imageOfSmallVehicle9.setImage(smallVehicleImage);
        imageOfSmallVehicle10.setImage(smallVehicleImage);
        root.getChildren().addAll(imageOfSmallVehicle1, imageOfSmallVehicle2, imageOfSmallVehicle3, imageOfSmallVehicle4, imageOfSmallVehicle5, imageOfSmallVehicle6, imageOfSmallVehicle7, imageOfSmallVehicle8, imageOfSmallVehicle9, imageOfSmallVehicle10);
    }

    public void moveSmallVehicle1(double x, double y) {
        imageOfSmallVehicle1.setTranslateX(x);
        imageOfSmallVehicle1.setTranslateY(y);
    }

    public void moveSmallVehicle2(double x, double y) {
        imageOfSmallVehicle2.setTranslateX(x);
        imageOfSmallVehicle2.setTranslateY(y);
    }

    public void moveSmallVehicle3(double x, double y) {
        imageOfSmallVehicle3.setTranslateX(x);
        imageOfSmallVehicle3.setTranslateY(y);
    }

    public void moveSmallVehicle4(double x, double y) {
        imageOfSmallVehicle4.setTranslateX(x);
        imageOfSmallVehicle4.setTranslateY(y);
    }

    public void moveSmallVehicle5(double x, double y) {
        imageOfSmallVehicle5.setTranslateX(x);
        imageOfSmallVehicle5.setTranslateY(y);
    }

    public void moveSmallVehicle6(double x, double y) {
        imageOfSmallVehicle6.setTranslateX(x);
        imageOfSmallVehicle6.setTranslateY(y);
    }

    public void moveSmallVehicle7(double x, double y) {
        imageOfSmallVehicle7.setTranslateX(x);
        imageOfSmallVehicle7.setTranslateY(y);
    }

    public void moveSmallVehicle8(double x, double y) {
        imageOfSmallVehicle8.setTranslateX(x);
        imageOfSmallVehicle8.setTranslateY(y);
    }

    public void moveSmallVehicle9(double x, double y) {
        imageOfSmallVehicle9.setTranslateX(x);
        imageOfSmallVehicle9.setTranslateY(y);
    }

    public void moveSmallVehicle10(double x, double y) {
        imageOfSmallVehicle10.setTranslateX(x);
        imageOfSmallVehicle10.setTranslateY(y);
    }

    public void createLargeVehicle() {
        imageOfLargeVehicle1.setImage(largeVehicleImage);
        imageOfLargeVehicle2.setImage(largeVehicleImage);
        imageOfLargeVehicle3.setImage(largeVehicleImage);
        imageOfLargeVehicle4.setImage(largeVehicleImage);
        imageOfLargeVehicle5.setImage(largeVehicleImage);
        root.getChildren().addAll(imageOfLargeVehicle1, imageOfLargeVehicle2, imageOfLargeVehicle3, imageOfLargeVehicle4, imageOfLargeVehicle5);
    }

    public void moveLargeVehicle1(double x, double y) {
        imageOfLargeVehicle1.setTranslateX(x);
        imageOfLargeVehicle1.setTranslateY(y);
    }

    public void moveLargeVehicle2(double x, double y) {
        imageOfLargeVehicle2.setTranslateX(x);
        imageOfLargeVehicle2.setTranslateY(y);
    }

    public void moveLargeVehicle3(double x, double y) {
        imageOfLargeVehicle3.setTranslateX(x);
        imageOfLargeVehicle3.setTranslateY(y);
    }

    public void moveLargeVehicle4(double x, double y) {
        imageOfLargeVehicle4.setTranslateX(x);
        imageOfLargeVehicle4.setTranslateY(y);
    }

    public void moveLargeVehicle5(double x, double y) {
        imageOfLargeVehicle5.setTranslateX(x);
        imageOfLargeVehicle5.setTranslateY(y);
    }
}