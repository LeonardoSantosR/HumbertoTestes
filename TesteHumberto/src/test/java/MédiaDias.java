import static org.junit.Assert.*;

import java.util.Scanner;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MédiaDias {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		
		Scanner teclado = new Scanner(System.in);

		int Dias;
		System.out.println("Quer é a janela de quantos dias?");
		int dias = teclado.nextInt();
		
		double somadias = 0;
		for(int i = 0 ; i < dias; i++) {
			System.out.println("Quantos jogadores no  dia" + (i + 1));
			Double jogadores_dia = teclado.nextDouble();
			somadias = somadias + jogadores_dia;
			
		}
		
		int esperado = 1;
		int resultado;
		Double Media;
		
		Media =  (double) somadias/ dias;
		System.out.println(Media);
		if ( Media > 0) {
			resultado = 1;
			assertEquals(esperado, resultado,0);
		} else {
		fail("Not yet implemented");
		}
	}

}
