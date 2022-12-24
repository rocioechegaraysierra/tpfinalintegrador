package com.mycompany.web.models;

import java.io.Serializable;

public class Cliente implements Serializable {
        private int id;
        private double costo,descuento;
        private String correo,categoria;

        public Cliente(){
    
        }
    
        public int getId(){
            return id;
        }
    
        public void setId(int nuevoId){
            this.id = nuevoId;
        }
    
              
        public String getCorreo(){
            return correo;
        }
    
        public void setCorreo(String nuevoCorreo){
            this.correo = nuevoCorreo;
        }

        public void setCategoria(String nuevaCategoria){
            this.categoria = nuevaCategoria;
        }

        public String getCategoria(){
            return categoria;
        }

        public void setCosto(double nuevoCosto){
            this.costo = nuevoCosto;
            this.calcularDescuento();
        }
        
        public double getCosto(){
            return costo;
        }

        public void setDescuento(double nuevoDescuento){
            this.descuento = nuevoDescuento;
        }

        public double getDescuento(){
            return this.descuento;
        }

        public void calcularDescuento(){
            double descuentoParcial=0;
            if (categoria == "Menores") {
                double porcentajeMenores = 0.80 * this.costo;
                descuentoParcial = this.costo - porcentajeMenores;
                
            } if (categoria == "Jubilados") {
                double porcentajeJubilados = 0.50 * this.costo;
                descuentoParcial = this.costo - porcentajeJubilados;
                
            } if (categoria == "Estudiantes") {
                double porcentajeEstudiantes = 0.15 * this.costo;
                descuentoParcial = this.costo - porcentajeEstudiantes;
                
            }
            this.descuento = descuentoParcial;
        }   
        
    }

