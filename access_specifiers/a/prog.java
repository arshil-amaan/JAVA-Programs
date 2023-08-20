package a ;
import b.*;
public class prog {
    public static void main(String[] args){
        int num=7;
        triple obj = new triple();
        quad obj2 = new quad();
        System.out.println(obj.outer);
        System.out.println(obj.trip(num));
        System.out.println(obj2.mit);
        System.out.println(obj2.qua(num));
    }
}

class quad {
    int mit = 86;
    int qua(int n){
    return 4*n;
    }
}