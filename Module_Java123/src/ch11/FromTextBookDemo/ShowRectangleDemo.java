package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class ShowRectangleDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        pane.getChildren().add(new Text(10,30,"矩形1"));
        Rectangle rectangle=new Rectangle(50,10,60,30);
        rectangle.setStroke(Color.BLUE);
        rectangle.setFill(Color.WHITE);
        pane.getChildren().add(rectangle);
        pane.getChildren().add(new Text(10,65,"矩形2"));
        pane.getChildren().add(new Rectangle(50,45,60,30));
        pane.getChildren().add(new Text(10,100,"矩形3"));
        Rectangle rectangle3=new Rectangle(50,80,60,30);
        rectangle3.setStroke(Color.BLUE);
        rectangle3.setFill(Color.WHITE);
        rectangle3.setArcHeight(20);
        rectangle3.setArcWidth(15);
        pane.getChildren().add(rectangle3);
        for(int i=0;i<7;i++){
            Rectangle myr=new Rectangle(200,50,100,30);
            myr.setRotate(i*360/8);
            myr.setStroke(Color.color(Math.random(),Math.random(),Math.random(),Math.random()));
            myr.setFill(Color.WHITE);
            pane.getChildren().add(myr);
        }
        Scene scene=new Scene(pane,500,500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
