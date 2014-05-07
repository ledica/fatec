package teste;
import java.util.*;
public class Frete
{
    // atributos
    private int codigo;
    private double valornota;
    private String destino;
    
    // métodos
    public Frete(double va)
    {
        valornota=va;
    }
    
    public void setCode(int cod)
    {
        codigo=cod;
    }
    
    public void setDest(String des)
    {
        destino=des;
    }
    
    public void setValue(double valor)
    {
        valornota=valor;
    }
    
    public int getCode()
    {
        return codigo;
    }
    
    public String getDest()
    {
        return destino;
    }
    
    public double getValue()
    {
        return valornota;
    }
    
    public double FreteSP(double v)
    {
        double r;
        if (v<3000)
        {
            r=(v+(v*5)/100);
            valornota=r;
        }
        if (v>=3000 && v<=5000)
        {
            r=(v+(v*10)/100);
            valornota=r;
        }
        if (v>5000)
        {
            r=(v+(v*15)/100);
            valornota=r;
        }
        return valornota;
    }
    
    public double FreteOutros(double v)
    {
        double r;
        r=(v+(v*20)/100);
        valornota=r;
        return valornota;
    }
}
