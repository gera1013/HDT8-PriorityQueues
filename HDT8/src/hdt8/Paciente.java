package hdt8;

/**
 *
 * @author Gerardo
 */
public class Paciente implements Comparable
{
    private String nombre;
    private String sintoma;
    private char emergencia;
    
    public Paciente(String n, String s, char e)
    {
        this.nombre = n;
        this.sintoma = s;
        this.emergencia = e;
    }
    
    @Override
    public int compareTo(Object o) 
    {
        return 0;
    }
    
}
