package ru.mirea.lab22.n2;

public class CalcModel {
    private int curOperand=0;
    private boolean hasPoint = false;
    private StringBuilder[] operands = new StringBuilder[]{ new StringBuilder(), new StringBuilder()};
    private double result=0;
    private boolean hasResult=false;
    private String operation="";
    public void appendDigit(char d){
        if(hasResult){
            curOperand=0;
            operands[curOperand]=new StringBuilder();
            hasResult=false;
        }
        operands[curOperand].append(d);
    }
    public String getValue(){
        if(hasResult)
            return String.valueOf(result);
        return operands[curOperand].toString();
    }
    public void point() throws Exception{
        if(hasPoint){
            throw new Exception("Number can not contain two pints");
        }else{
            operands[curOperand].append('.');
            hasPoint=true;
        }
    }
    private void replaceOp1(){
        double tmp=result;
        clear();
        operands[0].append(tmp);
        hasPoint = operands[0].toString().contains(".");
        curOperand=0;
    }
    public void mul(){
        if(hasResult) replaceOp1();
        curOperand=1;
        operands[curOperand]=new StringBuilder();
        hasPoint=false;
        operation="*";
    }
    public void div(){
        if(hasResult) replaceOp1();
        curOperand=1;
        operands[curOperand]=new StringBuilder();
        hasPoint=false;
        operation="/";
    }
    public void sub(){
        if(hasResult) replaceOp1();
        curOperand=1;
        operands[curOperand]=new StringBuilder();
        hasPoint=false;
        operation="-";
    }
    public void add(){
        if(hasResult) replaceOp1();
        curOperand=1;
        operands[curOperand]=new StringBuilder();
        hasPoint=false;
        operation="+";
    }
    public void res() throws ArithmeticException{
        switch(operation){
            case "+":
                result=Double.parseDouble(operands[0].toString())+Double.parseDouble(operands[1].toString());
                break;
            case "-":
                result=Double.parseDouble(operands[0].toString())-Double.parseDouble(operands[1].toString());
                break;
            case "/":
                if(Double.parseDouble(operands[1].toString())==0) throw new ArithmeticException("Div by 0");
                result=Double.parseDouble(operands[0].toString())/Double.parseDouble(operands[1].toString());
                break;
            case "*":
                result=Double.parseDouble(operands[0].toString())*Double.parseDouble(operands[1].toString());
        }
        hasResult=true;
    }
    public void clear(){
        operation="";
        operands=new StringBuilder[]{ new StringBuilder(), new StringBuilder()};
        curOperand=0;
        hasPoint=false;
        hasResult=false;
    }
}
