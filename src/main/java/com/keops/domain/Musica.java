package com.keops.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.Range;

@Entity
@Table(name = "musicas")
public class Musica {
  
      @Id
      @GeneratedValue(strategy = GenerationType.IDENTITY)
      private long id;
  
      @NotBlank
      @Size(min = 2, max = 50)
      @Column(nullable = false, length = 50)
      private String titulo;
  
      @NotBlank
      @Size(min = 2, max = 50)
      @Column(nullable = false, length = 50)
      private String banda;
  
      @Range(min = 0, max = 10)
      @Column(nullable = false)
      private int nota;
  
      @ManyToOne
      @JoinColumn(name = "id_playlist_fk")
      private Playlist playlist;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public int getNota() {
		return nota;
	}

	public void setNota(int nota) {
		this.nota = nota;
	}

	public Playlist getPlaylist() {
		return playlist;
	}

	public void setPlaylist(Playlist playlist) {
		this.playlist = playlist;
	}
  
      
}
