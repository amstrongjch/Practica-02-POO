/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.ups.prueba;


import Controladores.ControladorPez;
import ec.edu.ups.clases.Pez;
import java.util.Scanner;

/**
 *
 * @author Ordenador
 */
public class Lista {

    private static Pez objeto;
    private static int o;
    public static void main(String []args){
        Scanner leer = new Scanner(System.in);
      
        String SN= "";
       int x;
       int p,r;
         ControladorPez op=new ControladorPez();
        
           
        do{
           System.out.println("digite uno de estos numero");
            System.out.println("1 CRUD");
            System.out.println("2 CREATE");
            System.out.println("3 READ");
            System.out.println("4 DELETE");
            System.out.println("5 SALIR");
            x=leer.nextInt();
           
            switch(x){
                case 1:
                    op.create(objeto);
                    break;
                    //create
                    //pide todo los datos por teclado
                    //instancio un objeto
                    //llamo al metodo       
                
                case 2:
                    op.read(o);
                    break;
                    
                case 3:
                    op.update(objeto);
                    break;
                    
                case 4:
                    System.out.println("ingrese el codigo de eliminar");
                    op.delete(objeto);
                    break;
                    
                case 5 :
                    //opcion para salir
                    System.out.println("gracis");
                    break;
            }
            System.out.println("desea continuar");
            
            SN=leer.next();
        }while(SN.equals("si"));
        
    }
    
}
