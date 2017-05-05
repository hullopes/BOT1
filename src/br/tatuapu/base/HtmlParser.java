/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.tatuapu.base;

import br.tatuapu.model.HtmlElement;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class HtmlParser {
   public static List<HtmlElement> parse(String source, String target) {
       List<HtmlElement> elementos = new ArrayList<>();
      try {
         Document doc = Jsoup.connect(source).get();
         Elements elements = doc.getElementsByClass(target);
         for(Element element : elements){
             if(element.getClass())
             HtmlElement tag = new HtmlElement();
             //elementos.add(htmlEl);
         }

      } catch (IOException e) {
         e.printStackTrace();
      }
      return elementos;
   }
}