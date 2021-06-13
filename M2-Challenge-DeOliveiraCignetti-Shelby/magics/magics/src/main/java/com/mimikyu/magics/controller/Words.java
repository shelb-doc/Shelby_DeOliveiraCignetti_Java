package com.mimikyu.magics.controller;

import com.mimikyu.magics.models.Words;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

@RestController
class WordsController{
    Random random = new Random();

    private static List<Words> wordsList = new ArrayList<>(Arrays.asList(
            new Words(1,"fiddlesticks","used to express impatience, dismissal","Fiddlesticks originally was the plural of fiddlestick, “the bow used to play a violin or fiddle,” which dates to the first half of the 15th century. " +
                    "By the second half of the 18th century, the phrase fiddlestick’s end meant “nothing” (a fiddlestick ends in a point); " +
                    "fiddlestick’s end, reduced also to fiddlestick and fiddlesticks, was used as an expression of mild annoyance or dismissal.","Otho would have been Bilbo’s heir, but for the adoption of Frodo. He read the will carefully and snorted. " +
                    "It was, unfortunately, very clear and correct (according to the legal customs of hobbits, which demand among other things seven signatures of witnesses in red ink). “Foiled again!” he said to his wife. “And after waiting sixty years. Spoons? Fiddlesticks!” \n" +
                    "\n" +
                    "J. R. R. TOLKIEN, THE FELLOWSHIP OF THE RING, 1954"),

            new Words(2,"dissilient","bursting apart; bursting open.","Dissilient, “bursting apart or open,” is primarily a botanical term referring to ripe pods or capsules of some plants bursting apart. " +
                    "Dissilient comes from Latin dissiliēns (inflectional stem dissilient-), the present participle of dissilīre, “to leap apart,” a compound of the prefix dis– “apart, asunder, away” and –silīre, a derivative of the simple verb salīre “to leap, jump, spurt.” " +
                    "Dissilient entered English in the second half of the 17th century.","The court was dissilient, generationally fractured, mannered (as it were) by an increasingly impatient and acquisitive nobility.\n" +
                    "\n" +
                    "ERIC S. MALLIN, INSCRIBING THE TIME: SHAKESPEARE AND THE END OF ELIZABETHAN ENGLAND, 1995"),

            new Words(3,"picaresque","of, relating to, or resembling rogues.","The English adjective picaresque, “pertaining to or resembling rogues,” is modeled on Spanish picaresco “pertaining to or resembling a pícaro” (i.e., a rogue or vagabond), " +
                    "which first appears in print in Spanish in 1569. Picaresque in the sense “pertaining to a kind of narrative fiction” first appears in print in English in 1810; Spanish picaresco in the same sense appears in 1836. The etymology of pícaro is contested: it may come from the verb picar “to prick, pierce,” from Vulgar Latin piccāre, and be related to Latin pīcus “woodpecker.” " +
                    "Pícaro first appears in print in Spanish in the first half of the 16th century in the phrase pícaro de cozina “kitchen knave”; it was not a literary term. Pícaro in the sense “hero of a genre of novel” first appears in English in the first half of the 17th century.",
                    "Ronnie Cornwell was a picaresque, forceful, charming, world-class con man, and he is the obsession of his famous son to this day.\n" +
                            "\n" +
                            "TIMOTHY GARTON ASH, \"THE REAL LE CARRÉ,\" THE NEW YORKER, MARCH 15, 1999"),

            new Words(4,"ravelment","entanglement; confusion.", "Ravelment, “entanglement; confusion,” is a compound of the verb ravel “to tangle, entangle” and the noun suffix –ment, here denoting a resulting state. Ravel most likely comes from Dutch ravelen “to become entangled or confused, (of fabric or thread) to fray.” " +
                    "Ravelment entered English in the first half of the 19th century.", "This jagged shard of American history has become a ravelment of an election, a tangle of confusion and complexity.\n" +
                    "\n" +
                    "FRANCIS X. CLINES, \"THE LATEST STOP ON A WILD RIDE: THE BALLOT BOX, AGAIN,\" NEW YORK TIMES, DECEMBER 10, 2000"),

            new Words(5,"predilection","a tendency to think favorably of something in particular; partiality; preference", "Predilection, “a tendency to think favorably of something; partiality; preference,” has several origins. " +
                    "One is Middle French prédilection, from the second half of the 15th century; another is Italian predilezione from the early 17th century ; and the final source is the rare Medieval Latin noun praedīlectiō (inflectional stem praedīlectiōn-), dating from the 10th century. Praedīlectiō is a derivative of the verb praedīligere, “to prefer over others,” a compound of the preposition and prefix prae, prae– “before” and dīligere “to love” (usually not as strong as amāre). Dīligere in turn is a compound of the prefix dis– “apart” and the simple verb legere “to choose, select.” " +
                    "Predilection entered English in the first half of the 17th century.", "Most of us hold unrealistically optimistic views of the future, research shows, downplaying the likelihood that we will have bad experiences. Now a study… has found clues to the brain’s predilection for the positive, identifying regions that may fuel this “optimism bias” by preferentially responding to rosier information.\n" +
                    "\n" +
                    "ANDREA ANDERSON, \"UNFLAGGING OPTIMISM,\" SCIENTIFIC AMERICAN, MARCH 1, 2012"),

            new Words(6,"GIF","a set of standards and file format for storage of digital color images and short animations.", "1985–90; g(raphic) i(nterchange) f(ormat)","The GFY (pronounced “jiffy”) is essentially a more technologically advanced version of the ubiquitous GIF.\n" +
                    "\n" +
                    "ARE GFYS BAD FOR YOUR SEX LIFE?|LIZZIE CROCKER|MARCH 12, 2014|DAILY BEAST"),

            new Words(7,"java","Digital Technology. the proprietary name of a high-level, object-oriented programming language used primarily to build web-based applications.", "1550–60; of obscure origin; possibly from Sanskrit yāvadvīpa, yāvaka dvīpa “barley island” (the island was well known for the barley plant)",
                    "He has a passion for digital preservation, having previously worked on projects like conserving old-school mobile games that ran on Java.\n" +
                            "\n" +
                            "FLASH IS DEAD. THESE GAMES FROM THE EARLY 2000S HOPE TO LIVE ON.|ELISE FAVIS, SHANNON LIAO|APRIL 8, 2021|WASHINGTON POST"),

            new Words(8,"titanic","(initial capital letter) of, relating to, or characteristic of the Titans.\n" +
                    "Also titan. of enormous size, strength, power, etc.; gigantic.", "From the Greek word Tītānikós, dating back to 1650–60.","From abroad, movies including Titanic, Frozen and Harry Potter and the Philosopher’s Stone have topped the box office charts.\n" +
                    "\n" +
                    "EVERYTHING TO KNOW ABOUT DEMON SLAYER: THE MANGA, TV SERIES AND RECORD-BREAKING FILM|KAT MOON|FEBRUARY 24, 2021|TIME"),

            new Words(9,"hebdomadal","taking place, coming together, or published once every seven days; weekly","Hebdomadal, “occurring or published every seven days; a weekly publication,” comes via the Late Latin adjective hebdomadālis “weekly,” " +
                    "from Greek hebdomás (inflectional stem hebdomád-) “a group of seven, a seven-day cycle, a week, a fever recurring every seven days.” Hebdomás is a derivative of the adjective hébdomos (also hébdemos) “seventh,” a complicated but regular derivative of the cardinal number heptá “seven.” Original Proto-Indo-European s is lost before a vowel in Greek, becoming h; heptá is the Greek result of Proto-Indo-European septṃ, which becomes septem in Latin, sapta in Sanskrit, secht in Old Irish, sibun in Gothic, seofon in Old English, seven in English, septynì in Lithuanian, sedm in Czech, sedem in Slovak, and siedem in Polish. " +
                    "Hebdomadal entered English in the first half of the 17th century.","Thirty-six years had passed since. And still he remembered the Sunday evening, the hebdomadal get-together of his parents’ circle of friends.\n" +
                    "\n" +
                    "ROHINTON MISTRY, FAMILY MATTERS, 2002"),
            new Words(10,"Dogecoin","Dogecoin is a form of digital currency featuring the doge dog, a popular internet meme, as its mascot. Wow, so currency!","Dogecoin features the image of a Shiba Inu dog named Kabosu giving a curious sidelong glance. This picture is often referred to as the doge meme, popular online in the early 2010s. The meme displays a picture of Kabosu’s famed expression along with short, ungrammatical captions in Comic Sans."
            ,"Dogecoin has been around for less than a month. In that time, the value of all dogecoins in existence has skyrockted [sic] from zero to more than $8 million.\n" +
                    "Timothy B. Lee, “Dogecoins and Litecoins and Peercoins oh my: What you need to know about Bitcoin alternatives,” The Washington Post, December 26, 201")
    ));

    @RequestMapping(value = "/word", method = RequestMethod.GET)
    @ResponseStatus(value = HttpStatus.OK)
    public Words getRandomWord(){
        int randomQuoteIndex = random.nextInt(wordsList.size());
        return wordsList.get(randomQuoteIndex);
    }
}

