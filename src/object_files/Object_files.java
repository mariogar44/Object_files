/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package object_files;

/**
 *
 * @author Mario
 */
public class Object_files {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int option, aukeratu;
        int a, b;
        int repeat;
        do {
            do {
                b = 0;
                System.out.println("****************************");
                System.out.println("*                          *");
                System.out.println("*Choose one option:        *");
                System.out.println("*     1-PLAYER             *");
                System.out.println("*     2-TRAINER            *");
                System.out.println("*                          *");
                System.out.println("****************************");
                System.out.println("*                          *");
                System.out.println("*     3-BACKUP             *");
                System.out.println("*     4-RESTORE            *");
                System.out.println("*                          *");
                System.out.println("****************************");
                aukeratu = pedir.readInt();
                if (aukeratu < 1 || aukeratu > 4) {
                    b = 1;
                    System.out.println("You have to enter 1 or 2");
                    System.out.println("");
                }
            } while (b == 1);
            switch (aukeratu) {
                case 1:
                    do {

                        a = 0;
                        System.out.println("****************************");
                        System.out.println("*       PLAYER             *");
                        System.out.println("*   1-Add player:          *");
                        System.out.println("*   2-Show player:         *");
                        System.out.println("*   3-Find player:         *");
                        System.out.println("*   4-Remove player:       *");
                        System.out.println("****************************");
                        System.out.print("Enter a option:   ");
                        option = pedir.readInt();
                        if (option < 1 || option > 4) {
                            a = 1;
                            System.out.println("You have to enter a number between 1 to 4");
                            System.out.println("");
                        }
                    } while (a == 1);
                    switch (option) {
                        case 1:
                            WorksObjects.WriteObject();
                            break;
                        case 2:
                            WorksObjects.showObject();
                            break;
                        case 3:
                            WorksObjects.findObject();
                            break;
                        case 4:
                            WorksObjects.removeObject();
                            break;

                    }
                    break;
                case 2:
                    do {
                        a = 0;
                        System.out.println("*****************************");
                        System.out.println("*       TRAINER             *");
                        System.out.println("*   1-Add Trainer:          *");
                        System.out.println("*   2-Show trainer:         *");
                        System.out.println("*   3-Find trainer:         *");
                        System.out.println("*   4-Remove trainer:       *");
                        System.out.println("*****************************");
                        System.out.print("Enter a option:   ");
                        option = pedir.readInt();
                        if (option < 1 || option > 4) {
                            a = 1;
                            System.out.println("You have to enter a number between 1 to 4");
                            System.out.println("");
                        }
                    } while (a == 1);
                    switch (option) {
                        case 1:
                            WorksObjects.WriteObjectTrainer();
                            break;
                        case 2:
                            WorksObjects.showObjectTrainer();
                            break;
                        case 3:
                            WorksObjects.findObjectTrainer();
                            break;
                        case 4:
                            WorksObjects.removeObjectTrainer();
                            break;
                    }
                    break;
                case 3:
                    WorksObjects.backup();
                    break;
                case 4:
                    WorksObjects.restore();
                    break;
            }
            System.out.println("Do you want to repeat? Yes-> 1 No -> 2");
            repeat = pedir.readInt();
        } while (repeat == 1);
    }

}
