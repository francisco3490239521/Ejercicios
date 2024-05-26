package AreaPerimetro;

public class AreaPerimetro : public Ejercicio {

	void ejecutar() override {
        int opcion;
        printf("Seleccione la figura geométrica:\n1. Círculo\n2. Cuadrado\n3. Triángulo\n");
        if (scanf("%d", &opcion) != 1) {
            printf("Error al leer la opción.\n");
            return;
        }

        switch (opcion) {
        case 1: { // Círculo
            float radio;
            printf("Ingrese el radio del círculo: ");
            if (scanf("%f", &radio) != 1) {
                printf("Error al leer el radio.\n");
                return;
            }
            printf("El área del círculo es %.2f y el perímetro es %.2f.\n", M_PI * radio * radio, 2 * M_PI * radio);
            break;
        }
        case 2: { // Cuadrado
            float lado;
            printf("Ingrese el lado del cuadrado: ");
            if (scanf("%f", &lado) != 1) {
                printf("Error al leer el lado.\n");
                return;
            }
            printf("El área del cuadrado es %.2f y el perímetro es %.2f.\n", lado * lado, 4 * lado);
            break;
        }
        case 3: { // Triángulo (
            float lado;
            printf("Ingrese el lado del triángulo: ");
            if (scanf("%f", &lado) != 1) {
                printf("Error al leer el lado.\n");
                return;
            }
            printf("El área del triángulo es %.2f y el perímetro es %.2f.\n", (sqrt(3) / 4) * lado * lado, 3 * lado);
            break;
        }
        default:
            printf("Opción no válida.\n");
        }
    }
