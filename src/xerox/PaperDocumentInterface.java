package xerox;

public interface PaperDocumentInterface extends Cloneable {
	public void setType(String type);
    public String getType();
    public void setTitle(String title);
    public String getTitle();
    public void setContent(String content);
    public String getContent();
	public PaperDocumentInterface clone() throws CloneNotSupportedException;
}
