package com.corenetworks.presentacion;

import com.corenetworks.persistencia.AccesoProducto;
import com.corenetworks.persistencia.Conexion;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Main {
    public static void main(String[] args){

        Conexion c1 = new Conexion();
        try {
            c1.abrirConexion();
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        } catch (SQLException e) {
            System.out.println(e.toString());
        }
      AccesoProducto ap1= new AccesoProducto();
//        try {
//            System.out.println(ap1.obtenerUno(5));
//        } catch (ClassNotFoundException e) {
//            System.out.println(e.toString());
//        } catch (SQLException e) {
//            System.out.println(e.toString());
//        }
        try {
            System.out.println(ap1.obtenerTodos());
        } catch (SQLException e) {
            System.out.println(e.toString());
        } catch (ClassNotFoundException e) {
            System.out.println(e.toString());
        }
    }


    }