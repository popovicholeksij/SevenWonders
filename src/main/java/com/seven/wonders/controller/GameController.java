package com.seven.wonders.controller;

import com.seven.wonders.core.Application;
import com.seven.wonders.core.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Pavel Ruban on 02.04.2017.
 * Controller for Game Form
 */
@Scope(scopeName = "prototype")
@Controller
public class GameController {

    @Autowired
    private Application application;

    @Autowired
    private Session session;

//    @RequestMapping(value = "/newgame", method = {RequestMethod.GET,RequestMethod.POST})
//    public String newgame(Model model){
//        model.addAttribute("players", application.getAllGames().get(session.getCurrentGameId()).getPlayers());
//        return "newgame";
//    }
//
//    @RequestMapping(value = "/newgame/leave", method = {RequestMethod.GET,RequestMethod.POST})
//    public String login(Model model){
//        model.addAttribute("allGames", application.getAllGames().values());
//        return "redirect:login";
//    }

}