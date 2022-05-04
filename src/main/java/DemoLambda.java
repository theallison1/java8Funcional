import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class DemoLambda {

    public static void main(String[] args) {
        List<Alumno> listaAlumnos = new ArrayList();

        listaAlumnos.add(new Alumno(2, "1717456218", "Lillian Eugenia", "Gómez Álvarez", "Java 8", 10, 33));
        listaAlumnos.add(new Alumno(3, "1717328901", "Sixto Naranjoe", "Marín", "Java 8", 8.6, 15));
        listaAlumnos.add(new Alumno(4, "1717567128", "Gerardo Emilio", "Duque Gutiérrez", "Java 8", 10, 13));
        listaAlumnos.add(new Alumno(5, "1717902145", "Jhony Alberto", "Sáenz Hurtado", "Java 8", 9.5, 15));
        listaAlumnos.add(new Alumno(6, "1717678456", "Germán Antonio", "Lotero Upegui", "Java 8", 8, 34));
        listaAlumnos.add(new Alumno(7, "1102156732", "Oscar Darío", "Murillo González", "Java 8", 8, 32));
        listaAlumnos.add(new Alumno(8, "1103421907", "Augusto Osorno", "Palacio Martínez", "PHP", 9.5, 17));
        listaAlumnos.add(new Alumno(9, "1717297015", "César Oswaldo", "Alzate Agudelo", "Java 8", 8, 26));
        listaAlumnos.add(new Alumno(10, "1717912056", "Gloria Amparo", "González Castaño", "PHP", 10, 28));
        listaAlumnos.add(new Alumno(11, "1717912058", "Jorge León", "Ruiz Ruiz", "Python", 8, 22));
        listaAlumnos.add(new Alumno(12, "1717912985", "John Jairo", "Duque García", "Java Script", 9.4, 32));
        listaAlumnos.add(new Alumno(13, "1717913851", "Julio Cesar", "González Castaño", "C Sharp", 10, 22));
        listaAlumnos.add(new Alumno(14, "1717986531", "Gloria Amparo", "Rodas Monsalve", "Ruby", 7, 18));
        listaAlumnos.add(new Alumno(15, "1717975232", "Gabriel Jaime", "Jiménez Gómez", "Java Script", 10, 18));

        //obtener todos los alumnos de la lista
       /* System.out.println("**lista de alumnos**");
        listaAlumnos.stream().forEach(a->System.out.println(a.getId()));
        //**filtrar por iniciales
        System.out.println("\n*** Alumnos cuyo apellidos empiezan con el caracter L u G ***");
        listaAlumnos.stream()
                            .filter( c->c.getApellidos().charAt(0)=='L' || c.getApellidos().charAt(0)=='G')
                            .forEach(c->System.out.println(c));
        System.out.println("----------------------------------------------------------");
        System.out.println("----------------------------------------------------------");
        //obtener alumnos con notas mayores a 9 y que el curso sea PHP
        listaAlumnos.stream().filter(d->d.getNota()> 9 && d.getNombreCurso().equals("PHP") ).forEach(p->System.out.println(p));
        System.out.println("----------------------------------------------------------");
        System.out.println(listaAlumnos.stream().min(Comparator.comparingInt(Alumno::getEdad)));
        System.out.println("----------------------------------------------------------");
        System.out.println(listaAlumnos.stream().min(Comparator.comparingInt(Alumno::getEdad)));
        System.out.println("----------------------------------------------------------");
        System.out.println(listaAlumnos.stream().findFirst());
        System.out.println("----------------------------------------------------------");
        listaAlumnos.stream().filter(a->a.getNombreCurso().endsWith("t")).forEach(p->System.out.println(p));
        System.out.println("----------------------------------------------------------");
        listaAlumnos.stream().filter(a->a.getNombreCurso().contains("a")).forEach(p->System.out.println(p));*/

       listaAlumnos.stream().filter(x->x.getNombres().length()>10).forEach(System.out::println);
    }

}
