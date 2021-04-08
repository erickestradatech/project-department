package clases;

public class Departamento {

    private String nombre;
    private int tipo;
    private int c_años;

    // Segun el tipo
    private double costo;
    private int area;
    // Segun el tipo

    static int codigo = 10001;

    public Departamento(String nombre, int tipo, int c_años) {

        this.nombre = nombre;
        this.tipo = tipo;
        this.c_años = c_años;

        codigo++;
    }

    public double cuotaInicial() {

        int v[] = {0, 80000, 90000, 120000, 180000};

        return v[tipo] * 0.10;
    }

    public double saldo() {

        if (tipo == 1) {

            return 80000 - cuotaInicial();
        } else if (tipo == 2) {

            return 90000 - cuotaInicial();
        } else if (tipo == 3) {

            return 120000 - cuotaInicial();
        } else {

            return 180000 - cuotaInicial();
        }
    }

    public double interes() {

        return (saldo() / getC_años()) * 0.02;
    }

    public double cuotaMensual() {

        return (saldo() / getC_años()) + (saldo() / getC_años()) * 0.02;
    }

    public double costo() {

        return cuotaMensual() * getC_años();
    }

    public int getTipo() {

        return tipo;
    }

    public void setTipo(int tipo) {

        this.tipo = tipo;
    }

    public int getC_años() {

        return c_años;
    }

    public void setC_años(int c_años) {

        this.c_años = c_años;
    }

    public double getCosto() {

        return costo;
    }

    public void setCosto(double costo) {

        this.costo = costo;
    }

    public int getArea() {

        return area;
    }

    public void setArea(int area) {

        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
