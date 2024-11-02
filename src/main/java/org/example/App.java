package org.example;

import util.DatabaseConnection;
public class App 
{
    public static void main( String[] args )
    {
        DatabaseConnection conexion = DatabaseConnection.getInstance();
    }
}
