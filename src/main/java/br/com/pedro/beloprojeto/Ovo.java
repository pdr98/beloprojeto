package br.com.pedro.beloprojeto;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class Ovo {
	
		private Integer tamanho;
		private Integer fritada;
		private boolean quebrado;
		
		public Ovo(Integer tamanho) {
			this.tamanho = tamanho;
			this.fritada = 0;
			this.quebrado = false;
		}
		
		public void quebrar() {
			this.quebrado = true;
		}
		
		public void fritar() {
			if(!this.quebrado) {
				throw new RuntimeException("Não pode fritar o ovo sem quebrar");
			}
			this.fritada++;
		}

		public Integer getTamanho() {
			return this.tamanho;
		}

		public EnumStatusOvo getStatus() {
			
			if (tamanho > 0 && fritada > 0) {
				
				BigDecimal t = BigDecimal.valueOf(tamanho);
				BigDecimal f = BigDecimal.valueOf(fritada);
				BigDecimal cal = f.divide(t, 2, RoundingMode.FLOOR);
				
				if (cal.compareTo(BigDecimal.valueOf(50)) < 0) {
					return EnumStatusOvo.CRU;
				}
				if (cal.compareTo(BigDecimal.valueOf(100)) < 0) {
					return EnumStatusOvo.DELICIA;
				}
				if (cal.compareTo(BigDecimal.valueOf(75)) < 0) {
					return EnumStatusOvo.MEIO_QUEIMADO;
				}
				return EnumStatusOvo.QUEIMADO;
			}
			return EnumStatusOvo.CRU;
		}
	
			
	}
	



