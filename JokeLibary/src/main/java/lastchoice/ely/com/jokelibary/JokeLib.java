package lastchoice.ely.com.jokelibary;

import java.util.Random;

public class JokeLib  {



    private Random random = new Random();
    private String[] jokes = {


            "A couple of New Jersey hunters are out in the woods when one of them falls to the ground." +
                    " He doesn't seem to be breathing, his eyes are rolled back in his head. The other guy whips" +
                    " out his cell phone and calls the emergency services. He gasps to the operator: " +
                    "\u201CMy friend is dead! What can I do?\u201D\n\nThe operator, in a calm soothing voice says:" +
                    " \u201CJust take it easy. I can help. First, let's make sure he's dead.\u201D " +
                    "There is a silence, then a shot is heard.\n\n" +
                    "The guy's voice comes back on the line. He says: \u201COK, now what?\u201C",

                    "When NASA first started sending up astronauts, they quickly discovered that ballpoint" +
                            "pens would not work in zero gravity. To combat the problem, NASA scientists spent" +
                            " a decade and $12 billion to develop a pen that writes in zero gravity, upside down," +
                            " underwater, on almost any surface including glass and at temperatures ranging from below" +
                            " freezing to 300\u00B0C.\n",

            "This woman rushed to see her doctor, looking very much worried and all strung out. She rattles off:" +
                    " \u201CDoctor, take a look at me. When I woke up this morning, I looked at myself in the mirror" +
                    " and saw my hair all wiry and frazzled up, my skin was all wrinkled and pasty, my eyes were bloodshot" +
                    " and bugging out, and I had this corpse-like look on my face! What's WRONG with me, Doctor!?" +
                    "\u201D\n\nThe doctor looks her over for a couple of minutes, then calmly says:" +
                    " \u201CWell, I can tell you that there ain't nothing wrong with your eyesight....\u201D",

                   "Why do ducks have webbed feet?\n\nTo stamp out fires.\n\nWhy do elephants have flat feet?\n\n" +
                    "To stamp out burning ducks"};


          public String getJoke() {
        return jokes[random.nextInt((3) + 1)];
          }

}
