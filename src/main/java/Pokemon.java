public class Pokemon {

    String name;
    int level;

    Pokemon(){
        level = 1;
    }

    Pokemon(String pName, int pLevel){
        name = pName;
        level = pLevel;
    }

    void attack(){
        System.out.println(name + " Attack !");
    }
}

//    Pokemon(String pName, int pLevel){
//        this.name = name;
//        this.level = level;
//    }
