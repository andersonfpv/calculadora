/**
 * @(#)Calculadora.java
 *
 *
 * @author 
 * @version 1.00 2017/6/3
 */

public class Calculadora {
        
    private double numero1;
    private double numero2;
    
	public Calculadora(){
		numero1 = numero2 = 0;
	}
	public double getNumero1(){
		return numero1;
	}		
	public void setNumero1(double numero){
		this.numero1 = numero;
	}
	
	public double getNumero2(){
		return numero2;
	}		
	public void setNumero2(double numero){
		this.numero2 = numero;
	}
	
	public double soma(){
		return getNumero1() + getNumero2();
	}
	public double subtração(){
		return getNumero1() - getNumero2();
	}
	public double multiplicação(){
		return getNumero1() * getNumero2();
	}
	public double divisão(){
		if(getNumero1()>=getNumero2()){
			return getNumero1 / getNumero1();
		}else{
			if(getNumero2()>=getNumero1()){
				return getNumero2() / getNumero2();
			}
		}
		
	}
	
}
