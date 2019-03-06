class Adder{
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }
}
class FunctionOverloading{
    public static void main(String[] args){
        System.out.println(Adder.add(5,10));
        System.out.println(Adder.add(5,10,15));
    }
}
