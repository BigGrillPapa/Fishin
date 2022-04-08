//Author: Aaron Mervos
//Title: Discord Fishing

import java.util.Scanner;
import java.util.Random;

public class Fishing
{
	public static void main(String[] args)
	{
		int whatSpot;
		int whatSize;
		int whatFish;
		int drink;
		System.out.println("It's a good day for fishin'! Where we headed?");
		System.out.println("1) Off the dock!\n2) That sunny bank over yonder!\n3) That shady bank on the other side!\n4) Underneath them trees!\n5) Underneath them bushes!");
		Scanner keyboard = new Scanner(System.in);
		whatSpot = keyboard.nextInt();
		whatFish = rarity(whatSpot);
		whatSize =  size(whatFish);
		
		System.out.println("Interestin' choice... I'll trust you though, I get to pick next time though!");
		System.out.println("1)Fair enough... 2)Hell no! I am fish god!");
		int response = keyboard.nextInt();
		
		while(response < 1 || response > 2)
		{
			System.out.println("(invalid response)");
			response = keyboard.nextInt();
		}
		
		if (response == 1)
		{
			System.out.println("Alright! What kinda drinks we takin'?");
		}
		else
		{
			System.out.println("Put em up then partner!");
			return;
		}
		System.out.println("1)Budweiser 2)Modelo 3)White Claw 4)Mike's Hard 5)Jack Daniels");
		drink = keyboard.nextInt();
		
		switch(drink)
		{
		case 1:
		{
			System.out.println("Cheap drinker I reckon... Least it aint one of them fruity drinks!");
			break;
		}
		case 2:
		{
			System.out.println("Buena eleccion hermano! Modelo time!");
			break;
		}
		case 3:
		{
			System.out.println("Oh golly... The wife packed those, you can have em' but I'm a man so I'll be takin' this here Rainier.");
			break;
		}
		case 4:
		{
			System.out.println("Fruity, but I'll trust a man named Mike I suppose... Oughta take some beer just in case it throws off my fishin' however.");
			break;
		}
		case 5:
		{
			System.out.println("Now here's a drinker! Save some chest hair for the rest of us young buck!");
			break;
		}
		default:
		{
			break;
		}
		
		}
		
		System.out.println("Alrighty! Suppose we're good to go, let's head on over.");
		System.out.println("<i>As you walk over to your fishing spot, light rain begins to fall.</i>");
		System.out.println("Perfect! These here light rain drops make them fishes come to the top of the water!");
		System.out.println("<i>You cast your line, crack open your drink, and wait...</i>");
		
		if(whatFish == 5)
		{
			System.out.println("JESUS CHRIST BOY RUN FOR YOUR LIFE THAT'S THE GOD OF THE SEA POSEIDON!!!");
			System.out.println("<i>Congratulations! You caught the rarest fish and are now bestowed the title: Fishin' God!</i>");
		}
		else if(whatFish == 4)
		{
			System.out.println("Holy hell!!! What's a salmon doin' in this here lake??");
			System.out.println("Let's see here... I'd reckon right there's a good " + whatSize + " inches!");
		}
		else if(whatFish == 3)
		{
			System.out.println("Yeehaw!!! Bass fishin' I see!");
			System.out.println("Let's see here... I'd reckon right there's a good " + whatSize + " inches!");
		}
		else if(whatFish == 2)
		{
			System.out.println("Trout for dinner ain't bad I suppose!");
			System.out.println("Let's see here... I'd reckon right there's a good " + whatSize + " inches!");
		}
		else if(whatFish == 1)
		{
			if(drink == 3 || drink == 4)
			{
				System.out.println("A crappie? Amateur hours bud... Reckon it's them fruity drinks you been drinkin'.");
				System.out.println("Let's measure anyway... Bout " + whatSize + " inches.");
			}
			else
			{
				System.out.println("A crappie? Amateur hours bud...");
				System.out.println("Let's measure anyway... Bout " + whatSize + " inches.");
			}
		}
		
	}
	
	//method to determine rarity of fish
	public static int rarity(int spot)
	{
		final int MIN_RARE = 0;
		final int MAX_RARE = 100;
		int rare;
		int randRare;
		Random rand = new Random();
		randRare = rand.nextInt(MIN_RARE, MAX_RARE);
		
		if(randRare == 100)
		{
			rare = 5;
		}
		else
		{
			switch(spot)
			{
			case 1:
			{
				if(randRare >= 90)
				{
					rare = 4;
				}
				else if (randRare >= 80)
				{
					rare = 3;
				}
				else if (randRare >= 60)
				{
					rare = 2;
				}
				else
				{
					rare = 1;
				}
				break;
			}
			case 2:
			{
				if(randRare >= 90)
				{
					rare = 4;
				}
				else if (randRare >= 75)
				{
					rare = 3;
				}
				else if (randRare >= 55)
				{
					rare = 2;
				}
				else
				{
					rare = 1;
				}
				break;
			}
			case 3:
			{
				if(randRare >= 90)
				{
					rare = 4;
				}
				else if (randRare >= 75)
				{
					rare = 3;
				}
				else if (randRare >= 50)
				{
					rare = 2;
				}
				else
				{
					rare = 1;
				}
				break;
			}
			case 4:
			{
				if(randRare >= 90)
				{
					rare = 4;
				}
				else if (randRare >= 75)
				{
					rare = 3;
				}
				else if (randRare >= 50)
				{
					rare = 2;
				}
				else
				{
					rare = 1;
				}
				break;
			}
			case 5:
			{
				if(randRare >= 85)
				{
					rare = 4;
				}
				else if (randRare >= 70)
				{
					rare = 3;
				}
				else if (randRare >= 45)
				{
					rare = 2;
				}
				else
				{
					rare = 1;
				}
				break;
			}
			default:
			{
				rare = 0;
				break;
			}
			}
		}
		
		return rare;
	}
	
	//method to determine size of fish
	public static int size(int fish)
	{
		//5)Posiedon 4)Salmon 3)Bass 2)Trout 1)Crappie
		//salmon&bass:12-18, 18-24, 24-30
				//crappie: 5-8, 8-11, 11-13
		final int MIN_LUCK = 0;
		final int MAX_LUCK = 100;
		int whatSize = 0;
		int luck;
		
		Random sizeRand = new Random();
		luck = sizeRand.nextInt(MIN_LUCK, MAX_LUCK);
		
		switch(fish)
		{
		case 4:
		{
			if(luck >= 85)
			{
				whatSize = sizeRand.nextInt(24, 30);
			}
			else if(luck >= 50)
			{
				whatSize = sizeRand.nextInt(18, 24);
			}
			else if(luck >= 25)
			{
				whatSize = sizeRand.nextInt(15,18);
			}
			else
			{
				whatSize = sizeRand.nextInt(12,14);
			}
			break;
		}
		case 3:
		{
			if(luck >= 85)
			{
				whatSize = sizeRand.nextInt(24, 30);
			}
			else if(luck >= 50)
			{
				whatSize = sizeRand.nextInt(18, 24);
			}
			else if(luck >= 25)
			{
				whatSize = sizeRand.nextInt(15,18);
			}
			else
			{
				whatSize = sizeRand.nextInt(12,14);
			}
			break;
		}
		//trout: 8-12,12-16,16-20

		case 2:
		{
			if(luck >= 85)
			{
				whatSize = sizeRand.nextInt(16, 20);
				break;
			}
			else if(luck >= 50)
			{
				whatSize = sizeRand.nextInt(12, 16);
			}
			break;
		}
		//crappie: 5-8, 8-11, 11-13
		case 1:
		{
			if(luck >= 85)
			{
				whatSize = sizeRand.nextInt(11, 13);
			}
			else if(luck >= 60)
			{
				whatSize = sizeRand.nextInt(8,11);
			}
			else
			{
				whatSize = sizeRand.nextInt(5, 8);
			}
			break;
		}
		default:
		{
			whatSize = 0;
		}
			
		}
		
		
		return whatSize;
	}
}