package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyJavaFXDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {

        MyButton button=new MyButton("Ok-");
        button.setText("fasdfasf");
        button.setMinWidth(100);
        Button cancle=new Button("Canle");

        cancle.setMinWidth(180);
        Pane pane=new FlowPane();
        pane.getChildren().addAll(button,cancle);

        Scene scene=new Scene(pane,200,25);

        primaryStage.setScene(scene);
        primaryStage.setTitle("MyJavaFx");
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
