package InversionNumero;

public class InversionNumero : public Ejercicio {

	void ejecutar() override {
        int num;
        printf("Ingrese un número: ");
        if (scanf("%d", &num) != 1) {
            printf("Error al leer el número.\n");
            return;
        }

        int invertido = 0;
        int temp = abs(num);
        while (temp != 0) {
            invertido = invertido * 10 + temp % 10;
            temp /= 10;
        }
        
        printf("El número invertido de %d es %d.\n", num, (num < 0) ? -invertido : invertido);
    }
