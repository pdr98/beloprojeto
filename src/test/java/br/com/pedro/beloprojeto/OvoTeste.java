package br.com.pedro.beloprojeto;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class OvoTeste {
	
	
		@Test
		public void fritarNaoQuebradoTest() {
			Ovo ovo = new Ovo(10);
			assertEquals(EnumStatusOvo.CRU, ovo.getStatus());
			for (int i = 0; i < 499; i++) {
				ovo.fritar();
			}
			assertEquals(EnumStatusOvo.CRU, ovo.getStatus());
		}
		
		@Test
		public void getStatusDeliciaTest() {
			Ovo ovo = new Ovo(10);
			for (int i = 0; i < 500; i++) {
				ovo.fritar();
			}
			assertEquals(EnumStatusOvo.DELICIA, ovo.getStatus());
			for (int i = 0; i < 499; i++) {
				ovo.fritar();
			}
			assertEquals(EnumStatusOvo.DELICIA, ovo.getStatus());
		}
		
		@Test
		public void getStatusQueimadoTest() {
			Ovo ovo = new Ovo(10);
			for (int i = 0; i < 1000; i++) {
				ovo.fritar();
			}
			assertEquals(EnumStatusOvo.QUEIMADO, ovo.getStatus());
		}
		
		@Test
		public void getStatusMeioQueimadoTest() {
			Ovo ovo = new Ovo(10);
			for (int i = 0; i < 750; i++) {
				ovo.fritar();
			}
			assertEquals(EnumStatusOvo.MEIO_QUEIMADO, ovo.getStatus());
		}
		
		
	}

