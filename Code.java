import java.util.ArrayList;

import java.util.Scanner;

public class Code {
    public static void main(String[] args) {
        ArrayList<String> testA = new ArrayList<String>();
        ArrayList<String> AnswerA = new ArrayList<String>();
        ArrayList<String> testB = new ArrayList<String>();
        ArrayList<String> AnswerB = new ArrayList<String>();

        testA.add("Phishing is best described as:\n" +
                "A) A type of computer virus that hides inside another program\n" +
                "B) A scam where an attacker tries to trick you into revealing sensitive information by\n" +
                "pretending to be a trusted source\n" +
                "C) A method of physically stealing computer hardware\n" +
                "D) A technique that improves the speed of your internet connection");
        testA.add("Which of the following is a common red flag in a phishing email?\n" +
                "A) The sender’s email address is from a well-known company you regularly do business with\n" +
                "B) The email is addressed to you by your full name\n" +
                "C) The email creates a sense of urgency and asks you to click a link to “verify” your\n" +
                "account immediately\n" +
                "D) The message contains no spelling or grammatical errors");
        testA.add("What is ransomware?\n" +
                "A) Software that displays advertisements on your screen\n" +
                "B) Malware that encrypts your files and demands payment in exchange for the\n" +
                "decryption key\n" +
                "C) A subscription fee charged by software companies\n" +
                "D) A type of firewall used by large businesses");
        testA.add("Which of the following is an example of social engineering?\n" +
                "A) Designing a new social media website\n" +
                "B) Writing code to break a password by brute force\n" +
                "C) Calling someone and pretending to be from IT support to get their login credentials\n" +
                "D) Sending a file over the network without encryption");
        testA.add("A Trojan is malware that:\n" +
                "A) Disguises itself as a legitimate or harmless program but performs malicious\n" +
                "actions once installed\n" +
                "B) Spreads automatically across networks without any user interaction\n" +
                "C) Only attacks devices that are not connected to the internet\n" +
                "\n" +
                "D) Is a type of antivirus software");
        testA.add("You receive a text message that says “Your package could not be delivered. Click\n" +
                "here to reschedule: bit.ly/xyz123.” What should you do?\n" +
                "A) Click the link right away to make sure your package arrives on time\n" +
                "B) Reply to the message asking for more details\n" +
                "C) Do not click the link; verify the delivery directly through the courier’s official\n" +
                "website or app\n" +
                "D) Forward the message to all your contacts to warn them");
        testA.add("Which of the following best describes a man-in-the-middle attack?\n" +
                "A) An attack where a hacker physically stands between two people at an ATM\n" +
                "B) An attack where an attacker secretly intercepts and possibly alters the\n" +
                "communication between two parties\n" +
                "C) A type of denial-of-service attack\n" +
                "D) Hardware sabotage performed inside a server room");
        testA.add("Vishing is a form of phishing carried out:\n" +
                "A) Over voice calls\n" +
                "B) Through video games\n" +
                "C) Using printed letters in the mail\n" +
                "D) By installing software from a USB drive");
        testA.add("Which one of the following is most likely a sign of a spoofed website?\n" +
                "A) The URL is spelled exactly the same as the official site, including the correct top-level\n" +
                "domain\n" +
                "B) The URL contains small misspellings or extra characters (e.g., “amaz0n-login.com”\n" +
                "instead of “amazon.com”)\n" +
                "C) The site shows a padlock icon next to the URL\n" +
                "D) The site loads quickly with no errors");
        testA.add("Spyware is malware that primarily:\n" +
                "A) Encrypts your data and demands a ransom\n" +
                "B) Secretly collects information about your activity, such as keystrokes or browsing\n" +
                "history, and sends it to a third party\n" +
                "C) Floods a website with requests until it crashes\n" +
                "D) Improves your computer’s performance by removing junk files");


        AnswerA.add("B");
        AnswerA.add("C");
        AnswerA.add("B");
        AnswerA.add("C");
        AnswerA.add("A");
        AnswerA.add("C");
        AnswerA.add("B");
        AnswerA.add("A");
        AnswerA.add("B");
        AnswerA.add("B");


        testB.add("Which of the following is the strongest password?\n" +
                "A) password123\n" +
                "B) Farzin2009\n" +
                "C) Tr0ub4dor&amp;3-Spring!Tuesday\n" +
                "D) qwerty");
        testB.add("Two-factor authentication (2FA) protects an account by requiring:\n" +
                "A) Two different usernames\n" +
                "B) A password plus a second verification step, such as a code from an app or text\n" +
                "message\n" +
                "C) Two separate passwords\n" +
                "D) The user to log in from two different devices at the same time");
        testB.add("Why should you keep your operating system and apps up to date?\n" +
                "A) Updates make your device look more modern\n" +
                "B) Updates often include security patches that fix newly discovered vulnerabilities\n" +
                "C) Updates always add new social media features\n" +
                "D) Updates are only useful for gaming computers");
        testB.add("You see “https://” at the start of a website’s URL. This means:\n" +
                "A) The site is guaranteed to be safe and legitimate\n" +
                "B) The data sent between your browser and the site is encrypted in transit\n" +
                "C) The site has been certified by the government\n" +
                "D) The site cannot contain malware");
        testB.add("Which of the following is the safest way to manage many different account\n" +
                "passwords?\n" +
                "A) Use the same password on every account so you don’t forget it\n" +
                "B) Write all your passwords on a sticky note attached to your monitor\n" +
                "C) Use a reputable password manager to generate and store unique passwords\n" +
                "D) Use your birthday and last name on every account");
        testB.add("When using public Wi-Fi (e.g., at a coffee shop), the safest practice is to:\n" +
                "A) Log in to your online banking immediately to take advantage of the free network\n" +
                "B) Avoid sensitive activities, or use a reputable VPN to encrypt your traffic\n" +
                "C) Disable your firewall to improve speed\n" +
                "D) Share the network password with everyone nearby");
        testB.add("Why might it be risky to grant a free flashlight app access to your contacts and\n" +
                "microphone?\n" +
                "A) The app needs those permissions to turn the flashlight on\n" +
                "B) Apps can collect and share data they don’t actually need, creating a privacy risk\n" +
                "C) Permissions make the flashlight brighter\n" +
                "D) There is no risk; permissions are only requested by safe apps");
        testB.add("Which of the following is a good rule for sharing personal information online?\n" +
                "A) Post your full address and phone number on your social media profile\n" +
                "B) Share only the minimum information needed and review your privacy settings\n" +
                "regularly\n" +
                "C) Use the same profile picture and bio on every site so people can recognize you\n" +
                "D) Accept all friend or follower requests, including from strangers");
        testB.add("The “3-2-1” backup rule recommends keeping:\n" +
                "A) 3 copies of your data, on 2 different types of storage media, with 1 copy stored\n" +
                "offsite\n" +
                "B) 3 passwords, 2 usernames, and 1 email account\n" +
                "C) Backups for 3 days, 2 weeks, and 1 month\n" +
                "D) 3 antivirus programs running at the same time");
        testB.add("Q10. If you think your account has been hacked, the first thing you should do is:\n" +
                "A) Delete the account immediately\n" +
                "B) Tell no one and hope the attacker loses interest\n" +
                "C) Change the password, enable 2FA if available, and review recent activity for\n" +
                "unauthorized access\n" +
                "D) Post about it on social media to warn your friends");


        AnswerB.add("C");
        AnswerB.add("B");
        AnswerB.add("B");
        AnswerB.add("B");
        AnswerB.add("C");
        AnswerB.add("B");
        AnswerB.add("B");
        AnswerB.add("B");
        AnswerB.add("A");
        AnswerB.add("C");


        Scanner sc = new Scanner(System.in);
        int answA = 0;
        int repeateA = 0;
        int mistakeA = 0;
        int answB = 0;
        int repeateB = 0;
        int mistakeB = 0;
        System.out.println("Hello what is your name?");
        String name = sc.nextLine();
        System.out.println("Hello " + name + " please select number 1 or 2");
        System.out.println("1. Take Certification test.\n2. Login as admin");
        int num = sc.nextInt();
        sc.nextLine();
        if (num == 1) {
            System.out.println("Starting PART A");
            while (repeateA <= 6 && mistakeA < 4) {
                int randnum = (int) (Math.random() * ((testA.size() - 1) - 0 + 0) + 0);
                System.out.println(testA.get(randnum));
                testA.remove(randnum);
                String answer = sc.nextLine();
                if (answer.equals(AnswerA.get(randnum))) {
                    System.out.println("Very good you got it correct!");
                    answA++;
                } else {
                    System.out.println("Nice try but the correct answer was " + AnswerA.get(randnum));
                    mistakeA++;
                }
                repeateA++;

            }
            if (answA >= 4) {
                System.out.println("Starting PART B");
                while (repeateB <= 6 && mistakeB < 4) {
                    int randnum = (int) (Math.random() * (9 - 0 + 0) + 0);
                    System.out.println(testB.get(randnum));
                    String answer = sc.nextLine();
                    if (answer.equals(AnswerB.get(randnum))) {
                        System.out.println("Very good you got it correct!");
                        answB++;
                    } else {
                        System.out.println("Nice try but the correct answer was " + AnswerB.get(randnum));
                        mistakeB++;
                    }
                    if (answA + answB + (5 - repeateB) < 9) {
                        mistakeB = 4;
                    }
                    repeateB++;

                }
            }

            if (answA + answB >= 9) {
                System.out.println("Congrats you passed");
            } else {
                System.out.println("You failed");
            }


        } else if (num == 2) {
            System.out.println("please enter the password (it is 3267)");

            int passwordinput = sc.nextInt();

            if (passwordinput == 3267) {
                System.out.println("Correct Password\n1. Add a question\n2. Remove a question");
                int picknum = sc.nextInt();
                sc.nextLine();
                if (picknum == 1) {
                    System.out.println("Which Section do you want to add a question to?");
                    String section = sc.nextLine();

                    if (section.equals("A")) {
                        System.out.println("Please input your question and multiple choice questions");
                        String newquestion = sc.nextLine();
                        System.out.println("Please input the answer");
                        String newanswer = sc.nextLine();

                        testA.add(newquestion);
                        AnswerA.add(newanswer);
                    } else if (section.equals("B")) {
                        System.out.println("Please input your question and multiple choice questions");
                        String newquestion = sc.nextLine();
                        System.out.println("Please input the answer");
                        String newanswer = sc.nextLine();

                        testB.add(newquestion);
                        AnswerB.add(newanswer);
                    }

                } else if (picknum == 2) {
                    System.out.println("Which Section do you want to remove a question?");
                    String section = sc.nextLine();

                    if (section.equals("A")) {
                        System.out.println("Which Question do you want to delete?\n" +
                                "Q1 Phishing is best described as\n" +
                                "Q2. Which of the following is a common red flag in a phishing email?\n" +
                                "Q3. What is ransomware?\n" +
                                "Q4. Which of the following is an example of social engineering?\n" +
                                "Q5. A Trojan is malware that:\n" +
                                "Q6. You receive a text message that says “Your package could not be delivered. Click here to reschedule: bit.ly/xyz123.” What should you do?\n" +
                                "Q7. Which of the following best describes a man-in-the-middle attack?\n" +
                                "Q8. Vishing is a form of phishing carried out:\n" +
                                "Q9. Which one of the following is most likely a sign of a spoofed website?\n" +
                                "Q10. Spyware is malware that primarily:\n");
                        int questiondelete = sc.nextInt();
                        testA.remove(questiondelete - 1);
                        System.out.println("You deleted question " + questiondelete);


                    } else {
                        System.out.println("Invalid Response");
                    }

                } else {
                    System.out.println("Invalid Response");
                }


            }
            else{
                System.out.println("Incorrect Password");
            }


        }
        else{
            System.out.println("Invalid Response.");
        }
    }
}

