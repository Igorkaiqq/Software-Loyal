/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import dao.DAOVendasCliente;
import java.util.ArrayList;
import model.ModelVendasClientes;

/**
 *
 * @author Igor
 */
public class ControllerVendasCliente {

    private DAOVendasCliente dAOVendasCliente = new DAOVendasCliente();
    
    public ArrayList<ModelVendasClientes> getListaVendasClienteController() {
        
        return this.dAOVendasCliente.getListaVendasClienteDAO();
        
    }
    
}
