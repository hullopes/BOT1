/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.base;

/**
 *
 * @author Informática
 */
import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

public class LoadPage {

    public void getPage(URL url, File file) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));
        BufferedWriter out = new BufferedWriter(new FileWriter(file));
        String inputLine;
        while ((inputLine = in.readLine()) != null) {		
            // Imprime p&aacute;gina no console
            System.out.println(inputLine);			
            // Grava pagina no arquivo
            out.write(inputLine);
            out.newLine();
        }

        in.close();
        out.flush();
        out.close();
    }

    public static void main(String[] args) {
        URL url = null;
        File file = new File("C:\\Users\\Informática\\Desktop\\site.html");
        try {
            url = new URL("http://www.google.com.br");
            new LoadPage().getPage(url, file);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}