/*
 *	Author:
 *  Date:
 *	Collaborator(s):
*/

import java.util.Scanner;

class starter {
    public static String getObject(){
        int x = (int)(Math.random()*3);
        String item ="";
        if (x==0){
            item = "rock";
        }
        else if (x==1){
            item = "paper";
        }
        else if (x==1){
            item = "scissor";
        }
        return item;
    }
    public static String compare2(String a, String b){
        String results;
        if (a.equals(b)){
            results = "tie";
        }
        else if (a.equals("scissor")&&b.equals("paper")){
            results = "a wins";
        }
        else if (a.equals("paper")&&b.equals("rock")){
            results = "a wins";
        }
         else if (a.equals("rock")&&b.equals("scissor")){
            results = "a wins";
        }
        else {
            results = "b wins";
        }
        return results;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("Would you like to play the computer? (yes/no/done) type an");
            String anws = sc.nextLine();
            if (anws.equals("yes")||anws.equals("Yes")){
                System.out.println("");
                System.out.println("--------------------------------------------------------------");
                System.out.println("Please enter rock/paper/scissors:");
                
                while(true){
                    String player1 = sc.nextLine();
                    String bot1 = getObject();
                    String finish = compare2(player1,bot1);
                    if (finish.equals("a wins")){
                        System.out.println("You WIN!!!!!!");
                        break;
                    }
                    else if (finish.equals("b wins")){
                        System.out.println("You LOST!!!");
                        break;
                    }
                    else if (finish.equals("tie")){
                        System.out.println("keep going you tied");
                    }
                    System.out.println("Please enter rock/paper/scissors:");
                   
                   
                }
            }
            else if (anws.equals("no")||anws.equals("NO")){
                System.out.println("how many times do you want the bots to face off");
                int amount = sc.nextInt();
                int p = 0;
                int bot2score = 0;
                int bot3score = 0;
                while (p<=amount){
                    String bot2 = getObject();
                    String bot3 = getObject();
                    String john = compare2(bot2,bot3);
                    if (john.equals("a wins")){
                        bot2score = bot2score+1;
                    }
                    else if (john.equals("b wins")){
                        bot3score = bot3score+1;
                        
                    }
                    else if (john.equals("tie")){
                        while(true){
                            String bot4 = getObject();
                            String bot5 = getObject();
                            String suzie = compare2(bot4,bot5);
                            if (suzie.equals("a wins")){
                                bot2score = bot2score + 1;
                                break;
                            }
                            else if (suzie.equals("b wins")){
                                bot3score = bot3score + 1;
                                break;
                            }

                        }
                    }
                    p = p+1;

                }   
                System.out.println("bot 1 score : "+bot2score); 
                System.out.println("bot 2 score : "+bot3score); 
            }
            else if (anws.equals("done")||anws.equals("Done")){
                break;

            }
            String nothing = sc.nextLine();
                


        }

    }
}
