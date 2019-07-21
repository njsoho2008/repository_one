package ch14;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class FlashText extends Application {
    private String text = "";

    @Override
    public void start(Stage primaryStage) throws Exception {
        StackPane pane = new StackPane();
        Label lblText = new Label("程序正在运行...");
        pane.getChildren().add(lblText);

        new Thread(new Runnable() {
            @Override
            public void run() {

                while (true) {
                    if (lblText.getText().trim().length() == 0)
                        text = "Welcome";
                    else
                        text = "";
                    Platform.runLater(new Runnable() {
                        @Override
                        public void run() {
                            lblText.setText(text);
                        }
                    });

                    try {
                        Thread.sleep(200);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }

            }
        }).start();

        Scene scene = new Scene(pane, 200, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


    }


}
