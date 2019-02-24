package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class JavaFXFontDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new StackPane();
        Circle circle=new Circle();
        circle.centerXProperty().bind(pane.widthProperty().divide(2));
        circle.centerYProperty().bind(pane.heightProperty().divide(2));
        circle.setStroke(Color.web("000FFF",0.79));
        circle.setFill(new Color(0.1,0.3,0.8,0.19));
        circle.setRadius(80);
        pane.getChildren().add(circle);
        Label label=new Label("JavaFX");
        label.setFont(Font.font("Times New Roman",FontWeight.BOLD,FontPosture.ITALIC,20));
        pane.getChildren().add(label);
        Scene scene=new Scene(pane,200,200);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void  main(String[] args){
        Application.launch(args);
    }
}
