package xerox;

import java.util.ArrayList;
import java.util.List;

public class Xerox {

   public static PaperDocumentInterface copy(PaperDocumentInterface original) throws CloneNotSupportedException{
      PaperDocumentInterface copy = ((PaperDocument) original).clone();
	   return copy;
   }
   public static List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity) throws CloneNotSupportedException{
	   List <PaperDocumentInterface> copy = new ArrayList<PaperDocumentInterface>();
		for(int i = 0; i < quantity; i++) {
			PaperDocumentInterface copyElements = ((PaperDocument) original).clone();
			copy.add(copyElements);
		}
	   return copy;
   }
   public static PaperDocumentInterface original(String type, String title, String content) {
	   PaperDocumentInterface original = new PaperDocument(type, title, content);
	   return original;
   }
}
