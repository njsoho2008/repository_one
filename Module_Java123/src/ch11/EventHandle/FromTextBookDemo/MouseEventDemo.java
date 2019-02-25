package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class MouseEventDemo  extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        Text  text=new Text(30,80,"程序设计非常有趣");
        pane.getChildren().add(text);
        text.setOnMouseDragOver(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                text.setX(event.getX());
                text.setY(event.getX());

            }
        });


        Scene scene=new Scene(pane,200,300);
        primaryStage.setScene(scene);
        primaryStage.show();
       System.out.println(text.getX());
       System.out.println(text.getY());

    }
    public static  void main(String[] args){
       Application.launch(args);
    }
}
