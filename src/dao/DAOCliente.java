package dao;

import model.ModelCliente;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOCliente extends Conexao {

    /**
    * grava Cliente
    * @param pModelCliente
    * @return int
    */
    public int salvarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_cliente ("
                    + "cliente_nome,"
                    + "cliente_endereco,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado,"
                    + "cliente_cep,"
                    + "cliente_telefone,"
                    + "cliente_numero"
                + ") VALUES ("
                    + "'" + pModelCliente.getCliente_nome() + "',"
                    + "'" + pModelCliente.getCliente_endereco() + "',"
                    + "'" + pModelCliente.getCliente_bairro() + "',"
                    + "'" + pModelCliente.getCliente_cidade() + "',"
                    + "'" + pModelCliente.getCliente_estado() + "',"
                    + "'" + pModelCliente.getCliente_cep() + "',"
                    + "'" + pModelCliente.getCliente_telefone() + "',"
                    + "'" + pModelCliente.getCliente_numero() + "'"
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
    * recupera Cliente
    * @param pId_cliente
    * @return ModelCliente
    */
    public ModelCliente getClienteDAO(int pId_cliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cliente_nome,"
                    + "cliente_endereco,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado,"
                    + "cliente_cep,"
                    + "cliente_telefone,"
                    + "cliente_numero"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " pk_id_cliente = '" + pId_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCliente_nome(this.getResultSet().getString(2));
                modelCliente.setCliente_endereco(this.getResultSet().getString(3));
                modelCliente.setCliente_bairro(this.getResultSet().getString(4));
                modelCliente.setCliente_cidade(this.getResultSet().getString(5));
                modelCliente.setCliente_estado(this.getResultSet().getString(6));
                modelCliente.setCliente_cep(this.getResultSet().getString(7));
                modelCliente.setCliente_telefone(this.getResultSet().getString(8));
                modelCliente.setCliente_numero(this.getResultSet().getString(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }
    public ModelCliente getClienteDAO(String pNome_cliente){
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cliente_nome,"
                    + "cliente_endereco,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado,"
                    + "cliente_cep,"
                    + "cliente_telefone,"
                    + "cliente_numero"
                 + " FROM"
                     + " tbl_cliente"
                 + " WHERE"
                     + " cliente_nome = '" + pNome_cliente + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCliente_nome(this.getResultSet().getString(2));
                modelCliente.setCliente_endereco(this.getResultSet().getString(3));
                modelCliente.setCliente_bairro(this.getResultSet().getString(4));
                modelCliente.setCliente_cidade(this.getResultSet().getString(5));
                modelCliente.setCliente_estado(this.getResultSet().getString(6));
                modelCliente.setCliente_cep(this.getResultSet().getString(7));
                modelCliente.setCliente_telefone(this.getResultSet().getString(8));
                modelCliente.setCliente_numero(this.getResultSet().getString(9));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelCliente;
    }

    /**
    * recupera uma lista de Cliente
        * @return ArrayList
    */
    public ArrayList<ModelCliente> getListaClienteDAO(){
        ArrayList<ModelCliente> listamodelCliente = new ArrayList();
        ModelCliente modelCliente = new ModelCliente();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_cliente,"
                    + "cliente_nome,"
                    + "cliente_endereco,"
                    + "cliente_bairro,"
                    + "cliente_cidade,"
                    + "cliente_estado,"
                    + "cliente_cep,"
                    + "cliente_telefone,"
                    + "cliente_numero"
                 + " FROM"
                     + " tbl_cliente"
                + ";"
            );

            while(this.getResultSet().next()){
                modelCliente = new ModelCliente();
                modelCliente.setId_cliente(this.getResultSet().getInt(1));
                modelCliente.setCliente_nome(this.getResultSet().getString(2));
                modelCliente.setCliente_endereco(this.getResultSet().getString(3));
                modelCliente.setCliente_bairro(this.getResultSet().getString(4));
                modelCliente.setCliente_cidade(this.getResultSet().getString(5));
                modelCliente.setCliente_estado(this.getResultSet().getString(6));
                modelCliente.setCliente_cep(this.getResultSet().getString(7));
                modelCliente.setCliente_telefone(this.getResultSet().getString(8));
                modelCliente.setCliente_numero(this.getResultSet().getString(9));
                listamodelCliente.add(modelCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelCliente;
    }

    /**
    * atualiza Cliente
    * @param pModelCliente
    * @return boolean
    */
    public boolean atualizarClienteDAO(ModelCliente pModelCliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_cliente SET "
                    + "pk_id_cliente = '" + pModelCliente.getId_cliente() + "',"
                    + "cliente_nome = '" + pModelCliente.getCliente_nome() + "',"
                    + "cliente_endereco = '" + pModelCliente.getCliente_endereco() + "',"
                    + "cliente_bairro = '" + pModelCliente.getCliente_bairro() + "',"
                    + "cliente_cidade = '" + pModelCliente.getCliente_cidade() + "',"
                    + "cliente_estado = '" + pModelCliente.getCliente_estado() + "',"
                    + "cliente_cep = '" + pModelCliente.getCliente_cep() + "',"
                    + "cliente_telefone = '" + pModelCliente.getCliente_telefone() + "',"
                    + "cliente_numero = '" + pModelCliente.getCliente_numero() + "'"
                + " WHERE "
                    + "pk_id_cliente = '" + pModelCliente.getId_cliente() + "'"
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
    * exclui Cliente
    * @param pId_cliente
    * @return boolean
    */
    public boolean excluirClienteDAO(int pId_cliente){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_cliente "
                + " WHERE "
                    + "pk_id_cliente = '" + pId_cliente + "'"
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