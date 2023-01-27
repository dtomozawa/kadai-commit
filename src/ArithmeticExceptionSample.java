
public class ArithmeticExceptionSample {

    public static void main(String[] args) {
        // TODO 自動生成されたメソッド・スタブ
        int num1 = 100;
        int num2 = 10;
        int result;
        result = sumMethod(num1,num2);
        System.out.println(result + "  method2");
    }
    
    public static int sumMethod(int num1,int num2) {
        int result = num1 + num2;
        return result;
    }

}
