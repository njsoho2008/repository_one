package cn.edu.javaprogram_edition10.ch14;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ShowCircle extends Application {


    @Override
    public void start(Stage primaryStage) throws Exception {
        Circle circle=new Circle();
       /* circle.setCenterX(100);
        circle.setCenterY(100);*/

        circle.setRadius(80);
        circle.setStroke(Color.BLACK);
        circle.setFill(Color.WHITE);
        Pane pane=new StackPane();
        pane.getChildren().add(circle);
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));


        primaryStage.setScene(new Scene(pane,400,500));
        primaryStage.setTitle("画一个圆");
        primaryStage.show();
    }

    public static void  main(String[] args){
        Application.launch(args);
    }
}
