
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;


public class Main {
            public static void main(String[] args) {

                List<String> alumnos = Arrays.asList(
                        "Jofre", "Angel", "Fernando", "Antonio", "Ezequiel", "Alfonso",
                        "Pablo", "Isaac", "Cintia", "Aurélien", "Marat", "Luis",
                        "Jose Maria", "Mar", "Río Hierba", "Marc", "Zohra", "Flavio Augusto",
                        "Pablo Federico"
                );

                Collections.shuffle(alumnos);
                IntStream.range(0, alumnos.size())
                        .forEach(i -> System.out.println("Posición: " + (i+1) + ", Alumno seleccionado: " + alumnos.get(i)));
            }
        }

