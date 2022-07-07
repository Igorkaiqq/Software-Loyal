package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

/**
*
* @author Igor
*/
public class ControllerUsuario {

    private final DAOUsuario daoUsuario = new DAOUsuario();

    /**
    * grava Usuario
    * @param pModelUsuario
    * @return int
    */
    public int salvarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    /**
    * recupera Usuario
    * @param pId_usuario
    * @return ModelUsuario
    */
    public ModelUsuario getUsuarioController(int pId_usuario){
        return this.daoUsuario.getUsuarioDAO(pId_usuario);
    }

    /**
    * recupera uma lista deUsuario
    * @param pId_usuario
    * @return ArrayList
    */
    public ArrayList<ModelUsuario> getListaUsuarioController(){
        return this.daoUsuario.getListaUsuarioDAO();
    }

    /**
    * atualiza Usuario
    * @param pModelUsuario
    * @return boolean
    */
    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario){
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }
    
   

    /**
    * exclui Usuario
    * @param pId_usuario
    * @return boolean
    */
    public boolean excluirUsuarioController(int pId_usuario){
        return this.daoUsuario.excluirUsuarioDAO(pId_usuario);
    }

    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }

    public void getListaUsuarioController(ModelUsuario modelUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}