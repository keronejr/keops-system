package com.keops.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.keops.domain.Playlist;

@Repository
public class PlaylistDaoImpl implements PlaylistDao {

	@PersistenceContext
	private EntityManager em;
	
	@Override
	public void salvar(Playlist playlist) {
		em.persist(playlist);
	}

	@Override
	public List<Playlist> recuperar() {
		List<Playlist> retorno = em.createQuery("select p from Playlist p", Playlist.class).getResultList();
		if (retorno != null && retorno.size() == 0) 
			retorno = null;
		return retorno; 
	}

	@Override
	public Playlist recuperarPorID(long id) {
		return em.find(Playlist.class, id);
	}

	@Override
	public void atualizar(Playlist playlist) {
		em.merge(playlist);
	}

	@Override
	public void excluir(long id) {
		em.remove(em.getReference(Playlist.class, id));
	}

}
