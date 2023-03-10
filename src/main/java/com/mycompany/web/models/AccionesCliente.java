package com.mycompany.web.models;


import java.sql.*;


public class AccionesCliente {

//Insertar cliente

public static int registrarCliente(Cliente c){

    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/viajes","root","");

        String query = "INSERT INTO cliente(correo,categoria,costo) VALUES (?,?,?)";

        String correo = c.getCorreo();
        String categoria = c.getCategoria();
        double costo = c.getCosto();


        PreparedStatement pst = conexion.prepareStatement(query);
 
        pst.setString(1, correo);
        pst.setString(2, categoria);
        pst.setDouble(3, costo);

        estado = pst.executeUpdate();

        conexion.close();


    } catch (Exception e){
        System.out.println(e);
        System.out.println("No se pudo realizar el registro del cliente con el descuento");
    }

    return estado;
}


//Consultar por correo

public static Cliente verCliente(String correoAConsultar){
    Cliente clienteADevolver = new Cliente();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/viajes","root","");
        String query = "SELECT * FROM cliente WHERE correo=?"; 
        
        PreparedStatement pst = conexion.prepareStatement(query);
  
        
        pst.setString(1, correoAConsultar);

        ResultSet consultaCliente = pst.executeQuery();
       
        if (consultaCliente.next()){ 
            clienteADevolver.setCorreo(consultaCliente.getString(1));
            clienteADevolver.setCategoria(consultaCliente.getString(2));
            clienteADevolver.setCosto(consultaCliente.getDouble(3));
            conexion.close();       
        }
               
    } catch (Exception e){
        System.out.println(e);
        System.out.println("No se pudo consultar descuento del cliente");
    }

    return clienteADevolver;
} 
   
}
    

