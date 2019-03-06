public class AgeException extends Exception {
    AgeException(String s){
        super(s);
    }
}
class CustomException{
    static void validate(int age)throws AgeException{
        if(age<18)
            throw new AgeException("not valid");
        else
            System.out.println("welcome to vote");
    }
    public static void main(String args[]){
        try{
            validate(13);
        }catch(Exception m){System.out.println("Exception occured: "+m);}
    }
}
