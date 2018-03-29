package br.com.eu.financas.test;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.eu.financas.modelo.Conta;

public class TestConta {

	public static void main(String[] args) {

		Conta conta = new Conta();
		conta.setTitular("Rafael");
		conta.setAgencia("123456");
		conta.setBanco("BB");
		conta.setNumero("654321");
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas"); 
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
	}

}
