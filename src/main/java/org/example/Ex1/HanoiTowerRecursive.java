package org.example.Ex1;

/* Ханойская башня
Задача заключается в следующем: Имеется три стержня — левый, средний и правый. На левом стержне находятся n дисков,
диаметры которых различны. Диски упорядочены по размеру диаметра, сверху лежит наименьший, снизу — наибольший.
Требуется перенести диски с левого стержня на правый, используя средний стержень как вспомогательный.
Головоломка имеет следующие два правила: Вы не можете поместить больший диск на меньший диск.
За один раз можно перемещать только один диск.
Рекурсивно
*/
public class HanoiTowerRecursive {
    public static void main(String[] args) {
        towerOfHanoi(2, 'A', 'B', 'C');
    }

    public static void towerOfHanoi(int n, char startingRod, char endRod, char auxiliaryRod) {
        if (n == 1) {
            System.out.println("Move disk 1 from " + startingRod + " to " + endRod);
            return;
        }
        towerOfHanoi(n - 1, startingRod, auxiliaryRod, endRod);
        System.out.println("Move disk " + n + " from " + startingRod + " to " + endRod);

        towerOfHanoi(n - 1, auxiliaryRod, endRod, startingRod);
    }
}