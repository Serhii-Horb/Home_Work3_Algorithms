package org.example.Ex2;

/* Ханойская башня
Задача заключается в следующем: Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила: Вы не можете поместить больший диск на меньший диск.
За один раз можно перемещать только один диск.
Итеративно
*/
public class HanoiTowerIterative {
    public static void solveHanoiTower(int n, char source, char auxiliary, char target) {
        int totalMoves = (int) Math.pow(2, n) - 1;  // Общее количество перемещений

        for (int i = 1; i <= totalMoves; i++) {
            if (i % 2 == 1) {
                moveDisk(n, source, target);
            } else {
                if ((i / 2) % 2 == 1) {
                    moveDisk(n, source, auxiliary);
                } else {
                    moveDisk(n, auxiliary, target);
                }
            }
        }
    }

    private static void moveDisk(int n, char source, char target) {
        System.out.println("Move disk " + n + " from " + source + " to " + target);
    }

    public static void main(String[] args) {
        int numberOfDisks = 2;
        char sourcePeg = 'A';
        char auxiliaryPeg = 'B';
        char targetPeg = 'C';

        solveHanoiTower(numberOfDisks, sourcePeg, auxiliaryPeg, targetPeg);
    }
}


