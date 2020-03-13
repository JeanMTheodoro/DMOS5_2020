package br.edu.ifsp.arq.calculoimc.model;

import br.edu.ifsp.arq.calculoimc.R;

public class Pessoa {

    public static final int ABAIXO = R.string.Abaixo_do_Peso;
    public static final int NORMAL = R.string.peso_normal;
    public static final int SOBREPESO = R.string.sobrepeso;
    public static final int GRAU_1 = R.string.obeso_grau_1;
    public static final int GRAU_2 = R.string.obeso_grau_2;
    public static final int GRAU_3 =  R.string.obeso_gra_3;


    double imc;

    private double altura;

    private double peso;


    public Pessoa(double altura, double peso) {

        setAltura(altura);
        setPeso(peso);
    }


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }



    public double imc(){

        imc = peso  / Math.pow(altura, 2);
        return imc;

    }

    public int resultado(){


        if (imc < 18.9){

            return ABAIXO;
        }else {
            if(imc < 24.9){

                return NORMAL;
            }else {
                if(imc < 29.9){
                    return SOBREPESO;
                }else {
                    if(imc < 34.9){

                        return GRAU_1;
                    }else {
                        if(imc < 39.9){

                            return GRAU_2;
                        }else {
                            return GRAU_3;
                        }
                    }
                }
            }
        }
    }


}
