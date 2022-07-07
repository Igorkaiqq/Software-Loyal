package controller;

import model.ModelProduto;
import dao.DAOProduto;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerProduto {

    private DAOProduto daoProduto = new DAOProduto();

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.salvarProdutoDAO(pModelProduto);
    }

    /**
    * recupera Produto
    * @param pId_produto
    * @return ModelProduto
    */
    public ModelProduto getProdutoController(int pId_produto){
        return this.daoProduto.getProdutoDAO(pId_produto);
    }
    public ModelProduto getProdutoController(String pNome_Produto){
        return this.daoProduto.getProdutoDAO(pNome_Produto);
    }
    public ModelProduto retornarProdutoController(int pCodigo){
        return this.daoProduto.retornarProdutoDAO(pCodigo);
    }
     public ModelProduto retornarProdutoController(String pNomeProduto){
        return this.daoProduto.retornarProdutoDAO(pNomeProduto);
    }

 
    
    /**
    * recupera uma lista deProduto
    * @param pId_produto
    * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoController(){
        return this.daoProduto.getListaProdutoDAO();
    }

    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoController(ModelProduto pModelProduto){
        return this.daoProduto.atualizarProdutoDAO(pModelProduto);
    }

    /**
    * exclui Produto
    * @param pId_produto
    * @return boolean
    */
    public boolean excluirProdutoController(int pId_produto){
        return this.daoProduto.excluirProdutoDAO(pId_produto);
    }
    /**
     * Altera os produtos no banco de dados
     * @param plistaModelProdutos 
     */
    public boolean atualizarEstoqueProdutoController(ArrayList<ModelProduto> plistaModelProduto) {
        return this.daoProduto.atualizarEstoqueProdutoDAO(plistaModelProduto);
    }

  
}