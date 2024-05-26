package factorial;

public class factorial : public Ejercicio {

	oid ejecutar() override {
        int num;
        printf("Ingrese un número: ");
        if (scanf("%d", &num) != 1 || num < 0) {
            printf("Error al leer el número.\n");
            return;
        }

        unsigned long long factorial = 1;
        for (int i = 1; i <= num; ++i) {
            factorial *= i;
        }
        printf("El factorial de %d es %llu.\n", num, factorial);
    
	;
}
