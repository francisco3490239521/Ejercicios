package AdivinarNumero;

public class AdivinarNumero : public Ejercicio {

	 void ejecutar() override {
	        srand(time(0));
	        int numeroSecreto = rand() % 100 + 1;
	        int intento, intentos = 0;

	        printf("Adivine el número (entre 1 y 100): ");
	        do {
	            if (scanf("%d", &intento) != 1) {
	                printf("Error al leer el número.\n");
	                return;
	            }
	            intentos++;
	            if (intento < numeroSecreto) {
	                printf("Muy bajo. Intente de nuevo: ");
	            } else if (intento > numeroSecreto) {
	                printf("Muy alto. Intente de nuevo: ");
	            }
	        } while (intento != numeroSecreto);

	        printf("¡Correcto! Adivinaste el número en %d intentos.\n", intentos);
	    }