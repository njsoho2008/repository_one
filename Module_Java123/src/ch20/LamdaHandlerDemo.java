package ch20;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/*Java8中新增lamda表达式
* lamda表达式 可以被看作使用精简语法的匿名类
*
* (tpye1 param1,type2 param2,type3 param3,type4 param4)->expression
*
* (type1 param1,type2 param2,type3 param3,type4 param4)->{statements}
*
* 一个参数的数据类型可以显示声明，也可以由编译器隐式推断
*
* e->{
* coding....
* }
*
* */
public class LamdaHandlerDemo extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hbox=new HBox();
        hbox.setSpacing(10);
        hbox.setAlignment(Pos.CENTER);
        Button btNew=new Button("新建");
        Button btOpen=new Button("打开");
        Button btSave=new Button("保存");
        Button btPrint=new Button("打印....");
        hbox.getChildren().addAll(btNew,btOpen,btSave,btPrint);

        Scene scene=new Scene(hbox,300,500);
        primaryStage.setTitle("lamda表达式处理Demo");
        primaryStage.setScene(scene);
        primaryStage.show();

        btNew.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("执行新建命令.....");
            }
        });

        btOpen.setOnAction(event -> {
            System.out.println("执行打开文件的命令....");
        });

        btSave.setOnAction(event -> {
            System.out.println("执行保存文件的命令....");
        });

        btPrint.setOnAction(event -> {
            System.out.println("执行打印的命令.....");

        });

    }
    public static void main(String[] args){
        Application.launch(args);
    }
}
