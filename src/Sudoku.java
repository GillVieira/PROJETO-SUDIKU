
import java.util.Arrays;
import java.util.Scanner;

public class Sudoku {


    static int[][] objMatrix = {
            {5, 3, 4, 6, 7, 8, 9, 1, 2},
            {6, 7, 2, 1, 9, 5, 3, 4, 8},
            {1, 9, 8, 3, 4, 2, 5, 6, 7},
            {8, 5, 9, 7, 6, 1, 4, 2, 3},
            {4, 2, 6, 8, 5, 3, 7, 9, 1},
            {7, 1, 3, 9, 2, 4, 8, 5, 6},
            {9, 6, 1, 5, 3, 7, 2, 8, 4},
            {2, 8, 7, 4, 1, 9, 6, 3, 5},
            {3, 4, 5, 2, 8, 6, 1, 7, 9}
    };
    static int[][] objMatrix1 = {
            {1, 1, 1, 1, 1, 1, 1, 1, 1},
            {2, 2, 2, 2, 2, 2, 2, 2, 2},
            {3, 3, 3, 3, 3, 3, 3, 3, 3},
            {4, 4, 4, 4, 4, 4, 4, 4, 4},
            {5, 5, 5, 5, 5, 5, 5, 5, 5},
            {6, 6, 6, 6, 6, 6, 6, 6, 6},
            {7, 7, 7, 7, 7, 7, 7, 7, 7},
            {8, 8, 8, 8, 8, 8, 8, 8, 8},
            {9, 9, 9, 9, 9, 9, 9, 9, 9}
    };
    static int[][] objMatrix2 = {
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9},
            {1, 2, 3, 4, 5, 6, 7, 8, 9}
    };

    public static void main(String[] args) {

        int p = 0;
        int[] listFromQuadrant = new int[9];
        int ok = 0;
        String[] problems = new String[27];



        //pegar um quadrante (Top Left)
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                   listFromQuadrant[p] = objMatrix[i][j];
                    p++;
            }
        }

        DuplicateCheck testCheckTL = new DuplicateCheck(listFromQuadrant);
        if (testCheckTL.dupCheck()) {
            ok++;
        } else {
            problems[0] = "Quadrante Top Left";
        }

        p = 0;
        //pegar um quadrante (Top Center)
        for (int i = 0; i < 3; i++) {
            for (int j = 3; j < 6; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckTopCenter = new DuplicateCheck(listFromQuadrant);
        if (testCheckTopCenter.dupCheck()) {
            ok++;
        } else {
            problems[1] = "Quadrante Top Center";
        }

        p = 0;
        //pegar um quadrante (Top Right)
        for (int i = 0; i < 3; i++) {
            for (int j = 6; j < 9; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckTopRight = new DuplicateCheck(listFromQuadrant);
        if (testCheckTopRight.dupCheck()) {
            ok++;
        } else {
            problems[2] = "Quadrante Top Right";
        }

        p = 0;
        //pegar um quadrante (center left)
        for (int i = 3; i < 6; i++) {
            for (int j = 0; j < 3; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckCentLeft = new DuplicateCheck(listFromQuadrant);
        if (testCheckCentLeft.dupCheck()) {
            ok++;
        } else {
            problems[3] = "Quadrante Center Left";
        }

        p = 0;
        //pegar um quadrante (Center)
        for (int i = 3; i < 6; i++) {
            for (int j = 3; j < 6; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckCenter = new DuplicateCheck(listFromQuadrant);
        if (testCheckCenter.dupCheck()) {
            ok++;
        } else {
            problems[4] = "Quadrante Center";
        }

        p = 0;
        //pegar um quadrante (center right)
        for (int i = 3; i < 6; i++) {
            for (int j = 6; j < 9; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckCentRight = new DuplicateCheck(listFromQuadrant);
        if (testCheckCentRight.dupCheck()) {
            ok++;
        } else {
            problems[5] = "Quadrante Center Right";
        }

        p = 0;
        //pegar um quadrante (bottom left)
        for (int i = 6; i < 9; i++) {
            for (int j = 0; j < 3; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckBotLeft = new DuplicateCheck(listFromQuadrant);
        if (testCheckBotLeft.dupCheck()) {
            ok++;
        } else {
            problems[6] = "Quadrante Bottom Left";
        }

        p = 0;
        //pegar um quadrante (bottom center)
        for (int i = 6; i < 9; i++) {
            for (int j = 3; j < 6; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckBotCenter = new DuplicateCheck(listFromQuadrant);
        if (testCheckBotCenter.dupCheck()) {
            ok++;
        } else {
            problems[7] = "Quadrante Bottom Center";
        }

        p = 0;
        //pegar um quadrante (bottom right)
        for (int i = 6; i < 9; i++) {
            for (int j = 6; j < 9; j++) {
                listFromQuadrant[p] = objMatrix[i][j];
                p++;
            }
        }
        DuplicateCheck testCheckBotRight = new DuplicateCheck(listFromQuadrant);
        if (testCheckBotRight.dupCheck()) {
            ok++;
        } else {
            problems[8] = "Quadrante Bottom Right";
        }



 //       p = 0;

//        // pegar valores das colunas
//        for (int i = 3; i < 6; i++) {
//           // System.out.print(objMatrix[i][0] + " ");
//        }
        int[] colunaInteira = new int[9];
        // coluna inteira
        for (int j = 0; j < 9; j++) {
            for (int i = 0; i < 9; i++) {
               colunaInteira[i] = objMatrix2[i][j];
            }
            DuplicateCheck testColunaInteira = new DuplicateCheck(colunaInteira);
            if (testColunaInteira.dupCheck()) {
                ok++;
            } else {
                problems[8 + j] = "Coluna " + (j + 1);
            }
        }
        //pegar o valor da linha inteira

        int[] linhaInteira = new int[9];

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                linhaInteira[j] = objMatrix1[i][j];
            }
            DuplicateCheck testLinhaInteira = new DuplicateCheck(linhaInteira);

            if (testLinhaInteira.dupCheck()) {
                ok++;
            } else {
                problems[17 + i] = "Linha " + (i + 1);
            }
        }

        if (ok == 27) {
            System.out.println("Game Over. Congratulations!");
        } else {
            System.out.println("Problemas: ");
            for (String t : problems){
                if (t != null) {
                    System.out.println(t);
                }
            }
        }


      //  Scanner sc1 = new Scanner(System.in);
      //  int num1 = sc1.nextInt();
      //  System.out.println(num1);
    }
}