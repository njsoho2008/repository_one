package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

public class ShowEllipseDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        for (int i=0;i<16;i++){
            Ellipse ellipse=new Ellipse(150,100,100,50);
            ellipse.setStroke(new Color(Math.random(),Math.random(),Math.random(),Math.random()));
            ellipse.setRotate(i*180/8);
            ellipse.setFill(Color.WHITE);
            pane.getChildren().add(ellipse);

        }
        Scene scene=new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args){
         Application.launch(args);
    }
}
