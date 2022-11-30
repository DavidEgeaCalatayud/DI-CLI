/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package exCLI;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.OptionGroup;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;

/**
 *
 * @author Toy
 */
public class DiCLI {

    public static void main(String[] args) throws ParseException {
        //Sirve para meter datos por consola
        args = new String[]{"-y"};
        // create Options object
        Options options = new Options();

        // add t option
        options.addOption("w", false, "Hola mundo");
        options.addOption("c", false, "Hola mundo cruel");
        options.addOption("n", false, "Hola mundo bonito");
        options.addOption("h", false, "Ayuda");
        options.addOption("y", false, "Anios");
        CommandLineParser parser = new DefaultParser();
        CommandLine cmd = parser.parse(options, args); 
        

        if (cmd.hasOption("w")) {
            System.out.println("Hola mundo");
        } else if (cmd.hasOption("c")) {
            System.out.println("Hola mundo cruel");
        } else if (cmd.hasOption("n")) {
            System.out.println("Hola mundo bonito");
        } else if (cmd.hasOption("h")) {
            System.out.println("Pulsa w, n, c o y para ejecutar una accion de este programa");
        } else if (cmd.hasOption("y")) {
           DateFormat myFormat = DateFormat.getDateInstance( DateFormat.LONG, Locale.ENGLISH );
            System.out.println(DateFormat.DATE_FIELD);
 
        } else {
            System.err.getClass();
        }

    }
}
