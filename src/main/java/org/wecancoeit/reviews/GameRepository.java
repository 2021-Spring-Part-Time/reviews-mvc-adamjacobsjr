package org.wecancoeit.reviews;


import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class GameRepository {

    public GameRepository(){
        Game biomutant = new Game(1L, "Biomutant","/images/biomutant.jpg", "  A plague is ruining the land and the Tree-of-Life is bleeding death from its roots. The Tribes stand divided, in need of someone strong enough to unite them or bring them all down…", "Biomutant is my favorite game release this year. Its a refreshing and creative game full of fun interactive characters. I have enjoyed playing each of the available classes and found new challenges each time.", "10/10");
        Game cyberpunk = new Game(2L, "Cyberpunk","/images/cyberpunk.jpeg", "  Cyberpunk 2077 is an open-world, action-adventure story set in Night City, a megalopolis obsessed with power, glamour and body modification. You play as V, a mercenary outlaw going after a one-of-a-kind implant that is the key to immortality.", "After an incredibly rocky start full of bugs and crashes Cyberpunk provides an immersive and engaging world that has something for everyone. As the developer continues to fix and update I look forward to seeing the DLC they have planned. ", "8.75/10");
        Game outriders = new Game(3L, "Outriders","/images/outriders.jpg", "  Outriders is a third-person shooter mixed with elements from role-playing games. In the beginning of the game, players create their custom characters and choose from four classes, each of them with unique abilities that the players can use ", "This game was unfortunately an uninspired attempt at another franchise. The gameplay is meh, and the controls feel clunky. The skill tree is convoluted and uninspired. This feels like a reskin of the a game we have all played a thousand times. ", "6.5/10");

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
