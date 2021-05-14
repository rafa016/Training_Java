package viagem;
public class Custos {
	public double tot;
	public Custos() {
		this(0d);
	}
	public Custos(double tot) {
		this.tot = tot;
	}
	public double getTot() {
		return tot;
	}
	public void setTot(double tot) {
		this.tot = tot;
	}

	public void Calc(Percurso perc){
		this.setTot(perc.getComb() * perc.getKm() + perc.getPed() );
		
	}
}
