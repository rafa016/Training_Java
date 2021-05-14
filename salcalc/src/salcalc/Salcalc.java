package salcalc;

import javax.swing.JOptionPane;

public class Salcalc {

	float salb;
	float salliq;
	float inss;
	float irrf;
	float fgts;
	
	public Salcalc() {
		this(0f, 0f, 0f, 0f, 0f);
		
	}

	public Salcalc(float salb, float salliq, float inss, float irrf, float fgts) {
		this.salb = salb;
		this.salliq = salliq;
		this.inss = inss;
		this.irrf = irrf;
	}

	public float getSalb() {
		return salb;
	}

	public void setSalb(float salb) {
		this.salb = salb;
	}
	public float getFgts() {
		return fgts;
	}

	public void setFgts(float fgts) {
		this.fgts = fgts;
	}

	public float getSalliq() {
		return salliq;
	}

	public void setSalliq(float salliq) {
		this.salliq = salliq;
	}

	public float getInss() {
		return inss;
	}

	public void setInss(float d) {
		this.inss = d;
	}

	public float getIrrf() {
		return irrf;
	}

	public void setIrrf(float irrf) {
		this.irrf = irrf;
	}
	
	public void CalcularIrrf(){
		
		if (this.getInss() < 1903.98f) {
			JOptionPane.showMessageDialog(null, "Não é discontado nenhum valor");
		}else if(getInss() < 2826.65f) {
			this.setIrrf(salb*0.075f - 142.80f);
		}else if(getInss() < 3751.05f) {
			this.setIrrf(salb*0.15f - 354.80f);
		}else if(getInss() < 4664.68f) {
			this.setIrrf(salb*0.225f - 636.13f);
		}else {
			this.setIrrf(salb*0.275f - 869.36f);
		}
	}
	public void CalcularInss(float x) {
		this.setSalb(x);
		 if(salb < 1693.72f) {
			this.setInss(salb*1.08f);
		}else if(salb < 2822.90f) {
			this.setInss(salb*1.09f);
		}else {
			
			this.setInss(salb*1.11f);
		
		}
	}
	public void CalcularSalliq() {
		this.setSalliq(this.getInss() - this.getIrrf());
	}
	
	}
	


