package com.mycompany.web.models;


import java.sql.*;


public class AccionesCliente {

//Insertar cliente y realizar descuento

public static int registrarCliente(Cliente c){
    int estado = 0;

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:8080/descuentos","root","");

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


//Consultar descuento por correo

public static Cliente verCliente(String correoAConsultar){
    Cliente clienteADevolver = new Cliente();

    try {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost:8080/descuentos","root","");

        String query = "SELECT * FROM cliente WHERE correo_cliente=?";

        PreparedStatement pst = conexion.prepareStatement(query);
        
        pst.setString(1, correoAConsultar);

        ResultSet consultaCliente = pst.executeQuery();

        if (consultaCliente.next()){
            clienteADevolver.setId( consultaCliente.getInt(1));
            clienteADevolver.setCorreo( consultaCliente.getString(2));
            clienteADevolver.setCategoria(consultaCliente.getString(3));
            clienteADevolver.setCosto(consultaCliente.getDouble(4));
            conexion.close();
        }
    } catch (Exception e){
        System.out.println(e);
        System.out.println("No se pudo consultar descuento del cliente");
    }

    return clienteADevolver;
}    

    
}
