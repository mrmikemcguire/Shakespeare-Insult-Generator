import java.util.Random;

public class ShakespeareInsultGenerator
	{
	static int locationOfInsultPartOne = 999;
	static int locationOfInsultPartTwo = 999; 
	static int locationOfInsultPartThree = 999;
	static String insultPartOne, insultPartTwo, insultPartThree;
	
	public static void main(String[] args)
		{
		String [] mergedInsultList = {"artless",	"base-court", "apple-john",
				"bawdy", "bat-fowling",	"baggage",
				"beslubbering",	"beef-witted",	"barnacle",
				"bootless",	"beetle-headed", "bladder",
				"churlish",	"boil-brained",	"boar-pig",
				"cockered",	"clapper-clawed",	"bugbear",
				"clouted", "clay-brained",	"bum-bailey",
				"craven",	"common-kissing",	"canker-blossom",
				"currish",	"crook-pated",	"clack-dish",
				"dankish",	"dismal-dreaming",	"clotpole",
				"dissembling",	"dizzy-eyed",	"coxcomb",
				"droning",	"doghearted",	"codpiece",
				"errant",	"dread-bolted",	"death-token",
				"fawning",	"earth-vexing",	"dewberry",
				"fobbing",	"elf-skinned",	"flap-dragon",
				"froward",	"fat-kidneyed",	"flax-wench",
				"frothy",	"fen-sucked",	"flirt-gill",
				"gleeking",	"flap-mouthed",	"foot-licker",
				"goatish",	"fly-bitten",	"fustilarian",
				"gorbellied",	"folly-fallen",	"giglet",
				"impertinent",	"fool-born", 	"gudgeon",
				"infectious",	"full-gorged",	"haggard",
				"jarring",	"guts-griping",	"harpy",
				"loggerheaded",	"half-faced",	"hedge-pig",
				"lumpish",	"hasty-witted",	"horn-beast",
				"mammering",	"hedge-born",	"hugger-mugger",
				"mangled",	"hell-hated",	"joithead",
				"mewling",	"idle-headed",	"lewdster",
				"paunchy",	"ill-breeding",	"lout",
				"pribbling",	 "ill-nurtured", 	"maggot-pie",
				"puking",	"knotty-pated",	"malt-worm",
				"puny",	"milk-livered",	"mammet",
				"qualling",	"motley-minded", 	"measle",
				"rank",	"onion-eyed",	"minnow",
				"reeky",	 "plume-plucked",	"miscreant",
				"roguish",	"pottle-deep",	"moldwarp",
				"ruttish",	"pox-marked",	"mumble-news",
				"saucy", 	"reeling-ripe",	"nut-hook",
				"spleeny",	"rough-hewn",	"pigeon-egg",
				"spongy",	"rude-growing",	"pignut",
				"surly", 	"rump-fed",	"puttock",
				"tottering", 	"shard-borne",	"pumpion",
				"unmuzzled", 	"sheep-biting",	"ratsbane",
				"vain",	"spur-galled",	"scut",
				"venomed",	"swag-bellied",	"skainsmate",
				"villainous",	"tardy-gaited",	"strumpet",
				"warped",	"tickle-brained",	"varlet",
				"wayward",	"toad-spotted",	"vassal",
				"weedy", 	"unchin-snouted",	"whey-face",
				"yeasty",	"weather-bitten",	"wagtail"};
		
		Random randomNumber = new Random();
		while (locationOfInsultPartOne == 999 || locationOfInsultPartTwo == 999 
				|| locationOfInsultPartThree == 999)
			{
			int feederRoll = randomNumber.nextInt(mergedInsultList.length);

			switch (feederRoll % 3)
				{
				case 0:
					{
					locationOfInsultPartTwo = feederRoll;
					break;
					}
				case 1:
					{
					locationOfInsultPartOne = feederRoll;
					break;
					}
				case 2:
					{
					locationOfInsultPartThree = feederRoll;
					break;
					}
				}
			}

		System.out.println();

		insultPartOne = mergedInsultList [locationOfInsultPartOne];
		insultPartTwo = mergedInsultList [locationOfInsultPartTwo];
		insultPartThree = mergedInsultList [locationOfInsultPartThree];
		
		String firstLetterOfInsultPartOne = mergedInsultList [locationOfInsultPartOne].substring(0,1);

		switch(firstLetterOfInsultPartOne)
			{
			case "a":
			case "e":
			case "i":
			case "o":
			case "u":
				{
				System.out.println("Thou art an " + insultPartOne + ", " + insultPartTwo 
					+ " " + insultPartThree + "!");
				}
				break;
			default:
				{
				System.out.println("Thou art a " + insultPartOne + ", " + insultPartTwo 
				+ " " + insultPartThree + "!");
				}
			}
		}
	}
