/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pr02_m8;

/**
 *
 * @author daw
 */
import java.io.*;

public class Pr02_m8 {

public static void main(String[] args) throws IOException { File f = new File("fitxer.html");

try (BufferedWriter bw = new BufferedWriter(new FileWriter(f))) { bw.write("<html>");

bw.newLine(); 

bw.write(" <head>");bw.newLine();

bw.write(" <title>");bw.newLine(); bw.write(" Nova p&agrave;gina web");

bw.newLine(); bw.write(" </title>"); bw.newLine(); bw.write(" </head>"); bw.newLine();

bw.write(" <body>");
bw.write(" <h1>DAW2 m08uf4pr2</h1>");
bw.newLine();
bw.newLine();
bw.write(" Nova p&agrave;gina web"); bw.newLine();
bw.write("Hola");
bw.write("Adeu");
bw.write("xdddddddddd");
bw.write("Hola");
bw.write("Adeu");
bw.write("xdddddddddd");
bw.write(" </body>");
bw.newLine();
bw.write("</html>");
bw.newLine();
bw.close(); 

} }

}
