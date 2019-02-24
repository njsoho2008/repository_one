package cn.edu.javaprogram_edition10.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class ButtonInPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new StackPane();
        pane.getChildren().add(new Button("Ok"));
        Scene  scene=new Scene(pane,300,400);
        primaryStage.setTitle("ButtonInPane");
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
