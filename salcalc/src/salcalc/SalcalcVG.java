package salcalc;
import java.text.NumberFormat;
import javax.swing.JOptionPane;

public class SalcalcVG {
	private float vinss;
	private float virpf;
	private float pinss;
	private float pirpf;
	private float dirpf;
	private float fgts;
	private float bruto;
	private float liq;
	private float liqinss;
	private float liqdep;
	private int dep;
	NumberFormat nf = NumberFormat.getCurrencyInstance();
public SalcalcVG() {
	this( 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0f, 0);
	}

public SalcalcVG(float vinss, float virpf, float pinss, float pirpf, float dirpf, float fgts, float bruto, float liq,
		float liqinss, float liqdep, int dep) {
	this.vinss = vinss;
	this.virpf = virpf;
	this.pinss = pinss;
	this.pirpf = pirpf;
	this.dirpf = dirpf;
	this.fgts = fgts;
	this.bruto = bruto;
	this.liq = liq;
	this.liqinss = liqinss;
	this.liqdep = liqdep;
	this.dep = dep;
}

public float getVinss() {
	return vinss;
}

public void setVinss(float vinss) {
	this.vinss = vinss;
}

public float getVirpf() {
	return virpf;
}

public void setVirpf(float virpf) {
	this.virpf = virpf;
}

public float getPinss() {
	return pinss;
}

public void setPinss(float pinss) {
	this.pinss = pinss;
}

public float getPirpf() {
	return pirpf;
}

public void setPirpf(float pirpf) {
	this.pirpf = pirpf;
}

public float getDirpf() {
	return dirpf;
}

public void setDirpf(float dirpf) {
	this.dirpf = dirpf;
}

public float getFgts() {
	return fgts;
}

public void setFgts(float fgts) {
	this.fgts = fgts;
}

public float getBruto() {
	return bruto;
}

public void setBruto(float bruto) {
	this.bruto = bruto;
}

public float getLiq() {
	return liq;
}

public void setLiq(float liq) {
	this.liq = liq;
}

public float getLiqinss() {
	return liqinss;
}

public void setLiqinss(float liqinss) {
	this.liqinss = liqinss;
}

public float getLiqdep() {
	return liqdep;
}

public void setLiqdep(float liqdep) {
	this.liqdep = liqdep;
}

public int getDep() {
	return dep;
}

public void setDep(int dep) {
	this.dep = dep;
}


public void Listar() {
	JOptionPane.showMessageDialog(null, 
			"bruto: "+ 
	nf.format(this.getBruto()) + 
	" - fgts: " 
	+ nf.format(this.getFgts()) +
	" \ninss: " +
	nf.format(this.getPinss()) +
	" %, valor: " +
	nf.format(this.getVinss()) +
	"\nliquido sem " + "inss: " +
	nf.format(this.getLiqinss()) +
	"\nliquido dependente " +
	nf.format(this.getDep()) + 
	" dependente(s) " +
	nf.format(this.getLiqdep()) +
	"\nirpf: " +
	nf.format(this.getPirpf()) +
	"%, valor: " 
	+ nf.format(this.getVirpf()) 
	+ ", parcela dedutivel: " +
	nf.format(this.getDirpf()) +
	"\nliquido: " +
	nf.format(this.getLiq()));
	
}
public void Irpf() {
	this.setLiqdep(this.getLiqinss() - this.getDep() * 189.59f);
	if(this.getLiqdep() < 1903.99f) {
		this.setDirpf(0f);
		this.setPirpf(0f);
	}else if(this.getLiqdep() < 1903.99f) {
		this.setDirpf(0.075f);
		this.setPirpf(142.8f);
	}else if(this.getLiqdep() < 2826.66f) {
		this.setDirpf(0.15f);
		this.setPirpf(354.8f);
	}else if(this.getLiqdep() < 1903.99f) {
		this.setDirpf(0.225f);
		this.setPirpf(636.13f);
	}else if(this.getLiqdep() < 1903.99f) {
		this.setDirpf(0.275f);
		this.setPirpf(869.36f);
	}
	this.setVirpf(this.getLiqdep() * this.getPirpf() - this.getDirpf());
	this.setLiq(this.getLiqinss() - this.getVirpf());
	
	
}	


}

