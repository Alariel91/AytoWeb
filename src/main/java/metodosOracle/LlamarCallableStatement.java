package metodosOracle;

import java.sql.CallableStatement;
import java.sql.Types;
import java.util.logging.Level;
import java.util.logging.Logger;


import sql.sentenciasSQL;

public class LlamarCallableStatement {
	private CallableStatement cst;
	public void llamarCallabe(){
		sentenciasSQL sql = new sentenciasSQL();
		try {
			sql.conectarBBDD();
			cst = sql.getConn().prepareCall("{? = call devolverNumero(?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, 5);
			cst.executeQuery();
			
			int x = cst.getInt(1);
			System.out.println(x);
			sql.closeBBDD();
		} catch (Exception e) {
			// TODO: handle exception
			 Logger.getLogger(getClass().getName()).log(Level.SEVERE,
					  "Error: " + e.getMessage());
		}
	}
	public void llamarCallabeMultiplicacion(){
		sentenciasSQL sql = new sentenciasSQL();
		try {
			sql.conectarBBDD();
			cst = sql.getConn().prepareCall("{? = call multiplicacion(?,?)}");
			cst.registerOutParameter(1, Types.INTEGER);
			cst.setInt(2, 5);
			cst.setInt(3, 5);
			cst.executeQuery();
			
			int x = cst.getInt(1);
			System.out.println(x);
			sql.closeBBDD();
		} catch (Exception e) {
			// TODO: handle exception
			 Logger.getLogger(getClass().getName()).log(Level.SEVERE,
					  "Error: " + e.getMessage());
		}
	}
}
