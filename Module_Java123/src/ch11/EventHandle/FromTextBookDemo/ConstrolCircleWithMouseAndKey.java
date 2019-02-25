package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class ConstrolCircleWithMouseAndKey extends Application {
    myCirclePane myCirclePane = new myCirclePane();

    public static void main(String[] args) {
        launch(args);
    }


    @Override
    public void start(Stage primaryStage) {


        Button button_Enlarge = new Button("放大");

        button_Enlarge.setOnAction(new myEnlargeHandler());

        Button button_Shrink = new Button("缩小");

        button_Shrink.setOnAction(new MyShrinkHandler());

        HBox hBox = new HBox();

        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(button_Enlarge, button_Shrink);
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(0, 0, 30, 0));
        borderPane.setCenter(myCirclePane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    class myCirclePane extends StackPane {

        private int radius = 10;
        private Circle circle = new Circle(radius);


        public void enlarge(int enlargeL) {
            this.radius = radius < 80 ? radius + enlargeL : 80;

            circle.setRadius(radius);
        }

        public void shrink(int shrinkL) {

            radius = radius > 10 ? radius - shrinkL : 10;
          circle.setRadius(radius);
        }
    }

    class myEnlargeHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            myCirclePane.enlarge(10);

        }
    }

    class MyShrinkHandler implements EventHandler<ActionEvent> {

        @Override
        public void handle(ActionEvent event) {
            myCirclePane.shrink(5);
        }
    }


}
