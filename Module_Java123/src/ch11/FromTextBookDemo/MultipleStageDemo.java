package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class MultipleStageDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button=new Button("确定");
        Scene scene=new Scene(button,200,100);
        primaryStage.setScene(scene);
        primaryStage.setMaxWidth(500);
        primaryStage.setTitle("多个舞台1");
        primaryStage.show();

        Stage stage=new Stage();
        stage.setTitle("第二个舞台");
        Button button2=new Button("第二个stage");
        Scene secondscene=new Scene(button2,200,200);
        stage.setScene(secondscene);
        stage.show();

    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
