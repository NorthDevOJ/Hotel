package Modelo;

public class Reserva {

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

    private Reserva(ReservaBuilder builder) {
        this.numeroDeHabitacion = builder.numeroDeHabitacion;
        this.idReserva = builder.idReserva;
        this.idDesayuno = builder.idDesayuno;
        this.tipoDeTransporteHaciaElAereopuerto = builder.tipoDeTransporteHaciaElAereopuerto;
        this.tipoDeTransporteDesdeElAereopuerto = builder.tipoDeTransporteDesdeElAereopuerto;
        this.tipoDeHabitacion = builder.tipoDeHabitacion;
        this.precio = builder.precio;
        this.camaExtra = builder.camaExtra;
        this.fechaIn = builder.fechaIn;
        this.fechaOut = builder.fechaOut;
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

    public void setNumeroDeHabitacion(int numeroDeHabitacion) {
        this.numeroDeHabitacion = numeroDeHabitacion;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }

    public void setIdDesayuno(int idDesayuno) {
        this.idDesayuno = idDesayuno;
    }

    public void setTipoDeTransporteHaciaElAereopuerto(int tipoDeTransporteHaciaElAereopuerto) {
        this.tipoDeTransporteHaciaElAereopuerto = tipoDeTransporteHaciaElAereopuerto;
    }

    public void setTipoDeTransporteDesdeElAereopuerto(int tipoDeTransporteDesdeElAereopuerto) {
        this.tipoDeTransporteDesdeElAereopuerto = tipoDeTransporteDesdeElAereopuerto;
    }

    public void setTipoDeHabitacion(int tipoDeHabitacion) {
        this.tipoDeHabitacion = tipoDeHabitacion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCamaExtra(String camaExtra) {
        this.camaExtra = camaExtra;
    }

    public void setFechaIn(String fechaIn) {
        this.fechaIn = fechaIn;
    }

    public void setFechaOut(String fechaOut) {
        this.fechaOut = fechaOut;
    }

    public static class ReservaBuilder {

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

        public ReservaBuilder(int numeroDeHabitacion, int idReserva) {
            this.numeroDeHabitacion = numeroDeHabitacion;
            this.idReserva = idReserva;
        }

        public ReservaBuilder setIdDesayuno(int idDesayuno) {
            this.idDesayuno = idDesayuno;
            return this;
        }

        public ReservaBuilder setTipoDeTransporteHaciaElAereopuerto(int tipoDeTransporteHaciaElAereopuerto) {
            this.tipoDeTransporteHaciaElAereopuerto = tipoDeTransporteHaciaElAereopuerto;
            return this;
        }

        public ReservaBuilder setTipoDeTransporteDesdeElAereopuerto(int tipoDeTransporteDesdeElAereopuerto) {
            this.tipoDeTransporteDesdeElAereopuerto = tipoDeTransporteDesdeElAereopuerto;
            return this;
        }

        public ReservaBuilder setTipoDeHabitacion(int tipoDeHabitacion) {
            this.tipoDeHabitacion = tipoDeHabitacion;
            return this;
        }

        public ReservaBuilder setPrecio(double precio) {
            this.precio = precio;
            return this;
        }

        public ReservaBuilder setCamaExtra(String camaExtra) {
            this.camaExtra = camaExtra;
            return this;
        }

        public ReservaBuilder setFechaIn(String fechaIn) {
            this.fechaIn = fechaIn;
            return this;
        }

        public ReservaBuilder setFechaOut(String fechaOut) {
            this.fechaOut = fechaOut;
            return this;
        }

        public Reserva build() {
            return new Reserva(this);
        }
    }

    public ReservaMemento guardarEstado() {
        return new ReservaMemento(numeroDeHabitacion, idReserva, idDesayuno, tipoDeTransporteHaciaElAereopuerto,
                tipoDeTransporteDesdeElAereopuerto, tipoDeHabitacion, precio, camaExtra, fechaIn, fechaOut);
    }

    public void restaurarEstado(ReservaMemento memento) {
        this.numeroDeHabitacion = memento.getNumeroDeHabitacion();
        this.idReserva = memento.getIdReserva();
        this.idDesayuno = memento.getIdDesayuno();
        this.tipoDeTransporteHaciaElAereopuerto = memento.getTipoDeTransporteHaciaElAereopuerto();
        this.tipoDeTransporteDesdeElAereopuerto = memento.getTipoDeTransporteDesdeElAereopuerto();
        this.tipoDeHabitacion = memento.getTipoDeHabitacion();
        this.precio = memento.getPrecio();
        this.camaExtra = memento.getCamaExtra();
        this.fechaIn = memento.getFechaIn();
        this.fechaOut = memento.getFechaOut();
    }

    @Override
    public String toString() {
        return "numeroDeHabitacion=" + numeroDeHabitacion + ", idReserva=" + idReserva + ", idDesayuno=" + idDesayuno + ", tipoDeTransporteHaciaElAereopuerto=" + tipoDeTransporteHaciaElAereopuerto + ", tipoDeTransporteDesdeElAereopuerto=" + tipoDeTransporteDesdeElAereopuerto + ", tipoDeHabitacion=" + tipoDeHabitacion + ", precio=" + precio + ", camaExtra=" + camaExtra + ", fechaIn=" + fechaIn + ", fechaOut=" + fechaOut;
    }

}
