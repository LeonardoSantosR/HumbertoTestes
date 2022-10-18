import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.google.common.graph.SuccessorsFunction;

public class Tentativa1Teste {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Scanner teclado = new Scanner(System.in);
		
		String pesquisa;
		int esperado = 1;
		int resultado = 0;
		
		System.out.println("Qual é o nome do jogo");
		pesquisa = teclado.nextLine();
		String Jogo1 = ("A");
		String Jogo2 = ("B");
		
	
		if ( pesquisa.equals(Jogo1)) {
			System.out.println("O jogo " + Jogo1 +" tem 23,439 jogadores diarios");
			resultado = 1;
		assertEquals(esperado, resultado,0);	
		}else {
				fail("Not yet implemented");
			}
		}
	
	
	}


