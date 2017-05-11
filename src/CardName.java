public enum CardName {
	AceSpade, 
	AceHeart,
	AceClub,
	AceDiamond,
	TwoSpade,
	TwoHeart,
	TwoClub,
	TwoDiamond,
	ThreeSpade,
	ThreeHeart,
	ThreeClub,
	ThreeDiamond,
	FourSpade,
	FourHeart,
	FourClub,
	FourDiamond,
	FiveSpade,
	FiveHeart,
	FiveClub,
	FiveDiamond,
	SixSpade,
	SixHeart,
	SixClub,
	SixDiamond,
	SevenSpade,
	SevenHeart,
	SevenClub,
	SevenDiamond,
	EightSpade,
	EightHeart,
	EightClub,
	EightDiamond,
	NineSpade,
	NineHeart,
	NineClub,
	NineDiamond,
	TenSpade,
	TenHeart,
	TenClub,
	TenDiamond,
	JackSpade,
	JackHeart,
	JackClub,
	JackDiamond,
	QueenSpade,
	QueenHeart,
	QueenClub,
	QueenDiamond,
	KingSpade,
	KingHeart,
	KingClub,
	KingDiamond, CardBack;
	
	public String toString() {
		switch (this) {
		case AceSpade:return "Ace of Spades";
		case AceHeart:return "Ace of Hearts";
		case AceClub:return "Ace of Clubs";
		case AceDiamond: return "Ace of Diamonds";
		case EightClub: return "8 of Clubs";
		case EightDiamond: return "8 of Diamonds";
		case EightHeart: return "8 of Hearts";
		case EightSpade: return "8 of Spades";
		case FiveClub: return "5 of Clubs";
		case FiveDiamond: return "5 of Diamonds";
		case FiveHeart: return "5 of Hearts";
		case FiveSpade: return "5 of Spades";
		case FourClub: return "4 of Clubs";
		case FourDiamond: return "4 of Diamonds";
		case FourHeart: return "4 of Hearts";
		case FourSpade: return "4 of Spades";
		case JackClub: return "Jack of Clubs";
		case JackDiamond: return "Jack of Diamonds";
		case JackHeart: return "Jack of Hearts";
		case JackSpade: return "Jack of Spades";
		case KingClub:return "King of Clubs";
		case KingDiamond: return "King of Diamonds";
		case KingHeart: return "King of Hearts";
		case KingSpade: return "King of Spades";
		case NineClub: return "9 of Clubs";
		case NineDiamond: return "9 of Diamonds";
		case NineHeart: return "9 of Hearts";
		case NineSpade: return "9 of Spades";
		case QueenClub:return "Queen of Clubs";
		case QueenDiamond:return "Queen of Diamonds";
		case QueenHeart:return "Queen of Hearts";
		case QueenSpade:return "Queen of Spades";
		case SevenClub:return "7 of Clubs";
		case SevenDiamond:return "7 of Diamonds";
		case SevenHeart:return "7 of Hearts";
		case SevenSpade:return "7 of Spades";
		case SixClub:return "6 of Clubs";
		case SixDiamond:return "6 of Diamonds";
		case SixHeart:return "6 of Hearts";
		case SixSpade:return "6 of Spades";
		case TenClub:return "10 of Clubs";
		case TenDiamond:return "10 of Diamonds";
		case TenHeart:return "10 of Hearts";
		case TenSpade:return "10 of Spades";
		case ThreeClub:return "3 of Clubs";
		case ThreeDiamond:return "3 of Diamonds";
		case ThreeHeart:return "3 of Hearts";
		case ThreeSpade:return "3 of Spades";
		case TwoClub:return "2 of Clubs";
		case TwoDiamond:return "2 of Diamonds";
		case TwoHeart:return "2 of Hearts";
		case TwoSpade:return "2 of Spades";
		case CardBack:return "CardBack";
		default:return null;
		}
	}
}