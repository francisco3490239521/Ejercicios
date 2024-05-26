package Potencia;

public class Potencia : public Ejercicio {

	void ejecutar() override {
        int base, exponente;
        printf("Ingrese la base: ");
        if (scanf("%d", &base) != 1) {
            printf("Error al leer la base.\n");
            return;
        }
        printf("Ingrese el exponente: ");
        if (scanf("%d", &exponente) != 1) {
            printf("Error al leer el exponente.\n");
            return;
        }

        long long resultado = 1;
        for (int i = 0; i < exponente; ++i) {
            resultado *= base;
        }
        printf("%d elevado a la %d es %lld.\n", base, exponente, resultado);
    }
}
