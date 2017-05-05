/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.base;

import java.io.IOException;
import java.util.ArrayList;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {
   public static ArrayList parse(String source, String target) {
      String html = "http://www.jataiautopecas.com.br";
      try {
         Document doc = Jsoup.connect(source).get();
         Elements elements = doc.getElementsByClass(target);
         for(Element element : elements){
             
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
   }
}