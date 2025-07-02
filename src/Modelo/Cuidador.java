package Modelo;

import java.util.ArrayList;

public class Cuidador {

    public static ArrayList<ArrayList<ReservaMemento>> Registro = new ArrayList<>();

   

    public void agregarMemento(ArrayList<ReservaMemento> historial, ReservaMemento memento) {
        historial.add(memento);
        Registro.add(historial);
    }
    
    public void actualizarMemento(ArrayList<ReservaMemento> historial, ReservaMemento memento){
        historial.add(memento);
    }

    public ReservaMemento obtenerMemento(int indiceRegistro, int indiceHistorial) {
        ArrayList<ReservaMemento> a = Registro.get(indiceRegistro);
        ReservaMemento reserva = a.get(indiceHistorial);
        return reserva;
    }
    public ReservaMemento deshacerMemento(int indiceRegistro) {
        int pos = Registro.get(indiceRegistro).size();
        if (pos > 0) {
            pos = pos - 2;
            ReservaMemento a = Registro.get(indiceRegistro).get(pos);
            return a;
        }
        return null;
    }
}

