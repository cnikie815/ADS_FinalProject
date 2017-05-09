public enum CardName {
	TwoSpade; 
	TwoClub;
	TwoHeart;
	
	public String toString() {
		switch (this) {
		case TwoSpade:return "2 of Spades";
		case TwoClub:return "2 of Clubs";
		case END_SPEED_LIMIT:return "End of Speed Limit";
		case EXTRA_TANK:return "Extra Tank";
		case FLAT_TIRE:return "Flat Tire";
		case GAS:return "Extra Gas";
		case MILE_100:return "100 Miles";
		case MILE_200:return "200 Miles";
		case MILE_25:return "25 Miles";
		case MILE_50:return "50 Miles";
		case MILE_75:return "75 Miles";
		case OUT_OF_GAS:return "Out of Gas";
		case PUNCTURE_PROOF:return "Puncture-proof";
		case REPAIRS:return "Repairs";
		case RIGHT_OF_WAY:return "Right of Way";
		case ROADSIDE_ASSISTANCE:return "Roadside Assistance";
		case DEFAULT:return "Default";//blank card 
		case ROLL:return "Roll"; //Go!
		case SPARE_TIRE:return "Spare Tire";
		case SPEED_LIMIT:return "Speed Limit";
		case KEY_CARD:return "Key Card";
		case STOP:return "Stop";
		default: return null;
		}
	}
}