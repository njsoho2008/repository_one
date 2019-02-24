package ch11.FromTextBookDemo;

import ch8.CircleFromSimpleGeometicObject;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ButtonInPaneDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("确定");

        Circle mycircle=new Circle();
        mycircle.setCenterX(1);
        mycircle.setCenterY(3);
        mycircle.setRadius(90);
        mycircle.setStroke(Color.RED);
        mycircle.setFill(Color.WHITE);

       /* StackPane stackPane=new StackPane();
        stackPane.getChildren().add(button);

        stackPane.getChildren().add(mycircle);*/
        Pane pane=new Pane();
        pane.getChildren().add(button);
        pane.getChildren().add(mycircle);

        Scene  scene=new Scene(pane,300,150);
        primaryStage.setTitle("使用StackPane或者Pane 布局");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
