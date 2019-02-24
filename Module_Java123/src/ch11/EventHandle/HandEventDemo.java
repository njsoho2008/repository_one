package ch11.EventHandle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class HandEventDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox pane = new HBox();

        pane.setSpacing(90);
        pane.setAlignment(Pos.CENTER);
        Button buttonok = new Button("OK");
        buttonok.setMinWidth(60);
        OKHandlerclass okHandlerclass = new OKHandlerclass();
        buttonok.setOnAction(okHandlerclass);
        Button buttoncancle = new Button("Cancel");
        buttoncancle.setMinWidth(60);
        CancleHandlerClass cancleHandlerClass = new CancleHandlerClass();
        buttoncancle.setOnAction(cancleHandlerClass);
        pane.getChildren().addAll(buttonok, buttoncancle);
        Scene scene = new Scene(pane, 300, 100);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        Application.launch(args);
    }
}


class OKHandlerclass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Button Ok is pressed");
    }
}

class CancleHandlerClass implements EventHandler<ActionEvent> {

    @Override
    public void handle(ActionEvent event) {
        System.out.println("Button Cancle is pressed");
    }
}