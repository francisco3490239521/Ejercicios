package Factorizacion;

public class Factorizacion : public Ejercicio {

	void ejecutar() override {
        int num;
        printf("Ingrese un número: ");
        if (scanf("%d", &num) != 1 || num <= 1) {
            printf("Error al leer el número.\n");
            return;
        }

        printf("Factores primos de %d: ", num);
        for (int i = 2; i <= num; ++i) {
            while (num % i == 0) {
                printf("%d ", i);
                num /= i;
            }
        }
        printf("\n");
    }