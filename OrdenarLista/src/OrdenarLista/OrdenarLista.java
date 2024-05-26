package OrdenarLista;

public class OrdenarLista : public Ejercicio {

	void ejecutar() override {
        int n;
        printf("Ingrese la cantidad de números: ");
        if (scanf("%d", &n) != 1 || n <= 0) {
            printf("Error al leer la cantidad.\n");
            return;
        }

        int* lista = new int[n];
        for (int i = 0; i < n; ++i) {
            printf("Ingrese el número %d: ", i + 1);
            if (scanf("%d", &lista[i]) != 1) {
                printf("Error al leer el número.\n");
                delete[] lista;
                return;
            }
        }

        for (int i = 0; i < n - 1; ++i) {
            for (int j = i + 1; j < n; ++j) {
                if (lista[i] > lista[j]) {
                    int temp = lista[i];
                    lista[i] = lista[j];
                    lista[j] = temp;
                }
            }
        }

        printf("Lista ordenada: ");
        for (int i = 0; i < n; ++i) {
            printf("%d ", lista[i]);
        }
        printf("\n");

        delete[] lista;
    }
