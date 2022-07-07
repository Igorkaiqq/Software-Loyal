/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOProdVendProd;
import java.util.ArrayList;
import model.ModelProdVendProd;

/**
 *
 * @author Igor
 */
public class ControllerProdVendProd {
    
    private DAOProdVendProd dAOProdVendProd = new DAOProdVendProd();
    
    public ArrayList<ModelProdVendProd> getListaProdVendProdController(int pCodigoVenda) {
        return this.dAOProdVendProd.getListaProdVendProdDAO(pCodigoVenda);
    }
    
}
