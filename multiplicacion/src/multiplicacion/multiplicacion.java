package multiplicacion;

public class multiplicacion : public Ejercicio {

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
		        printf("La multiplicación de %d y %d es %d.\n", num1, num2, num1 * num2);
		    }
		;

}
