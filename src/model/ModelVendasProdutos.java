package model;
/**
*
* @author Igor
*/
public class ModelVendasProdutos {

    private int id_VendasProd;
    private int produto;
    private int vendas;
    private double vendasprod_valor;
    private int vendasprod_qnt;

    /**
    * Construtor
    */
    public ModelVendasProdutos(){}

    /**
    * seta o valor de id_VendasProd
    * @param pId_VendasProd
    */
    public void setId_VendasProd(int pId_VendasProd){
        this.id_VendasProd = pId_VendasProd;
    }
    /**
    * @return pk_id_VendasProd
    */
    public int getId_VendasProd(){
        return this.id_VendasProd;
    }

    /**
    * seta o valor de produto
    * @param pProduto
    */
    public void setProduto(int pProduto){
        this.produto = pProduto;
    }
    /**
    * @return fk_produto
    */
    public int getProduto(){
        return this.produto;
    }

    /**
    * seta o valor de vendas
    * @param pVendas
    */
    public void setVendas(int pVendas){
        this.vendas = pVendas;
    }
    /**
    * @return fk_vendas
    */
    public int getVendas(){
        return this.vendas;
    }

    /**
    * seta o valor de vendasprod_valor
    * @param pVendasprod_valor
    */
    public void setVendasprod_valor(double pVendasprod_valor){
        this.vendasprod_valor = pVendasprod_valor;
    }
    /**
    * @return vendasprod_valor
    */
    public double getVendasprod_valor(){
        return this.vendasprod_valor;
    }

    /**
    * seta o valor de vendasprod_qnt
    * @param pVendasprod_qnt
    */
    public void setVendasprod_qnt(int pVendasprod_qnt){
        this.vendasprod_qnt = pVendasprod_qnt;
    }
    /**
    * @return vendasprod_qnt
    */
    public int getVendasprod_qnt(){
        return this.vendasprod_qnt;
    }

    @Override
    public String toString(){
        return "ModelVendasProdutos {" + "::id_VendasProd = " + this.id_VendasProd + "::produto = " + this.produto + "::vendas = " + this.vendas + "::vendasprod_valor = " + this.vendasprod_valor + "::vendasprod_qnt = " + this.vendasprod_qnt +  "}";
    }

    public void setId_vendaprod(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}