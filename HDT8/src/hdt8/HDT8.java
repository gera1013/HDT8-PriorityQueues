//package hdt8;

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
        Scanner scan = new Scanner(System.in);
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
            if(emergencia.length() > 1)
            {
                System.out.println("La prioridad del paciente " + nombre + " no existe");
                System.out.println("No fue agregado a la cola, por favor revise el documento");
                System.out.println("");
            }
            else
            {
                Paciente nuevo = new Paciente(nombre, sintoma, emergencia);
                pacientes.add(nuevo);
            }
        }
        
        System.out.println("IMPLEMENTACION LA CLASE VECTORHEAP");
        System.out.println("");
        
        while(!pacientes.isEmpty())
        {
            System.out.println("PRESIONE ENTER PARA VER AL SIGUIENTE PACIENTE");
            String anything = scan.nextLine();
            Object pac = pacientes.remove();
            Paciente temp = (Paciente) pac;
            temp.display();
            System.out.println("");
        }
        
        System.out.println("Ya no hay más pacientes en la cola");
        System.out.println("");
    }
}
