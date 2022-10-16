package org.prototype;

import java.util.HashMap;
import java.util.Map;

public class GameRegistry {
    private Map<GameType,Game> games=new HashMap<GameType,Game>();
    public GameRegistry(){
        this.initialize();
    }
    public Game getGame(GameType type){
        try {
            return(Game) games.get(type).clone();
        } catch (CloneNotSupportedException e) {
         e.printStackTrace();
        }
        return null;
    }

    private void initialize() {
        //fetch data from database
        Ludo ludo=new Ludo();
        ludo.setName("LUDO");
       Pubg pubg=new Pubg();
    pubg.setName("PUBG");
    games.put(GameType.LUDO,ludo);
    games.put(GameType.PUBG,pubg);
    }
}
