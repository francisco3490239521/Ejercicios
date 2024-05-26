package TablaMultiplicar;

public class TablaMultiplicar : public Ejercicio {

 
	void ejecutar() override {
        int num;
        printf("Ingrese un número: ");
        if (scanf("%d", &num) != 1 || num < 2) {
            printf("Error al leer el número.\n");
            return;
        }

        bool esPrimo = true;
        for (int i = 2; i <= sqrt(num); ++i) {
            if (num % i == 0) {
                esPrimo = false;
                break;
            }
        }
        if (esPrimo) {
            printf("%d es un número primo.\n", num);
        } else {
            printf("%d no es un número primo.\n", num);
        }
    }

