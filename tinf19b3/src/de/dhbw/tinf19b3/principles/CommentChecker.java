package de.dhbw.tinf19b3.principles;

public class CommentChecker {

	public boolean isValid(Comment comment) {
		if (comment.isEmpty()) {
			return false;
		}
		if (!comment.isUnicum()) {
			return false;
		}
		return true;
    }
}
