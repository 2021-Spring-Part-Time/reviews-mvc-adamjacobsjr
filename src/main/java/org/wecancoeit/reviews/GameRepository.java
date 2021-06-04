package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GameRepository {

    public GameRepository(){
        Game biomutant = new Game(1L, "Biomutant", "  description", "review", "10/10");
        Game cyberpunk = new Game(2L, "Cyberpunk", "  description", "review", "10/10");
        Game outriders = new Game(3L, "Outriders", "  description", "review", "10/10");

        gamesList.put(biomutant.getId(), biomutant);
        gamesList.put(cyberpunk.getId(), cyberpunk);
        gamesList.put(outriders.getId(), outriders);

    }

        Map<Long, Game> gamesList = new HashMap<>();

    public GameRepository(Game ...gamesToAdd){
        for(Game game: gamesToAdd){
            gamesList.put(game.getId(), game);
        }
    }


    public Game findOne(long id){
        return gamesList.get(id);
    }
    public Collection<Game> findAll(){
        return gamesList.values();
    }

}
