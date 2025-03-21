public class HW2_3 {

    public static void main(String[] args) {
        int totalLoot = 2599;
        int numberOfPirates = 37;
        //------------------------
        int remainder = totalLoot;
        int ownerShare = remainder / 2;
        remainder = remainder - ownerShare;

        int captainShare = remainder / 2;
        remainder = remainder - captainShare;

        int eachPirateShare = remainder / (numberOfPirates + 1);
        remainder = remainder % (numberOfPirates + 1);

        captainShare = captainShare + eachPirateShare;
        //captainShare += eachPirateShare;

        System.out.println("Owner: " + ownerShare);
        System.out.println("Captain: " + captainShare );
        System.out.println("Each pirate: " + eachPirateShare);
        System.out.println("Remainder: " + remainder);
        System.out.println("Captain Jack Sparrow: " + (ownerShare + captainShare));

        System.out.println(ownerShare + captainShare + eachPirateShare * numberOfPirates + remainder);

    }

}
