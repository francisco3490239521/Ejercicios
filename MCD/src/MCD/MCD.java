package MCD;

public class MCD : public Ejercicio {

	void ejecutar() override {
        int num1, num2;
        printf("Ingrese el primer número: ");
        if (scanf("%d", &num1) != 1) {
            printf("Error al leer el número.\n");
            return;
        }
        printf("Ingrese el segundo número: ");
        if (scanf("%d", &num2) != 1) {
            printf("Error al leer el número.\n");
            return;
        }

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        printf("El máximo común divisor es %d.\n", num1);
    }
