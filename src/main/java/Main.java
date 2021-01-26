import java.util.Scanner;

public class Main {
    static Cat [] catArray = new Cat[2];
    public static Scanner sc = new Scanner(System.in);
    //------------------------------------------------main------------------------------------
    public static void main(String[] args){
        Cat cat = new Cat("Басик",5, false);
        Plate plate = new Plate (100);
        createCatArr();
        plate.info();
        cat.eat(plate, catArray);
        plate.info();
        exit("Хотите добавить корм в тарелку ? (1-добавить 0-нет)", plate);
    }//main
    public static void createCatArr(){ //-----------------------------------------------------
        catArray [0] = new Cat("Басик",10, false);
        catArray [1] = new Cat("Mарсик",100, false);
    }//createCatArr---------------------------------------------------------------------------
    //----------------------------------------------------------------------------------------
    private static void exit(String mess, Plate p) {
        int n;
        System.out.println(mess);
        n = sc.nextInt();
        switch (n) {
            case 1:
                p.addFood();
                break;
            case 0:
                break;
        }//switch
    }//exit
    //-----------------------------------------------------------------------------------------
}//Main
