package edu.ufp.inf.lp2.projetoAeroporto;

import java.util.Vector;

public class Aeroporto {
    
    private String nome_aeroporto;

  private String sigla;

  private String cidade;

  private String pais;

  private String continente;

  private float classificacao;

    public Aeroporto(String nome_aeroporto, String sigla, String cidade, String pais, String continente, float classificacao) {
        this.nome_aeroporto = nome_aeroporto;
        this.sigla = sigla;
        this.cidade = cidade;
        this.pais = pais;
        this.continente = continente;
        this.classificacao = classificacao;
    }

    public Aeroporto() {
    }

    

    
     @Override
    public String toString() {
        String valores = "Aeroporto@{Nome_Aeroporto="+nome_aeroporto+
                         ", Sigla="+sigla+
                         ", Cidade="+cidade+
                         ", Pais="+pais+
                         ", Continente="+continente+
                         ", Classificacao="+classificacao+"}";
        
        return valores;
    }
    
    
    
    /**
     * @return the nome_aeroporto
     */
    public String getNome_aeroporto() {
        return nome_aeroporto;
    }

    /**
     * @param nome_aeroporto the nome_aeroporto to set
     */
    public void setNome_aeroporto(String nome_aeroporto) {
        this.nome_aeroporto = nome_aeroporto;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the cidade
     */
    public String getCidade() {
        return cidade;
    }

    /**
     * @param cidade the cidade to set
     */
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    /**
     * @return the pais
     */
    public String getPais() {
        return pais;
    }

    /**
     * @param pais the pais to set
     */
    public void setPais(String pais) {
        this.pais = pais;
    }

    /**
     * @return the continente
     */
    public String getContinente() {
        return continente;
    }

    /**
     * @param continente the continente to set
     */
    public void setContinente(String continente) {
        this.continente = continente;
    }

    /**
     * @return the classificacao
     */
    public float getClassificacao() {
        return classificacao;
    }

    /**
     * @param classificacao the classificacao to set
     */
    public void setClassificacao(float classificacao) {
        this.classificacao = classificacao;
    }

  

    /**
   * 
   * @element-type Aviao
   */
  public Vector <Aviao> avioes=new Vector();

  public void addAviao(Aviao v) {
      this.avioes.add(v);
  }

  public void remAviao(Aviao v) {
  }

  public Aviao searchAviao(Aviao v) {
  return null;
  }

}