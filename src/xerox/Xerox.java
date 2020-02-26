package xerox;

import java.util.ArrayList;
import java.util.List;

public class Xerox {

   public PaperDocumentInterface copy(PaperDocumentInterface original) throws CloneNotSupportedException{
      PaperDocumentInterface copy = (PaperDocumentInterface) original.clone();
	   return copy;
   }
   public List<PaperDocumentInterface> copy(PaperDocumentInterface original, int quantity) throws CloneNotSupportedException{
	   List <PaperDocumentInterface> copy = new ArrayList<PaperDocumentInterface>();
		for(int i = 0; i < quantity; i++) {
			PaperDocumentInterface copyElement = (PaperDocumentInterface) original.clone();
			copy.add(copyElement);
		}
	   return copy;
   }

}
