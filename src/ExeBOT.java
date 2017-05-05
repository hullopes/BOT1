
import br.tatuapu.base.HtmlParser;
import br.tatuapu.base.LeitorHTML;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.text.BadLocationException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Informática
 */
public class ExeBOT {
    public static void main(String[] args) throws MalformedURLException, URISyntaxException{
//        LeitorHTML leitor = new LeitorHTML();
//        try {
//            String resp = leitor.getText("http://www.jataiautopecas.com.br");
//            System.out.println("resp:"+resp);
//        } catch (URISyntaxException ex) {
//            Logger.getLogger(ExeBOT.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(ExeBOT.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (BadLocationException ex) {
//            Logger.getLogger(ExeBOT.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        
//        try {
//            leitor.lerDocumento("http://www.google.com.br");
//        } catch (IOException ex) {
//            Logger.getLogger(ExeBOT.class.getName()).log(Level.SEVERE, null, ex);
//        }
          HtmlParser.parse("http://www.jataiautopecas.com.br", "carro");
    }
}
