package dao;

import model.ModelProduto;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOProduto extends Conexao {

    /**
    * grava Produto
    * @param pModelProduto
    * @return int
    */
    public int salvarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_produto ("
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor"
                + ") VALUES ("
                    + "'" + pModelProduto.getProduto_nome() + "',"
                    + "'" + pModelProduto.getProduto_tamanho() + "',"
                    + "'" + pModelProduto.getProduto_estoque() + "',"
                    + "'" + pModelProduto.getProduto_valor() + "',"
                    + "'" + pModelProduto.getProduto_marca() + "',"
                    + "'" + pModelProduto.getProduto_cor() + "'"
                + ");"
            );
        }catch(Exception e){
            e.printStackTrace();
            return 0;
        }finally{
            this.fecharConexao();
        }
    }

    /**
    * recupera Produto
    * @param pId_produto
    * @return ModelProduto
    */
    public ModelProduto getProdutoDAO(int pId_produto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " pk_id_produto = '" + pId_produto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setProduto_nome(this.getResultSet().getString(2));
                modelProduto.setProduto_tamanho(this.getResultSet().getString(3));
                modelProduto.setProduto_estoque(this.getResultSet().getInt(4));
                modelProduto.setProduto_valor(this.getResultSet().getDouble(5));
                modelProduto.setProduto_marca(this.getResultSet().getString(6));
                modelProduto.setProduto_cor(this.getResultSet().getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }
    public ModelProduto getProdutoDAO(String pNome_Produto){
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor"
                 + " FROM"
                     + " tbl_produto"
                 + " WHERE"
                     + " produto_nome = '" + pNome_Produto + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setProduto_nome(this.getResultSet().getString(2));
                modelProduto.setProduto_tamanho(this.getResultSet().getString(3));
                modelProduto.setProduto_estoque(this.getResultSet().getInt(4));
                modelProduto.setProduto_valor(this.getResultSet().getDouble(5));
                modelProduto.setProduto_marca(this.getResultSet().getString(6));
                modelProduto.setProduto_cor(this.getResultSet().getString(7));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelProduto;
    }

    /**
    * recupera uma lista de Produto
        * @return ArrayList
    */
    public ArrayList<ModelProduto> getListaProdutoDAO(){
        ArrayList<ModelProduto> listamodelProduto = new ArrayList();
        ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_produto,"
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor"
                 + " FROM"
                     + " tbl_produto"
                + ";"
            );

            while(this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setProduto_nome(this.getResultSet().getString(2));
                modelProduto.setProduto_tamanho(this.getResultSet().getString(3));
                modelProduto.setProduto_estoque(this.getResultSet().getInt(4));
                modelProduto.setProduto_valor(this.getResultSet().getDouble(5));
                modelProduto.setProduto_marca(this.getResultSet().getString(6));
                modelProduto.setProduto_cor(this.getResultSet().getString(7));
                listamodelProduto.add(modelProduto);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelProduto;
    }

    public ModelProduto retornarProdutoDAO (int pIdProduto){
    ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor "
                    + "FROM tbl_produto WHERE pk_id_produto = '"+pIdProduto+"';");
            
            while (this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setProduto_nome(this.getResultSet().getString(2));
                modelProduto.setProduto_tamanho(this.getResultSet().getString(3));
                modelProduto.setProduto_estoque(this.getResultSet().getInt(4));
                modelProduto.setProduto_valor(this.getResultSet().getDouble(5));
                modelProduto.setProduto_marca(this.getResultSet().getString(6));
                modelProduto.setProduto_cor(this.getResultSet().getString(7));
            }
            
       } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }       
        
        return modelProduto;
        
    }
    public ModelProduto retornarProdutoDAO (String pNomeProduto){
    ModelProduto modelProduto = new ModelProduto();
        try {
            this.conectar();
            this.executarSQL("SELECT "
                    + "pk_id_produto,"
                    + "produto_nome,"
                    + "produto_tamanho,"
                    + "produto_estoque,"
                    + "produto_valor,"
                    + "produto_marca,"
                    + "produto_cor"
                    + "FROM tbl_produto WHERE produto_nome = '"+pNomeProduto+"';");
            
            while (this.getResultSet().next()){
                modelProduto = new ModelProduto();
                modelProduto.setId_produto(this.getResultSet().getInt(1));
                modelProduto.setProduto_nome(this.getResultSet().getString(2));
                modelProduto.setProduto_tamanho(this.getResultSet().getString(3));
                modelProduto.setProduto_estoque(this.getResultSet().getInt(4));
                modelProduto.setProduto_valor(this.getResultSet().getDouble(5));
                modelProduto.setProduto_marca(this.getResultSet().getString(6));
                modelProduto.setProduto_cor(this.getResultSet().getString(7));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            this.fecharConexao();
        }
        
        return modelProduto;
        
    }
    
    /**
    * atualiza Produto
    * @param pModelProduto
    * @return boolean
    */
    public boolean atualizarProdutoDAO(ModelProduto pModelProduto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_produto SET "
                    + "pk_id_produto = '" + pModelProduto.getId_produto() + "',"
                    + "produto_nome = '" + pModelProduto.getProduto_nome() + "',"
                    + "produto_tamanho = '" + pModelProduto.getProduto_tamanho() + "',"
                    + "produto_estoque = '" + pModelProduto.getProduto_estoque() + "',"
                    + "produto_valor = '" + pModelProduto.getProduto_valor() + "',"
                    + "produto_marca = '" + pModelProduto.getProduto_marca() + "',"
                    + "produto_cor = '" + pModelProduto.getProduto_cor() + "'"
                + " WHERE "
                    + "pk_id_produto = '" + pModelProduto.getId_produto() + "'"
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
    * exclui Produto
    * @param pId_produto
    * @return boolean
    */
    public boolean excluirProdutoDAO(int pId_produto){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_produto "
                + " WHERE "
                    + "pk_id_produto = '" + pId_produto + "'"
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
  * Baixa no estoque no banco de dados
  * @param plistaModelProdutos 
  */

    public boolean atualizarEstoqueProdutoDAO(ArrayList<ModelProduto> plistaModelProduto) {
         try {
            this.conectar();
             for (int i = 0; i < plistaModelProduto.size(); i++) {
                 this.executarUpdateDeleteSQL(
                "UPDATE tbl_produto SET "
                    + "produto_estoque = '" + plistaModelProduto.get(i).getProduto_estoque() + "'"
                + " WHERE "
                    + "pk_id_produto = '" + plistaModelProduto.get(i).getId_produto() + "'"
                
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