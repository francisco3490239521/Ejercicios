package ContadorDigitos;

public class ContadorDigitos : public Ejercicio {
	

	void ejecutar() override {
        int num;
        printf("Ingrese un número: ");
        if (scanf("%d", &num) != 1) {
            printf("Error al leer el número.\n");
            return;
        }

        int contador = 0;
        int temp = abs(num);
        do {
            temp /= 10;
            contador++;
        } while (temp > 0);
        
        printf("El número %d tiene %d dígitos.\n", num, contador);
    }
