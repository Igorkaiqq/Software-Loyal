/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import connection.Conexao;
import java.util.ArrayList;
import model.ModelProdVendProd;
import model.ModelProduto;
import model.ModelVendasProdutos;

/**
 *
 * @author Igor
 */
public class DAOProdVendProd extends Conexao{
    
    
   public ArrayList<ModelProdVendProd> getListaProdVendProdDAO (int pCodigoVenda) {
       ArrayList<ModelProdVendProd> listaModelProdVendProds = new ArrayList<>();
       ModelProdVendProd modelProdVendProd = new ModelProdVendProd();
       ModelProduto modelProduto = new ModelProduto();
       ModelVendasProdutos modelVendasProdutos = new ModelVendasProdutos();
       try {
           this.conectar();
           this.executarSQL(
           "SELECT tbl_produto.pk_id_produto, "
           + "tbl_produto.produto_estoque, "        
           + "tbl_produto.produto_nome, "        
           + "tbl_produto.produto_valor, "        
           + "tbl_vendasprod.fk_produto, "        
           + "tbl_vendasprod.fk_vendas, "        
           + "tbl_vendasprod.pk_id_vendasprod, "        
           + "tbl_vendasprod.vendasprod_qnt, "        
           + "tbl_vendasprod.vendasprod_valor "        
           + "FROM tbl_vendasprod "        
           + "INNER JOIN tbl_produto ON tbl_produto.pk_id_produto = tbl_vendasprod.fk_produto "        
           + "WHERE tbl_vendasprod.fk_vendas = '"+pCodigoVenda+"';");
           
           while (this.getResultSet().next()) {               
               modelProdVendProd = new ModelProdVendProd();
               modelProduto = new ModelProduto();
               modelVendasProdutos = new ModelVendasProdutos();
               
               modelProduto.setId_produto(this.getResultSet().getInt(1));
               modelProduto.setProduto_estoque(this.getResultSet().getInt(2));
               modelProduto.setProduto_nome(this.getResultSet().getString(3));
               modelProduto.setProduto_valor(this.getResultSet().getDouble(4));
               
               modelVendasProdutos.setProduto(this.getResultSet().getInt(5));
               modelVendasProdutos.setVendas(this.getResultSet().getInt(6));
               modelVendasProdutos.setId_VendasProd(this.getResultSet().getInt(7));
               modelVendasProdutos.setVendasprod_qnt(this.getResultSet().getInt(8));
               modelVendasProdutos.setVendasprod_valor(this.getResultSet().getDouble(9));
               
               modelProdVendProd.setModelProdutos(modelProduto);
               modelProdVendProd.setModelVendasProdutos(modelVendasProdutos);
               
               listaModelProdVendProds.add(modelProdVendProd);
           }
           
       } catch (Exception e) {
           e.printStackTrace();
       } finally {
           this.fecharConexao();
       }
       return listaModelProdVendProds;
   }
    
   
}
