package padroesarquiteturais.interator;

public class Colecao implements InterfaceColecao {
	
	private String vetor[] = {"Fulano", "Beltrano", "Ciclano"};

	@Override
	public InterfaceIterator criarIterator() {
		RecordIterator iterator = new RecordIterator();
		return iterator;
	}

	private class RecordIterator implements InterfaceIterator {
		
		private int index;
	
		@Override
		public boolean hasNext() {
			if (index < vetor.length) {
				return true;
			} else {
				return false;
			}
		}
	
		@Override
		public Object next() {
			if (this.hasNext()) {
				return vetor[index++];
			} else {
				return null;
			}
		}
	
	}
	
}
