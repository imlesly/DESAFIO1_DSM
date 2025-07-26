package com.example.descuentosalariolesly;

public class Salario {
    private String nombretraba;
    private double salarioprincipal;
    private static final double AFP = 0.0725;
    private static  final double ISSS =0.03;
    
    public Salario (String nombretraba, double salarioprincipal){
        this.nombretraba= nombretraba;
        this.salarioprincipal= salarioprincipal;
    }
public String getNombretraba(){
        return nombretraba;
}
}
