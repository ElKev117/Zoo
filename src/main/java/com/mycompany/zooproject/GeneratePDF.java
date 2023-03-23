/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 *
 * @author brayan
 */
public class GeneratePDF {
    Document document = new Document(PageSize.A4);
    String pdfName = "reporteZoo";
    int numCol = 6;
    
    public void generatePDF () throws FileNotFoundException, DocumentException{
        
        PdfWriter.getInstance(document, new FileOutputStream(pdfName));
        document.open();
        
        // Agregar titulo
        Paragraph title = new Paragraph("ZonaZoo");
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);
        
        // Agregar tabla
        PdfPTable table = new PdfPTable(numCol);            // Crea una tabla con numCol columnas
        table.setWidthPercentage(100);                      // La tabla ocupa el ancho completo de la página
        table.setSpacingBefore(10f);                        // Espacio antes de la tabla
        table.setSpacingAfter(10f);                         // Espacio después de la tabla

        // Agregar encabezado
        Font font = FontFactory.getFont(FontFactory.HELVETICA_BOLD);
        PdfPCell cell1 = new PdfPCell(new Paragraph("PLAN", font));
        PdfPCell cell2 = new PdfPCell(new Paragraph("VALOR", font));
        PdfPCell cell3 = new PdfPCell(new Paragraph("CANTIDAD", font));
        PdfPCell cell4 = new PdfPCell(new Paragraph("VALOR VENTA", font));
        PdfPCell cell5 = new PdfPCell(new Paragraph("DESCUENTO", font));
        PdfPCell cell6 = new PdfPCell(new Paragraph("TOTAL", font));

        
        // Agrega filas a la tabla
        table.addCell(cell1);
        table.addCell(cell2);
        table.addCell(cell3);
        table.addCell(cell4);
        table.addCell(cell5);
        table.addCell(cell6);
        
        //Adherir filas 
        

        
        
    }
    
}
