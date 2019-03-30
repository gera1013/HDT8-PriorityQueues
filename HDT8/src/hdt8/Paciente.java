//package hdt8;

/**
 *
 * @author Gerardo
 */
public class Paciente implements Comparable
{
    private final String nombre;
    private final String sintoma;
    private final String emergencia;
    
    public Paciente(String n, String s, String e)
    {
        this.nombre = n;
        this.sintoma = s;
        this.emergencia = e;
    }
    
    @Override
    public int compareTo(Object o) 
    {
        Paciente temp = (Paciente) o;
        return emergencia.compareTo(temp.getEmergencia());
    }
    
    public void display()
    {
        System.out.println(nombre + ", " + sintoma + " -- Prioridad: " + emergencia);
    }
    
    /**
     *
     * @return variable nombre del paciente
     */
    public String getNombre()
    {
        return nombre;
    }
    
    /**
     *
     * @return variable sintoma del paciente
     */
    public String getSintoma()
    {
        return sintoma;
    }
    
    /**
     *
     * @return variable emergencia, la cual indica la prioridad del paciente
     */
    public String getEmergencia()
    {
        return emergencia;
    }
}
