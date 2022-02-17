package br.com.alura.lojajpa.testes;

import java.math.BigDecimal;

import javax.persistence.EntityManager;

import br.com.alura.lojajpa.dao.ProdutoDao;
import br.com.alura.lojajpa.modelo.Categoria;
import br.com.alura.lojajpa.modelo.Produto;
import br.com.alura.lojajpa.util.JPAUtil;

public class CadastroDeProduto {

	public static void main(String[] args) {
		Produto celular = new Produto("Xiaomi Redmi", "Muito legal", new BigDecimal("800"), Categoria.CELULARES );
		
		EntityManager em = JPAUtil.getEntityManager();
		
	    ProdutoDao dao = new ProdutoDao(em);
	    
	    em.getTransaction().begin();
	    dao.cadastrar(celular);
	    em.getTransaction().commit();
	    em.close();
	   
	        }   
	}





