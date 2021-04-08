package clases;

import java.util.ArrayList;

public class Arreglo_Departamento {

    private ArrayList<Departamento> lista;

    public Arreglo_Departamento() {

        lista = new ArrayList();

        lista.add(new Departamento("Alexander", 1, 2));
        lista.add(new Departamento("Fiorela", 2, 4));
        lista.add(new Departamento("Juan", 2, 3));

    }

    public void adi_Departamento(Departamento dep) {

        lista.add(dep);
    }

    public ArrayList<Departamento> listado() {

        return lista;
    }

}
