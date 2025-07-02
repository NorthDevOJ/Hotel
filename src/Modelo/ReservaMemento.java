package Modelo;

public class ReservaMemento {

    private int numeroDeHabitacion;
    private int idReserva;
    private int idDesayuno;
    private int tipoDeTransporteHaciaElAereopuerto;
    private int tipoDeTransporteDesdeElAereopuerto;
    private int tipoDeHabitacion;
    private double precio;
    private String camaExtra;
    private String fechaIn;
    private String fechaOut;

    public ReservaMemento(int numeroDeHabitacion, int idReserva, int idDesayuno, int tipoDeTransporteHaciaElAereopuerto,
            int tipoDeTransporteDesdeElAereopuerto, int tipoDeHabitacion, double precio,
            String camaExtra, String fechaIn, String fechaOut) {
        this.numeroDeHabitacion = numeroDeHabitacion;
        this.idReserva = idReserva;
        this.idDesayuno = idDesayuno;
        this.tipoDeTransporteHaciaElAereopuerto = tipoDeTransporteHaciaElAereopuerto;
        this.tipoDeTransporteDesdeElAereopuerto = tipoDeTransporteDesdeElAereopuerto;
        this.tipoDeHabitacion = tipoDeHabitacion;
       
        this.precio = precio;
        this.camaExtra = camaExtra;
        this.fechaIn = fechaIn;
        this.fechaOut = fechaOut;
    }

    public int getNumeroDeHabitacion() {
        return numeroDeHabitacion;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public int getIdDesayuno() {
        return idDesayuno;
    }

    public int getTipoDeTransporteHaciaElAereopuerto() {
        return tipoDeTransporteHaciaElAereopuerto;
    }

    public int getTipoDeTransporteDesdeElAereopuerto() {
        return tipoDeTransporteDesdeElAereopuerto;
    }

    public int getTipoDeHabitacion() {
        return tipoDeHabitacion;
    }

    public double getPrecio() {
        return precio;
    }

    public String getCamaExtra() {
        return camaExtra;
    }

    public String getFechaIn() {
        return fechaIn;
    }

    public String getFechaOut() {
        return fechaOut;
    }

    @Override
    public String toString() {
        return  "numeroDeHabitacion=" + numeroDeHabitacion + ", idReserva=" + idReserva + ", idDesayuno=" + idDesayuno + ", tipoDeTransporteHaciaElAereopuerto=" + tipoDeTransporteHaciaElAereopuerto + ", tipoDeTransporteDesdeElAereopuerto=" + tipoDeTransporteDesdeElAereopuerto + ", tipoDeHabitacion=" + tipoDeHabitacion + ", precio=" + precio + ", camaExtra=" + camaExtra + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut ;
    }
    
}
