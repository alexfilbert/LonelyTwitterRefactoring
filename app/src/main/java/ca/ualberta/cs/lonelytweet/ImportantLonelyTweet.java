package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class ImportantLonelyTweet extends LonelyTweet {

	 // Removed unused constructor ImportantLonelyTweet()

	public ImportantLonelyTweet(String text) {		// Removed unused parameter Date
		this.tweetDate = new Date();
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		if (tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 20) {
			return false;
		}

		return true;
	}

	@Override
	public String toString() {

		String string = getTweetDate() + " | " + getTweetBody();
		return string;
	}

	public String getTweetBody() {
        return tweetBody;
    }
}