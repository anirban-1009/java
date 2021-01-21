//enum

public class ex62{
	enum Rank {
		SOLDIER,
		SERGEANT,
		CAPTIAN
	}

	public static void main(String[] args) {
		Rank a = Rank.SOLDIER;

		switch(a) {
			case SOLDIER:
				System.out.println("Soldier says hi!");
				break;

			case SERGEANT:
				System.out.println("Sergeant says hi!");
				break;

			case CAPTIAN:
				System.out.println("Captian says hi!");
				break;
		}
	}
}