package model;

import java.sql.Date;

/**
*
* @author Igor
*/
public class ModelVendas {

    private int id_vendas;
    private int cliente;
    private Date venda_data;
    private double venda_valorliquido;
    private double venda_valorbruto;
    private double venda_desconto;

    /**
    * Construtor
    */
    public ModelVendas(){}

    /**
    * seta o valor de id_vendas
    * @param pId_vendas
    */
    public void setId_vendas(int pId_vendas){
        this.id_vendas = pId_vendas;
    }
    /**
    * @return pk_id_vendas
    */
    public int getId_vendas(){
        return this.id_vendas;
    }

    /**
    * seta o valor de cliente
    * @param pCliente
    */
    public void setCliente(int pCliente){
        this.cliente = pCliente;
    }
    /**
    * @return fk_cliente
    */
    public int getCliente(){
        return this.cliente;
    }

    /**
    * seta o valor de venda_data
    * @param pVenda_data
    */
    public void setVenda_data(Date pVenda_data){
        this.venda_data = pVenda_data;
    }
    /**
    * @return venda_data
    */
    public Date getVenda_data(){
        return this.venda_data;
    }

    /**
    * seta o valor de venda_valorliquido
    * @param pVenda_valorliquido
    */
    public void setVenda_valorliquido(double pVenda_valorliquido){
        this.venda_valorliquido = pVenda_valorliquido;
    }
    /**
    * @return venda_valorliquido
    */
    public double getVenda_valorliquido(){
        return this.venda_valorliquido;
    }

    /**
    * seta o valor de venda_valorbruto
    * @param pVenda_valorbruto
    */
    public void setVenda_valorbruto(double pVenda_valorbruto){
        this.venda_valorbruto = pVenda_valorbruto;
    }
    /**
    * @return venda_valorbruto
    */
    public double getVenda_valorbruto(){
        return this.venda_valorbruto;
    }

    /**
    * seta o valor de venda_desconto
    * @param pVenda_desconto
    */
    public void setVenda_desconto(double pVenda_desconto){
        this.venda_desconto = pVenda_desconto;
    }
    /**
    * @return venda_desconto
    */
    public double getVenda_desconto(){
        return this.venda_desconto;
    }

    @Override
    public String toString(){
        return "ModelVendas {" + "::id_vendas = " + this.id_vendas + "::cliente = " + this.cliente + "::venda_data = " + this.venda_data + "::venda_valorliquido = " + this.venda_valorliquido + "::venda_valorbruto = " + this.venda_valorbruto + "::venda_desconto = " + this.venda_desconto +  "}";
    }
}