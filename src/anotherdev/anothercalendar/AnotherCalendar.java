/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anotherdev.anothercalendar;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

/**
 *
 * @author Luis
 */
public class AnotherCalendar {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        out("Starting AnotherCalendar... (main)");
        out(" > Creating new instance");
        AnotherCalendar cal = getInstance();
        out(" > Giving control to instance");
        cal.init(args);
    }
    
    /**
     * Output a string to stdout.
     * The string is going to be prefixed with a timestamp in ISO 8601 format.
     * 
     * Example:
     * out("Hello World!");
     * ->
     * [2014-12-01T16:36:39.802+0100] Hello World!
     * @param msg the string to output
     */
    public static void out(String msg){
        String iso8601 = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ").format(new Date());
        System.out.println("["+iso8601+"] "+msg);
    }
    
    public static AnotherCalendar getInstance(){
        return new AnotherCalendar();
    }
    
    
    public void init(String[] args){
        out("Instance of AnotherCalendar says Hello World! (init)");
        out(" > Parsing arguments");
        parseArguments(args);
        out(" > Opening GUI");
        AnotherCalendarGui.main(args);
    }
    
    private void parseArguments(String[] args){
        out(" i Parsing arguments is not implemented yet!");
    }
    
    /**
     * Logger for the class.
     */
    public static final Logger L = Logger.getLogger(AnotherCalendar.class.getName());
    public Map<String, Object> conf = new HashMap(){
        {
            put("VERSION", (float) 0.01);
            put("AUTHORS", new String[]{"Luis Hartmann"});
            put("DEV_YEAR_FROM", 2014);
            put("DEV_YEAR_UNTIL", 2014);
            put("", null);
        }
    };
    
}
