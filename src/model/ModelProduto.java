package model;
/**
*
* @author Igor
*/
public class ModelProduto {

    private int id_produto;
    private String produto_nome;
    private String produto_tamanho;
    private int produto_estoque;
    private double produto_valor;
    private String produto_marca;
    private String produto_cor;

    /**
    * Construtor
    */
    public ModelProduto(){}

    /**
    * seta o valor de id_produto
    * @param pId_produto
    */
    public void setId_produto(int pId_produto){
        this.id_produto = pId_produto;
    }
    /**
    * @return pk_id_produto
    */
    public int getId_produto(){
        return this.id_produto;
    }

    /**
    * seta o valor de produto_nome
    * @param pProduto_nome
    */
    public void setProduto_nome(String pProduto_nome){
        this.produto_nome = pProduto_nome;
    }
    /**
    * @return produto_nome
    */
    public String getProduto_nome(){
        return this.produto_nome;
    }

    /**
    * seta o valor de produto_tamanho
    * @param pProduto_tamanho
    */
    public void setProduto_tamanho(String pProduto_tamanho){
        this.produto_tamanho = pProduto_tamanho;
    }
    /**
    * @return produto_tamanho
    */
    public String getProduto_tamanho(){
        return this.produto_tamanho;
    }

    /**
    * seta o valor de produto_estoque
    * @param pProduto_estoque
    */
    public void setProduto_estoque(int pProduto_estoque){
        this.produto_estoque = pProduto_estoque;
    }
    /**
    * @return produto_estoque
    */
    public int getProduto_estoque(){
        return this.produto_estoque;
    }

    /**
    * seta o valor de produto_valor
    * @param pProduto_valor
    */
    public void setProduto_valor(double pProduto_valor){
        this.produto_valor = pProduto_valor;
    }
    /**
    * @return produto_valor
    */
    public double getProduto_valor(){
        return this.produto_valor;
    }

    /**
    * seta o valor de produto_marca
    * @param pProduto_marca
    */
    public void setProduto_marca(String pProduto_marca){
        this.produto_marca = pProduto_marca;
    }
    /**
    * @return produto_marca
    */
    public String getProduto_marca(){
        return this.produto_marca;
    }

    /**
    * seta o valor de produto_cor
    * @param pProduto_cor
    */
    public void setProduto_cor(String pProduto_cor){
        this.produto_cor = pProduto_cor;
    }
    /**
    * @return produto_cor
    */
    public String getProduto_cor(){
        return this.produto_cor;
    }

    @Override
    public String toString(){
        return "ModelProduto {" + "::id_produto = " + this.id_produto + "::produto_nome = " + this.produto_nome + "::produto_tamanho = " + this.produto_tamanho + "::produto_estoque = " + this.produto_estoque + "::produto_valor = " + this.produto_valor + "::produto_marca = " + this.produto_marca + "::produto_cor = " + this.produto_cor +  "}";
    }
}