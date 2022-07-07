package DAO;

import model.ModelVendasProdutos;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOVendasProdutos extends Conexao {

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
    public ModelVendasProdutos getVendasProdutosDAO(int pId_VendasProd){
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendasprod,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "vendasprod_valor,"
                    + "vendasprod_qnt"
                 + " FROM"
                     + " tbl_vendasprod"
                 + " WHERE"
                     + " pk_id_vendasprod = '" + pId_VendasProd + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos.setId_VendasProd(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVendasprod_valor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendasprod_qnt(this.getResultSet().getInt(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendasProdutos;
    }

    /**
    * recupera uma lista de VendasProdutos
        * @return ArrayList
    */
    public ArrayList<ModelVendasProdutos> getListaVendasProdutosDAO(){
        ArrayList<ModelVendasProdutos> listamodelVendasProdutos = new ArrayList();
        ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendasprod,"
                    + "fk_produto,"
                    + "fk_vendas,"
                    + "vendasprod_valor,"
                    + "vendasprod_qnt"
                 + " FROM"
                     + " tbl_vendasprod"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendasProdutos = new ModelVendasProdutos();
                modelVendasProdutos.setId_VendasProd(this.getResultSet().getInt(1));
                modelVendasProdutos.setProduto(this.getResultSet().getInt(2));
                modelVendasProdutos.setVendas(this.getResultSet().getInt(3));
                modelVendasProdutos.setVendasprod_valor(this.getResultSet().getDouble(4));
                modelVendasProdutos.setVendasprod_qnt(this.getResultSet().getInt(5));
                listamodelVendasProdutos.add(modelVendasProdutos);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendasProdutos;
    }

    /**
    * atualiza VendasProdutos
    * @param pModelVendasProdutos
    * @return boolean
    */
    public boolean atualizarVendasProdutosDAO(ModelVendasProdutos pModelVendasProdutos){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendasprod SET "
                    + "pk_id_vendasprod = '" + pModelVendasProdutos.getId_VendasProd() + "',"
                    + "fk_produto = '" + pModelVendasProdutos.getProduto() + "',"
                    + "fk_vendas = '" + pModelVendasProdutos.getVendas() + "',"
                    + "vendasprod_valor = '" + pModelVendasProdutos.getVendasprod_valor() + "',"
                    + "vendasprod_qnt = '" + pModelVendasProdutos.getVendasprod_qnt() + "'"
                + " WHERE "
                    + "pk_id_vendas_prod = '" + pModelVendasProdutos.getId_VendasProd() + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * exclui VendasProdutos
    * @param pId_VendasProd
    * @return boolean
    */
    public boolean excluirVendasProdutosDAO(int pId_VendasProd){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendasprod "
                + " WHERE "
                    + "fk_vendas = '" + pId_VendasProd + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean salvarVendasProdutosDAO(ArrayList<ModelVendasProdutos> plistaModelVendasProdutos) {
       try {
            this.conectar();
            int cont = plistaModelVendasProdutos.size();
            for (int i = 0; i < cont; i++) {
                this.insertSQL(
                "INSERT INTO tbl_vendasprod ("
                    + "fk_produto," 
                    + "fk_vendas,"
                    + "vendasprod_valor,"
                    + "vendasprod_qnt"
                + ") VALUES ("
                    + "'" + plistaModelVendasProdutos.get(i).getProduto()+ "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVendas() + "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVendasprod_valor() + "',"
                    + "'" + plistaModelVendasProdutos.get(i).getVendasprod_qnt() + "'"
                + ");"
            );
           }
            return true;
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}