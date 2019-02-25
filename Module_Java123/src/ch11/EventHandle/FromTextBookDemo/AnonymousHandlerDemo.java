package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AnonymousHandlerDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox=new HBox();
        hBox.setSpacing(10);
        hBox.setAlignment(Pos.CENTER);
        Button btButton1=new Button("New");
        Button btButton2=new Button("Open");
        Button btButton3=new Button("Save");
        Button btButton4=new Button("Print");
        hBox.getChildren().addAll(btButton1,btButton2,btButton3,btButton4);
        Scene scene=new Scene(hBox,500,200);
        primaryStage.setTitle("匿名类的使用");
        primaryStage.setScene(scene);
        primaryStage.show();

        btButton1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("新建文件.....");
            }
        });

        btButton2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("打开现有文件....");
            }
        });

        btButton3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("保存现有文件....");
            }
        });
        btButton4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("打印");
            }
        });
    }

    public static void main(String[] args){
      Application.launch(args);
    }
}
