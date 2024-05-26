package Hipotenusa;

public class Hipotenusa {

	void ejecutar() override {
        float cateto1, cateto2;
        printf("Ingrese el primer cateto: ");
        if (scanf("%f", &cateto1) != 1) {
            printf("Error al leer el cateto.\n");
            return;
        }
        printf("Ingrese el segundo cateto: ");
        if (scanf("%f", &cateto2) != 1) {
            printf("Error al leer el cateto.\n");
            return;
        }

        float hipotenusa = sqrt(cateto1 * cateto1 + cateto2 * cateto2);
        printf("La hipotenusa del triángulo es %.2f.\n", hipotenusa);
    }
