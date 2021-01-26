import java.util.Scanner;

public class Plate {
    private int food;
    public static Scanner sc = new Scanner(System.in);
    //----------------------------------------------------------
    public int getFood() {
        return food;
    }
    public void setFood(int food) {
        this.food = food;
    }
    //конструктор-----------------------------------------------
    public Plate(int food){
        this.food = food;
    }//Plate
    //----------------------------------------------------------
    //info------------------------------------------------------
    public void info(){
        System.out.println("тарелка: " + food);
    }//info
    //----------------------------------------------------------
    //decreaseFood----------------------------------------------
    public void decreaseFood(int n){
        food = food - n;
    }//decreaseFood
    //----------------------------------------------------------
    public void addFood(){
        int x;
        System.out.println("Добавьте корм в тарелку");
        x = sc.nextInt();
        setFood(getFood() + x);
        System.out.println("теперь в тарелке " + getFood());
    }//addFood
}//Plate
