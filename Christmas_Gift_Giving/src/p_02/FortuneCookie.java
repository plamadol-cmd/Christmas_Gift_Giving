package p_02;

import java.util.Random;

public class FortuneCookie implements ISurprise {
	private static String[] quotes = {"I find that the harder I work, the more luck I seem to have. -Thomas Jefferson",
			"Success is walking from failure to failure with no loss of enthusiasm. -Winston Churchill", 
			"If you are not willing to risk the usual, you will have to settle for the ordinary. -Jim Rohn", 
			"Do one thing every day that scares you. -Anonymous",
			"All progress takes place outside the comfort zone. - Michael John Bobak",
			"If you really look closely, most overnight successes took a long time. -Steve Jobs",
			"The successful warrior is the average man, with laser-like focus. -Bruce Lee",
			"Fall seven times and stand up eight. -Japanese Proverb",
			"Some people dream of success while others wake up and work. -Unknown",
			"In order to succeed, your desire for success should be greater than your fear of failure. -Bill Cosby",
			"In order to succeed, we must first believe that we can. -Nikos Kazantzakis",
			"The secret of success is to do the common thing uncommonly well. -John D. Rockefeller Jr.",
			"I failed my way to success. -Thomas Edison",
			"The only place where success comes before work is in the dictionary. -Vidal Sassoon",
			"If you think you are too small to make a difference, try sleeping with a mosquito. -Dalai Lama",
			"Have no fear of perfection. You'll never reach it. -Salvador Dali",
			"Normality is a paved road: It's comfortable to walk, but no flowers grow on it. -Vincent Van Gogh",
			"I don't know what the future may hold, but I know who holds the future. -Ralph Abernathy",
			"All good ideas start out as bad ideas, that's why it takes so long. -Steven Spielberg",
			"Improving yourself is a lot more profitable than trying to improve others. -Dale Carnegie"};
	private String message;
	private static Random random = new Random();
	
	public FortuneCookie() {
		this.message = FortuneCookie.quotes[FortuneCookie.generate()];
	}
	
	public static int generate() {
	    int n = random.nextInt();
	    n = Math.abs(n % 19);
	    return n;
	}

	@Override
	public void enjoy() {
		String output = String.format("This message inspires me:\n\" %s \"", this.message);
		System.out.println(output);
		
	}
	
	@Override
	public String toString() {
		return "Fortune cookie";
	}
}
