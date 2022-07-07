package DAO;

import model.ModelUsuario;
import connection.Conexao;
import java.util.ArrayList;
/**
*
* @author Igor
*/
public class DAOUsuario extends Conexao{

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.insertSQL(
                "INSERT INTO tbl_usuario ("
                    + "usuario_nome,"
                    + "usuario_login,"
                    + "usuario_senha,"
                    + "usuario_permissao"
                + ") VALUES ("
                    + "'" + pModelUsuario.getUsuario_nome() + "',"
                    + "'" + pModelUsuario.getUsuario_login() + "',"
                    + "'" + pModelUsuario.getUsuario_senha() + "',"
                    + "'" + pModelUsuario.getUsuario_permissao() + "'"
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
    * recupera Usuario
    * @param pId_usuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioDAO(int pId_usuario){
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usuario_nome,"
                    + "usuario_login,"
                    + "usuario_senha,"
                    + "usuario_permissao"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " pk_id_usuario = '" + pId_usuario + "'"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario.setId_usuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuario_nome(this.getResultSet().getString(2));
                modelUsuario.setUsuario_login(this.getResultSet().getString(3));
                modelUsuario.setUsuario_senha(this.getResultSet().getString(4));
                modelUsuario.setUsuario_permissao(this.getResultSet().getString(5));
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return modelUsuario;
    }

    /**
    * recupera uma lista de Usuario
        * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioDAO(){
        ArrayList<ModelUsuario> listamodelUsuario = new ArrayList();
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usuario_nome,"
                    + "usuario_login,"
                    + "usuario_senha,"
                    + "usuario_permissao"
                 + " FROM"
                     + " tbl_usuario"
                + ";"
            );

            while(this.getResultSet().next()){
                modelUsuario = new ModelUsuario();
                modelUsuario.setId_usuario(this.getResultSet().getInt(1));
                modelUsuario.setUsuario_nome(this.getResultSet().getString(2));
                modelUsuario.setUsuario_login(this.getResultSet().getString(3));
                modelUsuario.setUsuario_senha(this.getResultSet().getString(4));
                modelUsuario.setUsuario_permissao(this.getResultSet().getString(5));
                listamodelUsuario.add(modelUsuario);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listamodelUsuario;
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioDAO(ModelUsuario pModelUsuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "UPDATE tbl_usuario SET "
                    + "pk_id_usuario = '" + pModelUsuario.getId_usuario() + "',"
                    + "usuario_nome = '" + pModelUsuario.getUsuario_nome() + "',"
                    + "usuario_login = '" + pModelUsuario.getUsuario_login() + "',"
                    + "usuario_senha = '" + pModelUsuario.getUsuario_senha() + "',"
                    + "usuario_permissao = '" + pModelUsuario.getUsuario_permissao() + "'"
                + " WHERE "
                    + "pk_id_usuario = '" + pModelUsuario.getId_usuario() + "'"
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
    * exclui Usuario
    * @param pId_usuario
    * @return boolean
    */
    public boolean excluirUsuarioDAO(int pId_usuario){
        try {
            this.conectar();
            return this.executarUpdateDeleteSQL(
                "DELETE FROM tbl_usuario "
                + " WHERE "
                    + "pk_id_usuario = '" + pId_usuario + "'"
                + ";"
            );
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
    }

    public boolean getValidarUsuarioDAO(ModelUsuario pModelUsuario) {
        ModelUsuario modelUsuario = new ModelUsuario();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "pk_id_usuario,"
                    + "usuario_nome,"
                    + "usuario_login,"
                    + "usuario_senha,"
                    + "usuario_permissao"
                 + " FROM"
                     + " tbl_usuario"
                 + " WHERE"
                     + " usuario_login = '" +pModelUsuario.getUsuario_login()
                     + "' AND usuario_senha = '" +pModelUsuario.getUsuario_senha()+"'"
                + ";"
            );
            if (getResultSet().next()) {
                return true;
            }else{
                return false;
            }
         
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }finally{
            this.fecharConexao();
        }
       
    }

    
}