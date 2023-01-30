package lab6.q3;

public class Calculator {
    private int ans;
    public int calc(int a ,int b,int operation){
        if(1 == operation)return ans=a+b;
        if(2 == operation)return ans=a-b;
        if(3 == operation)return ans=a*b;
        if(4 == operation)return ans=a/b;
        else return ans=-1;
    }
    public int getAns(){
        return ans;
    }
}
