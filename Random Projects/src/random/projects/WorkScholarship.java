package random.projects;

import java.util.Scanner;

/**
 *
 * @author Brayden
 */
public class WorkScholarship {

    public static void main(String[] args) {

        // Allows the computer to be talked to
        Scanner input = new Scanner(System.in);

        // Somethings that someone might need to input
        String job = "job";
        String school = "school";
        String community = "community";
        String irish = "They make good wrist watches";
        String yes = "yes";
        String no = "no";
        String options = "job school community";
        String options2 = "yes no";

        // Some sort of welcoming thing idk
        System.out.println("Welcome!  Please insert your name so I can personally address you");

        // Gets the name dude
        String name = input.nextLine();

        System.out.println("Ah so your name is " + name + ", interesting"
                + "\nAnyway!  You must be here for the information about me, well... what do you wanna hear about first?"
                + "\nPlease state \'job\', \'school\', or \'community\'");

        while (true) {
            // This is what the person waaaants
            String choice = input.nextLine().toLowerCase();

            while (!(options.contains(choice))) {
                System.out.println();
                System.out.println("That... That didn't contain anything that I asked for, could you please try again?");
                choice = input.nextLine().toLowerCase();
            }

            // Check to see if they match annnnything
            if (choice.equals(job)) {
                System.out.println();
                System.out.println("At work I always push to get better, faster, hit every step of procedures, and keep a "
                        + "\nhealthy attitude throughout my shifts.  I try to lead others into having the same pride in"
                        + "\ntheir work as I do by coaching them to do a great job, and to keep their spirits up by"
                        + "\ndoing whatever wacky thing comes to mind.  I love my job, and hope make it the same "
                        + "\nenjoyable period of the day for me, as well as those around me.");

            } else if (choice.equals(school)) {
                System.out.println();
                System.out.println("In my grade twelve year, I've had some great opportunities to be involved in the drama "
                        + "\ndepartment at my school, and I took off with it as much as I could.  Specifically being"
                        + "\noffered captain of one of the improv teams at school was one of the greatest possible for me."
                        + "\nBeing a captain gave me an amazing opportunity to work alongside some talented teens,"
                        + "\nand bring their skills to light.  My focus on the team was not being the best player,"
                        + "\nbut make the best one.  I challenged and worked with these students as a team to "
                        + "\nbring to life some amazing events, and in my personal oppinon, we had some of our greatest"
                        + "\nevents in my time playing at that school.  Not only did I lead this wonderful group, but"
                        + "\nthey also helped teach me what it's like to be a leader, and to listen and support."
                        + "\nAnd outside of Improv, I may not have been the most popular student, but many knew of me."
                        + "\nI may not have been the most talented, but I was able to see other's.  Through encouragement"
                        + "\nand simple helping acts, I believe I've made a difference, even if I'm not the one "
                        + "\nremembered for it.");

            } else if (choice.equals(community)) {
                System.out.println();
                System.out.println("I've been a part of a few local and non-local volunteer opportunities throughout highschool,"
                        + "\nsome ranging from just donations to travelling to help out.  One of the local things I've "
                        + "\ndone is the Opporation Christmas Child.  Spending some time near christmas to help pack and"
                        + "\nprepare shoe boxes for shipment, it's a really great experience to be a part of.  Another"
                        + "\nthing I've done a little less local is I heard that a camp up north was lacking in male "
                        + "\ncounsellors for the kids, so I took a few weeks off my summer to help support the camp."
                        + "\nUp until recently I also had a sponsor child that I would send money to once a month, up until"
                        + "\nthey left the program, I've been looking for something else to support since then.  Finally"
                        + "\nI've had the chance to work in homeless shelters, doing some repairs, moving things around,"
                        + "\nor sorting out their storage areas.  Not only was that trip a great experience and I got to "
                        + "\ndo a lot of great things, it was also humbling to see how privilaged I am.  All in all, I"
                        + "\nwould love to have more opportunities to support people who need it, and I see myself "
                        + "\nvolunteering for McHappy day type events long after I've finished university.");

            }

            System.out.println();
            System.out.println("Would you like to hear about something else?");

            // get the second choice
            String choice2 = input.nextLine().toLowerCase();

            while (!(options2.contains(choice2))) {
                System.out.println("Sorry, that's not a yes or no response, please try again");
                choice2 = input.nextLine().toLowerCase();
            }

            if (choice2.equals(yes)) {
                System.out.println("What else would you like to hear about?  Same options as before!");
            } else if (choice2.equals(no)) {
                break;
            }
        }
        System.out.println("");
        System.out.println("Thank you for reading this program!");
    }
}
