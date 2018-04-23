package Cola;

public class Cola {

	
	private Nodo entr;
	private Nodo sali;
	
	
	public Cola(){
		this.setEntr(null);
		this.setSali(null);
	}
	
	public Nodo getEntr() {
		return entr;
	}
	
	public void setEntr(Nodo entr) {
		this.entr = entr;
	}
	
	public Nodo getSali() {
		return sali;
	}
	
	public void setSali(Nodo sali) {
		this.sali = sali;
	}
	
	public Boolean isVacia(){
		return this.getSali() == null;
	}
	
	public Integer Ver() throws ColaVacioException{
		if(this.isVacia()) throw new  ColaVacioException();
		return this.getSali().getValor();
	}
	
	public void Poner(Integer valor){
		Nodo aux = new Nodo (valor,null);
		if (! this.isVacia())
			this.getEntr().setSig(aux);
		else
			this.setSali(aux);
			this.setEntr(aux);
	}
	
	public void Sacar() throws ColaVacioException {
		if(this.isVacia()) throw new ColaVacioException();		
		Nodo nodo = this.getSali();
		this.setSali(nodo.getSig());
		if(this.getSali() == null) this.setEntr(null);
		nodo.setSig(null);
	}
	
	public String toString(){
		String rep = " " ;
		Cola colaux = new Cola();
		while(!this.isVacia()){
			Integer valor = this.Ver();
			rep += valor + " " ;
			colaux.Poner(valor);
			this.Sacar();
			}	
		while (!colaux.isVacia()){
			this.Poner(colaux.Ver());
			colaux.Sacar();
		}
		return rep;
	}
	class Nodo{
		private Integer valor;
		private Nodo sig;
		public Nodo(Integer valor, Nodo sig){
			this.setValor(valor);
			this.setSig(sig);
		}
		public Nodo(){
			this(null,null);
		}
		
		public Integer getValor() {
			return valor;
		}

		public void setValor(Integer valor) {
			this.valor = valor;
		}

		public Nodo getSig() {
			return sig;
		}

		public void setSig(Nodo sig) {
			this.sig = sig;
		}
		
		public String toString(){
			return this.getValor().toString();
		}
	}
}
