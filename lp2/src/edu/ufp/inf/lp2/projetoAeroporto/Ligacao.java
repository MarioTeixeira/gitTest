package edu.ufp.inf.lp2.projetoAeroporto;

import java.util.Vector;
import edu.princeton.cs.algs4.DirectedEdge;
import java.util.ArrayList;

public class Ligacao extends DirectedEdge {

  private double custo;

  private double duracao;

  private double distancia;

    /**
   * 
   * @element-type Voo
   */
  public Vector <Voo>  voos=new Vector();

    public Ligacao(double custo, double duracao, double distancia, int v, int w, double weight) {
        super(v, w, weight);
        this.custo = custo;
        this.duracao = duracao;
        this.distancia = distancia;
    }
  

    public Ligacao(int v, int w, double weight) {
        super(v, w, weight);
    }

    
    public ArrayList <Voo> procurarVoosEntreOrigemDestino(Aeroporto o, Aeroporto d) {
        ArrayList vm=new ArrayList();
        for(Voo v:this.voos){
            if(v.getOrigem().equals(o) && v.getDestino().equals(d)){
                vm.add(v);
            }
        }
        return vm;
    }
  public double weight() {
  return 0.0;
  }

    /**
     * @return the custo
     */
    public double getCusto() {
        return custo;
    }

    /**
     * @param custo the custo to set
     */
    public void setCusto(double custo) {
        this.custo = custo;
    }

    /**
     * @return the duracao
     */
    public double getDuracao() {
        return duracao;
    }

    /**
     * @param duracao the duracao to set
     */
    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    /**
     * @return the distancia
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * @param distancia the distancia to set
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

}