package com.keops.services;

import java.util.List;

import com.keops.domain.Musica;

public interface MusicaService {

	   void salvar(Musica musica, long playlistId);
	   List<Musica> recuperarPorPlaylist(long playlistId);
	   Musica recuperarPorPlaylistIdEMusicaId
	    (long playlistId, long musicaId);
	   void atualizar(Musica musica, long playlistId);
	   void excluir(long playlistId, long musicaId);
	   
}
