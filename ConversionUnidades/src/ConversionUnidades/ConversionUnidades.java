package ConversionUnidades;

public class ConversionUnidades : public Ejercicio {

	void ejecutar() override {
        int opcion;
        printf("Seleccione la conversión:\n1. Metros a Kilómetros\n2. Gramos a Kilogramos\n3. Celsius a Fahrenheit\n");
        if (scanf("%d", &opcion) != 1) {
            printf("Error al leer la opción.\n");
            return;
        }

        switch (opcion) {
        case 1: { // Metros a Kilómetros
            float metros;
            printf("Ingrese la cantidad de metros: ");
            if (scanf("%f", &metros) != 1) {
                printf("Error al leer la cantidad.\n");
                return;
            }
            printf("%.2f metros es igual a %.2f kilómetros.\n", metros, metros / 1000);
            break;
        }
        case 2: { // Gramos a Kilogramos
            float gramos;
            printf("Ingrese la cantidad de gramos: ");
            if (scanf("%f", &gramos) != 1) {
                printf("Error al leer la cantidad.\n");
                return;
            }
            printf("%.2f gramos es igual a %.2f kilogramos.\n", gramos, gramos / 1000);
            break;
        }
        case 3: { // Celsius a Fahrenheit
            float celsius;
            printf("Ingrese la temperatura en grados Celsius: ");
            if (scanf("%f", &celsius) != 1) {
                printf("Error al leer la temperatura.\n");
                return;
            }
            printf("%.2f grados Celsius es igual a %.2f grados Fahrenheit.\n", celsius, celsius * 9 / 5 + 32);
            break;
        }
        default:
            printf("Opción no válida.\n");
        }
    }
