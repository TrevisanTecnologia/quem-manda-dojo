package cc.ttlabs.dojo.quemmanda;


import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QuemMandaTest {

	Fulano f;
	
	@Before
	public void setUp() throws Exception {
	   f = new Fulano();
	}

	@After
	public void tearDown() throws Exception {
	}

	// TODO testes devem ser expressivos e n�o precisar de nenhum coment�rio
	
	// Fulano � empregado de uma grande corpora��o
	// Fulano quando est� no [trabalho] n�o tem autoridade
	// e quem manda por l� � o seu Chefe
	
	@Test
	public void chefeMandaNoTrabalho()
	{
		
		ContextoDeAutoridade contexto = new Trabalho(f);
		
		Object pessoa = contexto.quemManda();
		
		assertTrue(pessoa instanceof Chefe);

	}
	
	// Fulano � lider de uma banda
	// E quando est� no [palco] � o dono da situa��o
	// e junto com seus parceiros de banda fazem 
	// a alegria do p�blico

	//TODO implementar contexto do palco
	
	// Fulano tem uma familia, mulher e dois filhos
	// mas em [casa] ele sempre tem autoridade
	// de dizer a sua mulher quem � que manda: ela. 
	
	//TODO contexto do fulano com a familia � a casa, n�o a familia. 
	
	@Test
	public void mulherMandaEmCasa(){
	    
		ContextoDeAutoridade contexto = new Casa(f);
		
		Object pessoa = contexto.quemManda();
		
		assertTrue(pessoa instanceof Mulher);
	}
	
	// Fulano � empregado de uma grande corpora��o
	// Fulano quando est� no [trabalho] n�o tem autoridade
	// e quem manda por l� � o seu Chefe

	
	@Test 
	public void fulanoQuandoFazCheckinNoTrabalhoNaoTemAutoridade()
	{
		Trabalho trabalho = new Trabalho();
		trabalho.checkin(f);
		
		assertFalse(f.temAutoridade());
		
	}
	
	
}
