package lab6.q3;

public class Calculator {
    int a;
    int b;
    String operation;
    int ans;
    public int getA() {
        return a;
    }
    public void setA(int a) {
        this.a = a;
    }
    public int getB() {
        return b;
    }
    public void setB(int b) {
        this.b = b;
    }
    public String getOperation() {
        return operation;
    }
    public void setOperation(String operation) {
        this.operation = operation;
    }
    public int getAns() {
        return ans;
    }
    public void setAns(int ans) {
        this.ans = ans;
    }
    public int calc(){
        if(operation.equals("+"))return ans=a+b;
        if(operation.equals("-"))return ans=a-b;
        if(operation.equals("*"))return ans=a*b;
        if(operation.equals("/"))return ans=a/b;
        else return ans=-1;
    }
}
