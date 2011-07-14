package cc.ttlabs.dojo.quemmanda;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuemMandaTest {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	// Fulano � empregado de uma grande corpora��o
	// Fulano quando est� no [trabalho] n�o tem autoridade
	// e quem manda por l� � o seu Chefe
	
	@Test
	public void chefeMandaNoTrabalho()
	{
		Fulano f = new Fulano();
		Trabalho t = new Trabalho(f);
		assertFalse(t.quemManda().equals(f));
	}
	
	
	// Fulano � lider de uma banda
	// E quando est� no [palco] � o dono da situa��o
	// e junto com seus parceiros de banda fazem 
	// a alegria do p�blico
	
	
	// Fulano tem uma familia, mulher e dois filhos
	// mas em [casa] ele sempre tem autoridade
	// de dizer a sua mulher quem � que manda: ela. 
	
	
	
}
