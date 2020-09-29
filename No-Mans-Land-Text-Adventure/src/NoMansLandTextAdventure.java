// version 2.0 bugfix
// correct spelling of "leer" and "conqueror"
// add Gazette location

import java.util.Scanner;
import java.lang.Math;
import java.io.*;
import java.awt.GraphicsEnvironment;
import java.net.URISyntaxException;

public class NoMansLandTextAdventure 
{

	public static void main(String[] args) 
	{/*
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
		    {*/
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
				System.out.println("G: The Gazette");
				System.out.println("___: anywhere else");
				System.out.println();
				String go1 = kb.nextLine();
				System.out.println();
				
				switch (go1)
				{	
					// Clocktower hub
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
									System.out.println("Star Conqueror does not like this.");
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
								System.out.println("Fastbreak leers at you.");
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
										System.out.println("Fastbreak continues to leer at you.");
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
					// Gazette hub
					case "G":
					case "g":
						System.out.println("You arrive at the Gotham Gazette");
						System.out.println("Grundy is not guarding the door anymore.");
						System.out.println("You miss Grundy.");
						System.out.println("Where do you go?");
						System.out.println();
						System.out.println("R: Riev's room");
						System.out.println("V: Varra's room");
						System.out.println("F: Fields's room");
						System.out.println("A: Artemis's room");
						System.out.println("T: Trish's room");
						System.out.println();
						
						String goG = kb.nextLine();
						System.out.println();
						
						switch (goG)
						{
							case "r":
							case "R":
								System.out.println("You go to Riev's room.");
								System.out.println("What do you do?");
								System.out.println();
								System.out.println("F: Leave a flashlight at the door");
								System.out.println("G: Get off on his bed");
								System.out.println("C: Be a cat");
								System.out.println();
								
								String goR = kb.nextLine();
								System.out.println();
								
								switch (goR)
								{
									case "f":
									case "F":
										System.out.println("You leave a flashlight at the door.");
										System.out.println("You hide around the corner to watch.");
										System.out.println("Riev approaches. He seems upset.");
										System.out.println("Heheheheh.");
										System.out.println("GOOD END");
										break;
									case "g":
									case "G":
										System.out.println("You enter Riev's room and schlick on his bed.");
										System.out.println("You write about it in your diary later.");
										System.out.println("Riev does not like this.");
										System.out.println("Next time he sees you, he shoots you in the head.");
										System.out.println("BAD END");
										break;
									case "c":
									case "C":
										System.out.println("You are a cat.");
										System.out.println("Cats like Riev.");
										System.out.println("Riev likes cats.");
										System.out.println("Where do you go now?");
										System.out.println();
										System.out.println("A: Artemis's room");
										System.out.println("T: Trish's room");
										System.out.println("C: The C Building");
										System.out.println("O: Find other cats");
										System.out.println();
										
										String goCat = kb.nextLine();
										System.out.println();
										
										switch (goCat)
										{
											case "a":
											case "A":
												System.out.println("You go see Artemis.");
												System.out.println("\"The consort! The consort!\"");
												System.out.println("Artemis helps you get adopted, via Ra's al Ghul and the League of Assassins.");
												System.out.println("GOOD END... for now");
												break;
											case "t":
											case "T":
												System.out.println("You go to Trish's room.");
												System.out.println("You find socks.");
												System.out.println("You take the socks.");
												System.out.println("Trish does not like this.");
												System.out.println("GOOD END for you, BAD END for Trish");
												break;
											case "c":
											case "C":
												System.out.println("You go to the C Building.");
												System.out.println("There is an army of pigs.");
												System.out.println("You fight valiantly.");
												System.out.println("The pigs have been defeated!");
												System.out.println("GOOD END");
												break;
											case "o":
											case "O":
												System.out.println("You go to find other cats.");
												System.out.println("How many cats?");
												System.out.println((int)(Math.random() * 52 + 1) + " cats.");
												System.out.println("GOOD END");
												break;
											default:
												System.out.println("You just stay there and lick yourself.");
												System.out.println("Gross.");
												System.out.println("END");
												break;
										}
										break;
									default:
										System.out.println("You don't do anything.");
										System.out.println("Riev doesn't say anything.");
										System.out.println("END");
										break;
								}
								break;
							case "v":
							case "V":
								System.out.println("You go to Varra's room.");
								System.out.println("What do you ask her?");
								System.out.println();
								System.out.println("H: For help");
								System.out.println("S: If she works with the Spectre or the League");
								System.out.println("G: If she's a good person");
								System.out.println("F: Flirt with her");
								System.out.println();
								
								String goV = kb.nextLine();
								System.out.println();
								
								switch (goV)
								{
									case "h":
									case "H":
										System.out.println("\"Varra! Help!\"");
										System.out.println("Varra helps you.");
										System.out.println("GOOD END");
										break;
									case "s":
									case "S":
										System.out.println("You ask Varra if she has been working with/for the League, or if she knows the Spectre personally.");
										System.out.println("She laughs nervously, twirling her hair with a finger.");
										System.out.println();
										System.out.println("Are you Count Vertigo? (y/n)");
										System.out.println();
										
										String areVertigo = kb.nextLine();
										System.out.println();
										
										if (areVertigo.equalsIgnoreCase("y"))
										{
											System.out.println("How could Varra betray you like this?!");
											System.out.println("BAD END");
										}
										else
										{
											System.out.println("This girl sure is strange.");
											System.out.println("END");
										}
										break;
									case "g":
									case "G":
										System.out.println("You ask Varra if she's a good person.");
										System.out.println("\"I like to think so\" she says.");
										System.out.println("She says this while pulling an arrow from the body of a person she just killed.");
										System.out.println("What a good person.");
										System.out.println("GOOD END");
										break;
									case "f":
									case "F":
										System.out.println("You flirt with Varra.");
										System.out.println();
										System.out.println("Are you a villain? (y/n)");
										System.out.println();
										
										String isVillain = kb.nextLine();
										System.out.println();
										
										if (isVillain.equalsIgnoreCase("y"))
										{
											System.out.println("Varra flirts back with you.");
											System.out.println();
											System.out.println("Are you Count Vertigo? (y/n)");
											System.out.println();
											
											String isVertigo = kb.nextLine();
											System.out.println();
											
											if (isVertigo.equalsIgnoreCase("y"))
											{
												System.out.println("You are Vertigo.");
												System.out.println("Bow chicka wow wow.");
												System.out.println("GOOD END");
											}
											else
											{
												System.out.println("You are not Vertigo.");
												System.out.println("How could Varra betray Vertigo like this?!");
												System.out.println("BAD END");
											}
										}
										else
										{
											System.out.println("Varra assures you she has a boyfriend.");
											System.out.println("Too bad.");
											System.out.println("BAD END");
										}
										break;
									default:
										System.out.println("Varra writes to the Soul Bowl.");
										System.out.println("GOOD END");
										break;
								}
								break;
							case "f":
							case "F":
								System.out.println("You find Fields in the concert hall.");
								System.out.println("He is playing piano.");
								System.out.println("This is nice.");
								System.out.println("GOOD END");
								break;
							case "a":
							case "A":
								System.out.println("You go to Artemis's room.");
								System.out.println("Are you Fields? (y/n)");
								System.out.println();
								String areFields = kb.nextLine();
								System.out.println();
								if (areFields.equalsIgnoreCase("Y"))
								{
									System.out.println("\"Huh!? Fields!\"");
									System.out.println();
								}
								boolean loopA = true;
								String again = "";
								while (loopA)
								{
									System.out.println("What do you do at Artemis's room?");
									System.out.println();
									System.out.println("C: Use the magic crown");
									System.out.println("P: Speak to Patch");
									System.out.println("M: Remind Artemis that he killed Man-Bat");
									System.out.println();
									String goA = kb.nextLine();
									System.out.println();
									
									switch (goA)
									{
										case "p":
										case "P":
											System.out.println("\"Hey Footpad!\"");
											System.out.println();
											//System.out.println("Hello Patch.");
											kb.nextLine();
											System.out.println("\"Do you have any cheesy crackers I sure am hungry.\"");
											System.out.println();
											//System.out.println("No, I'm afraid I don't.");
											kb.nextLine();
											System.out.println("\"Oh no! I really like cheesy crackers did I ever tell you about Vinny Vinny used to find cheesy crackers and bring them back to share with me...\"");
											System.out.println();
											//System.out.println("Um...");
											kb.nextLine();
											System.out.println("\"And sos I tells him he'll be sleeping with the fishies I don't know why people have to sleep with the fishies maybe the fishies have bad dreams and they need someone to help them feel safe while they sleep...\"");
											System.out.println();
											//System.out.println("...");
											kb.nextLine();
											System.out.println("\"And Otis was always giving us treats and I don't think anybody else really is giving us as much treats I mean funny woman made me a fort out of that shoe but she calls me a funny name so I don't know if it's quite as good as before...\"");
											System.out.println();
											System.out.println("He never stops.");
											System.out.println("BAD END");
											loopA = false;
											break;
										case "m":
										case "M":
											System.out.println("You remind Artemis that he killed Man-Bat" + again + ".");
											again = "... again";
											break;
										default:
											System.out.println("You decide to do nothing.");
											System.out.println("Artemis eats you.");
											System.out.println("BAD END");
											break;
									}
								}
								break;
							default:
								System.out.println("You can't make a decision.");
								System.out.println("You miss Grundy too much.");
								System.out.println("Rest in peace, big guy.");
								System.out.println("SAD END");
								break;
						
						}
						break;
					// Hidden Best End
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
//}
