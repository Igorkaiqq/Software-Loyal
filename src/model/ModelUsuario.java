package model;
/**
*
* @author Igor
*/
public class ModelUsuario {

    private int id_usuario;
    private String usuario_nome;
    private String usuario_login;
    private String usuario_senha;
    private String usuario_permissao;

    /**
    * Construtor
    */
    public ModelUsuario(){}

    /**
    * seta o valor de id_usuario
    * @param pId_usuario
    */
    public void setId_usuario(int pId_usuario){
        this.id_usuario = pId_usuario;
    }
    /**
    * @return pk_id_usuario
    */
    public int getId_usuario(){
        return this.id_usuario;
    }

    /**
    * seta o valor de usuario_nome
    * @param pUsuario_nome
    */
    public void setUsuario_nome(String pUsuario_nome){
        this.usuario_nome = pUsuario_nome;
    }
    /**
    * @return usuario_nome
    */
    public String getUsuario_nome(){
        return this.usuario_nome;
    }

    /**
    * seta o valor de usuario_login
    * @param pUsuario_login
    */
    public void setUsuario_login(String pUsuario_login){
        this.usuario_login = pUsuario_login;
    }
    /**
    * @return usuario_login
    */
    public String getUsuario_login(){
        return this.usuario_login;
    }

    /**
    * seta o valor de usuario_senha
    * @param pUsuario_senha
    */
    public void setUsuario_senha(String pUsuario_senha){
        this.usuario_senha = pUsuario_senha;
    }
    /**
    * @return usuario_senha
    */
    public String getUsuario_senha(){
        return this.usuario_senha;
    }

    /**
    * seta o valor de usuario_permissao
    * @param pUsuario_permissao
    */
    public void setUsuario_permissao(String pUsuario_permissao){
        this.usuario_permissao = pUsuario_permissao;
    }
    /**
    * @return usuario_permissao
    */
    public String getUsuario_permissao(){
        return this.usuario_permissao;
    }

    @Override
    public String toString(){
        return "ModelUsuario {" + "::id_usuario = " + this.id_usuario + "::usuario_nome = " + this.usuario_nome + "::usuario_login = " + this.usuario_login + "::usuario_senha = " + this.usuario_senha + "::usuario_permissao = " + this.usuario_permissao +  "}";
    }
}