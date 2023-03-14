package com.example.demo.utilities;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Date;

import org.springframework.stereotype.Component;

import com.example.demo.entity.Reservation;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;
@Component
public class PDFgenerator {
   public void generateItinerary(Reservation reservation, String filepath) {
   	Document document = new Document();
   	try {
		PdfWriter.getInstance(document, new FileOutputStream(filepath));
		document.open();
		document.add(generateTable(reservation));
		document.close();
	} catch (FileNotFoundException | DocumentException e) {
		e.printStackTrace();
	}
   }
   private PdfPTable generateTable(Reservation reservation) {
	   PdfPTable table = new PdfPTable(2);
	   PdfPCell cell;
	   
	   cell = new PdfPCell(new Phrase("Flight Itinerary"));
	   cell.setColspan(2);
	   table.addCell(cell);
	   
	   cell = new PdfPCell(new Phrase("Flight Details"));
	   cell.setColspan(2);
	   table.addCell(cell);
	   
	   table.addCell("Departure City");
	   table.addCell(reservation.getFlight().getDepartureCity());
	   
	   table.addCell("Arrival City");
	   table.addCell(reservation.getFlight().getArrivalCity());
	   
	   table.addCell("Flight Number");
	   table.addCell(reservation.getFlight().getFlightNumber());
	   
	   table.addCell("Operating Airline");
	   table.addCell(reservation.getFlight().getOperatingAirlines());
	   
	   table.addCell("Departure Date");
	   table.addCell(reservation.getFlight().getDateOfDeparture().toString());
	   
	   table.addCell("Departure Time");
	   table.addCell(reservation.getFlight().getEstimatedDepartureTime().toString());
	   
	   cell = new PdfPCell(new Phrase("Passenger Details"));
	   cell.setColspan(2);
	   table.addCell(cell);
	   
	   table.addCell("First Name");
	   table.addCell(reservation.getPassenger().getFirstName());
	   
	   table.addCell("Last Name");
	   table.addCell(reservation.getPassenger().getLastName());
	   
	   table.addCell("Email");
	   table.addCell(reservation.getPassenger().getEmail());
	   
	   table.addCell("Mobile Number");
	   table.addCell(reservation.getPassenger().getPhone());
	   
	   return table;
	   
   }
}
