package br.com.decolar.entities;

public class Voo {
	public final static int VOO_DISPONIVEL_NAO = 0;
	public final static int VOO_DISPONIVEL_SIM = 1;

	public Integer voonum;
	public String voocompanhia;
	public String vooorigem;
	public String voodestino;
	public String vooduracao;
	public String vooaviao;
	public Integer voodisponivel;
	
	public Voo() {}
	
	public Voo(Integer voonum, String voocompanhia, String vooorigem, String voodestino, String vooduracao, String vooaviao, Integer voodisponivel) {
		this.voonum = voonum;
		this.voocompanhia = voocompanhia;
		this.vooorigem = vooorigem;
		this.voodestino = voodestino;
		this.vooduracao = vooduracao;
		this.vooaviao = vooaviao;
		this.voodisponivel = voodisponivel;
	}

	public Integer getVoonum() {
		return voonum;
	}

	public void setVoonum(Integer voonum) {
		this.voonum = voonum;
	}
	
	public String getVoocompanhia() {
		return voocompanhia;
	}

	public void setVoocompanhia(String voocompanhia) {
		this.voocompanhia = voocompanhia;
	}

	public String getVooorigem() {
		return vooorigem;
	}

	public void setVooorigem(String vooorigem) {
		this.vooorigem = vooorigem;
	}

	public String getVoodestino() {
		return voodestino;
	}

	public void setVoodestino(String voodestino) {
		this.voodestino = voodestino;
	}

	public String getVooduracao() {
		return vooduracao;
	}

	public void setVooduracao(String vooduracao) {
		this.vooduracao = vooduracao;
	}

	public String getVooaviao() {
		return vooaviao;
	}

	public void setVooaviao(String vooaviao) {
		this.vooaviao = vooaviao;
	}

	public Integer getVoodisponivel() {
		return voodisponivel;
	}

	public void setVoodisponivel(Integer voodisponivel) {
		this.voodisponivel = voodisponivel;
	}

	public static int getVooDisponivelNao() {
		return VOO_DISPONIVEL_NAO;
	}

	public static int getVooDisponivelSim() {
		return VOO_DISPONIVEL_SIM;
	}
}