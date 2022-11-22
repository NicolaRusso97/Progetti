package com.nr.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="players")
public class Player {
	@Id
	@Column
	private int id;
	@Column
	private String nome;
	@Column
	private String ruolo;
	@Column
	private int overall;
	@Column
	private String nazione;
	@Column
	private String link;
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE,CascadeType.REFRESH,CascadeType.DETACH})
	@JoinColumn(name="team_nome")
	private Team team;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getRuolo() {
		return ruolo;
	}
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}
	public int getOverall() {
		return overall;
	}
	public void setOverall(int overall) {
		this.overall = overall;
	}
	public String getNazione() {
		return nazione;
	}
	public void setNazione(String nazione) {
		this.nazione = nazione;
	}
	public String getLink() {
		return link;
	}
	public void setLink(String link) {
		this.link = link;
	}
	public Team getTeam() {
		return team;
	}
	public void setTeam(Team team) {
		this.team = team;
	}
	@Override
	public String toString() {
		return "Player [id=" + id + ", nome=" + nome + ", ruolo=" + ruolo + ", overall=" + overall + ", nazione="
				+ nazione + ", link=" + link + "]";
	}
	
}
