package aha;

import java.util.Arrays;
import java.util.Scanner;

public class nevim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        boolean player1Won = false;
        boolean player2Won = false;

        String[][] array = {
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
                { "-", "-", "-", "-", "-", "-", "-", "-", "-", "-", },
        };

        while(!player1Won || !player2Won) {
            System.out.println(" 0  1  2  3  4  5  6  7  8  9");
            for (String[] strings : array) {
                System.out.println(Arrays.toString(strings));
            }

            System.out.println("Hráč 1: Zadej souradnici X");
            int y = sc.nextInt();
            System.out.println("Hráč 1: Zadej souradnici Y");
            int x = sc.nextInt();
            array[x][y] = "X";

            if(array[x-1][y-1].equals("X") && array[x-2][y-2].equals("X") && array[x-3][y-3].equals("X") && array[x-4][y-4].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;

            }
            if(array[x+1][y+1].equals("X") && array[x+2][y+2].equals("X") && array[x+3][y+3].equals("X") && array[x+4][y+4].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x-1][y].equals("X") && array[x-2][y].equals("X") && array[x-3][y].equals("X") && array[x-4][y].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x+1][y].equals("X") && array[x+2][y].equals("X") && array[x+3][y].equals("X") && array[x+4][y].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x][y-1].equals("X") && array[x][y-2].equals("X") && array[x][y-3].equals("X") && array[x][y-4].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x][y+1].equals("X") && array[x][y+2].equals("X") && array[x][y+3].equals("X") && array[x][y+4].equals("X")) {
                player1Won = true;
                System.out.println("Hráč 1 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }


            System.out.println(" 0  1  2  3  4  5  6  7  8  9");
            for (String[] strings : array) {
                System.out.println(Arrays.toString(strings));
            }

            System.out.println("Hráč 2: Zadej souradnici x");
            int y2 = sc.nextInt();
            System.out.println("Hráč 2: Zadej souradnici y");
            int x2 = sc.nextInt();
            array[x2][y2] = "O";

            if(array[x2-1][y2-1].equals("O") && array[x2-2][y2-2].equals("O") && array[x2-3][y2-3].equals("O") && array[x2-4][y2-4].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x2+1][y2+1].equals("O") && array[x2+2][y2+2].equals("O") && array[x2+3][y2+3].equals("O") && array[x2+4][y2+4].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x2-1][y2].equals("O") && array[x2-2][y2].equals("O") && array[x2-3][y2].equals("O") && array[x2-4][y2].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }

            if(array[x2+1][y2].equals("O") && array[x2+2][y2].equals("O") && array[x2+3][y2].equals("O") && array[x2+4][y2].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x2][y2-1].equals("O") && array[x2][y2-2].equals("O") && array[x2][y2-3].equals("O") && array[x2][y2-4].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
            if(array[x2][y2+1].equals("O") && array[x2][y+2].equals("O") && array[x2][y2+3].equals("O") && array[x2][y2+4].equals("O")) {
                player2Won = true;
                System.out.println("Hráč číslo 2 vyhrál");
                for (String[] strings : array) {
                    System.out.println(Arrays.toString(strings));
                }
                break;
            }
        }
    }
}


