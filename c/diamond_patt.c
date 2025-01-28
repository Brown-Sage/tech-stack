#include <stdio.h>

int main() {
    int num = 9;
    int n = num / 2;
    int k = n;

    // Upper half
    for (int i = 0; i <= n; i++) {
        for (int j = 0; j < num; j++) {
            if (j >= n - i && j <= k + i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    // Lower half
    for (int i = n - 1; i >= 0; i--) {
        for (int j = 0; j < num; j++) {
            if (j >= n - i && j <= k + i) {
                printf("*");
            } else {
                printf(" ");
            }
        }
        printf("\n");
    }

    return 0;
}
