package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.FloatProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleFloatProperty;
import javafx.scene.Scene;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class BindingPropertyDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new Pane();
        Circle circle=new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setRadius(20);
        circle.setFill(Color.WHITE);
        circle.setStroke(Color.BLUE);
        pane.getChildren().add(circle);
        Scene scene=new Scene(pane,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static  void main(String[] args){

        DoubleProperty d1=new SimpleDoubleProperty(2);
        DoubleProperty d2=new SimpleDoubleProperty(2);
        FloatProperty f1=new SimpleFloatProperty(44);
        d1.bind(d2);
        System.out.println("d1 is"+d1.getValue()+"  d2 is"+d2.getValue());
        d2.setValue(88);
        System.out.println("d1 is"+d1.getValue()+"  d2 is"+d2.getValue());
        d1.bind(f1);
        d2.bind(f1);

        f1.setValue(99);
        System.out.println("d1 is"+d1.getValue()+"  d2 is"+d2.getValue());
        Application.launch(args);
    }
}
