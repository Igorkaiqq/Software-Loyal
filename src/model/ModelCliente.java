package model;
/**
*
* @author Igor
*/
public class ModelCliente {

    private int id_cliente;
    private String cliente_nome;
    private String cliente_endereco;
    private String cliente_bairro;
    private String cliente_cidade;
    private String cliente_estado;
    private String cliente_cep;
    private String cliente_telefone;
    private String cliente_numero;

    /**
    * Construtor
    */
    public ModelCliente(){}

    /**
    * seta o valor de id_cliente
    * @param pId_cliente
    */
    public void setId_cliente(int pId_cliente){
        this.id_cliente = pId_cliente;
    }
    /**
    * @return pk_id_cliente
    */
    public int getId_cliente(){
        return this.id_cliente;
    }

    /**
    * seta o valor de cliente_nome
    * @param pCliente_nome
    */
    public void setCliente_nome(String pCliente_nome){
        this.cliente_nome = pCliente_nome;
    }
    /**
    * @return cliente_nome
    */
    public String getCliente_nome(){
        return this.cliente_nome;
    }

    /**
    * seta o valor de cliente_endereco
    * @param pCliente_endereco
    */
    public void setCliente_endereco(String pCliente_endereco){
        this.cliente_endereco = pCliente_endereco;
    }
    /**
    * @return cliente_endereco
    */
    public String getCliente_endereco(){
        return this.cliente_endereco;
    }

    /**
    * seta o valor de cliente_bairro
    * @param pCliente_bairro
    */
    public void setCliente_bairro(String pCliente_bairro){
        this.cliente_bairro = pCliente_bairro;
    }
    /**
    * @return cliente_bairro
    */
    public String getCliente_bairro(){
        return this.cliente_bairro;
    }

    /**
    * seta o valor de cliente_cidade
    * @param pCliente_cidade
    */
    public void setCliente_cidade(String pCliente_cidade){
        this.cliente_cidade = pCliente_cidade;
    }
    /**
    * @return cliente_cidade
    */
    public String getCliente_cidade(){
        return this.cliente_cidade;
    }

    /**
    * seta o valor de cliente_estado
    * @param pCliente_estado
    */
    public void setCliente_estado(String pCliente_estado){
        this.cliente_estado = pCliente_estado;
    }
    /**
    * @return cliente_estado
    */
    public String getCliente_estado(){
        return this.cliente_estado;
    }

    /**
    * seta o valor de cliente_cep
    * @param pCliente_cep
    */
    public void setCliente_cep(String pCliente_cep){
        this.cliente_cep = pCliente_cep;
    }
    /**
    * @return cliente_cep
    */
    public String getCliente_cep(){
        return this.cliente_cep;
    }

    /**
    * seta o valor de cliente_telefone
    * @param pCliente_telefone
    */
    public void setCliente_telefone(String pCliente_telefone){
        this.cliente_telefone = pCliente_telefone;
    }
    /**
    * @return cliente_telefone
    */
    public String getCliente_telefone(){
        return this.cliente_telefone;
    }
    /**
    * seta o valor de cliente_cep
    * @param pCliente_cep
    */
    public void setCliente_numero (String pCliente_numero){
        this.cliente_numero = pCliente_numero;
    }
    /**
    * @return cliente_cep
    */
    public String getCliente_numero(){
        return this.cliente_numero;
    }

    @Override
    public String toString(){
        return "ModelCliente {" + "::id_cliente = " + this.id_cliente + "::cliente_nome = " + this.cliente_nome + "::cliente_endereco = " + this.cliente_endereco + "::cliente_bairro = " + this.cliente_bairro + "::cliente_cidade = " + this.cliente_cidade + "::cliente_estado = " + this.cliente_estado + "::cliente_cep = " + this.cliente_cep + "::cliente_telefone = " + this.cliente_telefone +  "}";
    }
}