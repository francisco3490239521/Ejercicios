package Fibonacci;

public class Fibonacci : public Ejercicio {

 
	void ejecutar() override {
        int n;
        printf("Ingrese el número de términos: ");
        if (scanf("%d", &n) != 1 || n <= 0) {
            printf("Error al leer el número.\n");
            return;
        }

        int a = 0, b = 1;
        printf("Serie de Fibonacci: ");
        for (int i = 1; i <= n; ++i) {
            printf("%d ", a);
            int temp = a;
            a = b;
            b = temp + b;
        }
        printf("\n");
    }
