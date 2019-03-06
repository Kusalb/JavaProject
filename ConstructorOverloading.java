public class ConstructorOverloading {

    int length, breadth, height;

    ConstructorOverloading(int l, int b, int h){

        length=l;
        breadth=b;
        height=h;

    }

    ConstructorOverloading(){
        length=breadth=height=0;
    }

    int volume(int l, int b, int h){
        return l*b*h;
    }

    public static void main(String[] args) {
        ConstructorOverloading cons= new ConstructorOverloading(2,3,4);
        ConstructorOverloading cons1= new ConstructorOverloading();

        cons.volume(1,2,3);
        System.out.println(+cons.volume(1,2,3));

    }
}
