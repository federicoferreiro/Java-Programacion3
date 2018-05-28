package Booleano;

public enum Booleano{
	VERDADERO{

		@Override
		void or(Booleano b2) {
			System.out.println("VERDADERO");		
		}

		@Override
		void not() {
			System.out.println("FALSO");
		}

		@Override
		void and(Booleano b2) {
			if (b2 == VERDADERO)
				System.out.println("VERDADERO");
			else
			System.out.println("FALSO");			
		}

		@Override
		void xor(Booleano b2) {
			// TODO Auto-generated method stub
			 
		}

		@Override
		void equals(Booleano b2) {
			if(b2==FALSO)
				System.out.println("FALSO");
			else
				System.out.println("VERDADERO");
		}
		
	},
	FALSO{

		@Override
		void or(Booleano b2) {
			if (b2 == VERDADERO)
				System.out.println("VERDADERO");
			else
			System.out.println("FALSO");
		}

		@Override
		void not() {
			System.out.println("VERDADERO");
		}

		@Override
		void and(Booleano b2) {
			// TODO Auto-generated method stub
			System.out.println("FALSO");
		}

		@Override
		void xor(Booleano b2) {
			// TODO Auto-generated method stub
			
		}

		@Override
		void equals(Booleano b2) {
			if(b2==FALSO)
				System.out.println("VERDADERO");
			else
				System.out.println("FALSO");
		}
		
	};


	abstract void  or (Booleano b2);
	abstract void not();
	abstract void and(Booleano b2);
	abstract void xor(Booleano b2);
	abstract void equals(Booleano b2);

}