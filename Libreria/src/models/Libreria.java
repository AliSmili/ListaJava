package models;

public class Libreria {
	private String nombre;
	private CD[] listaCDs;
	private Libro[] listaLibros;

	public Libreria(String nombre, CD[] listaCDs, Libro[] listaLibros) {
		this.nombre = nombre;
		this.listaCDs = listaCDs;
		this.listaLibros = listaLibros;
	}

	public String getNombre() {
		return nombre;
	}

	public CD[] getListaCDs() {
		return listaCDs;
	}

	public Libro[] getListaLibros() {
		return listaLibros;
	}

	/**
	 * Devuelve el CD más caro
	 * 
	 * @return CD con mayor
	 */
	public CD getCDmasCaro() {
		CD cdMasCaro = listaCDs[0];

		for (int i = 0; i < listaCDs.length - 1; i++) {
			if (cdMasCaro.getPrecio() < listaCDs[i + 1].getPrecio()) {
				cdMasCaro = listaCDs[i + 1];
			}
		}
		return cdMasCaro;
	}

	public float getPrecioTotalCDs() {
		float precioTotal = 0.0f;
		for (int i = 0; i < listaCDs.length; i++) {
			precioTotal += listaCDs[i].getPrecio();
		}
		return precioTotal;
	}
	
	public float getPrecioTotalCDsPRO() {
		float precioTotal = 0.0f;
		for (CD miCD : listaCDs) {
			precioTotal += miCD.getPrecio();
		}
		return precioTotal;
	}

}
