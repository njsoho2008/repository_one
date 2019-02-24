package ch11.FromTextBookDemo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class ShowLineDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Pane pane=new LinePane();
        Scene scene=new Scene(pane,600,600);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
    public static void main(String[] args){
        Application.launch(args);
    }
}

class LinePane extends Pane {
    public LinePane(){
        Line line1=new Line(2,2,10,10);
        line1.endXProperty().bind(this.widthProperty().subtract(4));
        line1.endYProperty().bind(this.heightProperty().subtract(94));
        line1.setStroke(Color.RED);
        line1.setStrokeWidth(13);
        this.getChildren().add(line1);
        Line line2=new Line(30,-30,-20,100);
        line2.endXProperty().bind(this.widthProperty().subtract(14));
        line2.endYProperty().bind(this.heightProperty().subtract(14));

        line2.setStroke(Color.BLUE);
        line2.setStrokeWidth(3);
        this.getChildren().add(line2);
    }

}
