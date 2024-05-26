package SucesionNumeros;

public class SucesionNumeros : public Ejercicio {

	void ejecutar() override {
        int limite, opcion;
        printf("Ingrese el límite: ");
        if (scanf("%d", &limite) != 1 || limite <= 0) {
            printf("Error al leer el límite.\n");
            return;
        }

        printf("Seleccione la sucesión:\n1. Números pares\n2. Números impares\n3. Múltiplos de 3\n");
        if (scanf("%d", &opcion) != 1) {
            printf("Error al leer la opción.\n");
            return;
        }

        printf("Sucesión: ");
        switch (opcion) {
        case 1:
            for (int i = 2; i <= limite; i += 2) {
                printf("%d ", i);
            }
            break;
        case 2:
            for (int i = 1; i <= limite; i += 2) {
                printf("%d ", i);
            }
            break;
        case 3:
            for (int i = 3; i <= limite; i += 3) {
                printf("%d ", i);
            }
            break;
        default:
            printf("Opción no válida.\n");
            return;
        }
        printf("\n");
    }