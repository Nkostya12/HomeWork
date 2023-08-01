public class Arithmetic {

    public static void main(String [] args){
Arithmetic arithmetic = new Arithmetic(5,2);
        System.out.println(arithmetic.max());
        System.out.println(arithmetic.min());
        System.out.println(arithmetic.amount());
        System.out.println(arithmetic.composition());
    }
    public int x;
    public int y;

    public Arithmetic(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int amount(){
        return x+y;
    }
    public int composition(){
        return x*y;
    }
    public int max(){
        return  x > y ? x : y;
    }
    public  int min(){
        return  x < y ? x : y;
    }


}
