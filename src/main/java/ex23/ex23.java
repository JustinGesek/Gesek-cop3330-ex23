package ex23;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 justin gesek
 */
import java.util.Locale;
import java.util.Scanner;
//Is the car silent when you turn the key? y
 //       Are the battery terminals corroded? n
  //      Replace cables and try again.
public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //if (Is the car silent when you turn the key?) then (yes)
        System.out.print("Is the car silent when you turn the key? ");
        String response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
        if( response.equals("Y"))
        {
            //    if (Are the battery terminals corroded?) then (yes)
            System.out.print("Are the battery terminals corroded? ");
            response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
            if(response.equals("Y"))
            {
                //        :Clean terminals and try starting again.;
                System.out.println("Clean terminals and try starting again.");
                //        stop
                return;
            }
            else
            {
                //    else (no)
                //        :Replace cables and try again.;
                System.out.println("The battery cables may be damaged.\nReplace cables and try again.");

                //        stop
                return;
                //    endif
            }
        }
        else
        {
            //else (no)
            //    if (Does the car make a slicking noise?) then (yes)
            System.out.print("Does the car make a slicking noise? ");
            response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
            if(response.equals("Y"))
            {
                //        :Replace the battery.;
                System.out.println("Replace the battery.");
                //        stop
                return;
            }
            else
            {
                //    else (no)
                //        if (Does the car crank up but fail to start?) then (yes)
                System.out.print("Does the car crank up but fail to start? ");
                response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
                if(response.equals("Y"))
                {
                    //            :Check spark plug connections.;
                    //            stop
                }
                else
                {
                    //        else (no)
                    //            if (Does the engine start and then die?) then (yes)
                    System.out.print("Does the engine start and then die? ");
                    response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
                    if(response.equals("Y"))
                    {
                        //                if (Does you car have fuel injection?) then (yes)
                        System.out.print("Does you car have fuel injection? ");
                        response = scanner.nextLine().trim().toUpperCase(Locale.ROOT).substring(0,1);
                        if(response.equals("Y"))
                        {
                            //                    :Get it in for service.;
                            System.out.println("Get it in for service. ");
                            //                    stop
                            return;
                        }
                        else
                        {

                            //                else (no)
                            //                    :Check to ensure the choke is opening and closing.;
                            System.out.println("Check to ensure the choke is opening and closing. ");

                            //                    stop
                            return;
                        }

                        //                endif
                    }
                    else
                    {
                        //            else (no)
                        //                :This should not be possible.;
                        System.out.println("This should not be possible. ");

                        //                stop
                        return;
                        //            endif
                    }


                    //        endif
                }


                //    endif
            }


            //endif
        }
    }
}
