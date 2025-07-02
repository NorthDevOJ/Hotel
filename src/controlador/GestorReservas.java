package controlador;

import java.util.ArrayList;
import Modelo.Cuidador;
import Modelo.Reserva;
import Modelo.ReservaMemento;
import static Modelo.Cuidador.Registro;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestorReservas {

    Cuidador cuidador = new Cuidador();
    public static ArrayList<Reserva> reservas = new ArrayList<>();

    public static GestorReservas gestor;
    public int c = 0;

    public GestorReservas() {
    }

    public static GestorReservas getGestor() {
        if (gestor == null) {
            gestor = new GestorReservas();
        }
        return gestor;
    }

    public boolean reservar(int numeroDeHabitacion, String fechaIn, String fechaOut,
            int idDesayuno, int tipoDeTransporteHaciaElAereopuerto, int tipoDeTransporteDesdeElAereopuerto, int tipoDeHabitacion, String camaExtra) {
        double precio = 100000;

        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getNumeroDeHabitacion() == numeroDeHabitacion) {
                return false;
            }
        }
        switch (idDesayuno) {
            case 0:

                break;
            case 1:
                precio += 10000;
                break;
            case 2:
                precio += 9000;
                break;
            case 3:
                precio += 1500;
                break;
            case 4:
                precio += 7000;
                break;

            default:
                JOptionPane.showMessageDialog(null, "ID DE DESAYUNO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                ;
                return false;
        }
        switch (tipoDeTransporteHaciaElAereopuerto) {
            case 0:

                break;
            case 1:
                precio += 5000;
                break;
            case 2:
                precio += 7000;
                break;
            case 3:
                precio += 15000;
                break;
            case 4:
                precio += 40000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "ID DE TRANSPORTE HACIA EL AEROPUERTO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                ;
                return false;
        }
        switch (tipoDeTransporteDesdeElAereopuerto) {
            case 0:
                break;
            case 1:
                precio += 5000;
                break;
            case 2:
                precio += 7000;
                break;
            case 3:
                precio += 15000;
                break;
            case 4:
                precio += 40000;
                break;

            default:
                JOptionPane.showMessageDialog(null, "ID DE TRANSPORTE DESDE EL AEROPUERTO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                ;
                return false;
        }
        switch (tipoDeHabitacion) {
            case 0:

                break;
            case 1:
                precio += 50000;
                break;
            case 2:
                precio += 25000;
                break;
            case 3:
                precio += 100000;
                break;
            case 4:
                precio += 175000;
                break;
            default:
                JOptionPane.showMessageDialog(null, "ID DE TIPO DE HABITACIÓN INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                ;
                return false;
        }
        if (camaExtra.equalsIgnoreCase("SI")) {
            precio += 15000;
        }

        Reserva reserva = new Reserva.ReservaBuilder(numeroDeHabitacion, c)
                .setIdDesayuno(idDesayuno)
                .setTipoDeTransporteHaciaElAereopuerto(tipoDeTransporteHaciaElAereopuerto)
                .setTipoDeTransporteDesdeElAereopuerto(tipoDeTransporteDesdeElAereopuerto)
                .setTipoDeHabitacion(tipoDeHabitacion)
                .setFechaIn(fechaIn)
                .setFechaOut(fechaOut)
                .setCamaExtra(camaExtra)
                .setPrecio(precio)
                .build();
        reservas.add(reserva);
        ArrayList<ReservaMemento> historial = new ArrayList<>();
        cuidador.agregarMemento(historial, reserva.guardarEstado());
        JOptionPane.showMessageDialog(null, "SU ID DE RESERVA ES: " + c, "SOLICITUD DE RESERVA", JOptionPane.INFORMATION_MESSAGE);
        c++;
        return true;
    }

    public boolean mostrarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (idReserva == reservas.get(i).getIdReserva()) {
                System.out.println(reservas.get(i).toString());
                return true;
            }
        }
        return false;
    }

    public boolean modificarReserva(int idReserva, int idDesayuno, int tipoDeTransporteHaciaElAereopuerto, int tipoDeTransporteDesdeElAereopuerto, int tipoDeHabitacion, String camaExtra) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdReserva() == idReserva) {
                //REEMBOLSO O CARGO AGREGADO

                Reserva reserva = reservas.get(i);
                reservas.get(i).setIdDesayuno(idDesayuno);
                reservas.get(i).setTipoDeHabitacion(tipoDeHabitacion);
                reservas.get(i).setTipoDeTransporteHaciaElAereopuerto(tipoDeTransporteHaciaElAereopuerto);
                reservas.get(i).setTipoDeTransporteDesdeElAereopuerto(tipoDeTransporteDesdeElAereopuerto);
                reservas.get(i).setCamaExtra(camaExtra);
                double precio = 100000;
                switch (idDesayuno) {
                    case 0:

                        break;
                    case 1:
                        precio += 10000;
                        break;
                    case 2:
                        precio += 9000;
                        break;
                    case 3:
                        precio += 1500;
                        break;
                    case 4:
                        precio += 7000;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "ID DE DESAYUNO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        ;
                        return false;
                }
                switch (tipoDeTransporteHaciaElAereopuerto) {
                    case 0:

                        break;
                    case 1:
                        precio += 5000;
                        break;
                    case 2:
                        precio += 7000;
                        break;
                    case 3:
                        precio += 15000;
                        break;
                    case 4:
                        precio += 40000;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ID DE TRANSPORTE HACIA EL AEROPUERTO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        ;
                        return false;
                }
                switch (tipoDeTransporteDesdeElAereopuerto) {
                    case 0:
                        break;
                    case 1:
                        precio += 5000;
                        break;
                    case 2:
                        precio += 7000;
                        break;
                    case 3:
                        precio += 15000;
                        break;
                    case 4:
                        precio += 40000;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "ID DE TRANSPORTE DESDE EL AEROPUERTO INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        ;
                        return false;
                }
                switch (tipoDeHabitacion) {
                    case 0:

                        break;
                    case 1:
                        precio += 50000;
                        break;
                    case 2:
                        precio += 25000;
                        break;
                    case 3:
                        precio += 100000;
                        break;
                    case 4:
                        precio += 175000;
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "ID DE TIPO DE HABITACIÓN INCORRECTO. SELECCIONE UNA OPCIÓN VÁLIDA", "ERROR", JOptionPane.ERROR_MESSAGE);
                        ;
                        return false;
                }
                if (camaExtra.equalsIgnoreCase("SI")) {
                    precio += 15000;
                }
                reservas.get(i).setPrecio(precio);
                if (i < Registro.size()) {
                    Cuidador cuidador = new Cuidador();
                    cuidador.actualizarMemento(Registro.get(i), reserva.guardarEstado());
                    return true;
                } else {
                    System.out.println("Error: No hay suficientes elementos en el historial de la reserva.");
                    return false;
                }

            }
        }
        return false;
    }

    public boolean eliminarReserva(int idReserva) {
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getIdReserva() == idReserva) {
                reservas.remove(i);
                return true;
            }
        }
        return false;
    }

    public static boolean isInteger(String dato) {
        try {
            Long.parseLong(dato);
            return true;
        } catch (NumberFormatException excepcion) {
            return false;
        }
    }

    public void deshacerReserva(int idReserva) {
        try {
            reservas.get(idReserva).restaurarEstado(cuidador.deshacerMemento(idReserva));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ID NO EXISTENTE, O NUNCA SE HA REALIZADO UNA MODIFICACIÓN A ESTA RESERVA...");
        }
    }

    public void MostrarReservas(JTable reservas) {
        try {
            DefaultTableModel model = new DefaultTableModel();
            reservas.setModel(model);
            DefaultTableCellRenderer centerRenderer = new DefaultTableCellRenderer();
            centerRenderer.setHorizontalAlignment(SwingConstants.CENTER);
            reservas.setDefaultRenderer(Object.class, centerRenderer);
            model.addColumn("Nro Reservas");
            model.addColumn("Nro Habitación");
            model.addColumn("Nro Desayuno");
            model.addColumn("Transporte H-A");
            model.addColumn("Transporte A-H");
            model.addColumn("Tipo habitación");
            model.addColumn("Fecha Ingreso");
            model.addColumn("Fecha Salida");
            model.addColumn("¿Cama Extra?");
            model.addColumn("Precio");
            for (int i = 0; i < GestorReservas.reservas.size(); i++) {
                Reserva reservaActual = GestorReservas.reservas.get(i); // Obtener la Reserva actual de la lista
                model.addRow(new Object[]{
                    reservaActual.getIdReserva(),
                    reservaActual.getNumeroDeHabitacion(),
                    reservaActual.getIdDesayuno(),
                    reservaActual.getTipoDeTransporteHaciaElAereopuerto(),
                    reservaActual.getTipoDeTransporteDesdeElAereopuerto(),
                    reservaActual.getTipoDeHabitacion(),
                    reservaActual.getFechaIn(),
                    reservaActual.getFechaOut(),
                    reservaActual.getCamaExtra(),
                    reservaActual.getPrecio()
                });
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR DEL SISTEMA", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
