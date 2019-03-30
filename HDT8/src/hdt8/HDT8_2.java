package hdt8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.PriorityQueue;

/**
 *
 * @author Gerardo
 */
public class HDT8_2 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        PriorityQueue pacientesQueue = new PriorityQueue();
        ArrayList<String> array = new ArrayList<>();        
        Scanner read = new Scanner(new File("pacientes.txt"));
        read.useDelimiter("\\r\\n");
        String data;
        
        while(read.hasNext())
        {
            if(read.hasNextLine()){
                data = read.next();
                array.add(data);
            }
        }
        
        for(String a : array)
        {
            String [] entries = a.split(", ");
            String nombre = entries[0];
            String sintoma = entries[1];
            String emergencia = entries[2];
            Paciente nuevo = new Paciente(nombre, sintoma, emergencia);
            pacientesQueue.add(nuevo);
        }
        
        System.out.println("IMPLEMENTACION DEL PRIORITY QUEUE DEL JCF");
        System.out.println("EL orden para la atención de los pacientes ingresados es:");
        
        while(!pacientesQueue.isEmpty())
        {
            System.out.println("");
            Object pac = pacientesQueue.remove();
            Paciente temp = (Paciente) pac;
            temp.display();
        }
    }
}
