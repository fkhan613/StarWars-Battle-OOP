class HostBattle{

    //you can change the number of combatants by changing numJedis and numTroopers
    static int numJedis = 3, numTroopers = 12;
    static Jedi[] jedis = new Jedi[numJedis];
    static Stormtrooper[] troopers = new Stormtrooper[numTroopers];

    public HostBattle(){

        //welcome user
        System.out.println("\n\t\t\t\tWELCOME TO THE STAR WARS CLASH! MAY THE BATTLE BEGIN!");
            try{
                Thread.sleep(1500);
            }catch(InterruptedException e){System.out.println(e);}
        
        //create a random amount stormtroopers and jedis
        for(int i = 0; i < numJedis; i++){
            jedis[i] = new Jedi();
        }

        for(int i = 0; i < numTroopers; i++){
            troopers[i] = new Stormtrooper();
        }
    }

    //this method will check which team won
    public static boolean Winner(){

        if(Character.getNumJedis() == 0){
            System.out.println("\n~~~\tTHE STORMTROOPERS HAVE WON (～￣▽￣)～~~~");
            return true;
        }
        else if(Character.getNumTroopers() == 0){
            System.out.println("\n~~~\tTHE JEDIS HAVE WON (～￣▽￣)～~~~");
            return true;
        }

        return false;
    }

    //this method starts the attacs
    public void startBattle(){

        //keep attacking while there is no winner
        while(!Winner()){
            Character.attack((jedis[(int)(Math.random() * jedis.length)]), (troopers[(int)(Math.random() * troopers.length)]));
            try{
                Thread.sleep(500);
            }catch(InterruptedException e){System.out.println(e);}
        }
    }
}