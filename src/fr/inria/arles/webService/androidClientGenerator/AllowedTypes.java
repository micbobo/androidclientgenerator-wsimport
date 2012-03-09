
package fr.inria.arles.webService.androidClientGenerator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 *
 * @author ajay
 */
public class AllowedTypes {
    public static final Map<String,String> returnVal= new HashMap<String,String>();
    public static final Map<String,String> soapClass= new HashMap<String,String>();
    public static ArrayList<String> complexInput=new ArrayList<String>();
    public static ArrayList<String> complexOutput=new ArrayList<String>();
    
    static
    {       
        returnVal.put("String", "execute(request, methodName).toString()");
        returnVal.put("int", "Integer.parseInt(execute(request, methodName).toString())");
        returnVal.put("short", "Short.parseShort(execute(request, methodName).toString())");        
        returnVal.put("long", "Long.parseLong(execute(request, methodName).toString())");
        returnVal.put("double", "Double.parseDouble(execute(request, methodName).toString())");
        returnVal.put("float", "Float.parseFloat(execute(request, methodName).toString())");
        returnVal.put("boolean", "Boolean.parseBoolean(execute(request, methodName).toString())");
        returnVal.put("char", "execute(request, methodName).toString().toCharArray()[0]");
               
        soapClass.put("String", "PropertyInfo.STRING_CLASS");
        soapClass.put("int", "PropertyInfo.INTEGER_CLASS");
        soapClass.put("short", "PropertyInfo.INTEGER_CLASS");        
        soapClass.put("long", "PropertyInfo.LONG_CLASS");
        soapClass.put("boolean", "PropertyInfo.BOOLEAN_CLASS");
        soapClass.put("char", "PropertyInfo.STRING_CLASS");
    }   
        
    
}
