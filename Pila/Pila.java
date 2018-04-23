package Pila;

public class Pila {

	private Nodo tope;

	
	
	public Pila() {
		
		this.setTope(null);
	}

	public Nodo getTope() {
		return tope;
	}

	public void setTope(Nodo tope) {
		this.tope = tope;
	}
	
	
	
	
	public Boolean isVacia(){
		return this.getTope() == null;
	}
	
	public void Poner(Integer dato) throws PilaVacioException{
		if(dato == null ) throw new  PilaVacioException();
		
		this.actualizarTope(new Nodo(dato,this.getTope()));
	}
	
	private void actualizarTope(Nodo nodo){
		this.setTope(nodo);
	}
	
	public void Sacar() throws PilaVacioException{
		if(this.isVacia()) throw new PilaVacioException();
		Nodo aux = this.getTope();
		
		this.actualizarTope(aux.getSig());
		aux.setSig(null);
	}
	
	public Integer Ver() throws PilaVacioException{
		if(this.isVacia()) throw new PilaVacioException();
		
		return this.getTope().getValor();
	}
	
	public void Vaciar(){
		while(!this.isVacia()){
			this.Sacar();
		}
	}
	public String toString(){
		String represet = "";
			Pila pilaAux = new Pila();
			while(!this.isVacia()){
				Integer dato = this.Ver();
				represet += dato;
				pilaAux.Poner(dato);
				this.Sacar();
			}
			while(!pilaAux.isVacia()){
				this.Poner(pilaAux.Ver());
				pilaAux.Sacar();
			}
		return represet;
	}
	
	public String toString2(){
		String represet = "";
		represet = this.Ver().toString();
		return represet;
	}
	
	
	
	public class Nodo{
		private Integer valor;
		private Nodo sig;
		
		
		public Nodo(Integer valor, Nodo sig) {
			this.setValor(valor);
			this.setSig(sig);
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
	
	}
	
	
}
