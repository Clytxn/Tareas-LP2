
import java.util.ArrayList;
import java.util.List;

class Profesor {
    private String nombre;

    public Profesor(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
}

class Universidad {
    private List<Profesor> profesores;

    public Universidad() {
        profesores = new ArrayList<>();
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public List<Profesor> getProfesores() {
        return profesores;
    }
}