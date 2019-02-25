package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.scene.text.TextBoundsType;
import javafx.stage.Stage;

public class KeyEventDemo extends Application {

    @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        Text text = new Text(20, 20, "A");
        text.setBoundsType(TextBoundsType.LOGICAL);

        pane.getChildren().add(text);
        text.setOnKeyPressed(event -> {
            switch (event.getCode()) {
                case DOWN:
                    text.setY(text.getY() + 10);
                    break;
                case UP:
                    text.setY(text.getY() - 10);
                    break;
                case LEFT:
                    text.setX(text.getX() - 10);
                    break;
                case RIGHT:
                    text.setX(text.getX()+10);
                    break;
                default:
                    if (Character.isLetterOrDigit(event.getText().charAt(0))) {
                        text.setText(event.getText());
                    }
            }
        });
        Scene scene=new Scene(pane);
        primaryStage.setTitle("键盘事件Demo");
        primaryStage.setScene(scene);
        primaryStage.show();
        text.requestFocus();
    }

    public static void main(String[] args){
        Application.launch(args);
    }
}
