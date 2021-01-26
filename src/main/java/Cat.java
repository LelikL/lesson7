public class Cat {
    private String name;
    private int appetite;
    private boolean bellyful;
    //----------------------------------------------------------------------
    public String getName() {
        return name;
    }
    public int getAppetite() {
        return appetite;
    }
    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }
    public void setName(String name) {
        this.name = name;
    }
    public boolean isBellyful() {
        return bellyful;
    }
    public void setBellyful(boolean bellyful) {
        this.bellyful = bellyful;
    }
    //конструктор-----------------------------------------------------------
    public Cat(String name, int appetite, boolean bellyful){
        this.name = name;
        this.appetite = appetite;

    }//Cat
    //----------------------------------------------------------------------
    //eat-------------------------------------------------------------------
    public void eat(Plate p, Cat cats[]){

        for (int i = 0; i < cats.length; i++) {
            if (p.getFood() <= cats[i].appetite){
                System.out.println("нет столько корма для кота " + cats[i].getName() + ", кот не поел!");
            }else {
                p.decreaseFood(cats[i].appetite);
                cats[i].setBellyful(true);
            }
        }//for
        int k=0;
        while (k < cats.length){
            if (cats[k].isBellyful()){
                System.out.println("кот " + cats[k].getName() + " сыт!");
            }//if
            k++;
        }//while
    }//eat
    //----------------------------------------------------------------------
}//Cat
