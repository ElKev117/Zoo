/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zooproject.Vista;

import com.mycompany.zooproject.Modelo.CostumerManagement;
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
import com.mycompany.zooproject.Controlador.Costumer;
import com.mycompany.zooproject.Controlador.Plans;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import static java.lang.Math.round;

/**
 *
 * @author brayan
 */
public class GeneratePDF {
    Document document = new Document(PageSize.A4);
    String pdfName = "./reporteZoo.pdf";
    int numCol = 6;
    
    public void generatePDF () throws FileNotFoundException, DocumentException{
        
        PdfWriter.getInstance(document, new FileOutputStream(pdfName));
        document.open();
        
        // Agregar titulo
        Paragraph title = new Paragraph("Zoo Patitas Felices");
        Paragraph space = new Paragraph("\n");
        title.setAlignment(Element.ALIGN_CENTER);
        document.add(title);     
        document.add(space);
         
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
        PdfPCell cell4 = new PdfPCell(new Paragraph("VALOR DESCUENTO", font));
        PdfPCell cell5 = new PdfPCell(new Paragraph("DESCUENTO %", font));
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
        
        plan0[0] = 0;
        plan1[0] = 1;
        plan2[0] = 2;
        plan3[0] = 3;
        plan4[0] = 4;
        plan5[0] = 5;
        
        plan0[4] = Plans.PLAN_0;
        plan1[4] = Plans.PLAN_1;
        plan2[4] = Plans.PLAN_2;
        plan3[4] = Plans.PLAN_3;
        plan4[4] = Plans.PLAN_4;
        plan5[4] = Plans.PLAN_5;
        
        //Para lluego crear un método que haga cada bloque de if's abajo
        for(Costumer costumer : ZooWindow.costumers.getCostumer()){
            if(costumer.getPlan()== 0){
                plan0[1] += costumer.getPurchaseAmount();
                plan0[2] += 1;
                plan0[3] = plan0[1]*plan0[4];
                plan0[5] += Math.round(costumer.makeOffer());
            } else if(costumer.getPlan()==1){
                plan1[1] += costumer.getPurchaseAmount();
                plan1[2] += 1;
                plan1[3] = plan1[1]*plan1[4];
                plan1[5] += Math.round(costumer.makeOffer());
            } else if(costumer.getPlan()==2){
                plan2[1] += costumer.getPurchaseAmount();
                plan2[2] += 1;
                plan2[3] = plan2[1]*plan2[4];
                plan2[5] += Math.round(costumer.makeOffer());
            } else if(costumer.getPlan()==3){
                plan3[1] += costumer.getPurchaseAmount();
                plan3[2] += 1;
                plan3[3] = plan3[1]*plan3[4];
                plan3[5] += Math.round(costumer.makeOffer());
            } else if(costumer.getPlan()==4){
                plan4[1] += costumer.getPurchaseAmount();
                plan4[2] += 1;
                plan4[3] = plan4[1]*plan4[4];
                plan4[5] += Math.round(costumer.makeOffer());
            } else if(costumer.getPlan()==5){
                plan5[1] = costumer.getPurchaseAmount();
                plan5[2] += 1;
                plan5[3] = plan5[1]*plan5[4];
                plan5[5] += Math.round(costumer.makeOffer());
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
        
      
        document.add(table);
        document.close();
        
    }
    
}
