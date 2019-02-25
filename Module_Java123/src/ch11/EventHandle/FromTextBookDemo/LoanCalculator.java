package ch11.EventHandle.FromTextBookDemo;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.util.Scanner;

public class LoanCalculator extends Application {
    private TextField textField_nll = new TextField();
    private TextField textField_total_years = new TextField();
    private TextField textField_loan_amount = new TextField();
    private TextField textField_monthly_payment = new TextField();
    private TextField textField_total_payment = new TextField();
    private Loan loan = new Loan();


    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label_nll = new Label("年利率");
        textField_nll.setMinWidth(20);
        Label label_total_years = new Label("贷款时长");
        textField_total_years.setMinWidth(20);
        Label label_loan_amount = new Label("贷款总金额");
        textField_loan_amount.setMinWidth(20);
        Label label_monthly_payment = new Label("月供");
        textField_monthly_payment.setMinWidth(20);
        Label label_total_payment = new Label("总还款额");
        textField_total_payment.setMinWidth(20);
        Button calButton = new Button("计算结果");
        GridPane gridpane = new GridPane();
        gridpane.setVgap(5);
        gridpane.setHgap(3);
        gridpane.setGridLinesVisible(false);
        gridpane.add(label_nll, 0, 0);
        gridpane.add(textField_nll, 1, 0);
        gridpane.add(label_total_years, 0, 1);
        gridpane.add(textField_total_years, 1, 1);
        gridpane.add(label_loan_amount, 0, 2);
        gridpane.add(textField_loan_amount, 1, 2);
        gridpane.add(label_monthly_payment, 0, 3);
        gridpane.add(textField_monthly_payment, 1, 3);
        gridpane.add(label_total_payment, 0, 4);
        gridpane.add(textField_total_payment, 1, 4);
        gridpane.add(calButton, 1, 5);
        gridpane.setAlignment(Pos.CENTER);
        Scene scene = new Scene(gridpane, 300, 200);
        primaryStage.setScene(scene);
        primaryStage.show();


        calButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                buttonCal();
            }
        });
    }

    class Loan {
        private double interest;
        private int years;
        private double loanAmount;

        public Loan() {

        }

        public Loan(double interest, int years, double loanAmount) {
            this.interest = interest;
            this.years = years;
            this.loanAmount = loanAmount;
        }


        public double getMonthlyPay() {
            return this.getTotalPay() / 12.0;

        }

        public double getTotalPay() {

            double interest = Double.parseDouble(textField_nll.getText());
            int years = Integer.parseInt(textField_total_years.getText());
            double loanAmount = Double.parseDouble(textField_loan_amount.getText());

            return (1.0 + interest) * years * loanAmount;
        }
    }

    public void buttonCal() {

        this.textField_monthly_payment.setText(String.format("$%.2f", loan.getMonthlyPay()));
        this.textField_total_payment.setText(String.format("$%.2f", loan.getTotalPay()));
    }

    public static void main(String[] args) {
        //        LoanCalculator loanCalculator = new LoanCalculator();
//        LoanCalculator.Loan loan = loanCalculator.new Loan();
        Application.launch(args);
    }


}
