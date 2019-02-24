package ch11.EventHandle;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.AccessibleAction;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.control.Button;


public class ControlCircleDemo extends Application {
    private CirclePane circlePane = new CirclePane();

    class CirclePane extends StackPane {
        private Circle circle = new Circle(50);

        public CirclePane() {
            this.getChildren().add(circle);
            circle.setStroke(Color.BLUE);
            circle.setFill(Color.WHITE);
        }

        public void enlarge() {
            circle.setRadius(circle.getRadius() + 2);
            if (circle.getRadius() > 60) {
                circle.setRadius(190);
            }
        }

        public void shrink() {
            circle.setRadius(circle.getRadius() > 10 ? circle.getRadius() - 2 : circle.getRadius());
        }
    }

    class EnlargeHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            circlePane.enlarge();
        }
    }

    class ShrinkHandler implements EventHandler<ActionEvent> {
        @Override
        public void handle(ActionEvent event) {
            circlePane.shrink();
        }
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button button_Enlarge = new Button("放大");

        button_Enlarge.setOnAction(new EnlargeHandler());

        Button button_Shrink = new Button("缩小");

        button_Shrink.setOnAction(new ShrinkHandler());

        HBox hBox = new HBox();

        hBox.setSpacing(50);
        hBox.setAlignment(Pos.CENTER);
        hBox.getChildren().addAll(button_Enlarge, button_Shrink);
        BorderPane borderPane = new BorderPane();
        borderPane.setPadding(new Insets(0, 0, 30, 0));
        borderPane.setCenter(circlePane);
        borderPane.setBottom(hBox);
        Scene scene = new Scene(borderPane, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }


    public static void main(String[] args) {
        Application.launch(args);
    }
}