package com.nr.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="teams")
public class Team {
	@Id
	@Column
	private String nome;
	@OneToOne
	@JoinColumn(name="accounts_id")
	private Account acc;
	@OneToMany(mappedBy = "team", cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	private List<Player> players;
	public Team() {}
	public void add(Player player) {
		if(players == null)
			players = new ArrayList<>();
		players.add(player);
		player.setTeam(this);
	}
	public List<Player> getPlayers() {
		return players;
	}
	public void setPlayers(List<Player> players) {
		this.players = players;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account account) {
		this.acc = account;
	}
	@Override
	public String toString() {
		return "Team [nome=" + nome + "]";
	}
	public Team(String nome) {
		super();
		this.nome = nome;
	}
}
