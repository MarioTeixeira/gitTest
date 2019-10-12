package edu.ufp.inf.lp2.projetoAeroporto;
import edu.ufp.inf.lp2.intro.Date;


public class Voo {

  private int id;

  private Aeroporto origem;

  private Aeroporto destino;

  private double tailwind;

  private double altitude;

  private int nPassageiros;

  private Date data;

    public Voo(int id, Aeroporto origem, Aeroporto destino, double tailwind, double altitude, int nPassageiros, Date data) {
        this.id = id;
        this.origem = origem;
        this.destino = destino;
        this.tailwind = tailwind;
        this.altitude = altitude;
        this.nPassageiros = nPassageiros;
        this.data = data;
    }

    
  public void addAeroporto(Aeroporto a) {
  }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the origem
     */
    public Aeroporto getOrigem() {
        return origem;
    }

    /**
     * @param origem the origem to set
     */
    public void setOrigem(Aeroporto origem) {
        this.origem = origem;
    }

    /**
     * @return the destino
     */
    public Aeroporto getDestino() {
        return destino;
    }

    /**
     * @param destino the destino to set
     */
    public void setDestino(Aeroporto destino) {
        this.destino = destino;
    }

    /**
     * @return the tailwind
     */
    public double getTailwind() {
        return tailwind;
    }

    /**
     * @param tailwind the tailwind to set
     */
    public void setTailwind(double tailwind) {
        this.tailwind = tailwind;
    }

    /**
     * @return the altitude
     */
    public double getAltitude() {
        return altitude;
    }

    /**
     * @param altitude the altitude to set
     */
    public void setAltitude(double altitude) {
        this.altitude = altitude;
    }

    /**
     * @return the nPassageiros
     */
    public int getnPassageiros() {
        return nPassageiros;
    }

    /**
     * @param nPassageiros the nPassageiros to set
     */
    public void setnPassageiros(int nPassageiros) {
        this.nPassageiros = nPassageiros;
    }

    /**
     * @return the data
     */
    public Date getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Date data) {
        this.data = data;
    }

}