package main;

import java.util.List;

import xerox.Xerox;
import xerox.PaperDocumentInterface;

public class Application {

	public static void main(String[] args) throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		PaperDocumentInterface document = Xerox.original("Contract", "Java Developer Hiring Contract", "\n1. Working hours per day: 6\n"
																									 + "2. Earn per hour: 15EUR\n"
																									 + "3. Hollidays per year: 30days.");
		
		PaperDocumentInterface copyDocument = Xerox.copy (document);
		copyDocument.setType("Contract Copy");
		
		List<PaperDocumentInterface> listCopyDocument = Xerox.copy(copyDocument, 3);
		listCopyDocument.forEach(c -> c.setType("Archived Contract Copy"));
		
		System.out.println(document);
		System.out.println();
		System.out.println(copyDocument);
		System.out.println();
		listCopyDocument.forEach(c -> System.out.println(c));
	}
}
