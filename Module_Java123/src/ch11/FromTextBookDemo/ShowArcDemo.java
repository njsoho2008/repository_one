package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;

public class ShowArcDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        Arc arc=new Arc(150,100,80,80,30,55);
        arc.setFill(Color.RED);
        arc.setType(ArcType.CHORD);
        pane.getChildren().add(arc);
        Scene scene=new Scene(pane,400,400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);

    }
}
