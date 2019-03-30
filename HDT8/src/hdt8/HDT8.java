package hdt8;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Gerardo
 */
public class HDT8 
{

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException 
    {
        VectorHeap pacientes = new VectorHeap();
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
            String [] b = a.split(", ");
            String nombre = b[0];
            String sintoma = b[1];
            String emergencia = b[2];
            Paciente nuevo = new Paciente(nombre, sintoma, emergencia);
            pacientes.add(nuevo);
        }
        
        System.out.println("IMPLEMENTACION LA CLASE VECTORHEAP");
        System.out.println("EL orden para la atención de los pacientes ingresados es:");
        
        while(!pacientes.isEmpty())
        {
            System.out.println("");
            Object pac = pacientes.remove();
            Paciente temp = (Paciente) pac;
            temp.display();
            
        }
    }
}
