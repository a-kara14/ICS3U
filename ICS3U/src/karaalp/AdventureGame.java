package karaalp;
/*AdventureGame.java
 * Adem Karaalp, and Jared Hussain
 * April 06 2016
 */

import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;

import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import hsa_new.Console;

public class AdventureGame {

	public static void main(String[] args) throws LineUnavailableException, IOException, UnsupportedAudioFileException {

		boolean playOrNah = false, oneMoreChance = true;
		String play, direction, river, wet, cliff, path, wolf, ride, path1, pond, path2;
		int wolves;
		Image jpgEastOrWest, jpgRiver, jpgGirlSwim, jpgWet, jpgCliff, jpgPillow, jpgPath, jpgWolf, jpgEating, jpgWolves, jpgFrosbite, jpgAligators,
		jpgQuickSand, jpgPath2, jpgCamel, jpgBridge, jpgPath3, jpgDoorstep, jpgDead;
		
		Clip theme = AudioSystem.getClip();
		theme.open(AudioSystem.getAudioInputStream(new File("Free-Converter.com-theme-song-12310050.wav")));
		Clip finish = AudioSystem.getClip();
		finish.open(AudioSystem.getAudioInputStream(new File("smb_world_clear.wav")));
		Clip end = AudioSystem.getClip();
		end.open(AudioSystem.getAudioInputStream(new File("female-scream.wav")));
		Clip wolfSound = AudioSystem.getClip();
		wolfSound.open(AudioSystem.getAudioInputStream(new File("Wolf.wav")));
		Clip choice = AudioSystem.getClip();
		choice.open(AudioSystem.getAudioInputStream(new File("choice.wav")));
		
		

		wolves = (int) (Math.random() * 10) + 1;
		
		jpgEastOrWest = Toolkit.getDefaultToolkit().getImage("east-or-west.jpg");
		jpgRiver = Toolkit.getDefaultToolkit().getImage("river.jpg");
		jpgGirlSwim = Toolkit.getDefaultToolkit().getImage("girl-swimming.jpg");
		jpgWet = Toolkit.getDefaultToolkit().getImage("wet.jpg");
		jpgCliff = Toolkit.getDefaultToolkit().getImage("cliff.jpg");
		jpgPillow = Toolkit.getDefaultToolkit().getImage("pillow.jpg");
		jpgPath = Toolkit.getDefaultToolkit().getImage("path.jpg");
		jpgWolf = Toolkit.getDefaultToolkit().getImage("wolf.jpg");
		jpgEating = Toolkit.getDefaultToolkit().getImage("wolf-eating-hood.jpg");
		jpgWolves = Toolkit.getDefaultToolkit().getImage("wolves.jpg");
		jpgFrosbite = Toolkit.getDefaultToolkit().getImage("frosbite.jpg");
		jpgAligators = Toolkit.getDefaultToolkit().getImage("aligators.jpg");
		jpgQuickSand = Toolkit.getDefaultToolkit().getImage("quick-sand.jpg");
		jpgPath2 = Toolkit.getDefaultToolkit().getImage("path2.jpg");
		jpgCamel = Toolkit.getDefaultToolkit().getImage("camel.jpg");
		jpgBridge = Toolkit.getDefaultToolkit().getImage("bridge.jpg");
		jpgPath3 = Toolkit.getDefaultToolkit().getImage("path3.jpg");
		jpgDoorstep = Toolkit.getDefaultToolkit().getImage("doorsteps.jpg");
		jpgDead = Toolkit.getDefaultToolkit().getImage("dead.jpg");

		Console red = new Console(45, 155);
		red.setTextColor(Color.red);
		red.setTextBackgroundColor(Color.black);

		red.println("Would you like to play?   (yes or no)");
		play = red.readLine();
		if (play.equalsIgnoreCase("yes")) {
			playOrNah = true;
		} else {
			playOrNah = false;
		}
		red.clear();
		while (playOrNah == true) {

			try {
				theme.start();
				red.println(
						"Little Red riding hood made some cookies for her grandma, the regular path to her grandmas was in construcstion so she had to go through the forest.");
				Thread.sleep(4000);
				red.println("When she enters the forest she had to choose either west or east.");
				red.drawImage(jpgEastOrWest, 0, 200, 1250, 675, null);
				Thread.sleep(2000);
				red.println("Does she go West or East?  (west or east)");
				direction = red.readLine();
				if (direction.equalsIgnoreCase("west")) {
					red.clear();
					choice.start();
					Thread.sleep(3000);
					choice.stop();
					red.println("Little Red riding hood goes west");
					Thread.sleep(2000);
					red.println("While she was walking she saw a river in front of her");
					red.drawImage(jpgRiver, 0, 200, 1250, 675, null);
					Thread.sleep(2000);
					red.println("Does she swim through or does she go around?  (swim through or go around)");
					river = red.readLine();
					if (river.equalsIgnoreCase("swim through")) {
						red.clear();
						choice.start();
						Thread.sleep(3000);
						choice.stop();
						red.println("She swims through and gets to the other side");
						red.drawImage(jpgGirlSwim, 0, 200, 1250, 675, null);
						Thread.sleep(2000);
						red.println("The bad part is that shes wet all over");
						red.drawImage(jpgWet, 0, 200, 1250, 675, null);
						Thread.sleep(2000);
						red.println("Does she wait to dry off or does she continue on?   (dry off or continue)");
						wet = red.readLine();
						if (wet.equalsIgnoreCase("dry off")) {
							red.clear();
							choice.start();
							Thread.sleep(3000);
							choice.stop();
							while (oneMoreChance == true) {
								red.println("She decided to wait and dry off");
								Thread.sleep(2000);
								red.println("After she dried off she decided to continue");
								Thread.sleep(2000);
								red.println("She comes across a cliff");
								red.drawImage(jpgCliff, 0, 200, 1250, 675, null);
								Thread.sleep(2000);
								red.println("She has two options either jump down or go around; ");
								Thread.sleep(2000);
								red.println("Does she jump down or turn around?   (jump down or turn around)");
								cliff = red.readLine();
								if (cliff.equalsIgnoreCase("jump down")) {
									red.clear();
									choice.start();
									Thread.sleep(3000);
									choice.stop();
									oneMoreChance = false;
									red.println("She jumps down...");
									Thread.sleep(2000);
									red.println("She lands on a bunch of pillows and blankets");
									red.drawImage(jpgPillow, 0, 200, 1250, 675, null);
									Thread.sleep(2000);
									red.println("She survives!");
									Thread.sleep(2000);
									red.println("She continues and comes to a path");
									red.drawImage(jpgPath, 0, 200, 1250, 675, null);
									Thread.sleep(2000);
									red.println("Does she go left or right?   (left or right)");
									path = red.readLine();
									if (path.equalsIgnoreCase("left")) {
										red.clear();
										choice.start();
										Thread.sleep(3000);
										choice.stop();
										red.println("She sees a lone wolf");
										wolfSound.start();
										red.drawImage(jpgWolf, 0, 200, 1250, 675, null);
										Thread.sleep(2000);
										red.println(
												"Does she run away from the wolf or try to kill it?    (run away or fight it)");
										wolf = red.readLine();
										if (wolf.equalsIgnoreCase("run away")) {
											red.clear();
											choice.start();
											Thread.sleep(3000);
											choice.stop();
											red.println("She tries to run away...");
											Thread.sleep(2000);
											red.println("She runs so much that she runs out of breath");
											Thread.sleep(2000);
											red.println("She wasnt able to catch her breath so she dies");
											end.start();
											red.drawImage(jpgDead, 0, 200, 1250, 675, null);
											Thread.sleep(5000);
											red.clear();
											theme.stop();
											red.println("Do you want to play again?");
											play = red.readLine();
											if (play.equalsIgnoreCase("yes")) {
												playOrNah = true;
											} else {
												playOrNah = false;
											}
										} else if (wolf.equalsIgnoreCase("fight it")) {
											red.clear();
											choice.start();
											Thread.sleep(3000);
											choice.stop();
											red.println("She tries to fight a WOLF");
											wolfSound.start();
											Thread.sleep(5000);
											red.println("Are you out of your mind!?!?!?!");
											Thread.sleep(2000);
											red.println("She dies because she was forced to fight a wolf");
											end.start();
											red.drawImage(jpgEating, 0, 200, 1250, 675, null);
											Thread.sleep(2000);
											red.clear();
											theme.stop();
											red.println("Do you want to play again?");
											play = red.readLine();
											if (play.equalsIgnoreCase("yes")) {
												playOrNah = true;
											} else {
												playOrNah = false;
											}
										}
									} else if (path.equalsIgnoreCase("right")) {
										red.clear();
										choice.start();
										Thread.sleep(3000);
										choice.stop();
										red.println("She come across a pack of wolves");
										wolfSound.start();
										red.drawImage(jpgWolves, 0, 200, 1250, 675, null);
										Thread.sleep(5000);
										if (wolves >= 1 && wolves <= 6) {
											red.println("The wolves eat her");
											end.start();
											red.drawImage(jpgEating, 0, 200, 1250, 675, null);
											Thread.sleep(2000);
											red.clear();
											theme.stop();
											red.println("Do you want to play again?");
											play = red.readLine();
											if (play.equalsIgnoreCase("yes")) {
												playOrNah = true;
											} else {
												playOrNah = false;
											}
										} else if (wolves >= 7 && wolves <= 10) {
											red.println("You get away from the wolves");
											Thread.sleep(2000);
											red.println(
													"Buuuut you run away so far you get lost and die from starvation.");
											end.start();
											red.drawImage(jpgDead, 0, 200, 1250, 675, null);
											Thread.sleep(2000);
											red.clear();
											theme.stop();
											red.println("Do you want to play again?");
											play = red.readLine();
											if (play.equalsIgnoreCase("yes")) {
												playOrNah = true;
											} else {
												playOrNah = false;
											}
										}
									}

								} else if (cliff.equalsIgnoreCase("turn around")) {
									red.clear();
									choice.start();
									Thread.sleep(3000);
									choice.stop();
									red.println("You died, because some mysterious force kills her");
									red.drawImage(jpgDead, 0, 200, 1250, 675, null);
									Thread.sleep(2000);
									red.println("But im giving you another chance");
									Thread.sleep(4000);
									oneMoreChance = true;
								}
							}
						} else if (wet.equalsIgnoreCase("continue")) {
							red.clear();
							choice.start();
							Thread.sleep(3000);
							choice.stop();
							red.println("She dies from frosbite");
							end.start();
							red.drawImage(jpgFrosbite, 0, 200, 1250, 675, null);
							Thread.sleep(2000);
							red.clear();
							theme.stop();
							red.println("Do you want to play again?");
							play = red.readLine();
							if (play.equalsIgnoreCase("yes")) {
								playOrNah = true;
							} else {
								playOrNah = false;
							}
						}

					} else if (river.equalsIgnoreCase("go around")) {
						red.clear();
						choice.start();
						Thread.sleep(3000);
						choice.stop();
						red.println("She dies, because there were aligators on the side");
						end.start();
						red.drawImage(jpgAligators, 0, 200, 1250, 675, null);
						Thread.sleep(2000);
						red.clear();
						theme.stop();
						red.println("Do you want to play again?");
						play = red.readLine();
						if (play.equalsIgnoreCase("yes")) {
							playOrNah = true;
						} else {
							playOrNah = false;
						}

					}
				} else if (direction.equalsIgnoreCase("east")) {
					red.clear();
					choice.start();
					Thread.sleep(3000);
					choice.stop();
					red.println("Little Red riding road goes east");
					Thread.sleep(2000);
					red.println("While she was walking she comes across a path");
					red.drawImage(jpgPath2, 0, 200, 1250, 675, null);
					Thread.sleep(2000);
					red.println("Does she go through the path or around?  (go through or goes around)");
					path1 = red.readLine();
					if (path1.equalsIgnoreCase("go through")) {
						red.clear();
						choice.start();
						Thread.sleep(3000);
						choice.stop();
						while (oneMoreChance == true) {
							red.println("She follows the path and gets through");
							Thread.sleep(2000);
							red.println("she gets to see a camel and a horse");
							red.drawImage(jpgCamel, 0, 200, 1250, 675, null);
							Thread.sleep(2000);
							red.println("which one does she ride?   (camel or horse)");
							ride = red.readLine();
							if (ride.equalsIgnoreCase("horse")) {
								red.clear();
								choice.start();
								Thread.sleep(3000);
								choice.stop();
								red.println("She continues down the forest riding the horse");
								Thread.sleep(2000);
								red.println("she comes across a pond and a bridge");
								red.drawImage(jpgBridge, 0, 200, 1250, 675, null);
								Thread.sleep(2000);
								red.println("which which way does she take?   (pond or bridge)");
								pond = red.readLine();
								if (pond.equalsIgnoreCase("pond")) {
									red.clear();
									choice.start();
									Thread.sleep(3000);
									choice.stop();
									red.println("She goes across the pond safe and sound");
									Thread.sleep(2000);
									red.println("the horse gets tired so they stop for awhile");
									Thread.sleep(2000);
									red.println("they continue on there adventure and come to and end with two paths");
									red.drawImage(jpgPath3, 0, 200, 1250, 675, null);
									Thread.sleep(2000);
									red.println("which which way does she go, left or right?   (left or right)");
									path2 = red.readLine();
									if (path2.equalsIgnoreCase("left")) {
										red.clear();
										choice.start();
										Thread.sleep(3000);
										choice.stop();
										red.println(
												"they go through the left path which leads them right to the doorsteps of her Grandmas house");
										theme.stop();
										finish.start();
										red.drawImage(jpgDoorstep, 0, 200, 1250, 675, null);
										Thread.sleep(5000);
										red.clear();
										red.println("Do you want to play again?");
										play = red.readLine();
										if (play.equalsIgnoreCase("yes")) {
											playOrNah = true;
										} else {
											playOrNah = false;
										}

									} else if (path2.equalsIgnoreCase("right")) {
										red.clear();
										choice.start();
										Thread.sleep(3000);
										choice.stop();
										red.println(
												"they go through the path, since it was very dark they didnt realize what was around them. at the end of the path was a cliff and they both fell down it and died");
										end.start();
										red.drawImage(jpgDead, 0, 200, 1250, 675, null);
										Thread.sleep(5000);
										red.clear();
										theme.stop();
										red.println("Do you want to play again?");
										play = red.readLine();
										if (play.equalsIgnoreCase("yes")) {
											playOrNah = true;
										} else {
											playOrNah = false;
										}

									}

								} else if (pond.equalsIgnoreCase("bridge")) {
									red.clear();
									choice.start();
									Thread.sleep(3000);
									choice.stop();
									red.println(
											"sadly, while walking on the bridge, it breaks and red riding hood falls on her head and dies");
									end.start();
									red.drawImage(jpgDead, 0, 200, 1250, 675, null);
									Thread.sleep(5000);
									red.clear();
									theme.stop();
									red.println("Do you want to play again?");
									play = red.readLine();
									if (play.equalsIgnoreCase("yes")) {
										playOrNah = true;
									} else {
										playOrNah = false;
									}
								}
							} else if (ride.equalsIgnoreCase("camel")) {
								red.clear();
								choice.start();
								Thread.sleep(3000);
								choice.stop();
								red.println(
										"the horse gets hunted by wolves and eaten, red riding hood falls off the camel and tries to run,,,you know the rest");
								Thread.sleep(2000);
								red.println("you get another chance since your half wolf");
								Thread.sleep(5000);
								oneMoreChance = true;
							}
						}

					} else if (path1.equalsIgnoreCase("goes around")) {
						red.clear();
						choice.start();
						Thread.sleep(3000);
						choice.stop();
						red.println("gets trapped in quick sand and dies");
						end.start();
						red.drawImage(jpgQuickSand, 0, 200, 1250, 675, null);
						Thread.sleep(5000);
						red.clear();
						theme.stop();
						red.println("Do you want to play again?");
						play = red.readLine();
						if (play.equalsIgnoreCase("yes")) {
							playOrNah = true;
						} else {
							playOrNah = false;
						}

					}

				}

			} catch (InterruptedException ie) {
				System.err.println(ie.getMessage());
			}
		}

	}
}
