package umg.principal.reportes;

import umg.principal.DaseDatos.Service.ProductoService;
import umg.principal.DaseDatos.model.Producto;
import javax.swing.*;
import java.util.List;


public class pruebas {

    public static void GenerarReporte(String condicion){
        try{
            List<Producto> prod = new ProductoService().obtenerTodosMenores20(condicion);
//            List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            new PdfReport().generateProductReport(prod, "C:\\PruebasSQLITE\\reporte.pdf");
            //mostrar un mensaje de que se genero el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado enC:\\PruebasSQLITEreporte.pdf");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    public static void GenerarReportePorOrden (String condicion){
        try{
            List<Producto> prod = new ProductoService().obtenerTodosPorOrden(condicion);
//            List<Producto> prod = new ProductoService().obtenerTodosLosProductos();
            new PdfReport().generateProductReport(prod, "C:\\PruebasSQLITE\\reporte.pdf");
            //mostrar un mensaje de que se genero el reporte
            //con jpanel
            JOptionPane.showMessageDialog(null, "Reporte generado enC:\\PruebasSQLITEreporte.pdf");
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }


}