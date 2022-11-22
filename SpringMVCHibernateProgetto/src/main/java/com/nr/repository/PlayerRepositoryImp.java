package com.nr.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.nr.entity.Player;
@Repository
public class PlayerRepositoryImp implements PlayersRepository {
	@Autowired
	private SessionFactory factory;
	@Override
	public List<Player> getPlayers() {
		Session session = factory.getCurrentSession();
		Query<Player> theQuery = session.createQuery("from Player order by overall DESC",Player.class);
		return theQuery.getResultList();
	}
	@Override
	public Player getPlayer(int idPlayer) {
		Session session = factory.getCurrentSession();
		Player player = session.get(Player.class, idPlayer);
		return player;
	}
	@Override
	public void saveOrUpdatePlayer(Player player) {
		Session session = factory.getCurrentSession();
		session.saveOrUpdate(player);
		
	}

}
