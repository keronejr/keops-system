package com.keops.services;

import java.util.List;

import com.keops.domain.Playlist;

public interface PlaylistService {
	  
	   void salvar(Playlist playlist);
	   List<Playlist> recuperar();
	   Playlist recuperarPorId(long id);
	   void atualizar(Playlist playlist);
	   void excluir(long id);
	  
	}
