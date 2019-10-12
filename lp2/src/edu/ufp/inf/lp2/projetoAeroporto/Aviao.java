package edu.ufp.inf.lp2.projetoAeroporto;

public class Aviao {

    private int id_aviao;

    private String modelo;

    private String nome;

    private String companhia_aerea;

    private long velocidade_cruzeiro;

    private long altitude;

    private long distancia_maxima;

    private String cod_aeroporto;

    private int capacidade_de_passageiros;

    private long capacidadeDeposito;

    public Aviao(int id_aviao, String modelo, String nome, String companhia_aerea, long velocidade_cruzeiro, long altitude, long distancia_maxima, String cod_aeroporto, int capacidade_de_passageiros, long capacidadeDeposito) {
        this.id_aviao = id_aviao;
        this.modelo = modelo;
        this.nome = nome;
        this.companhia_aerea = companhia_aerea;
        this.velocidade_cruzeiro = velocidade_cruzeiro;
        this.altitude = altitude;
        this.distancia_maxima = distancia_maxima;
        this.cod_aeroporto = cod_aeroporto;
        this.capacidade_de_passageiros = capacidade_de_passageiros;
        this.capacidadeDeposito = capacidadeDeposito;
    }

    

    public Aviao() {
    }
    
    
     @Override
    public String toString() {
        String valores = "Aviao@{id="+id_aviao+
                         ", Modelo="+modelo+
                         ", Nome="+nome+
                         ", Companhia="+companhia_aerea+
                         ", velocidade="+velocidade_cruzeiro+
                         ", altitude="+altitude+
                         ", distancia="+distancia_maxima+
                         ", cod_Aereporto="+cod_aeroporto+
                         ", Capacidade Passageiros="+capacidade_de_passageiros+
                         ", Capacidade Deposito="+capacidadeDeposito+"}\n";

        
        return valores;
    }

    public double calculaConsumo(Voo v) {
        return 0.0;
    }

    /**
     * @return the id_aviao
     */
    public int getId_aviao() {
        return id_aviao;
    }

    /**
     * @param id_aviao the id_aviao to set
     */
    public void setId_aviao(int id_aviao) {
        this.id_aviao = id_aviao;
    }

    /**
     * @return the modelo
     */
    public String getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the companhia_aerea
     */
    public String getCompanhia_aerea() {
        return companhia_aerea;
    }

    /**
     * @param companhia_aerea the companhia_aerea to set
     */
    public void setCompanhia_aerea(String companhia_aerea) {
        this.companhia_aerea = companhia_aerea;
    }

    /**
     * @return the velocidade_cruzeiro
     */
    public long getVelocidade_cruzeiro() {
        return velocidade_cruzeiro;
    }

    /**
     * @param velocidade_cruzeiro the velocidade_cruzeiro to set
     */
    public void setVelocidade_cruzeiro(long velocidade_cruzeiro) {
        this.velocidade_cruzeiro = velocidade_cruzeiro;
    }

    /**
     * @return the distancia_maxima
     */
    public long getDistancia_maxima() {
        return distancia_maxima;
    }

    /**
     * @param distancia_maxima the distancia_maxima to set
     */
    public void setDistancia_maxima(long distancia_maxima) {
        this.distancia_maxima = distancia_maxima;
    }

    /**
     * @return the cod_aeroporto
     */
    public String getCod_aeroporto() {
        return cod_aeroporto;
    }

    /**
     * @param cod_aeroporto the cod_aeroporto to set
     */
    public void setCod_aeroporto(String cod_aeroporto) {
        this.cod_aeroporto = cod_aeroporto;
    }

    /**
     * @return the capacidade_de_passageiros
     */
    public int getCapacidade_de_passageiros() {
        return capacidade_de_passageiros;
    }

    /**
     * @param capacidade_de_passageiros the capacidade_de_passageiros to set
     */
    public void setCapacidade_de_passageiros(int capacidade_de_passageiros) {
        this.capacidade_de_passageiros = capacidade_de_passageiros;
    }

    /**
     * @return the capacidadeDeposito
     */
    public long getCapacidadeDeposito() {
        return capacidadeDeposito;
    }

    /**
     * @param capacidadeDeposito the capacidadeDeposito to set
     */
    public void setCapacidadeDeposito(long capacidadeDeposito) {
        this.capacidadeDeposito = capacidadeDeposito;
    }

    /**
     * @return the altitude
     */
    public long getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(long altitude) {
        this.altitude = altitude;
    }

}
