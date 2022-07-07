package controller;

import model.ModelVendasProdutos;
import DAO.DAOVendasProdutos;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerVendasProdutos {

    private DAOVendasProdutos daoVendasProdutos = new DAOVendasProdutos();

    /**
    * grava VendasProdutos
    * @param pModelVendasProdutos
    * @return int
    */
   

    /**
    * recupera VendasProdutos
    * @param pId_VendasProd
    * @return ModelVendasProdutos
    */
    public ModelVendasProdutos getVendasProdutosController(int pId_VendasProd){
        return this.daoVendasProdutos.getVendasProdutosDAO(pId_VendasProd);
    }

    /**
    * recupera uma lista deVendasProdutos
    * @param pId_VendasProd
    * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosController(){
        return this.daoVendasProdutos.getListaVendasProdutosDAO();
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosController(ModelVendasProdutos pModelVendasProdutos){
        return this.daoVendasProdutos.atualizarVendasProdutosDAO(pModelVendasProdutos);
    }

    /**
    * exclui VendasProdutos
    * @param pId_VendasProd
    * @return boolean
    */
    public boolean excluirVendasProdutosController(int pId_VendasProd){
        return this.daoVendasProdutos.excluirVendasProdutosDAO(pId_VendasProd);
    } 

    public boolean salvarVendasProdutosController(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
        return this.daoVendasProdutos.salvarVendasProdutosDAO(plistaModelVendasProdutos);
    }
}