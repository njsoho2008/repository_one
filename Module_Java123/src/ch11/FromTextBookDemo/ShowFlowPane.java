package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ShowFlowPane extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane  flowpane=new FlowPane();
        Image image=new Image("http://pic1.nipic.com/2009-01-07/20091713417344_2.jpg",
                200,200,false,true);
        ImageView imageView1=new ImageView(image);
        ImageView imageView2=new ImageView(image);
        ImageView imageView3=new ImageView(image);
        ImageView imageView4=new ImageView(image);
        ImageView imageView5=new ImageView(image);
        Label label=new Label("请输入长度");
        TextField textField=new TextField();
        Label label1=new Label("米");

//        imageView5.setRotate(90);
        flowpane.getChildren().add(imageView1);
        flowpane.getChildren().add(imageView2);
        flowpane.getChildren().add(imageView3);
        flowpane.getChildren().add(imageView4);
        flowpane.getChildren().add(imageView5);
        flowpane.getChildren().addAll(label,textField,label1);
//        flowpane.setPadding(new Insets(10,11,12,13));


        ((FlowPane) flowpane).setHgap(10);
        ((FlowPane) flowpane).setVgap(10);


        Scene scene=new Scene(flowpane,1400,1100);
        primaryStage.setScene(scene);
        primaryStage.show();





    }
    public static  void main(String[] args){
        Application.launch(args);
    }
}
