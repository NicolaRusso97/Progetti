package com.nr.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.nr.entity.Player;
import com.nr.service.PlayersService;

@Controller
@RequestMapping("/")
public class PlayerController {
	@Autowired
	private PlayersService playerService;
	@GetMapping("/players")
	public String SquadList(Model model) {
		List<Player> thePlayers = playerService.getPlayers();
		model.addAttribute("players",thePlayers);
		return "PlayersList";
	}
}
