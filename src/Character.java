class Character{
    int hitpoints, accuracy, damage;
    String tag;
    private static int numJedis = 0, numTroopers = 0;

    //constructor
    public Character(String t, int h, int a, int d){

        this.tag = t;
        this.hitpoints = h;
        this.accuracy = a;
        this.damage = d;

        //add 1 to the total number of jedis or stormtroopers
        if(t.equalsIgnoreCase("jedi")){numJedis += 1;} 
        else if(t.equalsIgnoreCase("stormtrooper")){numTroopers += 1;}
    }

    //this method will simulate an attack
    public static void attack(Jedi j, Stormtrooper s){

        //if a dead character has been sent to battle, return
        if(j.getName().equalsIgnoreCase("dead") || s.getId() == 0){
            return;
        }

        System.out.println("\n" + j.getName() + " and Stormtrooper #" + s.getId() + " are battling!");
        try{
            Thread.sleep(700);
        }catch(InterruptedException e){System.out.println(e);}
        
        //if stormtrooper hits jedi
        //stormtrooper accuracy has to be >=60 to get a hit
        if(s.accuracy >=60){
            System.out.println("Stormtrooper #" + s.getId() + " has hit " + j.getName() + " for " + s.damage + " damage");
            j.hitpoints = j.hitpoints - s.damage;

            //change accuracy of trooper if they hit
            s.accuracy = (int)(Math.random() * 100) + + 1;
            return;
        }

        //if stormtrooper killed a jedi
        if(j.hitpoints <= 0){
            numJedis -= 1;
            System.out.println("STORMTROOPER #" + s.getId() + " HAS KILLED " + j.getName());

            //make that jedi "dead" in the list
            j.setName("dead"); 
            return;
        }

        System.out.println("Stormtrooper #" + s.getId() + " has missed their shot!");

       //if stormtrooper misses, jedi kills stormstrooper
        s.hitpoints = s.hitpoints - j.damage;
        if(s.hitpoints <= 0){
            numTroopers -= 1;
            System.out.println(j.getName() + " HAS KILLED STORMTROOPER #" + s.getId());
            
            //make that stormtrooper null in the list
            s.setId(0);
            return;
        }
    }

    //Getters & Setters
    public int getHitpoints(){return this.hitpoints;}
    public int getAccuracy(){return this.accuracy;}
    public int getDamage(){return this.damage;}
    public static int getNumJedis(){return numJedis;}
    public static int getNumTroopers(){return numTroopers;}
    public void setHitpoints(int v){this.hitpoints = v;}
    public void setAccuracy(int v){this.accuracy = v;}
    public void setDamage(int v){this.damage = v;}
    public void setNumJedis(int v){numJedis = v;}
    public void setNumTroopers(int v){numTroopers = v;}
}