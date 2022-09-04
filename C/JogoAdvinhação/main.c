#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <windows.h>

void telaInicial();
int dificuldade();
void nivel(int nivel);
int definindoTentativas(int nivel);
int menuJogo(int dificuldade, int tentativas, int i);


int main(){
    HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO consoleInfo;
    WORD saved_attributes;

    GetConsoleScreenBufferInfo(hConsole, &consoleInfo);
    saved_attributes = consoleInfo.wAttributes;

    int segundos = time(0);
    srand(segundos);

    int numeroSecreto = rand() % 100;
    int dificuldadeEscolhida;
    int numeroTentativas, totalTentativas;
    int chuteUsuario;
    int acertou = 0;

    telaInicial();
    dificuldadeEscolhida = dificuldade();
    numeroTentativas = definindoTentativas(dificuldadeEscolhida);

    for(int i = 0; i < numeroTentativas; i++){

        chuteUsuario = menuJogo(dificuldadeEscolhida, numeroTentativas, i);

        if(chuteUsuario < 0){
            printf("\nVOCE NAO PODE CHUTAR NUMEROS NEGATIVOS.\n\n");
            i--;
            system("pause");
            system("cls");
            continue;
        }

        acertou = (numeroSecreto == chuteUsuario);
        int maior = (chuteUsuario > numeroSecreto);

        if(acertou){
            system("cls");
            SetConsoleTextAttribute(hConsole, 6);
            printf("\n\n");
            printf("             OOOOOOOOOOO               \n");
            printf("         OOOOOOOOOOOOOOOOOOO           \n");
            printf("      OOOOOO  OOOOOOOOO  OOOOOO        \n");
            printf("    OOOOOO      OOOOO      OOOOOO      \n");
            printf("  OOOOOOOO  #   OOOOO  #   OOOOOOOO    \n");
            printf(" OOOOOOOOOO    OOOOOOO    OOOOOOOOOO   \n");
            printf("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
            printf("OOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOO  \n");
            printf("OOOO  OOOOOOOOOOOOOOOOOOOOOOOOO  OOOO  \n");
            printf(" OOOO  OOOOOOOOOOOOOOOOOOOOOOO  OOOO   \n");
            printf("  OOOO   OOOOOOOOOOOOOOOOOOOO  OOOO    \n");
            printf("    OOOOO   OOOOOOOOOOOOOOO   OOOO     \n");
            printf("      OOOOOO   OOOOOOOOO   OOOOOO      \n");
            printf("         OOOOOO         OOOOOO         \n");
            printf("             OOOOOOOOOOOO              \n");
            SetConsoleTextAttribute(hConsole, 7);
            printf("\n\n");
            break;
        } else if(maior) {
            printf("\nO SEU CHUTE FOI MAIOR QUE O NUMERO SECRETO.\n\n");
        } else {
            printf("\nO SEU CHUTE FOI MENOR QUE O NUMERO SECRETO.\n\n");
        }
        totalTentativas += 1;
        system("pause");
        system("cls");
    }
    if(acertou){
        printf("VOCE GANHOU!\n");
        printf("VOCE ACERTOU EM %d TENTATIVAS!\n", totalTentativas);
    } else if(acertou == 0){
        system("cls");
        SetConsoleTextAttribute(hConsole, 70);
        printf("VOCE PERDEU! TENTE NOVAMENTE!\n");
        printf("\n\n");
        printf("       \\|/ ____ \\|/     \n");
        printf("        @~/ ,. \\~@      \n");
        printf("       /_( \\__/ )_\\     \n");
        printf("          \\__U_/        \n");
        SetConsoleTextAttribute(hConsole, 7);
        printf("\n\n");
    }

}

void telaInicial(){
    HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO consoleInfo;
    WORD saved_attributes;

    GetConsoleScreenBufferInfo(hConsole, &consoleInfo);
    saved_attributes = consoleInfo.wAttributes;

    SetConsoleTextAttribute(hConsole, 3);
    printf("|*************************|\n");
    printf("          P  /_\\  P       \n");
    printf("         /_\\_|_|_/_\\     \n");
    printf("     n_n | ||. .|| | n_n   \n");
    printf("     |_|_|nnnn nnnn|_|_|   \n");
    printf("    |" "  |  |_|  |"  " |  \n");
    printf("    |_____| ' _ ' |_____|  \n");
    printf("          \\__|_|__/       \n");
    printf("|*************************|\n");
    printf("|       BEM VINDO AO      |\n");
    printf("|    JOGO DE ADVINHACAO   |\n");
    SetConsoleTextAttribute(hConsole, 7);
}


int dificuldade(){
    int escolhaDificuldade;
    printf("|*************************|\n");
    printf("|  ESCOLHA A DIFICULDADE  |\n");
    printf("|*************************|\n");
    printf("|       [1] - FACIL       |\n");
    printf("|       [2] - NORMAL      |\n");
    printf("|       [3] - DIFICIL     |\n");
    printf("|*************************|\n");
    printf("|SUA ESCOLHA: ");
    scanf("%d", &escolhaDificuldade);
    printf("|*************************|\n");
    return escolhaDificuldade;
}


void nivel(int nivel){
    if(nivel == 1){
        printf("   FACIL    |\n");
    } else if(nivel == 2){
        printf("   NORMAL   |\n");
    } else if (nivel == 3){
        printf("  DIFICIL   |\n");
    }
}

int definindoTentativas(int nivel){
    HANDLE hConsole = GetStdHandle(STD_OUTPUT_HANDLE);
    CONSOLE_SCREEN_BUFFER_INFO consoleInfo;
    WORD saved_attributes;

    GetConsoleScreenBufferInfo(hConsole, &consoleInfo);
    saved_attributes = consoleInfo.wAttributes;

    int numeroTentativas = 0;
    switch(nivel){
        case 1:
            numeroTentativas = 15;
            break;
        case 2:
            numeroTentativas = 10;
            break;
        case 3:
            numeroTentativas = 5;
            break;
        default:
            printf("\nOPCAO INVALIDA! FINALIZANDO O PROGRAMA!\n\n");
            SetConsoleTextAttribute(hConsole, 13);
            printf("     \\|/ ____ \\|/    \n");
            printf("      @~/ ,. \\~@      \n");
            printf("     /_( \\__/ )_\\    \n");
            printf("        \\__U_/        \n");
            SetConsoleTextAttribute(hConsole, 7);
            system("pause");
    }
    system("cls");
    return numeroTentativas;

}

int menuJogo(int dificuldade, int tentativas, int i){
    int numeroUsuario;
    printf("|********************************|\n");
    printf("| DIFICULDADE:      |");
    nivel(dificuldade);
    printf("|********************************|\n");
    printf("| N%C TENTATIVAS RESTANTES |  %2d  |\n", 248, tentativas-i);
    printf("|********************************|\n");
    printf("|    ADIVINHE O NUMERO SECRETO   |\n");
    printf("|********************************|\n");
    printf("|            DE 0 A 100          |\n");
    printf("|********************************|\n");
    printf("| QUAL E O SEU CHUTE? ");
    scanf("%d", &numeroUsuario);
    return numeroUsuario;
}
