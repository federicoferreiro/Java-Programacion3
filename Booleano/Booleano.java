package Booleano;

public enum Booleano{
	VERDADERO{

		@Override
		void or(Booleano b2) {
			System.out.println(this);
		}


		@Override
		void not() {
			System.out.println(Booleano.FALSO);
		}

		@Override
		void and(Booleano b2) {
			if (b2 == VERDADERO)
				System.out.println(this);
			else
				System.out.println(Booleano.FALSO);			
		}

		@Override
		void xor(Booleano b2) {
			// TODO Auto-generated method stub
			 
		}

		@Override
		void equals(Booleano b2) {
			if(b2==FALSO)
				System.out.println(Booleano.FALSO);
			else
				System.out.println(this);
		}
		
	},
	FALSO{

		@Override
		void or(Booleano b2) {
			if (b2 == VERDADERO)
				System.out.println(Booleano.VERDADERO);
			else
			System.out.println(this);
		}

		@Override
		void not() {
			System.out.println(Booleano.VERDADERO);
		}

		@Override
		void and(Booleano b2) {
			// TODO Auto-generated method stub
			System.out.println(this);
		}

		@Override
		void xor(Booleano b2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		void equals(Booleano b2) {
			if(b2==FALSO)
				System.out.println(Booleano.VERDADERO);
			else
				System.out.println(this);
		}
		
	};


	abstract void  or (Booleano b2);
	abstract void not();
	abstract void and(Booleano b2);
	abstract void xor(Booleano b2);
	abstract void equals(Booleano b2);
	
	private static Object valueOf(Booleano B2) {
		// TODO Auto-generated method stub
		
		if (B2 == VERDADERO)
			return Booleano.VERDADERO;
		else
			return Booleano.FALSO;
	}

}