package random.projects;

/**
 * Randomness Scrapbook
 * @author Brayden
 */
public class RandomScrapbook {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /*
        First Real Number Generator was made in the mid 40s by RAND Corporation through reading 
        random noise input, and was used to make the book:
        "A Million Random Digits with 100,000 Normal Deviates"
        
        Around the same time, WWII code breaking team Bletchley Park created the machine ERNIE,
        a machine that randomly generated numbers for lottery tickets, there was documentory 
        made in 1964 about it...
        
        The first pseudorandom number generator (PRNG), seemingly random numbers through a generator 
        was designed by John Von Neumann.  His design didn’t last long though since no matter 
        what seed you’d put into the generator, it’d always fall into a chain of short repeating cycles
        (6100)
        
        Example of Von Neumann's PRNG:
        Seed: 3821
        
        Equation: 

        
        A PRNG that is still used today in python's random code, is the Mersenne Twister created by 
        Makoto Matsumoto and Takuji Nishimur in 1997.
        
        For security, PRNG were too risky, as even with the Mersenne Twister, with enough data points
        someone could easily find the seed, or the trend and predict future numbers to crack hidden 
        information.  To combat this, Cryptographically Secure Pseudo-Random Number Generators (CSPRNG) 
        were created.
        
        For a generator to be classified as a CSPRNG, it needs three properties"
        1. It appears random
        2. Its value is unpredictable in advance
        3. It cannot be reliably reproduced after generation
        
        */
        
        // Creates a 'Random' number using the Linear Congruential Generator
        int randomNum = (int) Math.ceil(Math.random()*10);
        
        System.out.println(randomNum);
        
        /*
        Scrapbook of Randomness
        
        PDF of "A Million Random Digits with 100,000 Normal Deviates"vv
        https://www.rand.org/content/dam/rand/pubs/monograph_reports/MR1418/MR1418.deviates.pdfv
        
        Virtual similation of the machine at:
        https://ernie.virtualcolossus.co.uk/ERNIE/
        
        The Importance of Being ERNIE
        https://www.youtube.com/watch?v=rOAfbb5D3Dw&feature=youtu.be
        
        True Random Numbers
        https://www.random.org/integers/
        
        Mersenne Twister Testing
        https://asecuritysite.com/encryption/twister
        */
        
        
        /*
        Citations:
        Byrne, Michael. “How To Make a Random Number.” Motherboard, VICE, 13 Dec. 2014, motherboard.vice.com/en_us/article/wnj48y/how-to-make-a-random-number. 
        Haahr, Mads. “True Random Number Service.” RANDOM.ORG - Coin Flipper, www.random.org/coins/. 
        Link, David. “MUC=Resurrection. A Memorial.” David Link, LoveLetters_1.0, 2009-..., www.alpha60.de/art/love_letters/. 
        “Mersenne Twister.” Mersenne Twister, asecuritysite.com/encryption/twister. 
        Sheth, Mansi. “RSS | Veracode Blog.” Veracode, www.veracode.com/blog/research/cryptographically-secure-pseudo-random-number-generator-csprng. 
        Tashian, Carl. “A Brief History of Random Numbers.” FreeCodeCamp.org, FreeCodeCamp.org, 10 Mar. 2017, medium.freecodecamp.org/a-brief-history-of-random-numbers-9498737f5b6c. 
        “The Importance of Being E.R.N.I.E.” Realist Film Unit, 1964, https://www.youtube.com/watch?v=rOAfbb5D3Dw&feature=youtu.be.
        */
        
    }
    
}
