/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controladores;

import ec.edu.ups.clases.Pez;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Edison
 */
public class ControladorPez {
    private List<Pez>lista;//estar creando como unvector, y se puede ingresar cualquier valor
    public ControladorPez(){
        lista=new ArrayList<>();
    }
    public void create(Pez objeto){//
        lista.add(objeto);
        
    }
    public Pez read(int codigo){
        for(Pez pez: lista){
            if(pez.gedCodigo() == codigo){
                return pez;
            }
        }
        return null;
    }
    
    public void update(Pez objeto){
        for(int i=0; i<lista.size();i++){
            Pez elemento= lista.get(i);
            if(elemento.getCodigo()==objeto.gedCodigo()){
                lista.set(i, objeto);
                break;
            }
        }
    }
    
    public void delete(Pez objeto){
        for(int i=0;i<lista.size();i++){
            Pez elemento=lista.get(i);
            if(elemento.getCodigo()==objeto.gedCodigo()){
                lista.remove(i);
            }
    }
        
    }
    
    
}
