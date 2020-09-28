import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;

public class NoMansLandTextAdventure 
{

	public static void main(String[] args) 
	{
		Console console = System.console();
	    if(console == null && !GraphicsEnvironment.isHeadless()) 
	    {
	        String filename = NoMansLandTextAdventure.class.getProtectionDomain().getCodeSource().getLocation().toString().substring(6);
	        try 
	        {
	            File batch = new File("Launcher.bat");
	            if(!batch.exists())
	            {
	                batch.createNewFile();
	                PrintWriter writer = new PrintWriter(batch);
	                writer.println("@echo off");
	                writer.println("java -jar "+filename);
	                writer.println("exit");
	                writer.flush();
	            }
	            Runtime.getRuntime().exec("cmd /c start \"\" "+batch.getPath());
	        } catch(IOException e) 
	        {
	            e.printStackTrace();
	        }
	    } 
	    else 
		    {
			Scanner kb = new Scanner(System.in);
			String loop = "y";
			
			while (loop.equalsIgnoreCase("y"))
			{
				// Welcome
				System.out.println();
				System.out.println("Welcome to No Man's Land! Where do you go?");
				System.out.println();
				
				//First screen
				System.out.println("C: Clocktower");
				System.out.println("___: anywhere else");
				System.out.println();
				String go1 = kb.nextLine();
				System.out.println();
				
				switch (go1)
				{
					case "c":
					case "C":
						System.out.println("You enter into the Clocktower.");
						System.out.println("Rags barks hello!");
						System.out.println("Where do you go?");
						System.out.println();
						System.out.println("B: Barbara's room");
						System.out.println("R: Rosetta's room");
						System.out.println("T: Tali's room");
						System.out.println("O: Obrov's room");
						System.out.println("F: Fastbreak's room");
						System.out.println();
						
						String go2 = kb.nextLine();
						System.out.println();
						
						switch (go2)
						{
							case "b":
							case "B":
								System.out.println("You enter Barbara's room.");
								System.out.println("Scar sighs.");
								System.out.println("What do you ask Oracle?");
								System.out.println();
								System.out.println("N: Something nerdy");
								System.out.println("J: About the Joker");
								System.out.println("F: Insult Fields");
								System.out.println();
								
								String goB = kb.nextLine();
								System.out.println();
								
								switch (goB)
								{
									case "n":
									case "N":
										System.out.println("Barbara starts talking about nerdy things.");
										System.out.println("It takes all evening.");
										System.out.println("You forgot to stop the League of Assassins.");
										System.out.println("BAD END");
										break;
									case "j":
									case "J":
										System.out.println("Wow you're an idiot.");
										System.out.println("Barbara turns pale and leaves for her room.");
										System.out.println("You really fucked that one up.");
										System.out.println("BAD END");
										break;
									case "f":
									case "F":
										System.out.println("Barbara glares at you over the top of her glasses.");
										System.out.println("She is not impressed.");
										System.out.println("BAD END");
										break;
									default:
										System.out.println("Unable to answer the prompt properly, Barbara glares at you over the top of her glasses.");
										System.out.println("She is unimpressed with your lack of computer knowledge.");
										System.out.println("BAD END");
										break;
								}
								break;
							case "r":
							case "R":
								System.out.println("You go to visit Rosetta.");
								System.out.println("She lectures you all day.");
								System.out.println("BAD END");
								break;
							case "t":
							case "T":
								System.out.println("You go to Tali's room.");
								System.out.println("Tali begins to speak, referencing everything to her own personal experiences.");
								System.out.println();
								System.out.println("Are you Tali? (y/n): ");
								System.out.println();
								
								String areTali = kb.nextLine();
								System.out.println();
								
								if (areTali.equalsIgnoreCase("y"))
								{
									System.out.println("Because you are Tali, you can understand your references.");
									System.out.println("Star Conquerer does not like this.");
									System.out.println("Your head asplodes.");
									System.out.println("BAD END");
								}
								else
								{
									System.out.println("You have no idea what Tali is talking about.");
									System.out.println("This sucks.");
									System.out.println("BAD END");
								}
								break;
							case "s":
							case "S":
								System.out.println("Wow! Despite the Spirit option being invisible, you found it!");
								System.out.println("Spirit is riding Patroklos and playing his flute.");
								System.out.println("What do you do?");
								System.out.println();
								System.out.println("P: Pet Patroklos");
								System.out.println("H: Get healing");
								System.out.println();
								
								String goS = kb.nextLine();
								System.out.println();
								
								switch (goS)
								{
									case "p":
									case "P":
										System.out.println("You pet Patroklos.");
										int roll = (int)((Math.random() * 100) + 1);
										System.out.println("You roll a " + roll);
										if (roll == 52)
										{
											System.out.println("Patroklos explodes!");
											System.out.println("GOOD END");
										}
										else
										{
											System.out.println("Patroklos does not explode.");
											System.out.println("BAD END");
										}
										break;
									case "h":
									case "H":
										System.out.println("You ask Spirit to heal you.");
										System.out.println("He does.");
										System.out.println("How nice.");
										System.out.println("GOOD END");
										break;
								}
								break;
							case "o":
							case "O":
								System.out.println("You go Obrov's room.");
								System.out.println("What do you do?");
								System.out.println();
								System.out.println("A: Arm wrestle Obrov.");
								System.out.println("J: Eat Jokester the pig.");
								System.out.println();
								
								String goO = kb.nextLine();
								System.out.println();
								
								switch (goO)
								{
									case "a":
									case "A":
										System.out.println("You try to arm wrestle Obrov.");
										System.out.println();
										System.out.println("Are you Lobo? (y/n)");
										System.out.println();
										
										String lobo = kb.nextLine();
										System.out.println();
										
										if (lobo.equalsIgnoreCase("y"))
										{
											System.out.println("You win easily. Obrov is a bitch.");
											System.out.println("GOOD END");
										}
										else
										{
											System.out.println("You lose. Oops!");
											System.out.println("BAD END");
										}
										break;
									case "j":
									case "J":
										System.out.println("You eat Jokester the pig.");
										System.out.println("Thank goodness.");
										System.out.println("GOOD END");
										break;
									default:
										System.out.println("KGBeast clotheslines you.");
										System.out.println("BAD END");
										break;
								}
								break;
							case "f":
							case "F":
								System.out.println("You go to Fastbreak's room.");
								System.out.println("His shirt is off.");
								System.out.println("\"A bird in one hand is worth its weight in two stones.\"");
								System.out.println("What?");
								System.out.println("Fastbreak lears at you.");
								System.out.println("What do you do?");
								System.out.println();
								System.out.println("P: Punch Fastbreak");
								System.out.println("A: Argue with Fastbreak");
								System.out.println("K: Kiss Fastbreak");
								System.out.println();
								
								String goF = kb.nextLine();
								System.out.println();
								
								switch (goF)
								{
									case "p":
									case "P":
										System.out.println("You punch Fastbreak.");
										System.out.println("You broke his nose!");
										System.out.println("Haha, nerd.");
										System.out.println("GOOD END");
										break;
									case "a":
									case "A":
										System.out.println("You argue with Fastbreak.");
										System.out.println("He argues back.");
										System.out.println("This is awful for everyone.");
										System.out.println("BAD END");
										break;
									case "k":
									case "K":
										System.out.println("You kiss Fastbreak.");
										System.out.println("He uses too much tongue.");
										System.out.println("Given his track record, you must be crazy.");
										System.out.println("You are thrown in Arkham Asylum.");
										System.out.println("Fastbreak forgets about you after a month.");
										System.out.println("BAD END");
										break;
									case "defeat cander now":
										System.out.println("You have defeated Cander.");
										System.out.println("Barbers is saved.");
										System.out.println("How many cats?");
										int cats = (int)((Math.random()*52) + 1);
										System.out.println(cats + " cats.");
										System.out.println("BEST END");
										break;
									default:
										System.out.println("Fastbreak continues to lear at you.");
										System.out.println("BAD END");
										break;
								}
								break;
							case "defeat cander now":
								System.out.println("You have defeated Cander.");
								System.out.println("Barbers is saved.");
								System.out.println("How many cats?");
								int cats = (int)((Math.random()*52) + 1);
								System.out.println(cats + " cats.");
								System.out.println("BEST END");
								break;
							default:
								System.out.println("Having trouble deciding where to go, you stay in the lobby and pet Rags");
								System.out.println("OKAY END, I GUESS");
								break;
						}
						break;
					case "defeat cander now":
						System.out.println("You have defeated Cander.");
						System.out.println("Barbers is saved.");
						System.out.println("How many cats?");
						int cats = (int)(Math.random() * 52) + 1;
						System.out.println(cats + " cats.");
						System.out.println("BEST END");
						break;
					default:
						System.out.println("You go somewhere other than the Clocktower.");
						System.out.println("You get eaten by a grue.");
						System.out.println("BAD END.");
						break;
				}
				System.out.println();
				System.out.println("Play again? (y/n)");
				loop = kb.nextLine();
			}
			System.out.println("Program terminated.");
			kb.close();
	    }
	}
}
