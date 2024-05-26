package Palindromo;

public class Palindromo : public Ejercicio {

	void ejecutar() override {
        char palabra[100];
        printf("Ingrese una palabra: ");
        if (scanf("%99s", palabra) != 1) {
            printf("Error al leer la palabra.\n");
            return;
        }

        int len = strlen(palabra);
        bool esPalindromo = true;
        for (int i = 0; i < len / 2; ++i) {
            if (palabra[i] != palabra[len - 1 - i]) {
                esPalindromo = false;
                break;
            }
        }

        if (esPalindromo) {
            printf("La palabra %s es un palíndromo.\n", palabra);
        } else {
            printf("La palabra %s no es un palíndromo.\n", palabra);
        }
    }
