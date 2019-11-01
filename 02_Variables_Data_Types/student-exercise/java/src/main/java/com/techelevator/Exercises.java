package com.techelevator;

public class Exercises {

	public static void main(String[] args) {

        /*
        1. 4 birds are sitting on a branch. 1 flies away. How many birds are left on
        the branch?
        */

		// ### EXAMPLE:
		int initialNumberOfBirds = 4;
		int birdsThatFlewAway = 1;
		int remainingNumberOfBirds = initialNumberOfBirds - birdsThatFlewAway;

        /*
        2. There are 6 birds and 3 nests. How many more birds are there than
        nests?
        */

		// ### EXAMPLE:
		int numberOfBirds = 6;
		int numberOfNests = 3;
		int numberOfExtraBirds = numberOfBirds - numberOfNests;

        /*
        3. 3 raccoons are playing in the woods. 2 go home to eat dinner. How
        many raccoons are left in the woods?
        */
		int initialRaccoons = 3; 
		int raccoonsGoHome = 2; 
		int raccoonsLeft = initialRaccoons - raccoonsGoHome; 
		
		System.out.println(raccoonsLeft);
        /*
        4. There are 5 flowers and 3 bees. How many less bees than flowers?
        */
		int numberOfFlowers = 5;
		int numberOfBees = 3; 
		int lessBees = numberOfFlowers - numberOfBees; 
		
		System.out.println(lessBees);
        /*
        5. 1 lonely pigeon was eating breadcrumbs. Another pigeon came to eat
        breadcrumbs, too. How many pigeons are eating breadcrumbs now?
        */
		int firstPigeon = 1;
		int secondPigeon = 1; 
		int howManyPigeons = firstPigeon + secondPigeon; 
		
		System.out.println(howManyPigeons);
		
        /*
        6. 3 owls were sitting on the fence. 2 more owls joined them. How many
        owls are on the fence now?
        */

		int initialOwlsOnFence = 3;
		int joiningOwls = 2; 
		int allOwlsOnFence = initialOwlsOnFence + joiningOwls; 
				
		System.out.println(allOwlsOnFence);
        /*
        7. 2 beavers were working on their home. 1 went for a swim. How many
        beavers are still working on their home?
        */

		int workingBeavers = 2;
		int swimmingBeavers = 1;
		int stillWorking = workingBeavers - swimmingBeavers; 
		
		System.out.println(stillWorking);
        /*
        8. 2 toucans are sitting on a tree limb. 1 more toucan joins them. How
        many toucans in all?
        */
		int initialToucans = 2;
		int joiningToucans = 1; 
		int totalToucans = initialToucans + joiningToucans; 
		
		System.out.println(totalToucans);
		
        /*
        9. There are 4 squirrels in a tree with 2 nuts. How many more squirrels
        are there than nuts?
        */
		int squirrels = 4;
		int nuts = 2;
		int moreSquirrelsThanNuts = squirrels - nuts; 
		
		System.out.println(moreSquirrelsThanNuts);
        /*
        10. Mrs. Hilt found a quarter, 1 dime, and 2 nickels. How much money did
        she find?
        */
		int quarter = 25;
		int dime = 10;
		int nickel = 5; 
		
		int mrsHiltsMoney = quarter + dime + nickel + nickel; 
		
		System.out.println("Mrs. Hilt found " + mrsHiltsMoney + " cents"); 
		
        /*
        11. Mrs. Hilt's favorite first grade classes are baking muffins. Mrs. Brier's
        class bakes 18 muffins, Mrs. MacAdams's class bakes 20 muffins, and
        Mrs. Flannery's class bakes 17 muffins. How many muffins does first
        grade bake in all?
        */
		
		int brierMuffins = 18;
		int macadamsMuffins = 20; 
		int flanneryMuffins = 17; 
		int totalMuffins = brierMuffins + macadamsMuffins + flanneryMuffins; 
		
		System.out.println(totalMuffins);
        /*
        12. Mrs. Hilt bought a yoyo for 24 cents and a whistle for 14 cents. How
        much did she spend in all for the two toys?
        */
		int yoyoCost = 24;
		int whistleCost = 14; 
		int moneySpent = yoyoCost + whistleCost; 
		
		System.out.println("Mrs. Hilt spent " + moneySpent + " cents"); 
		
        /*
        13. Mrs. Hilt made 5 Rice Krispie Treats. She used 8 large marshmallows
        and 10 mini marshmallows.How many marshmallows did she use
        altogether?
        */
		int largeMarshmallows = 8;
		int miniMarshmallows = 10; 
		int totalMarshmallows = largeMarshmallows + miniMarshmallows; 
		
		System.out.println(totalMarshmallows);
        /*
        14. At Mrs. Hilt's house, there was 29 inches of snow, and Brecknock
        Elementary School received 17 inches of snow. How much more snow
        did Mrs. Hilt's house have?
        */
		int snowAtHilts = 29;
		int snowAtBrecknock = 17; 
		int moreSnowAtHilts = snowAtHilts - snowAtBrecknock; 
		
		System.out.println("There were " + moreSnowAtHilts + " more inches of snow at Mrs. Hilt's house than at the school.");
        /*
        15. Mrs. Hilt has $10. She spends $3 on a toy truck and $2 on a pencil
        case. How much money does she have left?
        */
		int initialMoney = 10;
		int toyTruck = 3;
		int pencilCase = 2; 
		
		int moneyLeft = initialMoney - toyTruck - pencilCase; 
		System.out.println(moneyLeft);
		
        /*
        16. Josh had 16 marbles in his collection. He lost 7 marbles. How many
        marbles does he have now?
        */
		int initialMarbles = 16;
		int lostMarbles = 7;
		int marblesLeft = initialMarbles - lostMarbles; 
		
		System.out.println(marblesLeft);

        /*
        17. Megan has 19 seashells. How many more seashells does she need to
        find to have 25 seashells in her collection?
        */
		int initialSeashells = 19;
		int moreSeashellsNeeded = 25 - initialSeashells; 
		
		System.out.println(moreSeashellsNeeded);
		
        /*
        18. Brad has 17 balloons. 8 balloons are red and the rest are green. How
        many green balloons does Brad have?
        */
		int totalBalloons = 17; 
		int redBalloons = 8; 
		int greenBalloons = totalBalloons - redBalloons; 
		
		System.out.println(greenBalloons);
        /*
        19. There are 38 books on the shelf. Marta put 10 more books on the shelf.
        How many books are on the shelf now?
        */
		int initialBooks = 38; 
		int booksAddedToShelf = 10; 
		int booksNow = initialBooks + booksAddedToShelf; 
		
		System.out.println(booksNow);
        /*
        20. A bee has 6 legs. How many legs do 8 bees have?
        */
		int beeLegs = 6; 
		int eightBeesLegs = beeLegs * 8; 
		
		System.out.println(eightBeesLegs);

        /*
        21. Mrs. Hilt bought an ice cream cone for 99 cents. How much would 2 ice
        cream cones cost?
        */
		double iceCreamConeCost = 0.99; 
		double twoIceCream = iceCreamConeCost * 2; 
		
		System.out.println(twoIceCream);
		
        /*
        22. Mrs. Hilt wants to make a border around her garden. She needs 125
        rocks to complete the border. She has 64 rocks. How many more rocks
        does she need to complete the border?
        */
		int totalRocks = 125; 
		int rocksHiltHas = 64; 
		int moreRocksNeeded = totalRocks - rocksHiltHas;
		
		System.out.println(moreRocksNeeded);
        /*
        23. Mrs. Hilt had 38 marbles. She lost 15 of them. How many marbles does
        she have left?
        */
		int hiltMarbles = 38;
		int hiltLostMarbles = 15;
		int hiltMarblesLeft = hiltMarbles - hiltLostMarbles; 
		
		System.out.println(hiltMarblesLeft);
        /*
        24. Mrs. Hilt and her sister drove to a concert 78 miles away. They drove 32
        miles and then stopped for gas. How many miles did they have left to drive?
        */

		int totalMiles = 78;
		int droveMiles = 32; 
		int milesLeft = totalMiles - droveMiles; 
		
		System.out.println(milesLeft);
		
        /*
        25. Mrs. Hilt spent 1 hour and 30 minutes shoveling snow on Saturday
        morning and 45 minutes shoveling snow on Saturday afternoon. How
        much total time did she spend shoveling snow?
        */
		double satShovel = 1.5;
		double sunShovel = 0.75; 
		double totalTimeShovel = satShovel + sunShovel;  
		
		System.out.println(totalTimeShovel + " hours shoveling");
        /*
        26. Mrs. Hilt bought 6 hot dogs. Each hot dog cost 50 cents. How much
        money did she pay for all of the hot dogs?
        */
		int numOfHotDogs = 6; 
		int hotDogCost = 50;
		int hiltMoneySpent = numOfHotDogs * hotDogCost; 
		
		System.out.println(hiltMoneySpent + " cents"); 
        /*
        27. Mrs. Hilt has 50 cents. A pencil costs 7 cents. How many pencils can
        she buy with the money she has?
        */
		int moneyHiltHas = 50;
		int pencilCost = 7;
		int howManyPencils = moneyHiltHas / pencilCost; 
		
		System.out.println(howManyPencils); 
        /*
        28. Mrs. Hilt saw 33 butterflies. Some of the butterflies were red and others
        were orange. If 20 of the butterflies were orange, how many of them
        were red?
        */
		int totalButterflies = 33;
		int orangeButterflies = 20;
		int redButterflies = totalButterflies - orangeButterflies;  
		
		System.out.println(redButterflies); 
        /*
        29. Kate gave the clerk $1.00. Her candy cost 54 cents. How much change
        should Kate get back?
        */
		double moneyGiven = 1.00;
		double candyCost = 0.54; 
		double changeBack = moneyGiven - candyCost; 
		
		System.out.println(changeBack); 
        /*
        30. Mark has 13 trees in his backyard. If he plants 12 more, how many trees
        will he have?
        */
		int trees = 13;
		int newTreesPlanted = 12; 
		int totalTrees = trees + newTreesPlanted; 
		
		System.out.println(totalTrees); 
        /*
        31. Joy will see her grandma in two days. How many hours until she sees
        her?
        */
		int daysTilGma = 2; 
		int hoursInADay = 24; 
		int hoursTilGma = daysTilGma * hoursInADay; 
		
		System.out.println(hoursTilGma); 
        /*
        32. Kim has 4 cousins. She wants to give each one 5 pieces of gum. How
        much gum will she need?
        */
		int numCousins = 4; 
		int piecesOfGum = 5; 
		int gumNeeded = numCousins * piecesOfGum; 
		
		System.out.println(gumNeeded); 
        /*
        33. Dan has $3.00. He bought a candy bar for $1.00. How much money is
        left?
        */
		int moneyDanHas = 3; 
		int candyBarCost = 1; 
		int moneyDanHasLeft = moneyDanHas - candyBarCost; 
		
		System.out.println(moneyDanHasLeft); 
        /*
        /*
        34. 5 boats are in the lake. Each boat has 3 people. How many people are
        on boats in the lake?
        */
		int boatsOnLake = 5;
		int peopleOnBoat = 3;
		int peopleOnLake = boatsOnLake * peopleOnBoat; 
		
		System.out.println(peopleOnLake); 
        /*
        35. Ellen had 380 legos, but she lost 57 of them. How many legos does she
        have now?
        */
		int numberOfLegos = 380;
		int legosLost = 57;
		int ellensLegos = numberOfLegos - legosLost;  
		
		System.out.println(ellensLegos); 
        /*
        36. Arthur baked 35 muffins. How many more muffins does Arthur have to
        bake to have 83 muffins?
        */
		int bakedMuffins = 35;
		int muffinsLeft = 83 - bakedMuffins;
		
		
		System.out.println(muffinsLeft); 
        /*
        37. Willy has 1400 crayons. Lucy has 290 crayons. How many more
        crayons does Willy have then Lucy?
        */
		int willyCrayons = 1400;
		int lucyCrayons = 290;
		int moreWilly = willyCrayons - lucyCrayons; 
		
		System.out.println(moreWilly); 
        /*
        38. There are 10 stickers on a page. If you have 22 pages of stickers, how
        many stickers do you have?
        */
		int initialStickers = 10;
		int numOfPages = 22;
		int howManyStickers = initialStickers * numOfPages;
		
		System.out.println(howManyStickers); 
        /*
        39. There are 96 cupcakes for 8 children to share. How much will each
        person get if they share the cupcakes equally?
        */
		int cupcakes = 96;
		int children = 8;
		int distributedCakes = cupcakes / children; 
		
		System.out.println(distributedCakes); 
        /*
        40. She made 47 gingerbread cookies which she will distribute equally in
        tiny glass jars. If each jar is to contain six cookies each, how many
        cookies will not be placed in a jar?
        */
		int gingerbread = 47;
		int jarsCanHold = 6;
		int notInJars = gingerbread % jarsCanHold; 
		
		System.out.println(notInJars); 
        /*
        41. She also prepared 59 croissants which she plans to give to her 8
        neighbors. If each neighbor received and equal number of croissants,
        how many will be left with Marian?
        */
		int croissants = 59;
		int neighbors = 8;
		int leftWithMarian = croissants % neighbors; 
		
		System.out.println(leftWithMarian); 
        /*
        42. Marian also baked oatmeal cookies for her classmates. If she can
        place 12 cookies on a tray at a time, how many trays will she need to
        prepare 276 oatmeal cookies at a time?
        */
		int oatmealCookies = 276;
		int trayCanHold = 12;
		int traysNeeded = oatmealCookies / trayCanHold; 
		
		System.out.println(traysNeeded); 
        /*
        43. Marian’s friends were coming over that afternoon so she made 480
        bite-sized pretzels. If one serving is equal to 12 pretzels, how many
        servings of bite-sized pretzels was Marian able to prepare?
        */
		int pretzels = 480;
		int servingSize = 12;
		int howManyServings = pretzels / servingSize; 
		
		System.out.println(howManyServings); 
        /*
        44. Lastly, she baked 53 lemon cupcakes for the children living in the city
        orphanage. If two lemon cupcakes were left at home, how many
        boxes with 3 lemon cupcakes each were given away?
        */
		int lemonCupcakes = 51;
		int boxesCanHold = 3; 
		int boxesGivenAway = lemonCupcakes / boxesCanHold; 
		
		System.out.println(boxesGivenAway); 
		
        /*
        45. Susie's mom prepared 74 carrot sticks for breakfast. If the carrots
        were served equally to 12 people, how many carrot sticks were left
        uneaten?
        */
		int carrotStix = 74;
		int people = 12; 
		int carrotsLeft = carrotStix % people; 
		
		System.out.println(carrotsLeft); 
        /*
        46. Susie and her sister gathered all 98 of their teddy bears and placed
        them on the shelves in their bedroom. If every shelf can carry a
        maximum of 7 teddy bears, how many shelves will be filled?
        */
		int teddyBears = 98;
		int shelfSize = 7; 
		int shelvesFilled = 98 / 7; 
		
		System.out.println(shelvesFilled); 
        /*
        47. Susie’s mother collected all family pictures and wanted to place all of
        them in an album. If an album can contain 20 pictures, how many
        albums will she need if there are 480 pictures?
        */
		int albumCanHold = 20;
		int numOfPictures = 480; 
		int albumsNeeded = numOfPictures / albumCanHold; 
		
		System.out.println(albumsNeeded); 
        /*
        48. Joe, Susie’s brother, collected all 94 trading cards scattered in his
        room and placed them in boxes. If a full box can hold a maximum of 8
        cards, how many boxes were filled and how many cards are there in
        the unfilled box?
        */
		int joesCards = 94;
		int boxCanHold = 8; 
		int boxesFilled = joesCards / boxCanHold; 
		int cardsInUnfilledBox = joesCards % boxCanHold; 
		
		System.out.println("There are this many boxes filled: " + boxesFilled); 
		System.out.println("There are this many cards in the unfilled box: " + cardsInUnfilledBox); 
        /*
        49. Susie’s father repaired the bookshelves in the reading room. If he has
        210 books to be distributed equally on the 10 shelves he repaired,
        how many books will each shelf contain?
        */
		int dadBooks = 210;
		int bookShelves = 10; 
		int howManyBooks = dadBooks / bookShelves; 
		
		System.out.println(howManyBooks); 
        /*
        50. Cristina baked 17 croissants. If she planned to serve this equally to
        her seven guests, how many will each have?
        */
		int croissantsC = 17;
		int numOfGuests = 7; 
		int howManyCroissants = 17 / 7; 
		
		System.out.println(howManyCroissants); 
        /*
            CHALLENGE PROBLEMS
        */

        /*
        Bill and Jill are house painters. Bill can paint a 12 x 14 room in 2.15 hours, while Jill averages
        1.90 hours. How long will it take the two painter working together to paint 5 12 x 14 rooms?
        Hint: Calculate the hourly rate for each painter, combine them, and then divide the total walls in feet by the combined hourly rate of the painters.
        Challenge: How many days will it take the pair to paint 623 rooms assuming they work 8 hours a day?.
        */
		double squareFeetInRoom = 12 * 14; 
		//168 
		
		double billCanPaint = 2.15;
		double jillCanPaint = 1.90;
		double togetherCanPaint = (billCanPaint + jillCanPaint) / 2; 
		int totalRooms = 623; 
		int workingHours = 8; 
		// not sure how to do this... definitely not sure how to do this using sq ft
		int togetherPainting = (int)(togetherCanPaint)  / workingHours; 
		
		
        /*
        Create and assign variables to hold your first name, last name, and middle initial. Using concatenation,
        build an additional variable to hold your full name in the order of last name, first name, middle initial. The
        last and first names should be separated by a comma followed by a space, and the middle initial must end
        with a period.
        Example: "Hopper, Grace B."
        */

		String firstName = "Grace";
		String lastName = "Novacek"; 
		String middleI = "M"; 
		
		System.out.println(lastName + ", " + firstName + " " + middleI + ".");
		
		
        /*
        The distance between New York and Chicago is 800 miles, and the train has already travelled 537 miles.
        What percentage of the trip has been completed?
        Hint: The percent completed is the miles already travelled divided by the total miles.
        Challenge: Display as an integer value between 0 and 100 using casts.
        */
		double distanceBetween = 800; 
		double trainHasTraveled = 537; 
		
		int percentageComplete = (int)((trainHasTraveled / distanceBetween) * 100); 
		
		System.out.println(percentageComplete); 

	}

}
