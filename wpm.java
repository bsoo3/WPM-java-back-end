import java.io.IOException;

/*
===========================
     SEMINARSKA NALOGA
===========================
  wpm ¤ words per minute
===========================

Prevedeno v slovenščino to pomeni "besede na minuto".
-
Torej, napisal sem program ki približno izračuna kako hitro pišeš.
-
Program iz datotek s približno 500 besedami izbere 1-15 random besed.
-
Te besede ti izpiše in jih ti moraš v čim hitrejšem času izpisati.
-
AMPAK imamo en problem, koda je napisana tako, da moraš pravilno napisati besede, 
napisano je tako, da ne zazna, če si napisal kakšno besedo narobe.
-
Tako da se treba potrudit čim hitreje napisati pravilno besede.
- 
ENAČBA ZA IZRAČUN wpm: (((numChars/5)/seconds)*60)
    - numChars = število besed katerih si moral napisati
    - /5 = dolžina ene besede
    - seconds = koliko sekund si porabil za izpis besed
    - *60 = ==== pretvori iz sekund v minute
-
Na kocnu program izpiše vsak "wpm" v datoteko allWPM.txt
-
iskreno povedano je zelo kratek in lahek program!

-Benjamin 
*/
public class wpm 
{
    public static void main(String[] args) throws InterruptedException, IOException
    {
        methods object = new methods();
        object.countdown();
        object.fileWordPrinter(); 
        object.mainMethod();              
    }

    
}
 

