package chap9.list9_3.model;

import java.io.Serializable;

public class SiteEV implements Serializable {

	private int like;
	private int dislike;


	public SiteEV() { }


	public int getLike() {
		return like;
	}
	public void setLike(int like) {
		this.like = like;
	}

	public int getDislike() {
		return dislike;
	}
	public void setDislike(int dislike) {
		this.dislike = dislike;
	}

}
