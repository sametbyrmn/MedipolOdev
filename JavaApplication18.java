/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication18;
import org.apache.commons.lang3.StringUtils;
/**
 *
 * @author sametbuyurman
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String hatalimetin="    M ed ipol   ";
        System.out.println("hatalı metin "+hatalimetin);
        
        String duzgunmetin=StringUtils.deleteWhitespace(hatalimetin);
        System.out.println(duzgunmetin);
        
        
        
    }
    
}
