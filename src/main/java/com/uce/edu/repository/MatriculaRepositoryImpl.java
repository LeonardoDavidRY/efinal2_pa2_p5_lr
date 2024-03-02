package com.uce.edu.repository;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.support.TransactionSynchronizationManager;

import com.uce.edu.repository.modelo.Matricula;
import com.uce.edu.repository.modelo.dto.MatriculaDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import jakarta.transaction.Transactional.TxType;

@Transactional
@Repository
public class MatriculaRepositoryImpl implements IMatriculaRepository {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional(value = TxType.NOT_SUPPORTED)
	public List<MatriculaDTO> seleccionarTodosEficiente() {

		TypedQuery<MatriculaDTO> myQuery = this.entityManager.createQuery(""
				+ "select new com.example.demo.matricula.repo.modelo.dto.MatriculaDTO(m.estudiante.cedula,m.materia.nombre,m.materia.cedulaProfesor,m.nombreHilo) "
				+ "from Matricula m", MatriculaDTO.class);

		return myQuery.getResultList();
	}

	@Override
	@Transactional(value = TxType.REQUIRED)//REQUIRED porque exige la programción en paralelo
	public void insertar(Matricula matricula) {
		System.out.println("Repo " + TransactionSynchronizationManager.isActualTransactionActive());
		this.entityManager.persist(matricula);
	}

}
