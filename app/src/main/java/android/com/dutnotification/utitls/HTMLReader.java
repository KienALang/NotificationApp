package android.com.dutnotification.utitls;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class HTMLReader {
    private Jsoup mJsoup;
    private Document mDocument;
    private String mKeyWord;
    private String mUrl;

    public HTMLReader() {

    }

    public HTMLReader(Jsoup mJsoup, Document mDocument, String nKeyWord, String mUrl) {
        this.mJsoup = mJsoup;
        this.mDocument = mDocument;
        this.mKeyWord = nKeyWord;
        this.mUrl = mUrl;
    }

    public Jsoup getmJsoup() {
        return mJsoup;
    }

    public void setmJsoup(Jsoup mJsoup) {
        this.mJsoup = mJsoup;
    }

    public Document getmDocument() {
        return mDocument;
    }

    public void setmDocument(Document mDocument) {
        this.mDocument = mDocument;
    }

    public String getmKeyWord() {
        return mKeyWord;
    }

    public void setmKeyWord(String nKeyWord) {
        this.mKeyWord = nKeyWord;
    }

    public String getContent() {
        String content = null;

        

        return content;
    }

    private Document getDocument(String url) {
        try {
            mDocument = mJsoup.connect(url).get();

        }catch (Exception e) {
            System.out.println("Jsoup Error: "+e.getMessage());
        }
        return mDocument;
    }
}
