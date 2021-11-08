package de.dhbw.tinf19b3.principles;

public class SpamCommentChecker extends CommentChecker {
	
	@Override
	public boolean isValid(Comment comment) {
		if (comment.containsSpam()) {
			return false;
		}
		return super.isValid(comment);
		//return true;
	}
}
