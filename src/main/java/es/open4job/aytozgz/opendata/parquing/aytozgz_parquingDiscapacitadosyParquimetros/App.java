package es.open4job.aytozgz.opendata.parquing.aytozgz_parquingDiscapacitadosyParquimetros;

import jasperreport.ReportAparcamientosDiscapacitados;
import dao.AparcamientoPD_DAO;
import metodosOracle.*;

/**
 * Hello world!
 *
 */
public class App {
	// private UnfoldingMap map;

	public static void main(String args[]) {
		/*
		 * //Crear archivo CSV AparcamientoPD_DAO aparcamiento = new
		 * AparcamientoPD_DAO(); aparcamiento.aparcamientosCSV();
		 */
		// ReportAparcamientosDiscapacitados reportes = new
		// ReportAparcamientosDiscapacitados();
		// reportes.crearReport();
		// AparcamientoPD_DAO aparcamiento = new AparcamientoPD_DAO();
		// aparcamiento.InsertarAparcamientoPDVO();

		/*
		 * AparcamientoPD_DAO aparcamiento = new AparcamientoPD_DAO();
		 * aparcamiento.ActualizarAparcamientoPDVO(); }
		 */

		AparcamientoPD_DAO aparcamiento = new AparcamientoPD_DAO();
		aparcamiento.PruebaInsertarCommit();

		/*
		 * // Recoger los aparcamientos y poner su localizacion en el mapa.
		 * public void setup() { size(800, 600, OPENGL); map = new
		 * UnfoldingMap(this); map.zoomAndPanTo(12, new
		 * Location(41.651702291759094, -0.8949809000000641)); // 1.Recoger los
		 * aparcamientos AparcamientoPD_DAO aparcamientos = new
		 * AparcamientoPD_DAO(); ArrayList<AparcamientoPDVO> listaAparcamientos
		 * = new ArrayList<AparcamientoPDVO>(); listaAparcamientos =
		 * aparcamientos.getallAparcamientos(); // 2.Colocar las marcas de los
		 * aparcamientos en el mapa for (int i = 0; i <
		 * listaAparcamientos.size(); i++) { Location localizacion = new
		 * Location(listaAparcamientos.get(i) .getLongitud(),
		 * listaAparcamientos.get(i).getLatitud()); SimplePointMarker marca =
		 * new SimplePointMarker(localizacion); map.addMarkers(marca); }
		 * MapUtils.createDefaultEventDispatcher(this, map); }
		 * 
		 * // Dibuja y abre el Applet del mapa. public void draw() {
		 * background(0); map.draw(); }
		 */
	}
}
