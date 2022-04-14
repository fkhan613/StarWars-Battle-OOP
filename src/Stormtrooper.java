class Stormtrooper extends Character{
    private int id;

    //constructor
    public Stormtrooper(){
        super("stormtrooper", 100, ((int)(Math.random() * 100) + 1), generateRandomNumber(30, 50));
        this.id = (int)(Math.random() * 1000000) + 1;
    }

    static private int generateRandomNumber(int min, int max) {
        int range = (max - min) + 1;
        return (int)(Math.random() * range) + min;
    }

    //Getter & Setter
    public int getId(){return id;}
    public void setId(int v){this.id = v;}
}