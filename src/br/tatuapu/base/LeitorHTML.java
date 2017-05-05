/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLConnection;
import javax.swing.text.BadLocationException;
import javax.swing.text.EditorKit;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;

/**
 *
 * @author Informática
 */
public class LeitorHTML {
    
    public String getText(String uriStr) throws URISyntaxException, IOException, BadLocationException {
        final StringBuffer buf = new StringBuffer(1000);    
        try {
            HTMLDocument doc = new HTMLDocument() {
                public HTMLEditorKit.ParserCallback getReader(int pos) {
                    return new HTMLEditorKit.ParserCallback() {
                        public void handleText(char[] data, int pos) {
                            buf.append(data);
                            buf.append('\n');
                        }
                    };
                }
            };
            URL url = new URI(uriStr).toURL();
            URLConnection conn = url.openConnection();
            Reader rd = new InputStreamReader(conn.getInputStream());
            EditorKit kit = new HTMLEditorKit();
            kit.read(rd, doc, 0);
            
        } catch (MalformedURLException e) {
        } catch (URISyntaxException e) {
        } catch (BadLocationException e) {
        } catch (IOException e) {
        }
        // Retorna todo o texto encontrado
        return buf.toString();
    }    

    public void lerDocumento(String site) throws MalformedURLException, IOException, URISyntaxException {
        URL url = new URI(site).toURL(); 
        URLConnection conn = url.openConnection(); 
        InputStream is = url.openStream(); 
        InputStreamReader isr = new InputStreamReader(is); 
        BufferedReader br = new BufferedReader(isr); 
        String linha = br.readLine(); 
        while (linha != null) { 
        System.out.println(linha); 
        linha = br.readLine(); 
        }
    }
    
    
   
    
}
