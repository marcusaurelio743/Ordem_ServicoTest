package helpdesktest.domains.enumns;

public enum Status {
	ABERTO(0,"ABERTO"),FECHADO(1,"FECHADO"),ANDAMENTO(2,"ANDAMENTO");
	
		private Integer codigo;
		private String descricao;
		
		public Integer getCodigo() {
			return codigo;
		}
		public String getDescricao() {
			return descricao;
		}
		private Status(Integer codigo, String descricao) {
			this.codigo = codigo;
			this.descricao = descricao;
		}
		
		public static Status toEnum(Integer cod) {
			if(cod ==null) {
				return null;
			}
			for(Status x : Status.values()) {
				if(cod.equals(x.getCodigo())) {
					return x;
				}
			}
			
			throw new IllegalArgumentException("STATUS Invalido");
		}
		
		

}
