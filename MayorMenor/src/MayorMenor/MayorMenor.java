package MayorMenor;

public class MayorMenor : public Ejercicio {
	
	void ejecutar() override {
        int n;
        printf("Ingrese la cantidad de números: ");
        if (scanf("%d", &n) != 1 || n <= 0) {
            printf("Error al leer la cantidad.\n");
            return;
        }

        int num, mayor, menor;
        for (int i = 0; i < n; ++i) {
            printf("Ingrese el número %d: ", i + 1);
            if (scanf("%d", &num) != 1) {
                printf("Error al leer el número.\n");
                return;
            }
            if (i == 0) {
                mayor = menor = num;
            } else {
                if (num > mayor) mayor = num;
                if (num < menor) menor = num;
            }
        }
        printf("El mayor número es %d y el menor número es %d.\n", mayor, menor);
    }

