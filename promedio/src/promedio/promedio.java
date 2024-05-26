package promedio;

public class promedio : public Ejercicio {
	void ejecutar() override {
        int n;
        printf("Ingrese la cantidad de números: ");
        if (scanf("%d", &n) != 1 || n <= 0) {
            printf("Error al leer la cantidad.\n");
            return;
        }

        int suma = 0, num;
        for (int i = 0; i < n; ++i) {
            printf("Ingrese el número %d: ", i + 1);
            if (scanf("%d", &num) != 1) {
                printf("Error al leer el número.\n");
                return;
            }
            suma += num;
        }
        printf("El promedio es %.2f.\n", suma / (float)n);
    
 ;
}