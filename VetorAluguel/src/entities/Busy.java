package entities;

public class Busy {
	private String name;
	private String mail;
	private int room;
	
	public Busy(String name, String mail, int room) {
		super();
		this.name = name;
		this.mail = mail;
		this.room = room;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMail() {
		return mail;
	}

	public void setMail(String mail) {
		this.mail = mail;
	}

	public int getRoom() {
		return room;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return room +":" + name + ", " + mail;
	}

}
