package com.nr.service;

import java.util.List;

import javax.transaction.Transactional;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nr.entity.Player;
import com.nr.repository.PlayersRepository;
@Service
public class PlayersService {
	@Autowired
	private PlayersRepository playerRepo;
	@Transactional
	public List<Player> getPlayers() {
		return playerRepo.getPlayers();
	}
	@Transactional
	public Player getPlayer(int idPlayer) {
		return playerRepo.getPlayer(idPlayer);
	}
	@Transactional
	public void saveOrUpdatePlayer(Player player) {
		playerRepo.saveOrUpdatePlayer(player);
	}
}
