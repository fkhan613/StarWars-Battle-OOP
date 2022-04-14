class Jedi extends Character{
    private String name;
    private String[] jediNames = {"Qui-Gon Jinn", "Anakin Skywalker", "Quinlan Vos", "Mace Windu", "Plo Koon", "Yaddle", "Oppo Rancisis", "Eeth Koth", "Yoda", "Yaddle", "Aayla Secura", "Arath Tarrex", "Count Dooku", "Katooni", "Ki-Adi Mundi", "Obi-Wan Kenobi", "Zett Jukassa", "Yeeda", "Yula Braylon", "Qui-Gon Jinn", "Oo'ob ", "Pong Krell", "Naq Med", "Marseph ", "Huulik", "Ima-Gun Di", "Jmmaar", "Ben Solo", "Jaro Tapal", "Huulik", "Kanan Jarrus", "Kanan Jarrus", "Kirak Infil'a", "Nim Pianna", "Tutso Mara", "The Grand Inquisitor", "Sifo-Dyas", "Rissa Mano", "Petro Rissa Mano", "Nahdar Vebb", "Luke Skywalker", "Whie Malreaux"};

    //constructor
    public Jedi(){
        super("jedi", 100, 100, 100);
        this.name = jediNames[(int)(Math.random() * jediNames.length-1) + 0];
    }

    //Getter and Setter
    public String getName(){return this.name;}
    public void setName(String v){this.name = v;}
}