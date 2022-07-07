/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.Conexao;
import java.util.ArrayList;
import model.ModelCliente;
import model.ModelVendasClientes;
import model.ModelVendas;

/**
 *
 * @author Igor
 */
public class DAOVendasCliente extends Conexao {
    
    public ArrayList<ModelVendasClientes> getListaVendasClienteDAO(){
        ArrayList<ModelVendasClientes> listaModelVendasCliente = new ArrayList();
        ModelVendas modelVendas = new ModelVendas();
        ModelCliente  modelCliente = new ModelCliente();
        ModelVendasClientes modelVendasCliente = new ModelVendasClientes();
        try {
            this.conectar();
            this.executarSQL(
                "SELECT "
                    + "tbl_vendas.pk_id_vendas,"
                    + "tbl_vendas.fk_cliente,"
                    + "tbl_vendas.venda_data,"
                    + "tbl_vendas.venda_valor_liquido,"
                    + "tbl_vendas.venda_desconto,"
                    + "tbl_vendas.venda_valor_bruto,"
                    + "tbl_cliente.pk_id_cliente,"
                    + "tbl_cliente.cliente_nome,"
                    + "tbl_cliente.cliente_endereco,"
                    + "tbl_cliente.cliente_bairro,"
                    + "tbl_cliente.cliente_cidade,"
                    + "tbl_cliente.cliente_estado,"
                    + "tbl_cliente.cliente_cep,"
                    + "tbl_cliente.cliente_telefone,"
                    + "tbl_cliente.cliente_numero"
                 + " FROM "
                     + " tbl_vendas INNER JOIN tbl_cliente "
                     + "ON tbl_cliente.pk_id_cliente = tbl_vendas.fk_cliente; "
                + ";"
            );

            while(this.getResultSet().next()){
                modelVendas = new ModelVendas();
                modelVendasCliente = new ModelVendasClientes();
                modelCliente =new ModelCliente();
                modelVendas.setId_vendas(this.getResultSet().getInt(1));
                modelVendas.setCliente(this.getResultSet().getInt(2));
                modelVendas.setVenda_data(this.getResultSet().getDate(3));
                modelVendas.setVenda_valorliquido(this.getResultSet().getDouble(4));
                modelVendas.setVenda_valorbruto(this.getResultSet().getDouble(5));
                modelVendas.setVenda_desconto(this.getResultSet().getDouble(6));
                modelCliente.setId_cliente(this.getResultSet().getInt(7));
                modelCliente.setCliente_nome(this.getResultSet().getString(8));
                modelCliente.setCliente_endereco(this.getResultSet().getString(9));
                modelCliente.setCliente_bairro(this.getResultSet().getString(10));
                modelCliente.setCliente_cidade(this.getResultSet().getString(11));
                modelCliente.setCliente_estado(this.getResultSet().getString(12));
                modelCliente.setCliente_cep(this.getResultSet().getString(13));
                modelCliente.setCliente_telefone(this.getResultSet().getString(14));
                modelCliente.setCliente_numero(this.getResultSet().getString(15));
                modelVendasCliente.setModelCliente(modelCliente);
                modelVendasCliente.setModelVendas(modelVendas);
                listaModelVendasCliente.add(modelVendasCliente);
            }
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            this.fecharConexao();
        }
        return listaModelVendasCliente;
    }

    
}
