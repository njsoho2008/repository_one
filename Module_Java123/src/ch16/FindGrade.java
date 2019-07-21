package ch16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.sql.*;

public class FindGrade extends Application {

    private Statement stmt;
    private TextField tfSSN = new TextField();
    private TextField tfCourseId = new TextField();
    private Label lblStatus = new Label();


    @Override
    public void start(Stage primaryStage) {
        this.initDB();
        Button btShowGrade = new Button("show Grade");
        HBox hBox = new HBox(5);
        hBox.getChildren().addAll(new Label("SSN"), tfSSN, new Label("CourseID"), tfCourseId, btShowGrade);
        VBox vBox = new VBox(10);
        vBox.getChildren().addAll(hBox, lblStatus);
        tfSSN.setPrefColumnCount(20);
        tfCourseId.setPrefColumnCount(20);
        btShowGrade.setOnAction(e -> showGrade());
        /*btShowGrade.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                showGrade();
            }
        });*/
        Scene scene = new Scene(vBox, 420, 80);
        primaryStage.setTitle("FindGrade");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    private void initDB() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
            this.stmt = connection.createStatement();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private void showGrade() {
        String ssn = tfSSN.getText();
        String courseId = tfCourseId.getText();
///全连接查询 多表联合查询
        String queryString = "select firstName,mi,lastName，title，grade from Student,Enrollment_new,Course" +
                "where Student.ssn='" + ssn + "' and Enrollment_new.courseId='" + courseId +
                "'and Enrollment_new.coursId=Course.courseId" +
                "and Enrollment_new.ssn=Student.ssn";
        try {

            ResultSet resultSet = stmt.executeQuery(queryString);
            if (resultSet.next()) {
                String firstName = resultSet.getString(1);
                String mi = resultSet.getString(2);
                String lastName = resultSet.getString(3);
                String title = resultSet.getString(4);
                String grade = resultSet.getString(5);
                lblStatus.setText(firstName + " " + mi + " " + lastName + " " + title + "  " + "is" + grade);

            } else {
                lblStatus.setText("not Found");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }


    }

    public static void main(String[] args) {
        launch(args);
    }
}
