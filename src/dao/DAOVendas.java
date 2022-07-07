package DAO;

import model.ModelVendas;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOVendas extends Conexao {

    /**
    * grava Vendas
    * @param pModelVendas
    * @return int
    */
    public int salvarVendasDAO(ModelVendas pModelVendas){
        try {
            System.out.println("passou aqui");
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_vendas ("
                    + "fk_cliente,"
                    + "venda_data,"
                    + "venda_valor_liquido,"
                    + "venda_valor_bruto,"
                    + "venda_desconto"
                + ") VALUES ("
                    + "'" + pModelVendas.getCliente() + "',"
                    + "'" + pModelVendas.getVenda_data() + "',"
                    + "'" + pModelVendas.getVenda_valorliquido() + "',"
                    + "'" + pModelVendas.getVenda_valorbruto() + "',"
                    + "'" + pModelVendas.getVenda_desconto() + "'"
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
    * recupera Vendas
    * @param pId_vendas
    * @return ModelVendas
    */
    public ModelVendas getVendasDAO(int pId_vendas){
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "venda_data,"
                    + "venda_valor_liquido,"
                    + "venda_valor_bruto,"
                    + "venda_desconto"
                 + " FROM"
                     + " tbl_vendas"
                 + " WHERE"
                     + " pk_id_vendas = '" + pId_vendas + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenda_data(this.getResultSet().getDate(3));
                modelVendas.setVenda_valorliquido(this.getResultSet().getDouble(4));
                modelVendas.setVenda_valorbruto(this.getResultSet().getDouble(5));
                modelVendas.setVenda_desconto(this.getResultSet().getDouble(6));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelVendas;
    }

    /**
    * recupera uma lista de Vendas
        * @return ArrayList
    */
    public ArrayList<ModelVendas> getListaVendasDAO(){
        ArrayList<ModelVendas> listamodelVendas = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_vendas,"
                    + "fk_cliente,"
                    + "venda_data,"
                    + "venda_valor_liquido,"
                    + "venda_valor_bruto,"
                    + "venda_desconto"
                 + " FROM"
                     + " tbl_vendas"
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenda_data(this.getResultSet().getDate(3));
                modelVendas.setVenda_valorliquido(this.getResultSet().getDouble(4));
                modelVendas.setVenda_valorbruto(this.getResultSet().getDouble(5));
                modelVendas.setVenda_desconto(this.getResultSet().getDouble(6));
                listamodelVendas.add(modelVendas);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelVendas;
    }

    /**
    * atualiza Vendas
    * @param pModelVendas
    * @return boolean
    */
    public boolean atualizarVendasDAO(ModelVendas pModelVendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_vendas SET "
                    + "pk_id_vendas = '" + pModelVendas.getId_vendas() + "',"
                    + "fk_cliente = '" + pModelVendas.getCliente() + "',"
                    + "venda_data = '" + pModelVendas.getVenda_data() + "',"
                    + "venda_valor_liquido = '" + pModelVendas.getVenda_valorliquido() + "',"
                    + "venda_valor_bruto = '" + pModelVendas.getVenda_valorbruto() + "',"
                    + "venda_desconto = '" + pModelVendas.getVenda_desconto() + "'"
                + " WHERE "
                    + "pk_id_vendas = '" + pModelVendas.getId_vendas() + "'"
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
    * exclui Vendas
    * @param pId_vendas
    * @return boolean
    */
    public boolean excluirVendasDAO(int pId_vendas){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_vendas "
                + " WHERE "
                    + "pk_id_vendas = '" + pId_vendas + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }
}