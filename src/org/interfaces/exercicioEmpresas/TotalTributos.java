package org.interfaces.exercicioEmpresas;

public class TotalTributos {
	private double total;

		public TotalTributos() {
		super();
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}
	
	public void totalizarTributos(Tributos t) {
		this.total+=t.calcularIcms();
		this.total+=t.calcularIrenda();
		
		System.out.println(t.toString()+"\n"+"ICMS "+t.calcularIcms());
		System.out.println("IR "+t.calcularIrenda()+"\n");
	}

}
