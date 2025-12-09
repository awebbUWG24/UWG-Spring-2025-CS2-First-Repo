package edu.westga.cs1302.comic_collections.model;

/** Stores the information of a comic
 * 
 * @author AidenWebb
 * @version Fall2025
 */
public class Comic {
	
	private String comicName;
	private int issueNumber;
	
	/** Creates a comic book
	 * 
	 * @preconditon name != null && !name.IsEmpty && issueNumber > 0
	 * 
	 * @param name the name of the comic
	 * @param issueNumber the issue number of the comic
	 */
	public Comic(String name, int issueNumber) {
		if (name == null) {
			throw new IllegalArgumentException("Name may not be null");
		}
		if (name.isEmpty()) {
			throw new IllegalArgumentException("Name may not be empty");
		}
		if (issueNumber <= 0) {
			throw new IllegalArgumentException("Issue number must be a positive integer");
		}
		
		this.comicName = name;
		this.issueNumber = issueNumber;
	}
	
	/** Gets the name of the comic book
	 * 
	 * @return the name of the comic book
	 */
	public String getComicName() {
		return this.comicName;
	}
	
	/** Gets the issue number of the comic book
	 * 
	 * @return the issue number of the comic book
	 */
	public int getIssueNumber() {
		return this.issueNumber;
	}
}
