/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PaquetePrincipal;

/**
 *
 * @author juanp
 */
public class SalaCine {
    int aforo;
    int ocupadas;
    String pelicula;
    double entradas;
    
    
    public SalaCine(){
        aforo = 100;
        ocupadas = 100;
        pelicula = "";
        entradas = 0;
        
    }
    //Seters
    public void setAforo(int afo){
        aforo = afo;
    }
    
    public void setOcupadas(int ocu){
        ocupadas = ocu;
    }
    
    public void setPelicula(String peli){
        pelicula = peli;
    }
    
    public void setEntrada(double entra){
        entradas = entra;
    }
    
    public void setLibres(int libre){
        int Ocu;
        Ocu = aforo - libre;
        ocupadas = Ocu;
    }
    
    //Getters
    
    public int getAforo(){
        return aforo;
    }
    
    public int getOcupadas(){
        return ocupadas;
    }
    
    public String getPeliculas(){
        return pelicula;
    }
    
    public double getEntrada(){
        return entradas;
    }
    
    public int getLibres(){
        int lib;
        lib = aforo - ocupadas;
        return lib;
    }
    
    public double getPorcentajes(){
        double por;
        por = (double) ocupadas /(double) aforo * 100.0;
        return por;
    }
    
    public double getIngresos(){
        double ingre;
        ingre = ocupadas * entradas;
        return ingre;
    }
    
    public void Vaciar(){
        ocupadas = 0;
        pelicula = "";
    }
    
    public void entradaUno(){
        ocupadas++;
    }
    
}
