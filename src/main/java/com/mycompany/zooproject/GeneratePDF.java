/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject;

import com.mycompany.zooproject.Controlador.CostumerManagement;
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
    CostumerManagement costumers = new CostumerManagement();
    
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
        double[] plan0 = new double[6];
        double[] plan1 = new double[6];
        double[] plan2 = new double[6];
        double[] plan3 = new double[6];
        double[] plan4 = new double[6];
        double[] plan5 = new double[6];
        
        //Para lluego crear un método que haga cada bloque de if's abajo
        for(Costumer costumer : costumers.getCostumer()){
            if(costumer.getPlan()==0){
                plan0[0] = 0;
                plan0[1] = costumer.getPurchaseAmount();
                plan0[2] += 1;
                plan0[3] = plan0[1]*plan0[2];
                plan0[4] = costumer.getPlanPercent();
                plan0[5] =+ costumer.makeOffer();
            }
            if(costumer.getPlan()==1){
                plan1[0] = 1;
                plan1[1] = costumer.getPurchaseAmount();
                plan1[2] += 1;
                plan1[3] = plan1[1]*plan1[2];
                plan1[4] = costumer.getPlanPercent();
                plan1[5] =+ costumer.makeOffer();
            }
            if(costumer.getPlan()==2){
                plan2[0] = 2;
                plan2[1] = costumer.getPurchaseAmount();
                plan2[2] += 1;
                plan2[3] = plan2[1]*plan2[2];
                plan2[4] = costumer.getPlanPercent();
                plan2[5] =+ costumer.makeOffer();
            }
            if(costumer.getPlan()==3){
                plan3[0] = 3;
                plan3[1] = costumer.getPurchaseAmount();
                plan3[2] += 1;
                plan3[3] = plan3[1]*plan3[2];
                plan3[4] = costumer.getPlanPercent();
                plan3[5] =+ costumer.makeOffer();
            }
            if(costumer.getPlan()==4){
                plan4[0] = 4;
                plan4[1] = costumer.getPurchaseAmount();
                plan4[2] += 1;
                plan4[3] = plan4[1]*plan4[2];
                plan4[4] = costumer.getPlanPercent();
                plan4[5] =+ costumer.makeOffer();
            }
            if(costumer.getPlan()==5){
                plan5[0] = 5;
                plan5[1] = costumer.getPurchaseAmount();
                plan5[2] += 1;
                plan5[3] = plan5[1]*plan5[2];
                plan5[4] = costumer.getPlanPercent();
                plan5[5] =+ costumer.makeOffer();
            }
        }
        
        //Adherir celdas
        table.addCell(""+plan0[0]);
        table.addCell(""+plan0[1]);
        table.addCell(""+plan0[2]);
        table.addCell(""+plan0[3]);
        table.addCell(""+plan0[4]);
        table.addCell(""+plan0[5]);
        
        table.addCell(""+plan1[0]);
        table.addCell(""+plan1[1]);
        table.addCell(""+plan1[2]);
        table.addCell(""+plan1[3]);
        table.addCell(""+plan1[4]);
        table.addCell(""+plan1[5]);
        
        table.addCell(""+plan2[0]);
        table.addCell(""+plan2[1]);
        table.addCell(""+plan2[2]);
        table.addCell(""+plan2[3]);
        table.addCell(""+plan2[4]);
        table.addCell(""+plan2[5]);
        
        table.addCell(""+plan3[0]);
        table.addCell(""+plan3[1]);
        table.addCell(""+plan3[2]);
        table.addCell(""+plan3[3]);
        table.addCell(""+plan3[4]);
        table.addCell(""+plan3[5]);
        
        table.addCell(""+plan4[0]);
        table.addCell(""+plan4[1]);
        table.addCell(""+plan4[2]);
        table.addCell(""+plan4[3]);
        table.addCell(""+plan4[4]);
        table.addCell(""+plan4[5]);
        
        table.addCell(""+plan5[0]);
        table.addCell(""+plan5[1]);
        table.addCell(""+plan5[2]);
        table.addCell(""+plan5[3]);
        table.addCell(""+plan5[4]);
        table.addCell(""+plan5[5]);
        
    }
    
}
