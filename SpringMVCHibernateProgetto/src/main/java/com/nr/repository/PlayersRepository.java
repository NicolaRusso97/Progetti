package com.nr.repository;

import java.util.List;

import com.nr.entity.Player;

public interface PlayersRepository {

	public List<Player> getPlayers();

	public Player getPlayer(int idPlayer);

	public void saveOrUpdatePlayer(Player player);
}
