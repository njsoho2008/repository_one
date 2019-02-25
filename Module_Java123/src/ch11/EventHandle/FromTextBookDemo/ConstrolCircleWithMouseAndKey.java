package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

import java.security.Key;

public class ConstrolCircleWithMouseAndKey extends Application {

    private static final int i = 35;
    private Circle circle = new Circle(i);
    myCirclePane myCirclePane = new myCirclePane();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {

        Button button_Enlarge = new Button("放大");

        button_Enlarge.setOnAction(event -> {
            myCirclePane.enlarge(10);
        });

        Button button_Shrink = new Button("缩小");


        button_Shrink.setOnAction(event -> {
            myCirclePane.shrink(5);
        });

        circle.setOnMouseClicked(event -> {
            if (event.getButton() == MouseButton.PRIMARY) {
                myCirclePane.enlarge(4);

            } else if (event.getButton() == MouseButton.SECONDARY) {
                myCirclePane.shrink(4);

            }
        });

        circle.setOnKeyPressed(event -> {
            if(event.getCode()==KeyCode.U){
                myCirclePane.enlarge(5);

            }else  if(event.getCode()==KeyCode.D){
                myCirclePane.shrink(9);

            }
        });

        HBox hBox = new HBox();

        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(button_Enlarge, button_Shrink);
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(0, 0, 30, 0));
        borderPane.setCenter(myCirclePane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
        //请求焦点
        myCirclePane.requestFocus();
    }


    class myCirclePane extends StackPane {
        private int radius = 10;

        public myCirclePane() {
            this.getChildren().add(circle);
            circle.setStroke(Color.BLUE);
            circle.setFill(Color.RED);
        }


        public void enlarge(int enlargeL) {
            radius = radius < 80 ? radius + enlargeL : 80;

            circle.setRadius(radius);
        }


        public void shrink(int shrinkL) {

            radius = radius > 10 ? radius - shrinkL : 10;
            circle.setRadius(radius);
        }


    }


}
