package org.wecancoeit.reviews;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.annotation.Resource;

public class GameController {

    @Resource
    private GameRepository gameRepo;

    @RequestMapping("/games")
    public String findAllGames(Model model){
        model.addAttribute("gamesModel", gameRepo.findAll());
        return "gamesTemplate";
    }
    @RequestMapping("/game")
    public String findOneGame(@RequestParam(value="id") Long id, Model model){
        model.addAttribute("gameModel", gameRepo.findOne(id));
        return "gameTemplate";
    }
}
