package cn.edu.javaprogram_edition10.ch14;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MyJavaFX extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button btOK=new Button("OK");
        Button button=new Button("第二个按钮");
        Scene  scene=new Scene(btOK,100,200);
        primaryStage.setTitle("MyJavaFX");
        primaryStage.setScene(scene);
        Stage secodnstage=new Stage();
        secodnstage.setTitle("MySecondFX");
        secodnstage.setScene(new Scene(button,400,400));
        primaryStage.show();
        secodnstage.show();
    }

       public static  void main(String[] args){
          Application.launch(args);
        }
}
