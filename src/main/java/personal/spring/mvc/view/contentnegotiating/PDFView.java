package personal.spring.mvc.view.contentnegotiating;


import com.itextpdf.text.*;
import com.itextpdf.text.Font;
import com.itextpdf.text.pdf.PdfWriter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.LinkedList;
import java.util.Map;

public class PDFView  extends AbstractPdfView {

    @Override
    protected void buildPdfDocument(Map<String, Object> model, Document document, PdfWriter writer, HttpServletRequest request, HttpServletResponse response) throws Exception {
        // Get data "articles" from model
        @SuppressWarnings("unchecked")
        LinkedList<Article> articles = (LinkedList<Article>) model.get("articles");

        // Fonts
        Font fontTitle = new Font(Font.FontFamily.TIMES_ROMAN, 14, Font.BOLD, BaseColor.BLACK);
        Font fontTag = new Font(Font.FontFamily.HELVETICA, 10, Font.BOLD, BaseColor.WHITE);

        for(Article article:articles){

            // 1.Title
            document.add(new Chunk("Title: "));
            Chunk title = new Chunk(article.getTitle(), fontTitle);
            document.add(title);
            document.add(new Chunk(" "));

            // -- newline
            document.add(Chunk.NEWLINE);

            // 2.URL
            document.add(new Chunk("URL: "));
            Anchor url  = new Anchor(article.getUrl());
            url.setName(article.getUrl());
            url.setReference(article.getUrl());
            document.add(url);

            // -- newline
            document.add(Chunk.NEWLINE);

            // 3.Categories
            Chunk cat = null;
            document.add(new Chunk("Category: "));
            for(String category:article.getCategories()){
                cat =  new Chunk(category, fontTag);
                cat.setBackground(new BaseColor(72, 121, 145), 1f, 0.5f, 1f, 1.5f);
                document.add(cat);
                document.add(new Chunk(" "));

            }

            // -- newline
            document.add(Chunk.NEWLINE);

            // 4.Tags
            Chunk tg = null;
            document.add(new Chunk("Tags: "));
            for(String tag:article.getTags()){
                tg =  new Chunk(tag, fontTag);
                tg.setBackground(new BaseColor(97, 97, 97), 1f, 0.5f, 1f, 1.5f);
                document.add(tg);
                document.add(new Chunk(" "));

            }

            // -- newline
            document.add(Chunk.NEWLINE);
            document.add(Chunk.NEWLINE);

        }


    }
}
