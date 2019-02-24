package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ImageDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new HBox(50);
        pane.setPadding(new Insets(5,5,5,5));
        Image image=new Image("http://pic1.nipic.com/2009-01-07/20091713417344_2.jpg",
                200,200,false,true);
        ImageView imageView1=new ImageView();
        imageView1.setImage(image);
        pane.getChildren().add(imageView1);
        ImageView imageView2=new ImageView(image);
        imageView2.setFitHeight(200);
        imageView2.setFitWidth(200);
        pane.getChildren().add(imageView2);
        ImageView imageView3=new ImageView(image);
        imageView3.setRotate(90);
        pane.getChildren().add(imageView3);
        Scene scene=new Scene(pane);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
