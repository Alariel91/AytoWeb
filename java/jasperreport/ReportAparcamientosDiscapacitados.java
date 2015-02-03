package jasperreport;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.view.JasperViewer;
import dao.*;
import vo.*;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;

public class ReportAparcamientosDiscapacitados {

	public void crearReport() {
		AparcamientoPD_DAO aparcamientoDao = new AparcamientoPD_DAO();
		ArrayList<AparcamientoPDVO> aparcamientos = new ArrayList<AparcamientoPDVO>();
		aparcamientos = aparcamientoDao.getallAparcamientos();

		try {
			JasperReport report = JasperCompileManager.compileReport("archivos/aparcamientosPersonasDiscapacitadas.jrxml");
			JasperPrint print = JasperFillManager.fillReport(report, null,
					new JRBeanCollectionDataSource(aparcamientos));
			// Para visualizar el pdf directamente desde java
			JasperViewer.viewReport(print, false);
		} catch (JRException e) {
			// TODO Auto-generated catch block
			Logger.getLogger(getClass().getName()).log(Level.SEVERE,
					"No se ha encontrado el archivo: " + e.getMessage());
		}
	}

}
