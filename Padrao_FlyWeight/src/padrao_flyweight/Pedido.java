/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padrao_flyweight;

import java.util.ArrayList;

/**
 *
 * @author 20161bsi0403
 */
public class Pedido {
    private ArrayList<Item> itens;
    
    public Pedido(){
        this.itens = new ArrayList<Item>();
    }
    public void addItemPedido(Item item){
        itens.add(item);
    }

   
    
}
