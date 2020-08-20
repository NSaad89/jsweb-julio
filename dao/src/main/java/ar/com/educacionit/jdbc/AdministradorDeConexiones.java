package ar.com.educacionit.jdbc;

import java.sql.DriverManager;

import java.sql.Connection;

public class AdministradorDeConexiones {
	
	public static Connection obtenerConexion() throws Exception{
		
		// Establece el nombre del driver a utilizar
        String dbDriver = "com.mysql.jdbc.Driver";
    	
    	// Establece la url y base de datos a utilizar
        String dbConnString = "jdbc:mysql://localhost:3306/jsweb-julio?serverTimezone=UTC";
    	
    	// Establece el usuario de la base de datos
        String dbUser = "root";
       
        // Establece la contraseña de la base de datos
        String dbPassword = "";
       
        // Establece el driver de conexion
        Class.forName(dbDriver).newInstance();
       
        // Retorna la conexion
        Connection conn =  DriverManager.getConnection(dbConnString, dbUser, dbPassword);
        return conn;
		
	}
}
