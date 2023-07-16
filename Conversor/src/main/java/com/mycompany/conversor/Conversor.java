/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.conversor;
import com.mycompany.conversor.Menu_principal;
import javax.swing.*;
/**
 *
 * @author C4ptaiN
 */
public class Conversor {
    
// Codigo para conversion de divisas
    public double valor = 0.00;
    public double dolar = 16.75;
    public double euro = 18.82;
    public double libra = 21.92; 
    public double yen = 0.12;
    public double won = 0.013;
    public double resultado = 0.00;
    

    public double PesomxaDolar(double value){
        resultado = value / dolar ;
        return resultado;
        
    }
    public double PesomxaEuro(double value ){
        resultado = value  / euro ;
        return resultado;
    }
    public double PesomxaLibras(double value ){
        resultado = value / libra ;
        return resultado;
    }
    public double PesomxaYen(double value ){
       resultado = value  / yen ;
       return resultado; 
    }
    public double PesomxaWon(double value ){
        resultado = value / won ;
        return resultado;
    }
    
    public double DolaraPesomx(double value){
        resultado = value * dolar ;
        return resultado;
        
    }
    public double EuroaPesomx(double value ){
        resultado = value * euro ;
        return resultado;
    }
    public double LibrasaPesomx(double value ){
        resultado = value * libra ;
        return resultado;
    }
    public double YenaPesomx(double value ){
       resultado = value  * yen ;
       return resultado; 
    }
    public double WonaPesomx(double value ){
        resultado = value * won ;
        return resultado;
    }
    
// Codigo para conversion de temperaturas 
   
    public double Celsiusafahrenheit(Double value){
        resultado = (value * 9/5) + 32;
        return resultado;
    }
    public double Celsiusakelvin(Double value){
        resultado = value + 273.15;
        return resultado;
    }
    public double fahrenheitaCelsius(Double value){
        resultado = (value - 32) * 5/9;
        return resultado;
    }
    public double fahrenheitakelvin(Double value){
        resultado = (value + 459.67) * 5/9;
        return resultado;
    }
    public double kelvinacelcius(Double value){
        resultado = value - 273.15;
        return resultado;
    }
    public double kelvinafahrenheit(Double value){
        resultado = (value - 273.15) * 9/5 +32;
        return resultado;
    }
    
    public boolean validacion(String texto) {
        try{
           valor = Double.parseDouble(texto);
           return true;
        }catch(Exception e){
            return false;
            
        }
    };
    
    
    public static void main(String[] args) {
        Menu_principal menu = new Menu_principal();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
        
    }
}
