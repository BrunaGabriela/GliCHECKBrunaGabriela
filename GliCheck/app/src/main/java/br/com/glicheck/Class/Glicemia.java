package br.com.glicheck.Class;

/**
 * Created by Bruna on 11/14/2015.
 */
public class Glicemia {

    private int id;
    private int glicemia, dia, mes, ano;


    public Glicemia(int id, int glicemia, int dia, int mes, int ano)
    {
        this.id = id;
        this.glicemia = glicemia;
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;

    }

    public int getId() { return id; };
    public int getGlicemia() { return glicemia; }
    public int getDia() { return dia; }
    public int getMes() { return mes; }
    public int getAno() { return ano; }


}
