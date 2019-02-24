package cn.edu.javaprogram_edition10.ch20;

import java.util.Stack;

public class EvaluateExpression {

    public  static void main(String[] args){
        if(args.length!=1){
            System.out.println(" Java   EvaluateExpression \"expression\"");
            System.exit(1);
        }

        try{
            System.out.println(evaluateExpression(args[0]));
        }catch (Exception ex){
            System.out.println("Wrong expression:"+args[0]);

        }
    }

    public static int evaluateExpression(String expression){

        //操作数栈
        Stack<Integer> operandstack=new Stack<>();
        //操作符栈
        Stack<Character> operatorstack=new Stack<>();



        expression=insertBlanks(expression);
          //  分离 操作数 和操作符
         String[] tokens=expression.split(" ");

         for(String token:tokens){
             if(token.length()==0)
                 continue;
             else if(token.charAt(0)=='+'||token.charAt(0)=='-'){
                 while (!operatorstack.isEmpty()&&
                         (operatorstack.peek()=='+'||operatorstack.peek()=='-'||
                                 operatorstack.peek()=='*'||operatorstack.peek()=='/')

                         ){
                     processAnOperator(operandstack,operatorstack);


                 }
             }
         }


        return  1;

    }

    public static String insertBlanks(String s){

        String result="";
        for(int i=0;i< s.length();i++){
            if(s.charAt(i)=='('||s.charAt(i)==')'||s.charAt(i)=='+'||s.charAt(i)=='-'||s.charAt(i)=='*'||s.charAt(i)=='/')
                result=result+ " "+s.charAt(i)+"";
            else
                result +=s.charAt(i);
        }
        return  result;
    }

    public  static void  processAnOperator(Stack<Integer> operandStack,Stack<Character> operatorStack){
       char  op=operatorStack.pop();
       int op1=operandStack.pop();
       int op2=operandStack.pop();
       if(op=='+')
       operandStack.push(op1+op2);
       else if (op=='-')
           operandStack.push(op1-op2);
       else if(op=='*')
           operandStack.push(op1*op2);
       else if(op=='/'){
           operandStack.push(op1/op2);
       }


    }
}
