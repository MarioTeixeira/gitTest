package edu.ufp.inf.lp2.projetoAeroporto;

import edu.princeton.cs.algs4.RedBlackBST;
import java.util.Vector;
import edu.princeton.cs.algs4.SeparateChainingHashST;
import edu.princeton.cs.algs4.EdgeWeightedDigraph;
import edu.ufp.inf.lp2.intro.Date;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Sistema{

    private SeparateChainingHashST<String, Aeroporto> aeroportos = new SeparateChainingHashST();

    private RedBlackBST<String, Aviao> avioes = new RedBlackBST<>();

    private RedBlackBST<Date, Voo> voos = new RedBlackBST<>();

    private int idVoos;

    private int codAviao;
    
    private int idAeroporto;
    
   
    

    public void addAviao(Aviao a) throws AviaoJaRegistado {
         if (this.avioes.get(a.getNome())==a){
            throw new AviaoJaRegistado("Aviao ja registado");
        }else{
             avioes.put(a.getNome(), a);
        }
         codAviao++;
    }
    
    public Aviao searchAviao(String nome) throws AviaoNaoExistente {
        if (avioes.contains(nome)) {           
            return this.avioes.get(nome);
        } else {
            throw new AviaoNaoExistente("Aviao não existe");
        }   
            
    }

    public void remAviao(String nome) {
        this.avioes.delete(nome);
    }

    public void addVoo(Voo v) throws VooJaRegistado {
    if (this.voos.get(v.getData())==v){
            throw new VooJaRegistado("Voo ja registado");
        }else{
        voos.put(v.getData(), v);
        }
    }

    public Voo searchVoo(Aeroporto o, Aeroporto d) {
        return null;
    }

   

    public void addAeroporto(Aeroporto a) throws AeroportoJaRegistado {
        if (this.aeroportos.get(a.getSigla())==a){
            throw new AeroportoJaRegistado("Aeroporto ja registado");
        }else{
            aeroportos.put(a.getSigla(), a);
        }
        idAeroporto++;       
    }
    
     public Aeroporto searchAeroporto(String sigla) throws AeroportoNaoExistente {
              if (aeroportos.contains(sigla)) { 
            return this.aeroportos.get(sigla);
        } else {
            throw new AeroportoNaoExistente("Aeroporto não existe");
        }
    }

     public Vector <Aviao> aviaoNoAeroporto(String sigla){
           Vector <Aviao> vav=new Vector();
            
         




           Iterator<String> itr = this.avioes.keys().iterator();
            while (itr.hasNext()) {
                 String ph = itr.next(); 
               if(this.avioes.get(ph).getCod_aeroporto().compareTo("LGW")==0){
                   Aviao av=this.avioes.get(ph);    
                vav.add(av);
               }
            }
            return vav;
     }


                
       
            
     
    public void remAeroporto(String sigla) {
        this.aeroportos.delete(sigla);
    }

    public void remVoo(Date d) {
        this.voos.delete(d);
    }

 
    
    public ArrayList<Voo> procurarVoosEntreDatas(Date d1, Date d2) {
        return null;
    }
    
    

    public static void main(String args[]) throws  AeroportoNaoExistente, FileNotFoundException, AviaoNaoExistente, AviaoJaRegistado, VooJaRegistado {
        Aeroporto ae;
        Aviao av;
        
        Aviao av1=new Aviao(34, "novo", "falcao", "qualquer", 2000,10000, 20000, "OPO", 100, 10000);
        Sistema gr=new Sistema();
        Scanner sAeroporto = new Scanner(new FileReader("/home/mario/LP1617/airPorts.txt"));
        Scanner sAviao = new Scanner(new FileReader("/home/mario/LP1617/airPlanes.txt"));
        sAeroporto.useDelimiter(";");
        sAviao.useDelimiter(";");

        while (sAeroporto.hasNext()) {

            try {

                String nome = sAeroporto.next().trim();
                String sigla = sAeroporto.next();
                String cidade = sAeroporto.next();
                String pais = sAeroporto.next();
                String continente = sAeroporto.next();
                String classificacao = sAeroporto.next();
                float classi = 0.0f;
                classi = Float.parseFloat(classificacao);

                ae = new Aeroporto(nome, sigla, cidade, pais, continente, classi);
               //System.out.println(ae.toString());
                gr.addAeroporto(ae);
               // ae.avioes.add(av1);
            } catch (Exception e) {

            }

        }

        while (sAviao.hasNext()) {

            try {

                String id = sAviao.next().trim();
                String modelo = sAviao.next();
                String nome = sAviao.next();
                String companhia = sAviao.next();
                String velocidade = sAviao.next();
                String altitude = sAviao.next();
                String distancia = sAviao.next();
                String cod = sAviao.next();
                String capacidade_passageiros = sAviao.next();
                String capacidade_deposito = sAviao.next();

                int idd = 0;
                long vel = 0L;
                long alt = 0L;
                long dist = 0L;
                int capP = 0;
                long capD = 0L;
                idd = Integer.parseInt(id);
                vel = Long.parseLong(velocidade);
                alt = Long.parseLong(altitude);
                dist = Long.parseLong(distancia);
                capP = Integer.parseInt(capacidade_passageiros);
                capD = Long.parseLong(capacidade_deposito);

                av = new Aviao(idd, modelo, nome, companhia, vel, alt, dist, cod, capP, capD);
             // System.out.println(av.toString());
                gr.addAviao(av);
                //rb.put(av.getNome(), av);

            } catch (Exception e) {
                e.printStackTrace();
            }
}

     
         
         
         System.out.println(gr.searchAviao("Eusebio manel"));
          System.out.println(gr.searchAeroporto("OPO"));
           System.out.println(gr.aviaoNoAeroporto("OPO"));
      
    }

    /**
     * @return the idVoos
     */
    public int getIdVoos() {
        return idVoos;
    }

    /**
     * @param idVoos the idVoos to set
     */
    public void setIdVoos(int idVoos) {
        this.idVoos = idVoos;
    }

    /**
     * @return the codAviao
     */
    public int getCodAviao() {
        return codAviao;
    }

    /**
     * @param codAviao the codAviao to set
     */
    public void setCodAviao(int codAviao) {
        this.codAviao = codAviao;
    }

    /**
     * @return the idAeroporto
     */
    public int getIdAeroporto() {
        return idAeroporto;
    }

    /**
     * @param idAeroporto the idAeroporto to set
     */
    public void setIdAeroporto(int idAeroporto) {
        this.idAeroporto = idAeroporto;
    }

}
